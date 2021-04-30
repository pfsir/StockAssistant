package com.xy.jepackdemo.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.xy.jepackdemo.R;


/**
 * @author oyangpengfei
 */
public class ChartsLineView extends View {
    /**
     * 画笔工具
     */
    private Paint mPaint;
    /**
     * 数字画笔
     */
    private TextPaint mNumberPaint;
    /**
     * 画线
     */
    private Path mPath;
    /**
     * 下一个坐标
     */
    private long mNexTemperature;
    /**
     * 当前坐标
     */
    private long mTemperature;
    /**
     * 前一个坐标
     */
    private long mPreTemperature;
    /**
     * 计算过后的的坐标
     */
    private float mCalculatedNextHeightY;
    private float mCalculatedHeightY;
    private float mCalculatedPreHeightY;

    /**
     * 最高
     */
    private long mTemperatureMax;

    /**
     * 最低
     */
    private long mTemperatureMin;

    /**
     * 数字
     */
    private String mNumberText;

    /**
     * 第一个item 中间的item 和最后的item
     */
    public static final int FIRST_ITEM = 0;
    public static final int MEDIUM_ITEM = 1;
    public static final int LAST_ITEM = 2;
    private int mItemType;
    private int mContentTextSize;
    private int mContentTextColor;
    private int mLineColor;


    public ChartsLineView(Context context) {
        this(context, null);
    }

    public ChartsLineView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);

    }

    public ChartsLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ChartsLineView);
        mContentTextSize = a.getDimensionPixelSize(R.styleable.ChartsLineView_contentTextSize, 30);
        mContentTextColor = a.getColor(R.styleable.ChartsLineView_contentColor, getResources().getColor(R.color.color_000000));
        mLineColor = a.getColor(R.styleable.ChartsLineView_lineColor, getResources().getColor(R.color.colorAccent));

        //自定View 重写onDraw 方法时需要设置这个标志，表示需要重绘，否则会使用默认的onDraw 方法
        setWillNotDraw(false);
        init();
    }

    /**
     * 初始化画笔工具
     */
    private void init() {
        mPaint = new Paint();
        mPaint.setColor(mLineColor);
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(4);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeJoin(Paint.Join.BEVEL);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);

        mPath = new Path();
        mItemType = 0;
        mNumberPaint = new TextPaint();
        mNumberPaint.setColor(mContentTextColor);
        mNumberPaint.setAntiAlias(true);
        mNumberPaint.setStrokeWidth(3);
        mNumberPaint.setTextSize(mContentTextSize);
        mNumberPaint.setFakeBoldText(true);
        mNumberPaint.setStrokeCap(Paint.Cap.ROUND);
    }


    /**
     * 在onDraw 方法里进行曲线的绘制和温度数据的显示
     *
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int mWidth = getWidth();
        int mHeight = getHeight();
        //根据屏幕的高度计算出坐标
        calculateY(mHeight);

        //描点
        canvas.drawCircle(mWidth / 2, mCalculatedHeightY, 2, mPaint);
        //画数值
        canvas.drawText(mNumberText, mWidth / 2 - mNumberPaint.measureText(mNumberText) / 2, mCalculatedHeightY + mNumberPaint.getTextSize() + 20, mNumberPaint);

        //根据不同的item 画出不同的状态的曲线
        switch (mItemType) {
            //第一个item 只需要从中间到右边
            case FIRST_ITEM:
                mPath.moveTo(mWidth / 2, mCalculatedHeightY);
                mPath.lineTo(mWidth, (mCalculatedHeightY + mCalculatedNextHeightY) / 2);
                break;
            //中间的item 需要从左边画到中间，再从中间画到右边
            case MEDIUM_ITEM:
                mPath.moveTo(0, (mCalculatedPreHeightY + mCalculatedHeightY) / 2);
                mPath.lineTo(mWidth / 2, mCalculatedHeightY);
                mPath.moveTo(mWidth / 2, mCalculatedHeightY);
                mPath.lineTo(mWidth, (mCalculatedHeightY + mCalculatedNextHeightY) / 2);
                break;
            //最后一个item 只需要从坐标画到中间即可
            case LAST_ITEM:
                mPath.moveTo(0, (mCalculatedPreHeightY + mCalculatedHeightY) / 2);
                mPath.lineTo(mWidth / 2, mCalculatedHeightY);
                break;
            default:
                break;
        }
        canvas.drawPath(mPath, mPaint);

    }

    /**
     * 最后一个item 的数据赋值，并重绘
     *
     * @param preTemperature
     * @param temperature
     * @param itemType
     * @param last
     */
    public void draws(long preTemperature, long temperature, int itemType, boolean last) {
        this.mPreTemperature = preTemperature;
        this.mTemperature = temperature;
        this.mItemType = itemType;

        invalidate();

    }

    /**
     * 中间的item 的数据赋值并重绘
     *
     * @param preTemperature
     * @param temperature
     * @param nexTemperature
     * @param itemType
     */
    public void draws(long preTemperature, long temperature, long nexTemperature, int itemType) {
        this.mPreTemperature = preTemperature;
        this.mTemperature = temperature;
        this.mNexTemperature = nexTemperature;
        this.mItemType = itemType;

        invalidate();
    }


    /**
     * 第一个item 的数据赋值并重绘
     *
     * @param temperature
     * @param nexTemperature
     * @param itemType
     */
    public void draws(long temperature, long nexTemperature, int itemType) {
        this.mTemperature = temperature;
        this.mNexTemperature = nexTemperature;
        this.mItemType = itemType;

        invalidate();
    }


    /**
     * 根据屏幕高度和温度数据计算出坐标，为了显示在中间高点多加了/8项，低点多加了/4/8项
     *
     * @param height
     */
    private void calculateY(int height) {
        int minY = 50;
        int maxY = height - 50;
        //每度的高度 = 曲线的总高/温差
        float eachY = (maxY - minY) * 1f / (mTemperatureMax - mTemperatureMin);
        mCalculatedHeightY = minY + (mTemperatureMax - mTemperature) * eachY;
        mCalculatedPreHeightY = minY + (mTemperatureMax - mPreTemperature) * eachY;
        mCalculatedNextHeightY = minY + (mTemperatureMax - mNexTemperature) * eachY;
    }


    /**
     * 设置温度,日期，图标
     *
     * @param numberText
     */
    public void setText(long temperatureMax, long temperatureMin, String numberText) {
        this.mTemperatureMax = temperatureMax;
        this.mTemperatureMin = temperatureMin;
        this.mNumberText = numberText;
    }
}
