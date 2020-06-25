package com.ItStep.Lesson.ExceptionsHandle;

public class Main1 {
    public void finalize(){System.out.println("finalize called");}

    public static void main(String[] args) {
        Main1 f1=new Main1();
        Main1 f2=new Main1();
        f1=null;
        f2=null;
        System.gc();
    }
}
