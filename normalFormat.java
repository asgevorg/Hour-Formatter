package com.company;

public class normalFormat extends Time{
    public void print(){
        if(hours > 12){
            hours-=12;
        }
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
