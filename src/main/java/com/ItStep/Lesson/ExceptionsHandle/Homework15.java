package com.ItStep.Lesson.ExceptionsHandle;

import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) throws CustomException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 0 and 9:");
        String number = scanner.next();
        Convert(number, scanner);
    }

    public static void Convert(String number, Scanner scanner) throws CustomException {
        try {
            int stringToInt = Integer.parseInt(number);
            if (stringToInt >= 0 && stringToInt <= 9)
                System.out.println("Converted number is " + stringToInt+"\nType in again:");
            else {
                throw new CustomException(number);
            }
        } catch (NumberFormatException exception) {
            System.out.println("You've entered a character! Type in a number");
        }
        String num = scanner.next();
        Convert(num, scanner);
    }
}

