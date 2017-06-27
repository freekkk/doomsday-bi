package cn.relaxtech.doomsday.bi.boot.utils;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 */
public class DateUtil {

    public static Date stringToDate(String strDate,
                                    String oracleFormat) {
        if (strDate == null) {
            return null;
        }
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
        String javaFormat = new String();
        String s = oracleFormat.toLowerCase();
        if (s.indexOf("yyyy") != -1) {
            h.put(new Integer(s.indexOf("yyyy")), "yyyy");
        } else if (s.indexOf("yy") != -1) {
            h.put(new Integer(s.indexOf("yy")), "yy");
        }

        if (s.indexOf("mm") != -1) {
            h.put(new Integer(s.indexOf("mm")), "MM");
        }
        if (s.indexOf("dd") != -1) {
            h.put(new Integer(s.indexOf("dd")), "dd");
        }
        if (s.indexOf("hh24") != -1) {
            h.put(new Integer(s.indexOf("hh24")), "HH");
        }
        if (s.indexOf("mi") != -1) {
            h.put(new Integer(s.indexOf("mi")), "mm");
        }
        if (s.indexOf("ss") != -1) {
            h.put(new Integer(s.indexOf("ss")), "ss");
        }

        for (int intStart = 0; s.indexOf("-", intStart) != -1; intStart++) {
            intStart = s.indexOf("-", intStart);
            h.put(new Integer(intStart), "-");
        }

        for (int intStart = 0; s.indexOf("/", intStart) != -1; intStart++) {
            intStart = s.indexOf("/", intStart);
            h.put(new Integer(intStart), "/");
        }

        for (int intStart = 0; s.indexOf(" ", intStart) != -1; intStart++) {
            intStart = s.indexOf(" ", intStart);
            h.put(new Integer(intStart), " ");
        }

        for (int intStart = 0; s.indexOf(":", intStart) != -1; intStart++) {
            intStart = s.indexOf(":", intStart);
            h.put(new Integer(intStart), ":");
        }

        if (s.indexOf("年") != -1) {
            h.put(new Integer(s.indexOf("年")), "年");
        }
        if (s.indexOf("月") != -1) {
            h.put(new Integer(s.indexOf("月")), "月");
        }
        if (s.indexOf("日") != -1) {
            h.put(new Integer(s.indexOf("日")), "日");
        }
        if (s.indexOf("时") != -1) {
            h.put(new Integer(s.indexOf("时")), "时");
        }
        if (s.indexOf("分") != -1) {
            h.put(new Integer(s.indexOf("分")), "分");
        }
        if (s.indexOf("秒") != -1) {
            h.put(new Integer(s.indexOf("秒")), "秒");
        }

        int i = 0;
        while (h.size() != 0) {
            Enumeration<Integer> e = h.keys();
            int n = 0;
            while (e.hasMoreElements()) {
                i = e.nextElement().intValue();
                if (i >= n) {
                    n = i;
                }
            }
            String temp = h.get(new Integer(n));
            h.remove(new Integer(n));
            javaFormat = temp + javaFormat;
        }
        SimpleDateFormat df = new SimpleDateFormat(javaFormat);
        Date myDate = new Date();
        try {
            myDate = df.parse(strDate);
        } catch (ParseException e) {
            return null;
        }
        return myDate;
    }


    public static String getNowTimeDateFormat(String format) {
        Date nowTime = new Date(System.currentTimeMillis());
        DateFormat Dformat = new SimpleDateFormat(format);
        return Dformat.format(nowTime);
    }

    /**
     * 计算连个日期之间的天数
     *
     * @param newDate
     *            新日期
     * @param oldDate
     *            旧日期
     * @return
     */
    public static int daysBetweenDates(Date newDate,
                                       Date oldDate) {
        int days = 0;
        Calendar calo = Calendar.getInstance();
        Calendar caln = Calendar.getInstance();
        calo.setTime(oldDate);
        caln.setTime(newDate);
        int oday = calo.get(Calendar.DAY_OF_YEAR);
        int nyear = caln.get(Calendar.YEAR);
        for (int oyear = calo.get(Calendar.YEAR); nyear > oyear;) {
            calo.set(Calendar.MONTH, 11);
            calo.set(Calendar.DATE, 31);
            days += calo.get(Calendar.DAY_OF_YEAR);
            oyear++;
            calo.set(Calendar.YEAR, oyear);
        }

        int nday = caln.get(Calendar.DAY_OF_YEAR);
        days = (days + nday) - oday;
        return days;
    }


