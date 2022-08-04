package com.example.demo.model;

public class Product {
    private int id;
    private String nameProduct;
    private double price;
    private String color;
    private String description;
    private Category category;

    public Product() {
    }

    public Product(int id, String nameProduct, double price, String color, String description, Category category) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.color = color;
        this.description = description;
        this.category = category;
    }

    public Product(String nameProduct, double price, String color, String description, Category category) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.color = color;
        this.description = description;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                '}';
    }
}
