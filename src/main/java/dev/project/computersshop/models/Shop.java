package dev.project.computersshop.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    int id;
    @Column()
    String name;
    @Column(name = "tax_id")
    String taxId;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(mappedBy = "shops")
    public List<Product> products;

    public Shop( String name, String taxId) {
        this.name = name;
        this.taxId = taxId;
    }

    public Shop(int id, String name, String taxId) {
        this.id = id;
        this.name = name;
        this.taxId = taxId;
    }

    public Shop(int id, String name, String taxId, User user, List<Product> products) {
        this.id = id;
        this.name = name;
        this.taxId = taxId;
        this.user = user;
        this.products = products;
    }

    public Shop( String name, String taxId, User user, List<Product> products) {
        this.name = name;
        this.taxId = taxId;
        this.user = user;
        this.products = products;
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
    public String getTaxId() {
        return taxId;
    }
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
