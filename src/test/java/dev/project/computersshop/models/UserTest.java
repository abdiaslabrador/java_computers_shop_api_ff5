package dev.project.computersshop.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    @Test
    void testGetDni() {
        // Arrange
        User user = new User("John", "Doe", "12345678");

        // Act and Assert
        assertNotNull(user.getDni());
        assertEquals("12345678", user.getDni());
    }

    @Test
    void testGetfirstName() {
        // Arrange
        User user = new User("John", "Doe", "12345678");

        // Act and Assert
        assertNotNull(user.getFirstName());
        assertEquals("John", user.getFirstName());
    }

    @Test
    void testGetId() {
        // Arrange
        User user = new User(1, "John", "Doe", "12345678");

        // Act and Assert
        assertEquals(1, user.getId());
    }

    @Test
    void testGetlastName() {
        // Arrange
        User user = new User("John", "Doe", "12345678");

        // Act and Assert
        assertNotNull(user.getLastName());
        assertEquals("Doe", user.getLastName());
    }

    @Test
    void testSetDni() {
        // Arrange
        User user = new User("John", "Doe", "12345678");

        // Act
        user.setDni("98765432");

        // Assert
        assertEquals("98765432", user.getDni());
    }

    @Test
    void testSetfirstName() {
        // Arrange
        User user = new User("John", "Doe", "12345678");

        // Act
        user.setFirstName("Jane");

        // Assert
        assertEquals("Jane", user.getFirstName());
    }

    @Test
    void testSetId() {
        // Arrange
        User user = new User(1, "John", "Doe", "12345678");

        // Act
        user.setId(2);

        // Assert
        assertEquals(2, user.getId());
    }

    @Test
    void testSetlastName() {
        // Arrange
        User user = new User("John", "Doe", "12345678");

        // Act
        user.setLastName("Smith");

        // Assert
        assertEquals("Smith", user.getLastName());
    }

    @Test
    void testGetShops() {
        // Arrange
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Shop1", "12345678"));
        shops.add(new Shop("Shop2", "98765432"));
        User user = new User("John", "Doe", "12345678", shops);

        // Act and Assert
        assertNotNull(user.getShops());
        assertEquals(2, user.getShops().size());
        assertEquals("Shop1", user.getShops().get(0).getName());
        assertEquals("Shop2", user.getShops().get(1).getName());
    }

    @Test
    void testSetShops() {
        // Arrange
        User user = new User("John", "Doe", "12345678");
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Shop1", "12345678"));
        shops.add(new Shop("Shop2", "98765432"));

        // Act
        user.setShops(shops);

        // Assert
        assertNotNull(user.getShops());
        assertEquals(2, user.getShops().size());
        assertEquals("Shop1", user.getShops().get(0).getName());
        assertEquals("Shop2", user.getShops().get(1).getName());
    }

    @Test
    void testConstructorWithShops() {
        // Arrange
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Shop1", "12345678"));
        shops.add(new Shop("Shop2", "98765432"));

        // Act
        User user = new User(1, "John", "Doe", "12345678", shops);

        // Assert
        assertEquals(1, user.getId());
        assertEquals("John", user.getFirstName());
        assertEquals("Doe", user.getLastName());
        assertEquals("12345678", user.getDni());
        assertNotNull(user.getShops());
        assertEquals(2, user.getShops().size());
        assertEquals("Shop1", user.getShops().get(0).getName());
        assertEquals("Shop2", user.getShops().get(1).getName());
    }
}
