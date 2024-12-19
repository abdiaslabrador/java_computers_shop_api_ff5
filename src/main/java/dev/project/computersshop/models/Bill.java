package dev.project.computersshop.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bills")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Primary Key
    private int id;
    @Column()
    private LocalDateTime date;
    @Column(name = "sub_total")
    private double subTotal;
    @Column(name = "total")
    private double total;
    @Column(name = "totalPaid")
    private double totalPaid;
    @Column()
    private double discount;
     
    @ManyToOne()
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @ManyToOne()
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "bill", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<BillDet> billDets;

    public Bill(){

    }

    public Bill(int id, LocalDateTime date, double subTotal, double total, double totalPaid, double discount,
            Shop shop, Client client, List<BillDet> billDets) {
        this.id = id;
        this.date = date;
        this.subTotal = subTotal;
        this.total = total;
        this.totalPaid = totalPaid;
        this.discount = discount;
        this.shop = shop;
        this.client = client;
        this.billDets = billDets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<BillDet> getBillDets() {
        return billDets;
    }

    public void setBillDets(List<BillDet> billDets) {
        this.billDets = billDets;
    }
}
