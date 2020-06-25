package com.ItStep.Lesson._3;

import java.util.Scanner;

public class hometask2 {
    public static void main(String[] args) {
        /*The user enters two numbers from the keyboard.
        Calculate the sum, difference, and product of these numbers. Display the result.*/

        Scanner in = new Scanner(System.in);
        System.out.println("First number:");
        int num1 = in.nextInt();
        System.out.println("Second number:");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product:" + product);
    }

}
