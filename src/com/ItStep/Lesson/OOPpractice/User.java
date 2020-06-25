package com.ItStep.Lesson.OOPpractice;


public class User extends AbstractUser {
    public User(String username) {
        super(username);

    }


    @Override
    public String toString() {
        return "User{" +
                "Id=" + getUserId() +
                ", username='" + getUsername() + '\'' +
                ", userAddresses=" + getUserAddresses() +
                '}';
    }
}
