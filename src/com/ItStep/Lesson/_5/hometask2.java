package com.ItStep.Lesson._5;

import java.util.Scanner;

/*
Write a method that takes two numbers as a parameter and displays all even numbers between them.
*/
public class hometask2 {
    static void getSymbolLine(int lineLength, String symbol, boolean isVertical) {
        for (int i = 1; i <= lineLength; i++) {

            System.out.print(symbol);
            if (isVertical) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        getSymbolLine(6,"[",false);
    }
}






