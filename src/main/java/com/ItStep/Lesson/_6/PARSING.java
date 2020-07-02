package com.ItStep.Lesson._6;

public class PARSING {
    public static void main(String[] args) {
//        String str1 = "10";
//        System.out.println("\nString str1 is " + str1);  //  printing is no problem
//        // System.out.println(str1 * str1);              //  raises compilation error
//        int x = Integer.parseInt(str1);
//        System.out.println("int parsing: x * x is " + x * x);
//
//        // PARSING STRING TO DOUBLE
//        String str2 = "10.5";
//        double y = Double.parseDouble(str2);
//        System.out.println("double parsing: y * y is " + y * y);
//
//        // PARSING STRING TO LONG
//        String str3 = "45";
//        long z = Long.parseLong(str3);
//        System.out.println("long parsing: z * z is " + z * z);
//    }
//        int myInt = 31;
//        String string1 = String.valueOf(myInt);
//        System.out.println(string1 + 10);//concatenation
//        System.out.println(myInt+10);//sum of 31+10=41
//
        boolean b1=true;
        byte b2=11;
        short sh = 12;
        int i = 13;
        long l = 14L;
        float f = 15.5f;
        double d = 16.5d;
        char[] chr1 ={'j','a','v','a'};
        PARSING obj=new PARSING();
        String s1 = String.valueOf(b1);
        String s2 = String.valueOf(b2);
        String s3 = String.valueOf(sh);
        String s4 = String.valueOf(i);
        String s5 = String.valueOf(l);
        String s6 = String.valueOf(f);
        String s7 = String.valueOf(d);
        String s8 = String.valueOf(chr1);
        String s9 = String.valueOf(obj);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
    }
}
