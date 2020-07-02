package com.ItStep.Lesson._4;

import java.util.Scanner;

public class hometask5 {
    public static void main(String[] args) {

         /*Display a multiplication table in the range specified by the user.
    For example, if the user entered 3 and 5, the table may be as follows:

        3*1 = 3
        3*2 = 6
        3*3 = 9
        ............
        3* 10 = 30
        ......................................................
        5*1 = 5
        5 *2 = 10
        5 *3 = 15.....................
     */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 number: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        if (num1 < num2) {
            for (int i = num1; i <= num2; i++)
                for (int n = 1; n <= 10; n++)
                    System.out.println(i + "*" + n + "=" + i * n);
        }
        if (num2 < num1)
            for (int i = num2; i <= num1; i++)
                for (int n = 1; n <= 10; n++)
                    System.out.println(i + "*" + n + "=" + i * n);
        else {

            System.out.println("numbers are equal");
        }
    }
}

















