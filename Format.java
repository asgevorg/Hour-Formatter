package com.company;

public class Format {
    long seconds = System.currentTimeMillis() / 1000;
    long minutes = seconds / 60;
    long hours = minutes / 60;
    public void print(){
        seconds = System.currentTimeMillis() / 1000;
        System.out.printf("%02d:%02d:%02d AM", hours % 24, minutes % 60, seconds % 60);
    }
}