package com.ItStep.Lesson.OnlineShop;

import java.util.Map;
import java.util.Random;

public class UserInfo {
public long id;
public String username;
public Map<String, AddressInfo> addresses;

    public UserInfo(String username, Map<String, AddressInfo> addresses) {
        this.id = new Random().nextInt(100);
        this.username = username;
        this.addresses = addresses;
    }


    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}


