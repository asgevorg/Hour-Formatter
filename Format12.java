package com.company;

public class Format12 extends Format{
    public void print(){
        seconds = System.currentTimeMillis() / 1000;
        if(hours > 12){
            hours-=12;
        }
        System.out.printf("%02d:%02d:%02d PM", hours % 24, minutes % 60, seconds % 60);
    }
}
