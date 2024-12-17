package dev.project.computersshop.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ComputerTest {

    @Test
    void testGetBrand() {
        // Arrange
        Computer computer = new Computer("Dell", "16GB", "Intel Core i7", "Windows 10");

        // Act and Assert
        assertNotNull(computer.getBrand());
        assertEquals("Dell", computer.getBrand());
    }

    @Test
    void testGetCpu() {
        // Arrange
        Computer computer = new Computer("Dell", "16GB", "Intel Core i7", "Windows 10");

        // Act and Assert
        assertNotNull(computer.getCpu());
        assertEquals("Intel Core i7", computer.getCpu());
    }

    @Test
    void testGetId() {
        // Arrange
        Computer computer = new Computer(1, "Dell", "16GB", "Intel Core i7", "Windows 10");

        // Act and Assert
        assertEquals(1, computer.getId());
    }

    @Test
    void testGetMemory() {
        // Arrange
        Computer computer = new Computer("Dell", "16GB", "Intel Core i7", "Windows 10");

        // Act and Assert
        assertNotNull(computer.getMemory());
        assertEquals("16GB", computer.getMemory());
    }

    @Test
    void testGetOperatingSystem() {
        // Arrange
        Computer computer = new Computer("Dell", "16GB", "Intel Core i7", "Windows 10");

        // Act and Assert
        assertNotNull(computer.getOperatingSystem());
        assertEquals("Windows 10", computer.getOperatingSystem());
    }

    @Test
    void testSetBrand() {
        // Arrange
        Computer computer = new Computer("Dell", "16GB", "Intel Core i7", "Windows 10");

        // Act
        computer.setBrand("HP");

        // Assert
        assertEquals("HP", computer.getBrand());
    }

    @Test
    void testSetCpu() {
        // Arrange
        Computer computer = new Computer("Dell", "16GB", "Intel Core i7", "Windows 10");

        // Act
        computer.setCpu("AMD Ryzen 9");

        // Assert
        assertEquals("AMD Ryzen 9", computer.getCpu());
    }

    @Test
    void testSetId() {
        // Arrange
        Computer computer = new Computer("Dell", "16GB", "Intel Core i7", "Windows 10");

        // Act
        computer.setId(1);

        // Assert
        assertEquals(1, computer.getId());
    }

    @Test
    void testSetMemory() {
        // Arrange
        Computer computer = new Computer("Dell", "16GB", "Intel Core i7", "Windows 10");

        // Act
        computer.setMemory("32GB");

        // Assert
        assertEquals("32GB", computer.getMemory());
    }

    @Test
    void testSetOperatingSystem() {
        // Arrange
        Computer computer = new Computer("Dell", "16GB", "Intel Core i7", "Windows 10");

        // Act
        computer.setOperatingSystem("Linux");

        // Assert
        assertEquals("Linux", computer.getOperatingSystem());
    }
}
