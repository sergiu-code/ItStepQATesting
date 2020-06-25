package com.ItStep.Lesson._4;

import java.util.Scanner;

public class hometask7 {
    public static void main(String[] args) {

         /*Calculate the following numbers in a one-dimensional array filled by user:
        •	The sum of negative numbers.
        •	The sum of even numbers.
        •	The sum of odd numbers.
        •	The product of elements with indexes that can be divided by 3
        •	The product of the minimum and maximum elements.
        •	The sum of elements that are between the first and the last positive elements. (inclusive first, exclusive last)*/
        Scanner scanner = new Scanner(System.in);
        int[] newElem = new int[6];
        System.out.println("enter 6 elements in array: ");
        for (int a = 0; a < 6; a++) {
            newElem[a] = scanner.nextInt();
        }
        //The sum of negative numbers
        int sumN = 0;
        for (int b : newElem)
            if (b < 0) {
                sumN = sumN + b;
            }
        System.out.println("sum of negative numbers:" + sumN);

        int sumE = 0;
        for (int c : newElem)
            if (c % 2 == 0)
                sumE = sumE + c;
        System.out.println("sum of even numbers:" + sumE);

        int sumO = 0;
        for (int d : newElem)
            if (d % 2 != 0)
                sumO = sumO + d;
        System.out.println("sum of odd numbers:" + sumO);

        int prodDivby3 = 1;
        for (int e : newElem)
            if (e % 3 == 0)
                prodDivby3 = prodDivby3 * e;
        System.out.println("product of numbers divided by 3:" + prodDivby3);

    }
}






