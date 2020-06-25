package com.ItStep.Lesson.OnlineShop;

public class AddressInfo {

    public String country;
    public String city;
    public String street;

    public AddressInfo(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }


    public String toString() {
        return "AddressInfo{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public String getFullAddress() {
        return "Address : " + street+", " + city+", " + country+".";
    }
}