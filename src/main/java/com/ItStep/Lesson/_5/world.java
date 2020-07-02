package com.ItStep.Lesson._5;

public class world {
    public static void main(String[] args) {
address homeAddress=new address("chisinau","moldova","budai",3);
address workAddress=new address("bucuresti","romania","piata unirii",4);
job job=new job("tester",workAddress);
human human=new human("sergiu","balan",31,job,homeAddress);
human.humanCanTellAboutHim();
    }

}
