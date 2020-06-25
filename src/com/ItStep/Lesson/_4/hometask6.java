package com.ItStep.Lesson._4;

import java.util.Scanner;

public class hometask6 {
    public static void main(String[] args) {

          /*The user enters elements of a one-dimensional array from the keyboard.
            Find the sum and arithmetic mean of the array element; display all elements of the array.*/

        int sum = 0;
        int mean = 0;

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[6];
        System.out.println("Enter 6 numbers to store in array:");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();

            sum = sum + num[i];
            mean = sum / num.length;
        }
        System.out.println("Sum of array element: " + sum);
        System.out.println("Arithmetic mean of array: " + mean);
        System.out.print("One dimensional array elements are :\n");
        for (int i = 0; i < num.length; i++) {
            System.out.println("a[" + i + "]:" + num[i]);
        }
    }
}

