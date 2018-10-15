package com.shop.toys.web;

public class Toy {
    
    public String name;
    public String size;
    public String color;

    public Toy() {
    }

    public Toy(String name) {
        this.name = name;
    }

    public Toy(String name, String size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
