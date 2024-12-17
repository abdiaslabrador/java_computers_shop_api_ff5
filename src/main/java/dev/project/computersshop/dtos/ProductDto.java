package dev.project.computersshop.dtos;

import dev.project.computersshop.models.Product;

public class ProductDto {
   private  int id;

   private  String name;

   private  String code;

   private int quantity; 

   private double price;

    public ProductDto(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.code = product.getCode();
        this.quantity = product.getQuantity();
        this.price = product.getPrice();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}