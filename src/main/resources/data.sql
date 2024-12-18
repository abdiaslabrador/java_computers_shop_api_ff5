-- Insertar en la tabla Product
INSERT INTO Products (id, name, code, quantity, price) VALUES (default, 'Laptop', 'P001', 10, 99.99);
INSERT INTO Products (id, name, code, quantity, price) VALUES (default, 'Ordenador', 'P002', 20, 199.99);
INSERT INTO Products (id, name, code, quantity, price) VALUES (default, 'Laptop', 'P003', 15, 299.99);
INSERT INTO Products (id, name, code, quantity, price) VALUES (default, 'Ordenador', 'P004', 25, 399.99);
INSERT INTO Products (id, name, code, quantity, price) VALUES (default, 'Server', 'P005', 30, 499.99);

-- Insertar en la tabla Computer
INSERT INTO Computers (id, brand, memory, cpu, operating_system, product_id) VALUES (default, 'Asus', '16GB', 'i7', 'Windows', 1);
INSERT INTO Computers (id, brand, memory, cpu, operating_system, product_id) VALUES (default, 'Asus', '32GB', 'i9', 'Linux', 2);
INSERT INTO Computers (id, brand, memory, cpu, operating_system, product_id) VALUES (default, 'Intel', '8GB', 'i5', 'Windows', 3);
INSERT INTO Computers (id, brand, memory, cpu, operating_system, product_id) VALUES (default, 'HP', '16GB', 'i7', 'macOS', 4);
INSERT INTO Computers (id, brand, memory, cpu, operating_system, product_id) VALUES (default, 'Windows', '32GB', 'i9', 'Linux', 5);

-- Insertar en la tabla Shop
INSERT INTO Shops (id, name, owner_name, tax_id) VALUES (default, 'Fnac', 'Abdias Labrador', 123456);
INSERT INTO Shops (id, name, owner_name, tax_id) VALUES (default, 'MediaMark', 'Daniel Labrador', 654321);

-- Insertar en la tabla Client
INSERT INTO Clients (id, first_name, last_name, dni) VALUES (default, 'John', 'Doe', '12345678A');
INSERT INTO Clients (id, first_name, last_name, dni) VALUES (default, 'Jane', 'Smith', '87654321B');

-- Insertar en la tabla Bill
INSERT INTO Bills (id, date, sub_total, total, discount, total_paid, client_id, shop_id) VALUES (default, '2023-10-01', 100.00, 110.00, 10.00, 100.00, 1, 1);
INSERT INTO Bills (id, date, sub_total, total, discount, total_paid, client_id, shop_id) VALUES (default, '2023-10-02', 200.00, 220.00, 20.00, 200.00, 2, 2);

-- Insertar en la tabla Bill_det
INSERT INTO Bill_dets (id, quantity, sale_price, sub_total, product_id, bill_id) VALUES (default, 2, 50.00, 100.00, 1, 1);
INSERT INTO Bill_dets (id, quantity, sale_price, sub_total, product_id, bill_id) VALUES (default, 1, 200.00, 200.00, 2, 2);


