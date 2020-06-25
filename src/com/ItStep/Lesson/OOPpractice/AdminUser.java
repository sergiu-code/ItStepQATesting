package com.ItStep.Lesson.OOPpractice;


public class AdminUser extends AbstractUser {


    public AdminUser(String username) {
        super(username);
    }

    void approveOrder(UserOrder order) {
        System.out.println(order + " order is approved");
    }

    void rejectOrder(UserOrder order) {
        System.out.println(order + " order is rejected");
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "Id=" + getUserId() +
                ", username='" + getUsername() + '\'' +
                ", adminAddresses=" + getUserAddresses() +
                '}';
    }
}