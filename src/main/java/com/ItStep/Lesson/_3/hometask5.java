package com.ItStep.Lesson._3;

import java.util.Scanner;

public class hometask5<x> {
    public static void main(String[] args) {
        /*The user enters from the keyboard the number of hours.
        If the received value is in the range from 0 to 6, display "Good Night,"
         if in the range from 6 to 13, display "Good Morning,"
         if in the range from 13 to 17, display "Good Day,"
         if in the range from 17 to 0, display "Good Evening."
         The upper limit of the range is not included. For example, number 6 refers to the range from 6 to 13.
         */

        Scanner time = new Scanner(System.in);
        System.out.println("Enter number of hours:");
        int xHours = time.nextInt();
        if (xHours > 0 && xHours < 6)
            System.out.println("Good night");
        else if (xHours >= 6 && xHours < 13)
            System.out.println("Good morning");
        else if (xHours >= 13 && xHours < 17)
            System.out.println("Good day");
        else if (xHours >= 17 && xHours <= 24)
            System.out.println("Good evening");
        else
            System.out.println("Wrong hour");
    }
}

