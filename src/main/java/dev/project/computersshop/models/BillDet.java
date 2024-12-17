package dev.project.computersshop.models;

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
@Table(name = "Bill_dets")
public class BillDet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column()
    int quantity; 
    @Column(name = "sale_price")
    double salePrice;
    @Column(name = "sub_total")
    double subTotal;

    @ManyToOne()
    @JoinColumn(name = "product_id")
    private Product product;
    
    @ManyToOne()
    @JoinColumn(name = "bill_id")
    private Bill bill;
}
