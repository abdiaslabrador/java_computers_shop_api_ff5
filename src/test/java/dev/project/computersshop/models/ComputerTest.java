package dev.project.computersshop.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;

public class ComputerTest {

    Computer computer;
    Computer computerId;
    Product product;

    @BeforeEach
    void setUp() {
        // Arrange
        computer = new Computer("Dell", "16GB", "Intel Core i7", "Windows 10");
        product = new Product("Laptop", "LP001", 10, 1000.0);
        computerId = new Computer(1, "Dell", "16GB", "Intel Core i7", "Windows 10", product);
    }


    @Test
    void testGetBrand() {
        // Arrange
        // computer = new Computer("Dell", "16GB", "Intel Core i7", "Windows 10");
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
        assertEquals(1, computerId.getId());
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
        // Arrange
        Computer computer = new Computer("Dell", "16GB", "Intel Core i7", "Windows 10", product);

        // Act and Assert
        assertNotNull(computer.getProduct());
        assertEquals("Laptop", computer.getProduct().getName());
    }

    @Test
    void testSetBrand() {
        // Arrange
        Computer computerIdPro = new Computer(1, "Dell", "16GB", "Intel Core i7", "Windows 10", product);

        // Act
        computerIdPro.setBrand("HP");

        // Assert
        assertEquals("HP", computerIdPro.getBrand());
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
        // Arrange

        // Act
        computer.setMemory("32GB");

        // Assert
        assertEquals("32GB", computer.getMemory());
    }

    @Test
    void testSetOperatingSystem() {
        // Arrange

        // Act
        computer.setOperatingSystem("Linux");

        // Assert
        assertEquals("Linux", computer.getOperatingSystem());
    }

    @Test
    void testSetProduct() {
        // Arrange

        // Act
        computer.setProduct(product);

        // Assert
        assertNotNull(computer.getProduct());
        assertEquals("Laptop", computer.getProduct().getName());
    }
}
