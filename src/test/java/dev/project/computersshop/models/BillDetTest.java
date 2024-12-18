package dev.project.computersshop.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BillDetTest {

    Product product;
    Bill bill;
    BillDet billDet;

    @BeforeEach
    void setUp() {
        // Arrange
        product = new Product(1, "Laptop", "LP001", 10, 1000.0, null, null);
        bill = new Bill(1, LocalDateTime.now(), 100.0, 100.0, 100.0, 0, null, null, null);
        billDet = new BillDet(1, 10, 10.0, 10.0, product, bill);
    }

    @Test
    void testGetId() {
        // Act and Assert
        assertEquals(1, billDet.getId());
    }

    @Test
    void testGetQuantity() {
        // Act and Assert
        assertEquals(10, billDet.getQuantity());
    }

    @Test
    void testGetSalePrice() {
        // Act and Assert
        assertEquals(10.0, billDet.getSalePrice(), 0.01);
    }

    @Test
    void testGetSubTotal() {
        // Act and Assert
        assertEquals(10.0, billDet.getSubTotal(), 0.01);
    }

    @Test
    void testGetProduct() {
        // Act and Assert
        assertNotNull(billDet.getProduct());
        assertEquals("Laptop", billDet.getProduct().getName());
    }

    @Test
    void testGetBill() {
        // Act and Assert
        assertNotNull(billDet.getBill());
        assertEquals(1, billDet.getBill().getId());
    }

    @Test
    void testSetId() {
        // Act
        billDet.setId(2);

        // Assert
        assertEquals(2, billDet.getId());
    }

    @Test
    void testSetQuantity() {
        // Act
        billDet.setQuantity(20);

        // Assert
        assertEquals(20, billDet.getQuantity());
    }

    @Test
    void testSetSalePrice() {
        // Act
        billDet.setSalePrice(20.0);

        // Assert
        assertEquals(20.0, billDet.getSalePrice(), 0.01);
    }

    @Test
    void testSetSubTotal() {
        // Act
        billDet.setSubTotal(20.0);

        // Assert
        assertEquals(20.0, billDet.getSubTotal(), 0.01);
    }

    @Test
    void testSetProduct() {
        // Arrange
        Product newProduct = new Product(2, "Desktop", "DP001", 5, 500.0, null, null);

        // Act
        billDet.setProduct(newProduct);

        // Assert
        assertNotNull(billDet.getProduct());
        assertEquals("Desktop", billDet.getProduct().getName());
    }

    @Test
    void testSetBill() {
        // Arrange
        Bill newBill = new Bill(2, LocalDateTime.now(), 200.0, 200.0, 200.0, 0, null, null, null);

        // Act
        billDet.setBill(newBill);

        // Assert
        assertNotNull(billDet.getBill());
        assertEquals(2, billDet.getBill().getId());
    }
}
