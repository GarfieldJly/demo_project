package com.garfield.testthread.close;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jingliyuan
 * @date 2020/8/11
 * ThreadLocal 的用法
 */
public class DateFormatUtils {
    public static String DATE_PATTERN = "dd/MM/yyyy";
    public static String DATETIME_PATTERN_MIN = "dd/MM/yyyy HH:mm";
    public static String DATETIME_PATTERN = "dd/MM/yyyy HH:mm:ss";

    public static String EN_DATETIME_PATTERN = "dd-MMM-yyyy HH:mm";

    public static String EN_DATE_PATTERN = "dd-MMM-yyyy";

    public static String EN_DAY_PATTERN = "dd-MMM";

    public static String EN_DATETIMEFULL_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static String EN_DATETIMEFULL_PATTERN2 = "yyyy-MM-dd HH:mm";

    public static String EN_DAYTIME_PATTERN = "yyyy-MM-dd";

    public static String EN_HOURTIME_PATTERN = "HH:mm";

    private static String ZH_DAYTIME_PATTERN = "yy年M月d日 HH:mm";

    private static Map<String,ThreadLocal<SimpleDateFormat>> dateMap = new HashMap<>();

    private static Object lock = new Object();

    /**
     * 返回一个ThreadLocal的sdf,每个线程只会new一次SimpleDateFormat
     * SimpleDateFormat 线程不安全类
     */
    public static SimpleDateFormat getDateFormat(String pattern, DateFormatSymbols symbols){
        ThreadLocal<SimpleDateFormat> threadLocal = dateMap.get(pattern);
        if(threadLocal == null){
            synchronized (lock){
                threadLocal = dateMap.get(pattern);
                if(threadLocal == null){
                    threadLocal = new ThreadLocal(){
                        @Override
                        protected SimpleDateFormat initialValue() {
                            if(symbols == null){

                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                                return simpleDateFormat;
                            }
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern,symbols);
                            return simpleDateFormat;
                        }
                    };
                    dateMap.put(pattern,threadLocal);
                }
            }
        }
        return threadLocal.get();
    }

    /**
     * 是用ThreadLocal<SimpleDateFormat>来获取SimpleDateFormat,这样每个线程只会有一个SimpleDateFormat
     */
    public static String format(Date date, String pattern) {
        return getDateFormat(pattern, null).format(date);
    }

    public static Date parse(String dateStr, String pattern) {
        try {
            return getDateFormat(pattern, null).parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


}
