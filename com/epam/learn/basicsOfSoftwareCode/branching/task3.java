package com.epam.learn.basicsOfSoftwareCode.branching;

public class task3 {
    public static int x1=1;
    public static int x2=2;
    public static int x3=3;
    public static int y1=1;
    public static int y2=2;
    public static int y3=3;
    public static void main(String[] args) {
        int a=(x3-x1)/(x2-x1);
        int b=(y3-y1)/(y2-y1);
        if (a==b)
        System.out.println("Точки лежат на одной прямой");
else System.out.println("Точки не лежат на одной прямой");
    }
}
