package com.ItStep.Lesson._4;

import java.util.Scanner;

public class PRACTICE {
    public static void main(String[] args) {
        int n, sumN = 0, sumE = 0, sumO = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            if (a[i] < 0)
                sumN = sumN + a[i];
            if (a[i] % 2 == 0) {
                sumE = sumE + a[i];
            } else {
                sumO = sumO + a[i];
            }
        }
        System.out.println("sum of negative number:" + sumN);
        System.out.println("Sum of Even Numbers:" + sumE);
        System.out.println("Sum of Odd Numbers:" + sumO);
    }
}

