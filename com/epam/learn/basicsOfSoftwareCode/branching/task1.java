package com.epam.learn.basicsOfSoftwareCode.branching;

public class task1 {
    public static int a=80;
    public static int b=90;
    public static void main(String[] args) {

        if ((a==90 && (a+b)<180 ) || (b==90 && (a+b)<180))
            System.out.println("Такой треугольник существует. Он прямоугольный.");
        else if((a+b)<180)
            System.out.println("Такой треугольник существует");
        else System.out.println("Такого треугольника не существует");
    }
}
