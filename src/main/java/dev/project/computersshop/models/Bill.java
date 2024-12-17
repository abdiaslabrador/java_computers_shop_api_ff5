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
    int id;
    @Column()
    LocalDateTime date;
    @Column(name = "sub_total")
    double subTotal;
    @Column(name = "total")
    double total;
    @Column(name = "total_paid")
    double total_paid;
    @Column()
    double discount;
     
    @ManyToOne()
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @ManyToOne()
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "bill", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<BillDet> bill_dets;
}
