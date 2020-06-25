package com.ItStep.Lesson.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionsTask2 {
    public static Map<String, String> Users = new HashMap<>();

    public static void addUser(String username, String password) {
        Users.put(username, password);
        System.out.println("The new User is: " + "{" + username + "}" + " with password " + "{" + password + "}");
        System.out.println("The list with users is: " + Users);
        System.out.println();
    }

    public static void deleteUser(String userToDelete) {
        String remove = Users.remove(userToDelete);
        if (remove != null) {
            System.out.println("Username" + "{" + userToDelete + "}" + " has been deleted");
            System.out.println("Existing user's in the list are: " + Users);
        } else
            System.out.println("User has not been found!");
        System.out.println();

    }

    public static void checkIfUserExists(String checkUser) {
        if (Users.containsKey(checkUser)) {
            System.out.println("The User: " + "{" + checkUser + "}" + " exists in the list");
        } else
            System.out.println("The User: " + "{" + checkUser + "}" + " not exists in the list");
        System.out.println("The list with Users is:" + Users);
        System.out.println();
    }

    public static void changeUsername(String usernameToChange, String newUsername) {
        if (Users.containsKey(usernameToChange)) {
            Users.put(newUsername, Users.get(usernameToChange));
            Users.remove(usernameToChange);
        } else
            System.out.println("The user " + "{" + usernameToChange + "}" + " is not in the list");
        System.out.println("The list of users is: " + Users);
        System.out.println();
    }

    public static void changePassword(String userToChangePass, String newPassword) {
        System.out.println("the password for " + userToChangePass + " has been changed");
        addUser(userToChangePass, newPassword);
        System.out.println();
    }


    public static void main(String[] args) {
        boolean end = false;
        do {
            System.out.print("Choose a menu option below then press Enter or press 0 to Exit:\n" +
                    "Press 1. Add a new user\n" +
                    "Press 2. Delete a user\n" +
                    "Press 3. Check if the user exists\n" +
                    "Press 4. Change the username of a user\n" +
                    "Press 5. Change the password of a user\n");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter username:");
                    String username = scanner.next();
                    System.out.println("Enter password:");
                    String password = scanner.next();
                    addUser(username, password);
                    break;
                case 2:
                    System.out.println("Enter username you want to delete:");
                    String userToDelete = scanner.next();
                    deleteUser(userToDelete);
                    break;
                case 3:
                    System.out.println("Enter username to check if exists: ");
                    String checkUser = scanner.next();
                    checkIfUserExists(checkUser);
                    break;
                case 4:
                    System.out.println("Enter username you want to change:");
                    String usernameToChange = scanner.next();
                    System.out.println("Enter a new username to change for:");
                    String newUsername = scanner.next();
                    changeUsername(newUsername, usernameToChange);
                    break;
                case 5:
                    System.out.println("Enter username that you want to change password for:");
                    String userToChangePass = scanner.next();
                    System.out.println("Enter a new password:");
                    String newPassword = scanner.next();
                    changePassword(userToChangePass, newPassword);
                    break;
                case 0:
                    System.out.println("Have a good day!");
                    end = true;
                    break;
                default:
                    System.out.println("You entered an wrong option number!");
            }

        } while (!end);
    }
}
