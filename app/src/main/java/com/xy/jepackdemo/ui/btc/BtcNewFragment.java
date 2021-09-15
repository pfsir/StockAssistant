package com.xy.jepackdemo.ui.btc;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.lifecycle.ViewModelProviders;

import com.xy.baselib.base.BaseLazyFragment;
import com.xy.jepackdemo.R;
import com.xy.jepackdemo.databinding.FragmentNewBtcBinding;

/**
 * @author oyangpengfei
 * @date 2021/04/29.
 * description 打开对应的webview
 */
public class BtcNewFragment extends BaseLazyFragment<BtcViewModel, FragmentNewBtcBinding> {


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_new_btc;
    }

    @Override
    protected void initView() {
        // 设置WebView的客户端
        dataBinding.wbView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;// 返回false
            }

        });
        WebSettings webSettings = dataBinding.wbView.getSettings();
        // 让WebView能够执行javaScript
        webSettings.setJavaScriptEnabled(true);
        // 让JavaScript可以自动打开windows
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        // 设置缓存
        webSettings.setAppCacheEnabled(true);
        // 设置缓存模式,一共有四种模式
        webSettings.setCacheMode(webSettings.LOAD_CACHE_ELSE_NETWORK);
        // 支持缩放(适配到当前屏幕)
        webSettings.setSupportZoom(true);
        // 将图片调整到合适的大小
        webSettings.setUseWideViewPort(true);
        // 支持内容重新布局,一共有四种方式
        // 默认的是NARROW_COLUMNS
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        // 设置可以被显示的屏幕控制
        webSettings.setDisplayZoomControls(true);
        // 设置默认字体大小
        webSettings.setDefaultFontSize(12);

        dataBinding.wbView.loadUrl("https://history.btc126.com/zhishu/");
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void lazyLoad() {
    }

    @Override
    protected BtcViewModel initViewModel() {
        return ViewModelProviders.of(this).get(BtcViewModel.class);
    }

    @Override
    protected void showError(Object obj) {

    }
}
