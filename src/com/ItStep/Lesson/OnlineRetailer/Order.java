package com.ItStep.Lesson.OnlineRetailer;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Order {
    public long orderId;
    public User orderUser;
    public List < Item > orderItems;

    public Order(User user, List < Item > items) {
        Random random = new Random();
        this.orderId = random.nextInt(100);
        this.orderUser = user;
        this.orderItems = items;
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
            if (tempItem.itemType.equals(type)) {
                filterItem.add(tempItem);

            }
        }

        return filterItem;
    }
}





