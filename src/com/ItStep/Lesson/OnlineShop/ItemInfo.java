package com.ItStep.Lesson.OnlineShop;

import java.util.Random;

public class ItemInfo {
public long id;
public String title;
TypeItem type;

    @Override
    public String toString() {
        return "ItemInfo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }

    public ItemInfo(String title, TypeItem type) {
        this.id = new Random().nextInt(100);
        this.title = title;
        this.type = type;
    }
}
