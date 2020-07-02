package com.ItStep.Lesson._5;

import java.util.Scanner;
/*
Write a method that returns the largest of four numbers.
Numbers are passed as parameters.
*/
public class hometask3 {
    static int returnLargestNum(int a, int b, int c, int d) {
        if (a > b && a > c && a > d)
            return a;
        if (b > c && b > d)
            return b;
        if (c > d)
            return c;
        return d;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("The largest of four numbers is: "+returnLargestNum(a,b,c,d));

    }
}