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
@Table(name = "Users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Primary Key
    int id;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    String dni;


    @OneToMany(mappedBy = "", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Shop> shops;

    public User( String firstName, String lastName, String dni) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
    }

    public User(int id, String firstName, String lastName, String dni) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
    }

    public User(int id, String firstName, String lastName, String dni, List<Shop> shops) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.shops = shops;
    }

    public User( String firstName, String lastName, String dni, List<Shop> shops) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.shops = shops;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
   
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }
}
