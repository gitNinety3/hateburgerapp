package com.sesmundo.hateburger40.model;

import android.widget.Button;
import android.widget.TextView;

public class HateBurgerFood {
    String name;
    String price;
    String description;
    Integer imageUrl;
    // BUTTONS FOR INCREMENTING/DECREMENTING THE ITEMS
    Button inc, dec;

    // COUNTER FOR INCREMENTING/DECREMENTING THE ITEMS
    TextView textViewQty;

    // COUNT
    int count;

    public HateBurgerFood(String name, String price, String description, int imageUrl) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageID() {
        return imageUrl;
    }

    public void setImageID(int imageID) {
        this.imageUrl = imageID;
    }
}