package dev.project.computersshop.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductTest {

    @Test
    void testGetId() {
        // Arrange
        Product product = new Product(1, "Laptop", "LP001", 10, 1000.0);

        // Act and Assert
        assertEquals(1, product.getId());
    }

    @Test
    void testGetName() {
        // Arrange
        Product product = new Product("Laptop", "LP001", 10, 1000.0);

        // Act and Assert
        assertNotNull(product.getName());
        assertEquals("Laptop", product.getName());
    }

    @Test
    void testGetCode() {
        // Arrange
        Product product = new Product("Laptop", "LP001", 10, 1000.0);

        // Act and Assert
        assertNotNull(product.getCode());
        assertEquals("LP001", product.getCode());
    }

    @Test
    void testGetQuantity() {
        // Arrange
        Product product = new Product("Laptop", "LP001", 10, 1000.0);

        // Act and Assert
        assertEquals(10, product.getQuantity());
    }

    @Test
    void testGetPrice() {
        // Arrange
        Product product = new Product("Laptop", "LP001", 10, 1000.0);

        // Act and Assert
        assertEquals(1000.0, product.getPrice(), 0.01); 
    }

    @Test
    void testSetId() {
        // Arrange
        Product product = new Product("Laptop", "LP001", 10, 1000.0);

        // Act
        product.setId(1);

        // Assert
        assertEquals(1, product.getId());
    }

    @Test
    void testSetName() {
        // Arrange
        Product product = new Product("Laptop", "LP001", 10, 1000.0);

        // Act
        product.setName("Desktop");

        // Assert
        assertEquals("Desktop", product.getName());
    }

    @Test
    void testSetCode() {
        // Arrange
        Product product = new Product("Laptop", "LP001", 10, 1000.0);

        // Act
        product.setCode("LP002");

        // Assert
        assertEquals("LP002", product.getCode());
    }

    @Test
    void testSetQuantity() {
        // Arrange
        Product product = new Product("Laptop", "LP001", 10, 1000.0);

        // Act
        product.setQuantity(20);

        // Assert
        assertEquals(20, product.getQuantity());
    }

    @Test
    void testSetPrice() {
        // Arrange
        Product product = new Product("Laptop", "LP001", 10, 1000.0);

        // Act
        product.setPrice(1200.0);

        // Assert
        assertEquals(1200.0, product.getPrice(), 0.01); 
    }
}
