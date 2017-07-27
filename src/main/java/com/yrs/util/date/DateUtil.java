package com.yrs.util.date;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by yrs on 2017/7/27.
 */
public class DateUtil {

    public static Date getAgoHour(Date date, int agoHour) {

        Calendar ca=Calendar.getInstance();
        ca.setTime(date);
        ca.set(Calendar.HOUR, ca.get(Calendar.HOUR) - agoHour);
        return ca.getTime();
    }

    public static Date getAfterHour(Date date, int afterHour) {
        Calendar ca=Calendar.getInstance();
        ca.setTime(date);
        ca.set(Calendar.HOUR, ca.get(Calendar.HOUR) + afterHour);
        return ca.getTime();
    }
}
                