package com.ItStep.Lesson._3;


import java.util.Scanner;

public class hometask3 {
    public static void main(String[] args) {
        /*The user enters a number from the keyboard. Check whether it is even or odd.
         If the number is even, display the number and the phrase "Even number."
         If the number is odd, display the number and the phrase "Odd number."*/

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = in.nextInt();
        if (x % 2 == 0)
            System.out.println(x + " even number");
        else
            System.out.println(x + " odd number");
    }
}
