package com.ItStep.Lesson._5;

import java.util.Scanner;
/*
Write a method that checks if a number is prime.
The number is passed as a parameter.
If the number is prime, return true, otherwise false.
*/
public class hometask4 {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = scanner.nextInt();
        if (isPrime(n))
            System.out.println("true number "+n+" is prime");
        else
            System.out.println("false number "+n+" is not prime");
    }
}