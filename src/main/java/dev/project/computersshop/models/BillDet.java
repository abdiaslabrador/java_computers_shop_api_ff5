package dev.project.computersshop.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bill_dets")
public class BillDet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column()
    private int quantity; 
    @Column(name = "sale_price")
    private double salePrice;
    @Column(name = "sub_total")
    private double subTotal;

    @ManyToOne()
    @JoinColumn(name = "product_id")
    private Product product;
    
    @ManyToOne()
    @JoinColumn(name = "bill_id")
    private Bill bill;
    
    public BillDet(){

    }

    public BillDet(int id, int quantity, double salePrice, double subTotal, Product product, Bill bill) {
        this.id = id;
        this.quantity = quantity;
        this.salePrice = salePrice;
        this.subTotal = subTotal;
        this.product = product;
        this.bill = bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    
}
