create database  Inventarioreto5;

CREATE TABLE productos
(
codigo int primary key not null AUTO_INCREMENT,
nombre text,
precio real,
inventario int
);

INSERT INTO productos (nombre, precio, inventario) VALUES ("Manzanas",5000,25);
INSERT INTO productos (nombre, precio, inventario) VALUES ("Limones",2300,15);
INSERT INTO productos (nombre, precio, inventario) VALUES ("Peras",2700,33);
INSERT INTO productos (nombre, precio, inventario) VALUES ("Arandanos",9300,5);
INSERT INTO productos (nombre, precio, inventario) VALUES ("Tomates",2100,42);
INSERT INTO productos (nombre, precio, inventario) VALUES ("Fresas",4100,3);
INSERT INTO productos (nombre, precio, inventario) VALUES ("Helado",4500,41);
INSERT INTO productos (nombre, precio, inventario) VALUES ("Galletas",500,8);
INSERT INTO productos (nombre, precio, inventario) VALUES ("Chocolates",3500,80);
INSERT INTO productos (nombre, precio, inventario) VALUES ("Jamon",15000,10);