package com.epam.learn.basicsOfSoftwareCode.linear;

public class task5 {
    public static void main(String[] args) {
        int T=3700;
        int sec=T%60;
        int m=(T-sec)/60;
        int min=m%60;
        int h=(m-min)/60;
        System.out.println(h+" час "+ min + " минута "+ sec + " секунд");
    }
}
