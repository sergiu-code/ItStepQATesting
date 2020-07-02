package com.ItStep.Lesson.OOPpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserOrder implements Order {
    private final long orderId;
    private User orderUser;
    private List < Item > orderItems;

    public UserOrder(User user, List < Item > items) {
        Random random = new Random();
        this.orderId = random.nextLong();
        this.orderUser = user;
        this.orderItems = items;
    }

    public User getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(User orderUser) {
        this.orderUser = orderUser;
    }

    public List < Item > getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List < Item > orderItems) {
        this.orderItems = orderItems;
    }

    public long getOrderId() {
        return orderId;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderUser=" + orderUser +
                ", orderItems=" + orderItems +
                '}';
    }

    List < Item > filterItemsByType(Type type) {
        List < Item > filterItem = new ArrayList <>();
        for (Item tempItem : orderItems) {
            if (tempItem.getItemType().equals(type))
                filterItem.add(tempItem);
        }
        return filterItem;
    }

    @Override
    public double sum() {
        double sum = 0;
        for (Item orderItem : orderItems) {
            double itemPrice = orderItem.getPrice();
            sum += itemPrice;
        }
        return sum;
    }

    @Override
    public double count() {
        return orderItems.size();
    }
}
