package com.ItStep.Lesson.OOPpractice;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CompanyOrder implements Order {
    private final long orderId;
    private Company companyOrder;
    private List < Item > companyItems;

    public CompanyOrder(Company companyOrder, List < Item > companyItems) {
        Random random = new Random();
        this.orderId = random.nextLong();
        this.companyOrder = companyOrder;
        this.companyItems = companyItems;

    }

    public long getOrderId() {
        return orderId;
    }

    public Company getCompanyOrder() {
        return companyOrder;
    }

    public void setCompanyOrder(Company companyOrder) {
        this.companyOrder = companyOrder;
    }

    public List < Item > getCompanyItems() {
        return companyItems;
    }

    public void setCompanyItems(List < Item > companyItems) {
        this.companyItems = companyItems;
    }

    @Override
    public String toString() {
        return "CompanyOrder{" +
                "orderId=" + orderId +
                ", companyOrder=" + companyOrder +
                ", companyItems=" + companyItems +
                '}';
    }

    List < Item > filterItemsByType(Type type) {
        List < Item > filterItem = new ArrayList <>();
        for (Item tempItem : companyItems)
            if (tempItem.getItemType().equals(type)) {
                filterItem.add(tempItem);

            }
        return filterItem;
    }

    @Override
    public double sum() {
        double sum = 0;
        for (Item orderItem : companyItems) {
            double itemPrice = orderItem.getPrice();
            sum += itemPrice;
        }
        return sum;
    }

    @Override
    public double count() {
        return companyItems.size();
    }

    //Overload methods:
    public double sum(Item item) {
        double sum = 0;
        for (Item currentItem : companyItems) {
            if (item.getItemType().equals(currentItem.getItemType())) {
                double itemPrice = currentItem.getPrice();
                sum += itemPrice;
            }
        }
        return sum;
    }

    public int count(Item item) {
        return filterItemsByType(item.getItemType()).size();
    }
}
