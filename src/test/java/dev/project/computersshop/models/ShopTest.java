package dev.project.computersshop.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    List<Bill> bills;
    Shop shop;

    @BeforeEach
    void setUp() {
        // Arrange
        Shop shop2 = new Shop();
        bills = List.of(new Bill(1, LocalDateTime.now(), 100.0, 100.0, 100.0, 0, null, null, null));
        shop = new Shop(1, "Fnac", "1234W56", bills);
    }

    @Test
    void testGetId() {
        // Act and Assert
        assertEquals(1, shop.getId());
    }

    @Test
    void testGetName() {
        // Act and Assert
        assertNotNull(shop.getName());
        assertEquals("Fnac", shop.getName());
    }

    @Test
    void testGetTaxId() {
        // Act and Assert
        assertNotNull(shop.getTaxId());
        assertEquals("1234W56", shop.getTaxId());
    }

    @Test
    void testGetBills() {
        // Act and Assert
        assertNotNull(shop.getBills());
        assertEquals(1, shop.getBills().size());
    }

    @Test
    void testSetId() {
        // Act
        shop.setId(2);

        // Assert
        assertEquals(2, shop.getId());
    }

    @Test
    void testSetName() {
        // Act
        shop.setName("MediaMarkt");

        // Assert
        assertEquals("MediaMarkt", shop.getName());
    }

    @Test
    void testSetTaxId() {
        // Act
        shop.setTaxId("5678X90");

        // Assert
        assertEquals("5678X90", shop.getTaxId());
    }

    @Test
    void testSetBills() {
        // Arrange
        List<Bill> newBills = new ArrayList<>();
        newBills.add(new Bill(2, LocalDateTime.now(), 200.0, 200.0, 200.0, 0, null, null, null));

        // Act
        shop.setBills(newBills);

        // Assert
        assertNotNull(shop.getBills());
        assertEquals(1, shop.getBills().size());
        assertEquals(2, shop.getBills().get(0).getId());
    }
}
