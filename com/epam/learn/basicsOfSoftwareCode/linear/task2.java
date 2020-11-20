package com.epam.learn.basicsOfSoftwareCode.linear;

public class task2 {

    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;
        double x = ((b * b) + 4 * a * c);
        x=Math.sqrt(x);
        System.out.println(x);
        double z = (b + x) / (2 * a) - (a * a * a * c) + (1 / b * b);
        System.out.println(z);
    }
}
