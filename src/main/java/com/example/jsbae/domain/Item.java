package com.example.jsbae.domain;


import lombok.Data;

@Data
public class Item {

    private String itemName;
    private int itemPrice;

    public Item() {
    }

    public Item(String itemName, int itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
}