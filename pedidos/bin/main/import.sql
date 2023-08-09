INSERT INTO Camionetas (Hawa, Marca, Precio, Descuento, Existencia) VALUES ('QAZ', 'Atos', '300000', '10', 50);
INSERT INTO Camionetas (Hawa, Marca, Precio, Descuento, Existencia) VALUES ('QWE', 'Honda', '500000', '10', 1);
INSERT INTO Camionetas (Hawa, Marca, Precio, Descuento, Existencia) VALUES ('QRT', 'Ford', '400000', '20', 20);
INSERT INTO Camionetas (Hawa, Marca, Precio, Descuento, Existencia) VALUES ('QUI', 'Nissan', '500000', '20', 10);

INSERT INTO Clientes (Nombre,App, Correo, RFC) VALUES ('Angel', 'Duarte', 'angel@example.com', 'QWERT567');
INSERT INTO Clientes (Nombre,App, Correo, RFC) VALUES ('AngelK', 'MTZ', 'angelMTZ@example.com', 'QWERT556');
INSERT INTO Clientes (Nombre,App, Correo, RFC) VALUES ('AngelC', 'Cruz', 'angelCr@example.com', 'QWERT512');

INSERT INTO Vendedores (Nombre,Tienda, Ip) VALUES ('Luis', 'AUTOZMX', '102.10.10.10');
INSERT INTO Vendedores (Nombre,Tienda, Ip) VALUES ('Alberto', 'AUTOZgdl', '102.10.10.11');
INSERT INTO Vendedores (Nombre,Tienda, Ip) VALUES ('Miguel', 'AUTOZMty', '102.10.10.110');

INSERT INTO Pedidos (Fecha,Status,Idcliente,Idvendedor,Idcamioneta) VALUES ('2022-03-06 22:00:00.888','pendiente',1,3,1);