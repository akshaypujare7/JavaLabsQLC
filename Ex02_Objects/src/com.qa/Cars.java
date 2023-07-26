package com.qa;

import java.util.Arrays;

public class Cars {
    private String name;
    private String brand;
    private float price;

    public Cars(String name, String brand, float price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String[] authors) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car name=" + name + ", Brand" +
                brand + ", price=" + price;
    }

}
