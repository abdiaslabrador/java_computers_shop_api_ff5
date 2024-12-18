package dev.project.computersshop.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BillTest {

    Shop shop;
    Client client;
    List<BillDet> bill_dets;
    Bill bill;

    @BeforeEach
    void setUp() {
        // Arrange
        Bill bill2 = new Bill();
        shop = new Shop(1, "Fnac", "1234W56", null);
        client = new Client(1, "John", "Doe", "12345678A", null);
        bill_dets = List.of(new BillDet(1, 10, 10.0, 10.0, null, null));
        bill = new Bill(1, LocalDateTime.now(), 100.0, 100.0, 100.0, 0, shop, client, bill_dets);
    }

    @Test
    void testGetId() {
        // Act and Assert
        assertEquals(1, bill.getId());
    }

    @Test
    void testGetDate() {
        // Act and Assert
        assertNotNull(bill.getDate());
    }

    @Test
    void testGetSubTotal() {
        // Act and Assert
        assertEquals(100.0, bill.getSubTotal(), 0.01);
    }

    @Test
    void testGetTotal() {
        // Act and Assert
        assertEquals(100.0, bill.getTotal(), 0.01);
    }

    @Test
    void testGetTotal_paid() {
        // Act and Assert
        assertEquals(100.0, bill.getTotal_paid(), 0.01);
    }

    @Test
    void testGetDiscount() {
        // Act and Assert
        assertEquals(0, bill.getDiscount(), 0.01);
    }

    @Test
    void testGetShop() {
        // Act and Assert
        assertNotNull(bill.getShop());
        assertEquals("Fnac", bill.getShop().getName());
    }

    @Test
    void testGetClient() {
        // Act and Assert
        assertNotNull(bill.getClient());
        assertEquals("John", bill.getClient().getFirstName());
    }

    @Test
    void testGetBill_dets() {
        // Act and Assert
        assertNotNull(bill.getBill_dets());
        assertEquals(1, bill.getBill_dets().size());
    }

    @Test
    void testSetId() {
        // Act
        bill.setId(2);

        // Assert
        assertEquals(2, bill.getId());
    }

    @Test
    void testSetDate() {
        // Act
        bill.setDate(LocalDateTime.now());

        // Assert
        assertNotNull(bill.getDate());
    }

    @Test
    void testSetSubTotal() {
        // Act
        bill.setSubTotal(200.0);

        // Assert
        assertEquals(200.0, bill.getSubTotal(), 0.01);
    }

    @Test
    void testSetTotal() {
        // Act
        bill.setTotal(200.0);

        // Assert
        assertEquals(200.0, bill.getTotal(), 0.01);
    }

    @Test
    void testSetTotal_paid() {
        // Act
        bill.setTotal_paid(200.0);

        // Assert
        assertEquals(200.0, bill.getTotal_paid(), 0.01);
    }

    @Test
    void testSetDiscount() {
        // Act
        bill.setDiscount(10.0);

        // Assert
        assertEquals(10.0, bill.getDiscount(), 0.01);
    }

    @Test
    void testSetShop() {
        // Arrange
        Shop newShop = new Shop(2, "MediaMarkt", "5678X90", null);

        // Act
        bill.setShop(newShop);

        // Assert
        assertNotNull(bill.getShop());
        assertEquals("MediaMarkt", bill.getShop().getName());
    }

    @Test
    void testSetClient() {
        // Arrange
        Client newClient = new Client(2, "Jane", "Doe", "98765432B", null);

        // Act
        bill.setClient(newClient);

        // Assert
        assertNotNull(bill.getClient());
        assertEquals("Jane", bill.getClient().getFirstName());
    }

    @Test
    void testSetBill_dets() {
        // Arrange
        List<BillDet> newBillDets = new ArrayList<>();
        newBillDets.add(new BillDet(2, 20, 20.0, 20.0, null, null));

        // Act
        bill.setBill_dets(newBillDets);

        // Assert
        assertNotNull(bill.getBill_dets());
        assertEquals(1, bill.getBill_dets().size());
        assertEquals(2, bill.getBill_dets().get(0).getId());
    }
}
