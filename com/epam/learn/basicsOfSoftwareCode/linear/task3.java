package com.epam.learn.basicsOfSoftwareCode.linear;

public class task3 {
    public static void main(String[] args) {
        double x = 30;
        double y = 45;
        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println(z);
    }
}
