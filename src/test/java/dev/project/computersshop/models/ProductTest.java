package dev.project.computersshop.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import java.util.List;

public class ProductTest {

    Product product;

    @BeforeEach
    void setUp() {
        // Arrange
        product = new Product("Laptop", "LP001", 10, 1000.0);
    }

    @Test
    void testGetCode() {
        // Arrange

        // Act and Assert
        assertNotNull(product.getCode());
        assertEquals("LP001", product.getCode());
    }

    @Test
    void testGetId() {
        //Arrange
        Product productId = new Product(1, "Laptop", "LP001", 10, 1000.0);

        // Act and Assert
        assertEquals(1, productId.getId());
    }

    @Test
    void testGetName() {
        // Act and Assert
        assertNotNull(product.getName());
        assertEquals("Laptop", product.getName());
    }

    @Test
    void testGetPrice() {
        // Act and Assert
        assertEquals(1000.0, product.getPrice(), 0.01);
    }

    @Test
    void testGetQuantity() {
        // Act and Assert
        assertEquals(10, product.getQuantity());
    }

    @Test
    void testGetShops() {
        // Arrange
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Shop1", "12345678"));
        shops.add(new Shop("Shop2", "98765432"));
        Product product = new Product(1, "Laptop", "LP001", 10, 1000.0, shops);

        // Act and Assert
        assertNotNull(product.getShops());
        assertEquals(2, product.getShops().size());
        assertEquals("Shop1", product.getShops().get(0).getName());
        assertEquals("Shop2", product.getShops().get(1).getName());
    }

    @Test
    void testSetCode() {
        // Act
        product.setCode("LP002");

        // Assert
        assertEquals("LP002", product.getCode());
    }

    @Test
    void testSetId() {
        // Act
        product.setId(1);

        // Assert
        assertEquals(1, product.getId());
    }

    @Test
    void testSetName() {
        // Act
        product.setName("Desktop");

        // Assert
        assertEquals("Desktop", product.getName());
    }

    @Test
    void testSetPrice() {
        // Act
        product.setPrice(1200.0);

        // Assert
        assertEquals(1200.0, product.getPrice(), 0.01); // Usar delta para comparar doubles
    }

    @Test
    void testSetQuantity() {
        Product productId = new Product(1, "Laptop", "LP001", 10, 1000.0);

        // Act
        productId.setQuantity(20);

        // Assert
        assertEquals(20, productId.getQuantity());
    }

    @Test
    void testSetShops() {
        // Arrange
        Product product = new Product("Laptop", "LP001", 10, 1000.0);
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Shop1", "12345678"));
        shops.add(new Shop("Shop2", "98765432"));

        // Act
        product.setShops(shops);

        // Assert
        assertNotNull(product.getShops());
        assertEquals(2, product.getShops().size());
        assertEquals("Shop1", product.getShops().get(0).getName());
        assertEquals("Shop2", product.getShops().get(1).getName());
    }
}
