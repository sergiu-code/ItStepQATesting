package com.ItStep.Lesson.OnlineRetailer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Address {
    String country;
    String city;
    String street;

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getFullAddress() {
        return ("Address: " + street + ", " + city + ", " + country);
    }

//public String getCity(){
//        return city;
//}
//
//    List<User>filterCity(String city){
//        for (int i=0;i<users.size();i++){
//            User tempUser=users.get(i);
//            if (tempUser.)
//        }
//}
}
