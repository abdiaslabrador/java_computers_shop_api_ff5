package dev.project.computersshop.models;

public class Product {
    int id;
    String name;
    String code;
    int cant;
    double price;

    public Product( String name, String code, int cant, double price) {
        this.name = name;
        this.code = code;
        this.cant = cant;
        this.price = price;
    }
    
    public Product(int id, String name, String code, int cant, double price) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.cant = cant;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public int getCant() {
        return cant;
    }
    public void setCant(int cant) {
        this.cant = cant;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


}
