package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class normalFormat extends Time{
    public void print(){
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int hour = 0;
        while(hours > 12){
            hour++;
            hours--;
        }
        System.out.printf("%02d", hour);
        System.out.print(":");
        System.out.printf("%02d", minute);
    }
}
