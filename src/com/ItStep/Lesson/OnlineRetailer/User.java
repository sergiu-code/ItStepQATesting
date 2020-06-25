package com.ItStep.Lesson.OnlineRetailer;


import java.util.*;

public class User {
    long userId;
    String username;
    Map<String, Address> userAddresses;

    public User(String username, Map<String, Address> address) {
        Random random = new Random();
        this.userId = random.nextInt(100);
        this.username = username;
        this.userAddresses = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userAddresses=" + userAddresses +
                '}';
    }

    public User(String username) {
        Random random = new Random();
        this.userId = random.nextInt(100);
        this.username = username;
        this.userAddresses = new HashMap<>();
    }

    public void addAddress(String location, Address address) {
        userAddresses.put(location, address);
    }
}





