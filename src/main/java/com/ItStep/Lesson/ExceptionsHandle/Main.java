package com.ItStep.Lesson.ExceptionsHandle;

import java.io.IOException;

public class Main {
    //    static void validate(int age){
//        if(age<18) {
//            throw new ArithmeticException("not valid for voting");
//        } else
//            System.out.println("welcome to vote");
//    }
    void m() throws IOException {
        throw new java.io.IOException("device error");//checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }


    public static void main(String[] args) {
//        try {
//            String s = "abc";
//            int i = Integer.parseInt(s);
//        }catch (NumberFormatException e) {
//            System.err.println(e.getMessage()+" must input numbers for cast to integer not characters");
//        }
//        String t = "123";
//        int j = Integer.parseInt(t);
//        System.out.println(t);

//        try {
//            int data = 25 / 0;
//            System.out.println(data);
//        } catch (ArithmeticException e) {
//            System.err.println(e);
//        } finally {
//            System.out.println("finally block is always executed");
//        }
//        System.out.println("rest of the code...");
//    }

//        validate(13);
//        System.out.println("rest of the code...");
        Main obj = new Main();
        obj.p();
        System.out.println("normal flow");
    }
}



