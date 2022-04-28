package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1 for 12 hour format and input 0 for 24");
        int num = scanner.nextInt();
        num = (1 + (num >> 31) - (-num >> 31)) - 1;
        Time []time = new Time[]{new Time(), new NormalFormat()};
        time[num].print();
    }
}
