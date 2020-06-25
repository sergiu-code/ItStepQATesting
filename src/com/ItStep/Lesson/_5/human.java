package com.ItStep.Lesson._5;

public class human {
/*    String firstName;
    String secondName;
    int age;
    job job;
    address homeAddress;

    public human(String sergiu, String s) {
    }

    public human() {
    }

    void speak() {
        System.out.println("Hi my name is " + firstName + " " + secondName);
        System.out.println("I am " + age + " years old");
        System.out.println("i work at " + job + " company");
        System.out.println("My home address is " + homeAddress);
    }

    void setJob() {
        System.out.println(firstName + " has a job at " + job + " company.");
    }

    public static void main(String[] args) {
        human human = new human();
        human.firstName = "Sergiu";
        human.secondName = "Balan";
        human.age = 21;
        human.speak();
    }*/

    String firstName;
    String secondName;
    int age;
    job job;
    address homeAddress;

    public human(String firstName, String secondName, int age, job job, address homeAddress) {
        this.homeAddress = homeAddress;
        this.job = job;
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void humanCanGoToJob() {
        System.out.println("im working as a " + job.hisJob());
    }

    public void humanCanTellAboutHim() {
        System.out.println("hi i am " + firstName + " " + secondName + "." + "\ni am " + age + " years old.");
        humanCanGoToJob();
        homeAddress.homeAddress();
    }

}
