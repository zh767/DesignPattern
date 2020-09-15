package com.zh.jdk;

import java.util.Calendar;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/27
 */
public class Factory {
    public static void main(String[] args) {
        // getInstance 是 Calendar 静态方法
        Calendar cal = Calendar.getInstance();
        // 注意月份下标从0开始，所以取月份要+1
        System.out.println("年:" + cal.get(Calendar.YEAR));
        System.out.println("月:" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日:" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:" + cal.get(Calendar.MINUTE));
        System.out.println("秒:" + cal.get(Calendar.SECOND));
    }

    /**
     * OrderPizza的order调用createPizza创建不同的pizza
     * Calendar的getInstance调用createCalendar方法创建不同的calendar(简单工厂模式)
     *
     *  public static Calendar getInstance()
     *     {
     *         return createCalendar(TimeZone.getDefault(), Locale.getDefault(Locale.Category.FORMAT));
     *     }
     *
     *
     *  private static Calendar createCalendar(TimeZone zone,
     *                                            Locale aLocale)
     *     {
     *      Calendar cal = null;
     *         if (aLocale.hasExtensions()) {
     *             String caltype = aLocale.getUnicodeLocaleType("ca");
     *             if (caltype != null) {
     *                 switch (caltype) {
     *                 case "buddhist":
     *                 cal = new BuddhistCalendar(zone, aLocale);
     *                     break;
     *                 case "japanese":
     *                     cal = new JapaneseImperialCalendar(zone, aLocale);
     *                     break;
     *                 case "gregory":
     *                     cal = new GregorianCalendar(zone, aLocale);
     *                     break;
     *                 }
     *             }
     *         }
     *         return cal;
     *      }
     */
}
