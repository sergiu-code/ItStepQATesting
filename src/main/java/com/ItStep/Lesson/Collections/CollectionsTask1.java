package com.ItStep.Lesson.Collections;


import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsTask1 {
    public static ArrayList < Integer > numbers = new ArrayList <>();

    public static void addItemToList(Integer addItem) {
        numbers.add(addItem);
        System.out.println("the list with number are: " + numbers);
        System.out.println();
    }

    public static void removeItemFromLIst(Integer deleteItem) {
        for (int i = 0; i < numbers.size(); i++) {
            if (deleteItem.equals(numbers.get(i))) {
                numbers.remove(numbers.get(i));
                System.out.println("Numbers in the list are: " + numbers);
                System.out.println();
            }
        }
    }

    public static void displayListItem() {
        if (numbers.isEmpty()) {
            System.out.println("List is Empty...");
        } else {
            System.out.println("List content is: " + numbers);
            System.out.println();
        }
    }

    public static void checkValueInList(Integer checkNr) {
        if (numbers.contains(checkNr)) {
            System.out.println("Contains in the list");
        } else {
            System.out.println("Not contains in the list");
            System.out.println();
        }
    }

    public static void replaceItemInList(int numberToChange, int toWhatNumber) {
        int i = 0;
        for (Integer number : numbers) {
            if (number == numberToChange)
                numbers.set(i, toWhatNumber);
            System.out.println("The Updated list is: " + numbers);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter:");
        int number = scanner.nextInt();
        System.out.println("Enter numbers:");
        for (int i = 0; i < number; i++) {
            numbers.add(scanner.nextInt());
        }
        System.out.println("The list number are: " + numbers);
        System.out.println();
        boolean done = false;
        do {
            System.out.print("Choose a option in menu below. After that press Enter or 0 to Exit program:\n" +
                    "Press 1. Add an item to the list\n" +
                    "Press 2. Delete an item from the list\n" +
                    "Press 3. Display the list content\n" +
                    "Press 4. Check if a number is in the list\n" +
                    "Press 5. Replace the number in the list\n");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Add an item to list:");
                    Integer addItem = scanner.nextInt();
                    addItemToList(addItem);
                    break;
                case 2:
                    System.out.println("Delete an item from list:");
                    Integer deleteItem = scanner.nextInt();
                    removeItemFromLIst(deleteItem);
                    break;
                case 3:
                    displayListItem();
                    break;
                case 4:
                    System.out.println("Check an item in list:");
                    Integer checkNr = scanner.nextInt();
                    checkValueInList(checkNr);
                    break;
                case 5:
                    System.out.println("Enter number you want to change:");
                    int numberToChange = scanner.nextInt();
                    System.out.println("Enter to what number to change:");
                    int toWhatNumber = scanner.nextInt();
                    replaceItemInList(numberToChange, toWhatNumber);
                    break;
                case 0:
                    System.out.println("Thanks for your service");
                    done = true;
                    break;
                default:
                    System.out.println("Choosed an wrong option! Try Again!");
            }
        } while (!done);
    }
}




