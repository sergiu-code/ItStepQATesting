package com.ItStep.Lesson.OnlineShop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        AddressInfo homeAddress = new AddressInfo("Moldova", "Chisinau", "str.Ismail");
//        homeAddress.getFullAddress();
//
        AddressInfo workAddress = new AddressInfo("Moldova", "Ialoveni", "str.31 August");
        workAddress.getFullAddress();
//
//        Map<String, AddressInfo> user1Address = new HashMap<>();
//        user1Address.put("home", homeAddress);
//
//        UserInfo user1 = new UserInfo("markwall@gmail.com", user1Address);
//        System.out.println(user1.id);
//        System.out.println(user1.username);
//        System.out.println(user1Address.get("home").getFullAddress());

//Method Example -> List<Item> filterItemsByType(Type type):
//
//        List<ItemInfo> shopList2 = new ArrayList<>();
//
//        ItemInfo item3 = new ItemInfo("suits", TypeItem.CLOTHES);
//        ItemInfo item4 = new ItemInfo("t-shirt", TypeItem.CLOTHES);
//        Collections.addAll(shopList2, item3, item4);
//
//        OrderInfo order2 = new OrderInfo(user1, shopList2);
//
//        List<ItemInfo> filteredGadgets = order2.filterItemsByType(TypeItem.CLOTHES);
//        System.out.println(filteredGadgets);

// method Example -> List<Order> filterOrdersByType(Type type, List<Order> orders):

        Map<String, AddressInfo> user2Address = new HashMap<>();
        user2Address.put("work", workAddress);

        UserInfo user2 = new UserInfo("bsereoga@gmail.com", user2Address);
        System.out.println(user2.id);
        System.out.println(user2.username);
        System.out.println(user2Address.get("work").getFullAddress());

        List<ItemInfo> shopList1 = new ArrayList<>();
        ItemInfo phone = new ItemInfo("Xiaomi", TypeItem.GADGETS);
        ItemInfo watch = new ItemInfo("MiBand", TypeItem.GADGETS);
        Collections.addAll(shopList1, phone, watch);
        OrderInfo order1 = new OrderInfo(user2, shopList1);

        List<ItemInfo> shopList2 = new ArrayList<>();
        ItemInfo item3 = new ItemInfo("suits", TypeItem.CLOTHES);
        ItemInfo item4 = new ItemInfo("t-shirt", TypeItem.CLOTHES);
        Collections.addAll(shopList2, item3, item4);

        OrderInfo order2 = new OrderInfo(user2, shopList2);
        List<OrderInfo> orders = new ArrayList<>();
        Collections.addAll(orders, order1, order2);


        List<OrderInfo> filteredOrders = filterOrdersByType(TypeItem.GADGETS, orders);

        System.out.println(filteredOrders);


    }

    static List<OrderInfo> filterOrdersByType(TypeItem type, List<OrderInfo> orders) {
        List<OrderInfo> filterOrders = new ArrayList<>();

        for (OrderInfo order : orders) {
            List<ItemInfo> itemsType = order.filterItemsByType(type);

            if (!itemsType.isEmpty()) {
                filterOrders.add(order);
            }
        }
        return filterOrders;
    }
}




