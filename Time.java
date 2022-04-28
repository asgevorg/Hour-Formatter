package com.company;

public class Time {
    long  milliseconds = System.currentTimeMillis();
    long seconds = (milliseconds / 1000) % 60;
    int minutes = (int) (milliseconds / 1000 / 60) % 60;
    long hours =  (milliseconds / 1000 / 60 / 60) % 24;
    public void print(){
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
