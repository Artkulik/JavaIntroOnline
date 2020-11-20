package com.epam.learn.basicsOfSoftwareCode.branching;

public class task2 {
    public static void main(String[] args) {
        int a = 1;
        int b=2;
        int c=3;
        int d=4;
        int x=Math.min(a,b);
        int y=Math.min(c,d);
        System.out.println(x);
        System.out.println(y);
        if(x<y)
            System.out.println(y);
        else System.out.println(x);
    }
}
