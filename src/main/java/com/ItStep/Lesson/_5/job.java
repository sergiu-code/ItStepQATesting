package com.ItStep.Lesson._5;

public class job {
/*    String major;
    String address;
    human hisName;
    human hisJob;
    public job(String major, String address, human hisName, human hisJob) {
        this.major = major;
        this.address = address;
        this.hisName = hisName;
        this.hisJob = hisJob;
    }
    public static void main(String[] args) {
        human human = new human("Sergiu", "Google");
        job job = new job("testing software", "Silicon Valley", human, human);
        job.getJob();
    }
    void getJob() {
        System.out.println(hisName.firstName + " has a job at " + hisJob.job + " company.");
        System.out.println("At " + hisJob.job + " his working on " + major + " the office is located on " + address);
    }*/


    String major;
    address address;

    public job(String major,address address) {
        this.major = major;
        this.address = address;
    }

    public String hisJob() {
        return (major + " on address" + address.homeInfo());

    }
}




