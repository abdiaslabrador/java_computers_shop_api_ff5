package dev.project.computersshop.models;

import java.security.Principal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Computers")
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Clave primaria autogenerada
    private int id;

    @Column()
    private String brand;

    @Column()
    private String memory;

    @Column()
    private String cpu;

    @Column()
    private String operatingSystem;

    @OneToOne()
    @JoinColumn(name = "product_id")
    private Product product;


    public Computer() {
    }

    public Computer(int id,  String brand, String memory, String cpu, String operatingSystem) {
        this.id = id;
        this.brand = brand;
        this.memory = memory;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
    }

    public Computer(String brand, String memory, String cpu, String operatingSystem) {
        this.brand = brand;
        this.memory = memory;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
    }

    
    public Computer(int id, String brand, String memory, String cpu, String operatingSystem, Product product) {
        this.id = id;
        this.brand = brand;
        this.memory = memory;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.product = product;
    }

    public Computer(String brand, String memory, String cpu, String operatingSystem, Product product) {
        this.brand = brand;
        this.memory = memory;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
