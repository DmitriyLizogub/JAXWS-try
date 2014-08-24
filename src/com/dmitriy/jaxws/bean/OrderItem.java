package com.dmitriy.jaxws.bean;

/**
 * Created by dmitriy on 8/24/14.
 */
public class OrderItem {

    private String itemId;

    private int qty;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
