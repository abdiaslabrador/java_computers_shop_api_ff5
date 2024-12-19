package dev.project.computersshop.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import java.util.List;

public class ProductTest {

    Product product;
    List<BillDet> billDets;
    Computer computer;

    @BeforeEach
    void setUp() {
        // Arrange
        Product product2 = new Product();
        computer = new Computer(1, "Dell", "16GB", "Intel Core i7", "Windows 10", null);
        billDets = List.of(new BillDet(1, 10, 10.0, 10.0, null, null));
        product = new Product(1, "Laptop", "LP001", 10, 1000.0, billDets, computer);
    }

    @Test
    void testGetCode() {

        // Act and Assert
        assertNotNull(product.getCode());
        assertEquals("LP001", product.getCode());
    }

    @Test
    void testGetId() {
        // Act and Assert
        assertEquals(1, product.getId());
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
        // Act
        product.setQuantity(20);

        // Assert
        assertEquals(20, product.getQuantity());
    }

    @Test
    void testgetBillDets() {
        // Act and Assert
        assertNotNull(product.getBillDets());
        assertEquals(1, product.getBillDets().size());
    }

    @Test
    void testsetBillDets() {
        // Arrange
        List<BillDet> newBillDets = new ArrayList<>();
        newBillDets.add(new BillDet(2, 20, 20.0, 20.0, null, null));

        // Act
        product.setBillDets(newBillDets);

        // Assert
        assertNotNull(product.getBillDets());
        assertEquals(1, product.getBillDets().size());
        assertEquals(2, product.getBillDets().get(0).getId());
    }

    @Test
    void testGetComputer() {
        // Act and Assert
        assertNotNull(product.getComputer());
        assertEquals(1, product.getComputer().getId());
    }

    @Test
    void testSetComputer() {
        // Arrange
        Computer newComputer = new Computer(2, "HP", "8GB", "Intel Core i5", "Windows 11", null);

        // Act
        product.setComputer(newComputer);

        // Assert
        assertNotNull(product.getComputer());
        assertEquals(2, product.getComputer().getId());
    }
}
