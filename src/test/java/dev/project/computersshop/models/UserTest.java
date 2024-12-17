// package dev.project.computersshop.models;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;

// import java.util.ArrayList;
// import java.util.List;

// public class UserTest {

//     @Test
//     void testGetDni() {
//         // Arrange
//         Client client = new Client("John", "Doe", "12345678");

//         // Act and Assert
//         assertNotNull(client.getDni());
//         assertEquals("12345678", client.getDni());
//     }

//     @Test
//     void testGetfirstName() {
//         // Arrange
//         Client client = new Client("John", "Doe", "12345678");

//         // Act and Assert
//         assertNotNull(client.getFirstName());
//         assertEquals("John", client.getFirstName());
//     }

//     @Test
//     void testGetId() {
//         // Arrange
//         Client client = new Client(1, "John", "Doe", "12345678");

//         // Act and Assert
//         assertEquals(1, client.getId());
//     }

//     @Test
//     void testGetlastName() {
//         // Arrange
//         Client client = new Client("John", "Doe", "12345678");

//         // Act and Assert
//         assertNotNull(client.getLastName());
//         assertEquals("Doe", client.getLastName());
//     }

//     @Test
//     void testSetDni() {
//         // Arrange
//         Client client = new Client("John", "Doe", "12345678");

//         // Act
//         client.setDni("98765432");

//         // Assert
//         assertEquals("98765432", client.getDni());
//     }

//     @Test
//     void testSetfirstName() {
//         // Arrange
//         Client client = new Client("John", "Doe", "12345678");

//         // Act
//         client.setFirstName("Jane");

//         // Assert
//         assertEquals("Jane", client.getFirstName());
//     }

//     @Test
//     void testSetId() {
//         // Arrange
//         Client client = new Client(1, "John", "Doe", "12345678");

//         // Act
//         client.setId(2);

//         // Assert
//         assertEquals(2, client.getId());
//     }

//     @Test
//     void testSetlastName() {
//         // Arrange
//         Client client = new Client("John", "Doe", "12345678");

//         // Act
//         client.setLastName("Smith");

//         // Assert
//         assertEquals("Smith", client.getLastName());
//     }

//     @Test
//     void testGetShops() {
//         // Arrange
//         List<Shop> shops = new ArrayList<>();
//         shops.add(new Shop("Shop1", "12345678"));
//         shops.add(new Shop("Shop2", "98765432"));
//         Client client = new Client("John", "Doe", "12345678", shops);

//         // Act and Assert
//         assertNotNull(client.getShops());
//         assertEquals(2, client.getShops().size());
//         assertEquals("Shop1", client.getShops().get(0).getName());
//         assertEquals("Shop2", client.getShops().get(1).getName());
//     }

//     @Test
//     void testSetShops() {
//         // Arrange
//         Client client = new Client("John", "Doe", "12345678");
//         List<Shop> shops = new ArrayList<>();
//         shops.add(new Shop("Shop1", "12345678"));
//         shops.add(new Shop("Shop2", "98765432"));

//         // Act
//         client.setShops(shops);

//         // Assert
//         assertNotNull(client.getShops());
//         assertEquals(2, client.getShops().size());
//         assertEquals("Shop1", client.getShops().get(0).getName());
//         assertEquals("Shop2", client.getShops().get(1).getName());
//     }

//     @Test
//     void testConstructorWithShops() {
//         // Arrange
//         List<Shop> shops = new ArrayList<>();
//         shops.add(new Shop("Shop1", "12345678"));
//         shops.add(new Shop("Shop2", "98765432"));

//         // Act
//         Client client = new Client(1, "John", "Doe", "12345678", shops);

//         // Assert
//         assertEquals(1, client.getId());
//         assertEquals("John", client.getFirstName());
//         assertEquals("Doe", client.getLastName());
//         assertEquals("12345678", client.getDni());
//         assertNotNull(client.getShops());
//         assertEquals(2, client.getShops().size());
//         assertEquals("Shop1", client.getShops().get(0).getName());
//         assertEquals("Shop2", client.getShops().get(1).getName());
//     }
// }
