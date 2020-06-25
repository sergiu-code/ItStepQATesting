package com.ItStep.Lesson.OOPpractice;


import java.util.Random;

public class Item {
    private final long itemId;
    private String itemTitle;
    private Type itemType;
    private double price;

    public double getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Type getItemType() {
        return itemType;
    }

    public void setItemType(Type itemType) {
        this.itemType = itemType;
    }

    public long getItemId() {
        return itemId;
    }

    public Item(String title, Type type, int price) {
        Random random = new Random();
        this.itemId = random.nextLong();
        this.itemTitle = title;
        this.itemType = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemTitle='" + itemTitle + '\'' +
                ", itemType=" + itemType +
                ", price=" + price +
                '}';
    }

    public String getItem() {
        return itemId + "\n" + itemTitle + "\n" + itemType + "\n" + price;
    }

}
