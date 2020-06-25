package com.ItStep.Lesson._6;


import java.util.Random;

public class RANDOMIZER {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int randomInt = randomNum.nextInt(30);
        double randomDouble = randomNum.nextDouble();
        float randomFloat = randomNum.nextFloat();
        long randomLong = randomNum.nextLong();
        boolean randomBoolean = randomNum.nextBoolean();

        System.out.println("Return a random value of int: "+randomInt);
        System.out.println("Return a random value of double: "+randomDouble);
        System.out.println("Return a random value of float: "+randomFloat);
        System.out.println("Return a random value of long: "+randomLong);
        System.out.println("Return a random value of boolean: "+randomBoolean);
        System.out.println("Return a random value of doubles between range >=0.0 and <1.0: "+Math.random());
    }
}




