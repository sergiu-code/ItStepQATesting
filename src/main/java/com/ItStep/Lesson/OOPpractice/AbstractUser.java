package com.ItStep.Lesson.OOPpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class AbstractUser {
    private final long userId;
    private final String username;
    private final Map < String, Address > userAddresses;


    public AbstractUser(String username) {
        Random random = new Random();
        this.userId = random.nextLong();
        this.username = username;
        this.userAddresses = new HashMap <>();

    }

    public long getUserId() {
        return userId;
    }


    public String getUsername() {
        return username;
    }


    public Map < String, Address > getUserAddresses() {
        return userAddresses;
    }

    @Override
    public String toString() {
        return "userId=" + userId +
                ", username='" + username + '\'' +
                ", userAddresses=" + userAddresses +
                '}';
    }
}
