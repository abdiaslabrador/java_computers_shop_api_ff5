package dev.project.computersshop.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ShopTest {

    @Test
    void testGetId() {
        // Arrange
        Shop shop = new Shop(1, "My Shop", "12345678");

        // Act and Assert
        assertEquals(1, shop.getId());
    }

    @Test
    void testGetName() {
        // Arrange
        Shop shop = new Shop("My Shop", "12345678");

        // Act and Assert
        assertNotNull(shop.getName());
        assertEquals("My Shop", shop.getName());
    }

    @Test
    void testGetTaxId() {
        // Arrange
        Shop shop = new Shop("My Shop", "12345678");

        // Act and Assert
        assertNotNull(shop.getTaxId());
        assertEquals("12345678", shop.getTaxId());
    }

    @Test
    void testSetId() {
        // Arrange
        Shop shop = new Shop("My Shop", "12345678");

        // Act
        shop.setId(1);

        // Assert
        assertEquals(1, shop.getId());
    }

    @Test
    void testSetName() {
        // Arrange
        Shop shop = new Shop("My Shop", "12345678");

        // Act
        shop.setName("New Shop Name");

        // Assert
        assertEquals("New Shop Name", shop.getName());
    }

    @Test
    void testSetTaxId() {
        // Arrange
        Shop shop = new Shop("My Shop", "12345678");

        // Act
        shop.setTaxId("98765432");

        // Assert
        assertEquals("98765432", shop.getTaxId());
    }
}
