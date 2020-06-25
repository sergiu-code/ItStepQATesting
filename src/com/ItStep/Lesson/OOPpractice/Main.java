package com.ItStep.Lesson.OOPpractice;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("moldova", "chisinau", "budai");
        Address address1=new Address("moldova","balti","stefan cel mare");
        User user = new User("sergiu@gmail.com");
        user.getUserAddresses().put("home",address);
//        System.out.println(user.getUserAddresses());
        AdminUser adminUser=new AdminUser("adminuser@gmail.com");
        adminUser.getUserAddresses().put("work",address1);
        System.out.println(adminUser);
        System.out.println(user);




    }

    public static List < UserOrder > filterItemsByType(Type type, List < UserOrder > orders) {
        List < UserOrder > filteredOrders = new ArrayList <>();
        for (UserOrder tempOrder : orders) {
            List < Item > itemsByType = tempOrder.filterItemsByType(type);
            if (!itemsByType.isEmpty()) {
                filteredOrders.add(tempOrder);
            }
        }
        return filteredOrders;
    }


    public static List < User > filterUsersByCity(List < User > users, String city) {
        List < User > filteredUser = new ArrayList <>();
        for (User u : users) {
            for (Address a : u.getUserAddresses().values()) {
                if (a.getCity().equals(city)) {
                    filteredUser.add(u);
                }
            }
        }
        return filteredUser;
    }

}

