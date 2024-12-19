package dev.project.computersshop.dtos.computer;


public class ComputerProductDto {
    private  String name;
    private  String code;
    private int quantity; 
    private double price;

    public ComputerProductDto(String name,String code,int quantity, double price) {
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
