package com.example.reciclerview;

//Para crar una Recicler View se necesita
//1 The item layout
//2 THE Recycler View
//3 Model Class
//4 Adapter

public class Item {
    int itemImage;
    String itemName, itemDescription;

    public Item(int itemImage, String itemName, String itemDescription) {
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}
