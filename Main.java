package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1 for 12 hour format and input 0 for 24");
        int num = scanner.nextInt();
        Time []time = new Time[]{new Format(), new normalFormat()};
        time[num].print();
    }
}
