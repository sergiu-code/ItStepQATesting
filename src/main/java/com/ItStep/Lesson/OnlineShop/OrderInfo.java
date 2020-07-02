package com.ItStep.Lesson.OnlineShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderInfo {
    public long id;
    public UserInfo user;
    public List<ItemInfo> items;


    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", user=" + user +
                ", items=" + items +
                '}';
    }

    public OrderInfo(UserInfo user, List<ItemInfo> items) {
        this.id = new Random().nextInt(100);
        this.user = user;
        this.items = items;


    }

    public List<ItemInfo> filterItemsByType(TypeItem type) {
        List<ItemInfo> filterItems = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            ItemInfo item = items.get(i);
            if (item.type.equals(type)) {
                filterItems.add(item);
            }
        }
        return filterItems;
    }


}
