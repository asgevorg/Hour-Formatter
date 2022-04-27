package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Time {
    public void print(){
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        System.out.printf("%02d", hours);
        System.out.print(":");
        System.out.printf("%02d", minute);
    }
}