    /**
     * 日期转换成指定格式的字符串
     *
     * @param date
     *            日期
     * @param format
     *            格式
     * @return
     */
    public static String dateToString(Date date, String format) {
        if (date == null) {
            return "";
        }
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
        String javaFormat = new String();
        String s = format.toLowerCase();
        if (s.indexOf("yyyy") != -1) {
            h.put(new Integer(s.indexOf("yyyy")), "yyyy");
        } else if (s.indexOf("yy") != -1) {
            h.put(new Integer(s.indexOf("yy")), "yy");
        }
        if (s.indexOf("mm") != -1) {
            h.put(new Integer(s.indexOf("mm")), "MM");
        }
        if (s.indexOf("dd") != -1) {
            h.put(new Integer(s.indexOf("dd")), "dd");
        }
        if (s.indexOf("hh24") != -1) {
            h.put(new Integer(s.indexOf("hh24")), "HH");
        }
        if (s.indexOf("mi") != -1) {
            h.put(new Integer(s.indexOf("mi")), "mm");
        }
        if (s.indexOf("ss") != -1) {
            h.put(new Integer(s.indexOf("ss")), "ss");
        }
        for (int intStart = 0; s.indexOf("-", intStart) != -1; intStart++) {
            intStart = s.indexOf("-", intStart);
            h.put(new Integer(intStart), "-");
        }

        for (int intStart = 0; s.indexOf("/", intStart) != -1; intStart++) {
            intStart = s.indexOf("/", intStart);
            h.put(new Integer(intStart), "/");
        }

        for (int intStart = 0; s.indexOf(" ", intStart) != -1; intStart++) {
            intStart = s.indexOf(" ", intStart);
            h.put(new Integer(intStart), " ");
        }

        for (int intStart = 0; s.indexOf(":", intStart) != -1; intStart++) {
            intStart = s.indexOf(":", intStart);
            h.put(new Integer(intStart), ":");
        }

        if (s.indexOf("年") != -1) {
            h.put(new Integer(s.indexOf("年")), "年");
        }
        if (s.indexOf("月") != -1) {
            h.put(new Integer(s.indexOf("月")), "月");
        }
        if (s.indexOf("日") != -1) {
            h.put(new Integer(s.indexOf("日")), "日");
        }
        if (s.indexOf("时") != -1) {
            h.put(new Integer(s.indexOf("时")), "时");
        }
        if (s.indexOf("分") != -1) {
            h.put(new Integer(s.indexOf("分")), "分");
        }
        if (s.indexOf("秒") != -1) {
            h.put(new Integer(s.indexOf("秒")), "秒");
        }
        int i = 0;
        while (h.size() != 0) {
            Enumeration<Integer> e = h.keys();
            int n = 0;
            while (e.hasMoreElements()) {
                i = e.nextElement().intValue();
                if (i >= n) {
                    n = i;
                }
            }
            String temp = h.get(new Integer(n));
            h.remove(new Integer(n));
            javaFormat = temp + javaFormat;
        }
        SimpleDateFormat df = new SimpleDateFormat(javaFormat,
                new DateFormatSymbols());
        return df.format(date);
    }

    /**
     * 得到间隔一定天数的日期
     *
     * @param date
     *            日期
     * @param intBetween
     *            间隔天数
     * @return
     */
    public static Date getDateBetween(Date date,
                                      int intBetween) {
        Calendar calo = Calendar.getInstance();
        calo.setTime(date);
        calo.add(Calendar.DAY_OF_MONTH, intBetween);
        return calo.getTime();
    }

}
