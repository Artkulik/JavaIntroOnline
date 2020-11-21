package com.epam.learn.basicsOfSoftwareCode.branching;

public class task5 {
    public static void main(String[] args) {
        double x = (double) Math.round(Math.random()*5);
        System.out.println(x);
        if(x<=3)
            System.out.println(x*x-3*x+9);
        else System.out.println(1/(Math.pow(3,x)+6));
    }
}
