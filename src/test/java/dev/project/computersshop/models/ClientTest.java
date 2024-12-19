package dev.project.computersshop.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ClientTest {

    Client client;
    List<Bill> bills;

    @BeforeEach
    void setUp() {
        // Arrange
        bills = List.of(new Bill(1, LocalDateTime.now(), 100.0, 100.0, 100.0, 0, null, null, null));
        client = new Client(1, "John", "Doe", "12345678A", bills);
    }

    @Test
    void testGetId() {
        // Act and Assert
        assertEquals(1, client.getId());
    }

    @Test
    void testGetFirstName() {
        // Act and Assert
        assertNotNull(client.getFirstName());
        assertEquals("John", client.getFirstName());
    }

    @Test
    void testGetLastName() {
        // Act and Assert
        assertNotNull(client.getLastName());
        assertEquals("Doe", client.getLastName());
    }

    @Test
    void testGetDni() {
        // Act and Assert
        assertNotNull(client.getDni());
        assertEquals("12345678A", client.getDni());
    }

    @Test
    void testGetBills() {
        // Act and Assert
        assertNotNull(client.getBills());
        assertEquals(1, client.getBills().size());
    }

    @Test
    void testSetId() {
        // Act
        client.setId(2);

        // Assert
        assertEquals(2, client.getId());
    }

    @Test
    void testSetFirstName() {
        // Act
        client.setFirstName("Jane");

        // Assert
        assertEquals("Jane", client.getFirstName());
    }

    @Test
    void testSetLastName() {
        // Act
        client.setLastName("Smith");

        // Assert
        assertEquals("Smith", client.getLastName());
    }

    @Test
    void testSetDni() {
        // Act
        client.setDni("98765432B");

        // Assert
        assertEquals("98765432B", client.getDni());
    }

    @Test
    void testSetBills() {
        // Arrange
        List<Bill> newBills = new ArrayList<>();
        newBills.add(new Bill(2, LocalDateTime.now(), 200.0, 200.0, 200.0, 0, null, null, null));

        // Act
        client.setBills(newBills);

        // Assert
        assertNotNull(client.getBills());
        assertEquals(1, client.getBills().size());
        assertEquals(2, client.getBills().get(0).getId());
    }
}
