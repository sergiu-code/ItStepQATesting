package com.ItStep.Lesson.OnlineRetailer;

import java.util.Random;

public class Item {
    public long itemId;
    public String itemTitle;
    public Type itemType;

    public Item(String title, Type type) {
        Random random = new Random();
        this.itemId = random.nextInt(100);
        this.itemTitle = title;
        this.itemType = type;

    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemTitle='" + itemTitle + '\'' +
                ", itemType=" + itemType +
                '}';
    }

    public String getItem() {
        return itemId + "\n" + itemTitle + "\n" + itemType;
    }
}



