package com.yrs.util.date;

import org.junit.Test;

import java.util.Date;

/**
 * Created by yrs on 2017/7/27.
 */
public class DateUtilTest {

    @Test
    public void testGetAgoHour() throws Exception {
        Date date = new Date();
        System.out.println(date);
        System.out.println(DateUtil.getAgoHour(date, 2));
    }

    @Test
    public void testGetAfterHour() throws Exception {
        Date date = new Date();
        System.out.println(date);
        System.out.println(DateUtil.getAfterHour(date, 2));
    }
}