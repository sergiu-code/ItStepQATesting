package com.ItStep.Lesson._4;

import java.util.Scanner;

public class hometask3 {
    public static void main(String[] args) {

           /*The user enters the length of a line and a symbol which the line should be made of.
    Display a vertical line made of the entered symbol of the specified length.
    For example, if the user entered 5 and %, the output would be as follows:
        %
        %
        %
        %
        %

            */


        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of the line:");
        length = scanner.nextInt();
        System.out.println("enter a symbol witch the line should be made of:");

        scanner.nextLine();
        String symbol = scanner.nextLine();
        for (int i = 1; i <= length; i++) {
            System.out.print(symbol);

        }
    }
}
