package com.epam.learn.basicsOfSoftwareCode.branching;

public class task4 {
    public static int A = 64;
    public static int B = 255;
    public static int x = 120;
    public static int y = 250;
    public static int z = 65;

    public static void main(String[] args) {
        if (x < A && y < B || x < B && y < A)
            System.out.println("Кирпич пройдет");
        else if (x < A && z < B || x < B && z < A)
        System.out.println("Кирпич пройдет");
        else if(y < A && z < B || y < B && z < A)
            System.out.println("Кирпич пройдет");
        else System.out.println("Кирпич не пройдет");
    }
}
