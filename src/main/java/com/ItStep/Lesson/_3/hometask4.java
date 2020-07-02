package com.ItStep.Lesson._3;

import java.util.Scanner;

public class hometask4 {
    public static void main(String[] args) {

        /*The user enters the number of meters from the keyboard.
        Based on the user's choice, the program converts meters to miles, inches, or yards.
         */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of meters: ");
        int meters = scanner.nextInt();

        System.out.println("In which unit do u want to convert?:\nmiles\ninches\nyards");
        //Constants for mile, inch and yard in 1 meter;
        final double miles = meters * 0.000621371;
        final double inches = meters * 39.3701;
        final double yards = meters * 1.09361;

        scanner.nextLine();
        String choice = scanner.nextLine();
        System.out.println("Result:");

        switch (choice) {
            case "miles":
                System.out.println(meters + " meters convert to : " + miles + " miles");
                break;
            case "inches":
                System.out.println(meters + " meters convert to : " + inches + " inches");
                break;
            case "yards":
                System.out.println(meters + " meters convert to : " + yards + " yards");
                break;*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a unit of meter:");
        int meters = scanner.nextInt();

        System.out.println("convert to mile press 1\nconvert to inches press 2\nconvert to yards press 3");
        final double miles = meters * 0.000621371;
        final double inches = meters * 39.3701;
        final double yards = meters * 1.09361;
        int choice = scanner.nextInt();
        System.out.println("result:");

        switch (choice) {
            case 1:
                System.out.println(meters + " meters convert to : " + miles + " miles");
                break;
            case 2:
                System.out.println(meters + " meters convert to : " +inches + " inches");
                break;
            case 3:
                System.out.println(meters + " meters convert to : " + yards + " yards");


        }
    }
}































