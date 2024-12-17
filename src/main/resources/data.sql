-- Insertar en la tabla Product
INSERT INTO Products (id, name, code, quantity, price) VALUES (1, 'Laptop', 'P001', 10, 99.99);
INSERT INTO Products (id, name, code, quantity, price) VALUES (2, 'Ordenador', 'P002', 20, 199.99);
INSERT INTO Products (id, name, code, quantity, price) VALUES (3, 'Laptop', 'P003', 15, 299.99);
INSERT INTO Products (id, name, code, quantity, price) VALUES (4, 'Ordenador', 'P004', 25, 399.99);
INSERT INTO Products (id, name, code, quantity, price) VALUES (5, 'Server', 'P005', 30, 499.99);

-- Insertar en la tabla Computer
INSERT INTO Computers (id, brand, memory, cpu, operating_system, product_id) VALUES (1, 'Nvidia', '16GB', 'i7', 'Windows', 1);
INSERT INTO Computers (id, brand, memory, cpu, operating_system, product_id) VALUES (2, 'Asus', '32GB', 'i9', 'Linux', 2);
INSERT INTO Computers (id, brand, memory, cpu, operating_system, product_id) VALUES (3, 'Intel', '8GB', 'i5', 'Windows', 3);
INSERT INTO Computers (id, brand, memory, cpu, operating_system, product_id) VALUES (4, 'HP', '16GB', 'i7', 'macOS', 4);
INSERT INTO Computers (id, brand, memory, cpu, operating_system, product_id) VALUES (5, 'Windows', '32GB', 'i9', 'Linux', 5);

-- Insertar en la tabla Shop
INSERT INTO Shops (id, name, tax_id) VALUES (1, 'Fnac', 123456);
INSERT INTO Shops (id, name, tax_id) VALUES (2, 'Shop2', 654321);

-- Insertar en la tabla Client
INSERT INTO Clients (id, first_name, last_name, dni) VALUES (1, 'John', 'Doe', '12345678A');
INSERT INTO Clients (id, first_name, last_name, dni) VALUES (2, 'Jane', 'Smith', '87654321B');

-- Insertar en la tabla Bill
INSERT INTO Bills (id, date, sub_total, total, discount, total_paid, client_id, shop_id) VALUES (1, '2023-10-01', 100.00, 110.00, 10.00, 110.00, 1, 1);
INSERT INTO Bills (id, date, sub_total, total, discount, total_paid, client_id, shop_id) VALUES (2, '2023-10-02', 200.00, 220.00, 20.00, 220.00, 2, 2);

-- Insertar en la tabla Bill_det
INSERT INTO Bill_dets (id, quantity, sale_price, sub_total, product_id, bill_id) VALUES (1, 2, 50.00, 100.00, 1, 1);
INSERT INTO Bill_dets (id, quantity, sale_price, sub_total, product_id, bill_id) VALUES (2, 1, 200.00, 200.00, 2, 2);


