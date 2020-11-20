package com.epam.learn.basicsOfSoftwareCode.linear;


public class task4 {
    public static void main(String[] args) {
        double x = 111.222;
        System.out.println(x);
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
    }
}
