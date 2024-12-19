package dev.project.computersshop.dtos.product;

import dev.project.computersshop.models.Product;

public class ProductDtoResponse {
    private  int id;
   private  String name;
   private  String code;
   private int quantity; 
   private double price;
   private ProductComputerResponse computer;

    public ProductDtoResponse(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.code = product.getCode();
        this.quantity = product.getQuantity();
        this.price = product.getPrice();
        this.computer = new ProductComputerResponse(product.getComputer());
    }
    
    public int getId(){
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

    public ProductComputerResponse getComputer() {
        return computer;
    }    
}
