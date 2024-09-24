CREATE DATABASE restaurant_management;

USE restaurant_management;

CREATE TABLE Plato (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    disponibilidad BOOLEAN NOT NULL
);

CREATE TABLE Mesa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero_mesa INT NOT NULL UNIQUE,
    ocupada BOOLEAN NOT NULL
);