-- Insertar un producto
INSERT INTO Products (id, name, code, quantity, price)
VALUES (default, 'Laptop', 'LP001', 10, 1000.0);

-- Suponiendo que el id del producto insertado es 1
-- Insertar un computador relacionado con el producto
INSERT INTO Computers (id, brand, memory, cpu, operating_system, product_id)
VALUES (default, 'Dell', '16GB', 'Intel Core i7', 'Windows 10', 1);