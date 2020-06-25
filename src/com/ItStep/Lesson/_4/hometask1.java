package com.ItStep.Lesson._4;

import java.util.Scanner;

public class hometask1 {
    public static void main(String[] args) {

           /*The user enters two numbers from the keyboard.
            Display all odd numbers in the specified range.
            If the range limits were specified incorrectly, normalize them.?
            For example, the user entered 20 and 11, normalize the limits so that 11 becomes the beginning of the range and 20 the end.*/

        int r, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number for the range: ");
        int num1 = scanner.nextInt();//reads num1 from user
        System.out.print("Enter the second number for the range: ");
        int num2 = scanner.nextInt();//reads num2 from user

        int start;
        int end;
        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;

            System.out.println("The result odd numbers between range " + start + " and " + end + " are :");
            for (i = start; i <= end; i++) {
                r = i % 2;
                if (r == 1)
                    System.out.println(i);
            }
        }
    }
}



