package com.ItStep.Lesson._5;

public class address {
    /*    String street;
        String houseNumber;
        String city;
        String country;
        human hisName;

        public address(String street, String houseNumber, String city, String country, human hisName) {
            this.city = city;
            this.country = country;
            this.houseNumber = houseNumber;
            this.street = street;
            this.hisName = hisName;
        }

        public static void main(String[] args) {

            human human = new human("Sergiu","");
            address address = new address("Silicon Valley", "3", "California", "USA", human);
            address.getAddress();
        }

            void getAddress () {
                System.out.println(hisName.firstName + " can also rest at home located in " + city + " " + country + " on " + street + "/" + houseNumber);
            }*/
    String city;
    String country;
    String street;
    int houseNumber;

    public address(String city, String country, String street, int houseNumber) {
        this.houseNumber = houseNumber;
        this.country = country;
        this.city = city;
        this.street = street;
    }

    String homeInfo() {
        return (street +" "+ houseNumber + ", " + city +", "+country+ '.');
    }
public void homeAddress(){
    System.out.println("i have a house on "+homeInfo());
}
}





