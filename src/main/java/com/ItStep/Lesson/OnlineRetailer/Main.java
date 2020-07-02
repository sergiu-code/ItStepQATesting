package com.ItStep.Lesson.OnlineRetailer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Item phone = new Item("iphone", Type.GADGETS);
//        System.out.println(phone.getItem());
//        Address address = new Address("Moldova", "Chisinau", "Budai");
//        System.out.println(address.getFullAddress());
//        Address address1 = new Address("Moldova", "Hincesti", "str. 31 August");
//        System.out.println(address1.getFullAddress());
//        User user = new User("sergiu@gmail.com");
//        System.out.println(user.userId);
//        System.out.println(user.username);
//        System.out.println(user.userAddresses);//prints {} or empty
//        user.addAddress("home", address);
//        user.addAddress("work", address1);
//        System.out.println(user.userAddresses.get("home").getFullAddress());
//        System.out.println(user.userAddresses.get("work").getFullAddress());
//
//        Map<String, Address> userAddress = new HashMap<>();
//        userAddress.put("home", address1);
//        userAddress.put("work", address);
//        User user1 = new User("billy@gamil.com", userAddress);
//        System.out.println(user1.userId);
//        System.out.println(user1.username);
//        System.out.println(user1.userAddresses.get("home").getFullAddress());
//        System.out.println(user1.userAddresses.get("work").getFullAddress());
//        user1.addAddress("home", new Address("Moldova", "Balti", "Independentei"));
//        System.out.println(user1.userAddresses.get("home").getFullAddress());

//        List<Item> firstItemList = new ArrayList<>();
//        Item doll = new Item("baby doll", Type.TOYS);
//        Item ball = new Item("footbal ball", Type.TOYS);
//        Item console = new Item("playstation", Type.GADGETS);
//        Collections.addAll(firstItemList, doll, ball, console);
//        Order order = new Order(user1, firstItemList);
//        List<Item> filteredToys = order.filterItemsByType(Type.TOYS);
//        System.out.println(filteredToys);
//
//        List<Item> secondItemList = new ArrayList<>();
//        Item item = new Item("samsung tv", Type.GADGETS);
//        Item item1 = new Item("smartwatch", Type.GADGETS);
//        Collections.addAll(secondItemList, item, item1);
//        User user = new User("sergiu@gmail.com");
//        Order order1 = new Order(user, secondItemList);
//        List<Order> allOrders = new ArrayList<>();
//        Collections.addAll(allOrders, order, order1);
//        List<Order> filterOrder = filterItemsByType(Type.GADGETS, allOrders);
//        System.out.println(filterOrder);

        Address address = new Address("moldova", "chisinau", "ismail");
        Address address1 = new Address("moldova", "chisinau", "ismail");
        Map<String, Address> userAddress = new HashMap<>();
        Map<String, Address> user1Address = new HashMap<>();
        userAddress.put("work", address);
        user1Address.put("home", address1);
        User user = new User("sergiu@gmail.com", userAddress);
        User user1 = new User("valera@gmail.com", user1Address);
        List<User> allUsers = new ArrayList<>();
        Collections.addAll(allUsers, user, user1);
        List<User> filterUser = filterUsersByCity(allUsers,"chisinau");
        System.out.println(filterUser);
    }

    public static List<Order> filterItemsByType(Type type, List<Order> orders) {
        List<Order> filteredOrders = new ArrayList<>();
        for (Order tempOrder : orders) {
            List<Item> itemsByType = tempOrder.filterItemsByType(type);
            if (!itemsByType.isEmpty()) {
                filteredOrders.add(tempOrder);
            }
        }
        return filteredOrders;
    }

//    public static List<User> filterUsersByCity(List<User> users, String city) {
//        List<User> filterCity = new ArrayList<>();
//        for (User tempUser : users) {
//            if (tempUser.userAddresses.equals(city)) {
//                filterCity.add(tempUser);
//            }
//        }
//        return filterCity;
//    }
    static List<User> filterUsersByCity(List<User> users, String city) {
        List<User> filteredUser = new ArrayList<>();
        for (User u: users){
            for (Address a:u.userAddresses.values()){
                if (a.city.equals(city)){
                    filteredUser.add(u);
                }
            }
        }
        return filteredUser;
    }

}






