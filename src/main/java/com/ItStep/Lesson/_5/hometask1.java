package com.ItStep.Lesson._5;

import java.util.Scanner;

/*
Write a method that takes two numbers as a parameter and displays all even numbers between them.
*/
public class hometask1 {
    static void getEvenNum(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Numbers between " + num1 + " and " + num2 + " are:");
        if (num1 < num2)
            getEvenNum(num1, num2);
        else if (num1 > num2)
            getEvenNum(num1, num2);
        else
            System.out.println("nr are equal");
    }
}

