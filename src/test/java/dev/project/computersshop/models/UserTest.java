package dev.project.computersshop.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    void testGetFirst_name() {
        // Arrange
        User user = new User("John", "Doe", "12345678");

        // Act and Assert
        assertNotNull(user.getFirst_name());
        assertEquals("John", user.getFirst_name());
    }

    @Test
    void testGetId() {
        // Arrange
        User user = new User(1, "John", "Doe", "12345678");

        // Act and Assert
        assertEquals(1, user.getId());
    }

    @Test
    void testGetLast_name() {
        // Arrange
        User user = new User("John", "Doe", "12345678");

        // Act and Assert
        assertNotNull(user.getLast_name());
        assertEquals("Doe", user.getLast_name());
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
    void testSetFirst_name() {
        // Arrange
        User user = new User("John", "Doe", "12345678");

        // Act
        user.setFirst_name("Jane");

        // Assert
        assertEquals("Jane", user.getFirst_name());
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
    void testSetLast_name() {
        // Arrange
        User user = new User("John", "Doe", "12345678");

        // Act
        user.setLast_name("Smith");

        // Assert
        assertEquals("Smith", user.getLast_name());
    }
}
