package com.example.aimhackathonentry.ObjectModels;

public class TradeItem {


    private String productName;

    private int quantity;


    public TradeItem(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
