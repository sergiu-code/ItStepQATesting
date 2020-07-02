package com.ItStep.Lesson.ExceptionsHandle;

import java.util.Scanner;

// we cover the case of out number range
class MyException extends Exception {
    public MyException(String message) {
        super("Number " + message + " is out of range between 0-9");

    }


    public static void main(String[] args) throws MyException {
        boolean Character = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number between 0 and 9:");
            String myString = scanner.next();
            try {
                int num = Integer.parseInt(myString);
                if (num > 0 && num < 9) {
                    System.out.println("number type in is: " + num);
                    Character = true;
                } else {
// we throw a custom exception by constructor MyException
                    throw new MyException(myString);
                }
            } catch (NumberFormatException e) {
                System.out.println("You enter a character! Try again and enter a number ");
            }
        } while (!Character);
    }
}
