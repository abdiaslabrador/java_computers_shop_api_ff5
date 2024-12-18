package dev.project.computersshop.dtos;


public class ProductDto {
    private  String name;
    private  String code;
    private int quantity; 
    private double price;

    public ProductDto(String name,String code,int quantity, double price) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
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
