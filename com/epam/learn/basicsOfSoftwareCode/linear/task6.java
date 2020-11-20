package com.epam.learn.basicsOfSoftwareCode.linear;

public class task6 {
    public static int x=4;
    public static int y=-2;
    public static void main(String[] args) {

        if(x>=-4 && x<=4 && y>=-3 && y<=0) {
            System.out.println(true);
        }
         else if (x>=-2 && x<=2 && y>=0 && y<=4){
            System.out.println(true);
        }else System.out.println(false);
    }
}
