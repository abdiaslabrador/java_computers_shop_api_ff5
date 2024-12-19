package dev.project.computersshop.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    @Column()
    private String name;
    

    @Column()
    private String ownerName;
    @Column(name = "tax_id")
    private String taxId;

    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Bill> bills;

    public Shop() {
    }

    public Shop(int id, String name, String ownerName , String taxId, List<Bill> bills) {
        this.id = id;
        this.name = name;
        this.taxId = taxId;
        this.ownerName = ownerName;
        this.bills = bills;
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

    public String getownerName() {
        return ownerName;
    }

    public void setownerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<Bill> getBills() {
        return this.bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }
}
