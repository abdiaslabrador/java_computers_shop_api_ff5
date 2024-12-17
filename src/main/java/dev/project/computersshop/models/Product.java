package dev.project.computersshop.models;

import java.util.List;

import javax.security.auth.Subject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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

    @ManyToMany
    @JoinTable( 
        name = "PRODUCTS_SHOPS",
        joinColumns  = @JoinColumn(name = "shop_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Shop> shops;

    @OneToOne(mappedBy = "product")
    private Computer computer;
    

    public Product(String name, String code, int quantity, double price) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(int id, String name, String code, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(int id, String name, String code, int quantity, double price, List <Shop> shops) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
        this.shops = shops;
    }

    public Product(String name, String code, int quantity, double price, List <Shop> shops) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
        this.shops = shops;
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
    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }
}
