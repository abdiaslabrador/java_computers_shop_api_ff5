package dev.project.computersshop.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;

public class ComputerTest {

    Computer computer;
    Product product;

    @BeforeEach
    void setUp() {
        // Arrange
        Computer computer2 = new Computer();
        product = new Product(1, "Laptop", "LP001", 10, 1000.0, null, null);
        computer = new Computer(1, "Dell", "16GB", "Intel Core i7", "Windows 10", product);
    }


    @Test
    void testGetBrand() {
        // Act and Assert
        assertNotNull(computer.getBrand());
        assertEquals("Dell", computer.getBrand());
    }

    @Test
    void testGetCpu() {
        // Act and Assert
        assertNotNull(computer.getCpu());
        assertEquals("Intel Core i7", computer.getCpu());
    }

    @Test
    void testGetId() {
        // Act and Assert
        assertEquals(1, computer.getId());
    }

    @Test
    void testGetMemory() {
        // Act and Assert
        assertNotNull(computer.getMemory());
        assertEquals("16GB", computer.getMemory());
    }

    @Test
    void testGetOperatingSystem() {
        // Act and Assert
        assertNotNull(computer.getOperatingSystem());
        assertEquals("Windows 10", computer.getOperatingSystem());
    }

    @Test
    void testGetProduct() {
        // Act and Assert
        assertNotNull(computer.getProduct());
        assertEquals("Laptop", computer.getProduct().getName());
    }

    @Test
    void testSetBrand() {
        // Act
        computer.setBrand("HP");

        // Assert
        assertEquals("HP", computer.getBrand());
    }

    @Test
    void testSetCpu() {
        // Act
        computer.setCpu("AMD Ryzen 9");

        // Assert
        assertEquals("AMD Ryzen 9", computer.getCpu());
    }

    @Test
    void testSetId() {
        // Act
        computer.setId(1);

        // Assert
        assertEquals(1, computer.getId());
    }

    @Test
    void testSetMemory() {
        // Act
        computer.setMemory("32GB");

        // Assert
        assertEquals("32GB", computer.getMemory());
    }

    @Test
    void testSetOperatingSystem() {
        // Act
        computer.setOperatingSystem("Linux");

        // Assert
        assertEquals("Linux", computer.getOperatingSystem());
    }

    @Test
    void testSetProduct() {
        // Act
        computer.setProduct(product);

        // Assert
        assertNotNull(computer.getProduct());
        assertEquals("Laptop", computer.getProduct().getName());
    }
}
