// Phone.java
package com.example.srikaimobileapp.model; // เปลี่ยน package ตามโครงสร้างโปรเจ็กต์ของคุณ

public class Phone {
    String name;
    double price;
    String imageUrl;

    public Phone(String name, double price, String imageUrl) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
