package dev.project.computersshop.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column()
    String name;
    @Column()
    String code;
    @Column()
    int quantity; 
    @Column()
    double price;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<BillDet> billDets;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private Computer computer;
    
    public Product() {
    }

    

    public Product(int id, String name, String code, int quantity, double price, List<BillDet> billDets,
            Computer computer) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
        this.billDets = billDets;
        this.computer = computer;
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

    public int getQuantity() { 
        return quantity;
    }

    public void setQuantity(int quantity) { 
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public List<BillDet> getBillDets() {
        return billDets;
    }

    public void setBillDets(List<BillDet> billDets) {
        this.billDets = billDets;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
