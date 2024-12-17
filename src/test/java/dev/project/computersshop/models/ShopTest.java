// package dev.project.computersshop.models;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;

// import java.util.ArrayList;
// import java.util.List;

// public class ShopTest {

//     @Test
//     void testGetId() {
//         // Arrange
//         Shop shop = new Shop(1, "My Shop", "12345678");

//         // Act and Assert
//         assertEquals(1, shop.getId());
//     }

//     @Test
//     void testGetName() {
//         // Arrange
//         Shop shop = new Shop("My Shop", "12345678");

//         // Act and Assert
//         assertNotNull(shop.getName());
//         assertEquals("My Shop", shop.getName());
//     }

//     @Test
//     void testGetTaxId() {
//         // Arrange
//         Shop shop = new Shop("My Shop", "12345678");

//         // Act and Assert
//         assertNotNull(shop.getTaxId());
//         assertEquals("12345678", shop.getTaxId());
//     }

//     @Test
//     void testSetId() {
//         // Arrange
//         Shop shop = new Shop("My Shop", "12345678");

//         // Act
//         shop.setId(1);

//         // Assert
//         assertEquals(1, shop.getId());
//     }

//     @Test
//     void testSetName() {
//         // Arrange
//         Shop shop = new Shop("My Shop", "12345678");

//         // Act
//         shop.setName("New Shop Name");

//         // Assert
//         assertEquals("New Shop Name", shop.getName());
//     }

//     @Test
//     void testSetTaxId() {
//         // Arrange
//         Shop shop = new Shop("My Shop", "12345678");

//         // Act
//         shop.setTaxId("98765432");

//         // Assert
//         assertEquals("98765432", shop.getTaxId());
//     }

//     @Test
//     void testGetUser() {
//         // Arrange
//         Client client = new Client("John", "Doe", "12345678");
//         Shop shop = new Shop("My Shop", "12345678", client, new ArrayList<>());

//         // Act and Assert
//         assertNotNull(shop.getUser());
//         assertEquals("John", shop.getUser().getFirstName());
//         assertEquals("Doe", shop.getUser().getLastName());
//         assertEquals("12345678", shop.getUser().getDni());
//     }

//     @Test
//     void testSetUser() {
//         // Arrange
//         Shop shop = new Shop("My Shop", "12345678");
//         Client client = new Client("John", "Doe", "12345678");

//         // Act
//         shop.setUser(client);

//         // Assert
//         assertNotNull(shop.getUser());
//         assertEquals("John", shop.getUser().getFirstName());
//         assertEquals("Doe", shop.getUser().getLastName());
//         assertEquals("12345678", shop.getUser().getDni());
//     }

//     @Test
//     void testGetProducts() {
//         // Arrange
//         List<Product> products = new ArrayList<>();
//         products.add(new Product("Laptop", "LP001", 10, 1000.0));
//         products.add(new Product("Desktop", "DP001", 5, 800.0));
//         Shop shop = new Shop("My Shop", "12345678", new Client("John", "Doe", "12345678"), products);

//         // Act and Assert
//         assertNotNull(shop.getProducts());
//         assertEquals(2, shop.getProducts().size());
//         assertEquals("Laptop", shop.getProducts().get(0).getName());
//         assertEquals("Desktop", shop.getProducts().get(1).getName());
//     }

//     @Test
//     void testSetProducts() {
//         // Arrange
//         Shop shop = new Shop("My Shop", "12345678");
//         List<Product> products = new ArrayList<>();
//         products.add(new Product("Laptop", "LP001", 10, 1000.0));
//         products.add(new Product("Desktop", "DP001", 5, 800.0));

//         // Act
//         shop.setProducts(products);

//         // Assert
//         assertNotNull(shop.getProducts());
//         assertEquals(2, shop.getProducts().size());
//         assertEquals("Laptop", shop.getProducts().get(0).getName());
//         assertEquals("Desktop", shop.getProducts().get(1).getName());
//     }

//     @Test
//     void testConstructorWithUserAndProducts() {
//         // Arrange
//         Client client = new Client("John", "Doe", "12345678");
//         List<Product> products = new ArrayList<>();
//         products.add(new Product("Laptop", "LP001", 10, 1000.0));
//         products.add(new Product("Desktop", "DP001", 5, 800.0));

//         // Act
//         Shop shop = new Shop("My Shop", "12345678", client, products);

//         // Assert
//         assertEquals("My Shop", shop.getName());
//         assertEquals("12345678", shop.getTaxId());
//         assertNotNull(shop.getUser());
//         assertEquals("John", shop.getUser().getFirstName());
//         assertEquals("Doe", shop.getUser().getLastName());
//         assertEquals("12345678", shop.getUser().getDni());
//         assertNotNull(shop.getProducts());
//         assertEquals(2, shop.getProducts().size());
//         assertEquals("Laptop", shop.getProducts().get(0).getName());
//         assertEquals("Desktop", shop.getProducts().get(1).getName());
//     }

//     @Test
//     void testConstructorWithIdUserAndProducts() {
//         // Arrange
//         Client client = new Client("John", "Doe", "12345678");
//         List<Product> products = new ArrayList<>();
//         products.add(new Product("Laptop", "LP001", 10, 1000.0));
//         products.add(new Product("Desktop", "DP001", 5, 800.0));

//         // Act
//         Shop shop = new Shop(1, "My Shop", "12345678", client, products);

//         // Assert
//         assertEquals(1, shop.getId());
//         assertEquals("My Shop", shop.getName());
//         assertEquals("12345678", shop.getTaxId());
//         assertNotNull(shop.getUser());
//         assertEquals("John", shop.getUser().getFirstName());
//         assertEquals("Doe", shop.getUser().getLastName());
//         assertEquals("12345678", shop.getUser().getDni());
//         assertNotNull(shop.getProducts());
//         assertEquals(2, shop.getProducts().size());
//         assertEquals("Laptop", shop.getProducts().get(0).getName());
//         assertEquals("Desktop", shop.getProducts().get(1).getName());
//     }
// }
