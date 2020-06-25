package com.ItStep.Lesson.ExceptionsHandle;

import java.util.Scanner;

public class OnlyAdultsVote extends RuntimeException {
    public OnlyAdultsVote(String message) {
        super(message);
    }

    private static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            throw new OnlyAdultsVote("You cannot vote! Your age is " + age + "! You must be  18 years old to vote");

        }

    }


    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int age = scanner.nextInt();
            checkAge(age);
        } catch (OnlyAdultsVote vote) {
            System.err.println(vote.getMessage());
        }
//        int age = scanner.nextInt();
//        checkAge(age);
    }
}