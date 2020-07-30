package com.xy.jepackdemo.common;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author libo
 * @date 2019/1/3.
 * description: 时间管理类
 */
public class DateUtil {

    private static DateUtil util;

    public static DateUtil getInstance() {
        if (util == null) {
            synchronized (DateUtil.class) {
                if (util == null) {
                    util = new DateUtil();
                }
            }
        }
        return util;
    }

    private SimpleDateFormat formatToMS = new SimpleDateFormat("mm:ss", Locale.CHINA);
    private SimpleDateFormat formatToHM = new SimpleDateFormat("HH:mm", Locale.CHINA);
    private SimpleDateFormat formatToYMD = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
    private SimpleDateFormat formatToYMDHMS = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CHINA);
    private SimpleDateFormat formatToMS_CN = new SimpleDateFormat("mm分ss秒", Locale.CHINA);


    public String dateToString(Date data, String formatType) {
        return new SimpleDateFormat(formatType).format(data);
    }


    public Date longToDate(long currentTime, String formatType)
            throws Exception {
        //根据long类型的毫秒数生命一个date类型的时间
        Date dateOld = new Date(currentTime);
        //把date类型的时间转换为string
        String sDateTime = dateToString(dateOld, formatType);
        return stringToDate(sDateTime, formatType);
    }

    public String longToString(long currentTime, String formatType)
            throws Exception {
        //long类型转成Date类型
        Date date = longToDate(currentTime, formatType);
        //date类型转成String
        String strTime = dateToString(date, formatType);
        return strTime;
    }

    public Date stringToDate(String strTime, String formatType)
            throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat(formatType);
        return formatter.parse(strTime);
    }

    public Calendar stringToCalendar(String strTime, String formatType) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(formatType);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(formatter.parse(strTime));
            return calendar;
        } catch (ParseException e) {
            LogUtil.e("stringToCalendar-------------ParseException:" + e.toString());
        }
        return null;
    }

    /**
     * yyyy-MM-dd 串 转 date
     */
    public Date ymdToDate(String str) {
        try {
            return formatToYMD.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * yyyy-MM-dd HH:mm:ss 串 转 date
     */
    public Date ymdhmsToDate(String str) {
        try {
            return formatToYMDHMS.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * date 转 mm:ss的串
     */
    private String dateToMS(Date date) {
        return formatToMS.format(date);
    }

    /**
     * date 转 HH:mm的串
     */
    private String dateToHM(Date date) {
        return formatToHM.format(date);
    }

    /**
     * date 转 ymd的串
     */
    public String dateToYMD(Date date) {
        return formatToYMD.format(date);
    }

    /**
     * date 转 ymd hms的串
     */
    private String dateToYMDHMS(Date date) {
        return formatToYMDHMS.format(date);
    }

    /**
     * date 转 ms的串
     */
    public String longToMS(long time) {
        Date date = new Date(time);
        return dateToMS(date);
    }

    /**
     * date 转 hm的串
     */
    public String longToHM(long time) {
        Date date = new Date(time);
        return dateToHM(date);
    }

    /**
     * date 转 ymd的串
     */
    public String longToYMD(long time) {
        Date date = new Date(time);
        return dateToYMD(date);
    }

    /**
     * date 转 ymd hms的串
     */
    public String longToYMDHMS(long time) {
        Date date = new Date(time);
        return dateToYMDHMS(date);
    }

    public long toUTC(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
//        2、取得时间偏移量：
        int zoneOffset = cal.get(Calendar.ZONE_OFFSET);
//        3、取得夏令时差：
        int dstOffset = cal.get(Calendar.DST_OFFSET);
//        4、从本地时间里扣除这些差量，即可以取得UTC时间：
        cal.add(Calendar.MILLISECOND, -(zoneOffset + dstOffset));
        return cal.getTimeInMillis();
    }

    /**
     * 得到UTC时间，类型为字符串，格式为"yyyy-MM-dd HH:mm"
     * 如果获取失败，返回null
     */
    public String getUTCTimeStr() {
        StringBuilder stringBuilder = new StringBuilder();
        // 1、取得本地时间：
        Calendar cal = Calendar.getInstance();
        // 2、取得时间偏移量：
        int zoneOffset = cal.get(Calendar.ZONE_OFFSET);
        // 3、取得夏令时差：
        int dstOffset = cal.get(Calendar.DST_OFFSET);
        // 4、从本地时间里扣除这些差量，即可以取得UTC时间：
        cal.add(Calendar.MILLISECOND, -(zoneOffset + dstOffset));
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        stringBuilder.append(year).append("-").append(month).append("-").append(day);
        stringBuilder.append(" ").append(hour).append(":").append(minute);
        try {
            formatToYMD.parse(stringBuilder.toString());
            return stringBuilder.toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将UTC时间转换为东八区时间
     */
    public String getLocalTimeFromUTC(String utcTime) {
        String localTimeStr = null;
        try {
            Date utcDate = formatToYMD.parse(utcTime);
            formatToYMD.setTimeZone(TimeZone.getTimeZone("GMT-8"));
            localTimeStr = formatToYMD.format(utcDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return localTimeStr;
    }

    public long getCheckDate(int year, int month, int day, int hour, int minute, int s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(year).append("-").append(month).append("-").append(day).append(" ").append(hour).append(":").append(minute).append(":").append(s);
        try {
            return formatToYMDHMS.parse(stringBuilder.toString()).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public long getLastMonthStart(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        calendar.set(year, month - 1, 1, 0, 0, 0);
        return calendar.getTime().getTime();
    }


    public static String[] WEEK = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
    public static final int WEEKDAYS = 7;

    public static String dateToWeek(Date date) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayIndex = calendar.get(Calendar.DAY_OF_WEEK);
        if (dayIndex < 1 || dayIndex > WEEKDAYS) {
            return null;
        }

        return WEEK[dayIndex - 1];
    }

    /**
     * 返回星期的int类型
     */
    public static Integer[] WEEK_INDEX = {7, 1, 2, 3, 4, 5, 6};

    public static int dateToWeekIndex(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayIndex = calendar.get(Calendar.DAY_OF_WEEK);
        if (dayIndex < 1 || dayIndex > WEEKDAYS) {
            return 0;
        }
        return WEEK_INDEX[dayIndex - 1];
    }


    /**
     * 获取本周的开始时间
     */
    public static Date getBeginDayOfWeek() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
        if (dayofweek == 1) {
            dayofweek += 7;
        }
        cal.add(Calendar.DATE, 2 - dayofweek);
        return getDayStartTime(cal.getTime());
    }

    /**
     * 获取本周的结束时间
     */
    public static Date getEndDayOfWeek() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getBeginDayOfWeek());
        cal.add(Calendar.DAY_OF_WEEK, 6);
        Date weekEndSta = cal.getTime();
        return getDayEndTime(weekEndSta);
    }


    /**
     * 获取某个日期的开始时间
     */
    public static Timestamp getDayStartTime(Date d) {
        Calendar calendar = Calendar.getInstance();
        if (null != d) {
            calendar.setTime(d);
        }
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return new Timestamp(calendar.getTimeInMillis());
    }

    /**
     * 获取某个日期的结束时间
     */
    public static Timestamp getDayEndTime(Date d) {
        Calendar calendar = Calendar.getInstance();
        if (null != d) {
            calendar.setTime(d);
        }
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return new Timestamp(calendar.getTimeInMillis());
    }


    /**
     * String转为long
     */
    public long stringToLong(String strTime, String formatType) {
        try {
            // String类型转成date类型
            Date date = stringToDate(strTime, formatType);
            if (date == null) {
                return 0;
            } else {
                return date.getTime();
            }
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * 获取今天往后一周的日期（几月几号）
     */
    public static List<String> getSevendate() {
        List<String> dates = new ArrayList<>();
        final Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));

        for (int i = 0; i < 7; i++) {
            // 获取当前年份
            String mYear = String.valueOf(c.get(Calendar.YEAR));
            // 获取当前月份
            String mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);
            // 获取当前日份的日期号码
            String mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH) + i);
            if (Integer.parseInt(mDay) > MaxDayFromDay_OF_MONTH(Integer.parseInt(mYear), (i + 1))) {
                mDay = String.valueOf(MaxDayFromDay_OF_MONTH(Integer.parseInt(mYear), (i + 1)));
            }
            String date = mYear + "." + mMonth + "." + mDay;
            dates.add(date);
        }
        return dates;
    }

    /**
     * 得到当年当月的最大日期
     **/
    public static int MaxDayFromDay_OF_MONTH(int year, int month) {
        Calendar time = Calendar.getInstance();
        time.clear();
        time.set(Calendar.YEAR, year);
        //注意,Calendar对象默认一月为0  
        time.set(Calendar.MONTH, month - 1);
        //本月份的天数
        int day = time.getActualMaximum(Calendar.DAY_OF_MONTH);
        return day;
    }

}
