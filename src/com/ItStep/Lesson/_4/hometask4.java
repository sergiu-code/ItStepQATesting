package com.ItStep.Lesson._4;

import java.util.Scanner;

public class hometask4 {
    public static void main(String[] args) {

            /*The user enters two numbers (the beginning and the end of the range).
    Analyze all the numbers in this range.
    The output should be according to the rules below.
    If the number is divisible by 3 (it is divided by 3 without a remainder), display the word Fizz.
    If the number is divisible by 5, display the word Buzz. I
    f the number is divisible by 3 and 5, output Fizz Buzz.
    If the number is not divisible by 3 or 5, output the number itself.
     */


        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number for the range: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number for the range: ");
        int num2 = scanner.nextInt();
        System.out.println("The result numbers between range " + num1 + " and " + num2 + " are :");
        for (i = num1; i <= num2; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\nDivisible by 3:");
        for (i = num1; i <= num2; i++) {
            if (i % 3 == 0)
                System.out.print(i+"-Fizz; ");
        }
        System.out.println("\nDivisible by 5: ");
        for (i = num1; i <= num2; i++) {
            if (i % 5 == 0)
                System.out.print(i+"-Buzz; ");
        }
        System.out.println("\nDivisible by 3 and 5: ");
        for (i = num1; i <= num2; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i+"-FizzBuzz; ");
            }
        }
        System.out.println("\nNot divisible by 3 or 5: ");
        for (i = num1; i <= num2; i++) {
            if (i % 3 != 0 && i % 5 != 0)
                System.out.print(i + ", ");
        }

    }

}






