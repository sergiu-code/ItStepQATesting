package com.ItStep.Lesson._4;

import java.util.Scanner;

public class hometask2 {
    public static void main(String[] args) {

           /*The user enters a number from the keyboard.
    Calculate the factorial of the number.
    For example, if 3 was entered, the factorial would be 1*2*3 = 6.
    The factorial formula is n! = 1*2*3...*n, where n is the number to calculate the factorial.
     */

        int n;
        int i;
        int factorial = 1;

        System.out.println("Enter an number to calculate its factorial: ");
        Scanner number = new Scanner(System.in);

        n = number.nextInt();

        if (n < 0)
            System.out.println("Number should be positive.");
        else {
            for (i = 1; i <= n; i++)
                factorial = factorial * i;
            System.out.println("Factorial of " + n + " is = "+factorial);


        }
    }
}


