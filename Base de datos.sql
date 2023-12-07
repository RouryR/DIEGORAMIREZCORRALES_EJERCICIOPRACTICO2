-- Crear la base de datos
CREATE DATABASE AerolineaDB;

-- Usar la base de datos
USE AerolineaDB;

CREATE TABLE Roles (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL
);
-- Crear la tabla Vuelos
CREATE TABLE Vuelos (
    id_Vuelos INT AUTO_INCREMENT PRIMARY KEY,
    numero_vuelo VARCHAR(20) NOT NULL,
    destino VARCHAR(100) NOT NULL,
    lugar_salida VARCHAR(100) NOT NULL,
    hora_salida TIME NOT NULL,
    fecha_salida DATE NOT NULL,
    fecha_llegada DATE NOT NULL,
    modelo_avion VARCHAR(50) NOT NULL
);

-- Crear la tabla Cliente
CREATE TABLE Cliente (
    id_Cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL,
    telefono VARCHAR(20) NOT NULL,
    nombre_usuario VARCHAR(50) NOT NULL,
    contrasena VARCHAR(100) NOT NULL,
    id_rol INT,
    activo boolean,
    FOREIGN KEY (id_rol) REFERENCES Roles(id)
);



-- Crear la tabla Prereservas
CREATE TABLE Prereservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_vuelo INT NOT NULL,
    id_cliente INT NOT NULL,
    FOREIGN KEY (id_vuelo) REFERENCES Vuelos(id_Vuelos),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_Cliente)
);

-- Crear la tabla Reserva
CREATE TABLE Reserva (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_vuelo INT NOT NULL,
    id_cliente INT NOT NULL,
    fecha_reserva DATETIME NOT NULL,
    FOREIGN KEY (id_vuelo) REFERENCES Vuelos(id_Vuelos),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_Cliente)
);

-- Insertar roles
INSERT INTO Roles (nombre)
VALUES ('administrador'), ('usuario');

-- Insertar datos de ejemplo en la tabla Cliente
INSERT INTO Cliente (nombre, apellido, correo, telefono, nombre_usuario, contrasena, id_rol)
VALUES
    ('Juan', 'Pérez', 'juan@example.com', '123-456-7890', 'juan_perez', SHA2('secretpassword', 256), 2),
    ('María', 'García', 'maria@example.com', '987-654-3210', 'maria_garcia', SHA2('mypassword', 256), 2),
    ('Carlos', 'López', 'carlos@example.com', '555-123-4567', 'carlos_lopez', SHA2('123456', 256), 2),
    ('Admin', 'Admin', 'admin@example.com', '111-111-1111', 'admin', SHA2('adminpassword', 256), 1);

-- Ejemplo de inserción de datos en la tabla Vuelos
INSERT INTO Vuelos (numero_vuelo, destino, lugar_salida, hora_salida, fecha_salida, fecha_llegada, modelo_avion)
VALUES 
	 ('V005', 'Ciudad E', 'Aeropuerto E', '18:10:00', '2024-01-05', '2024-01-05', 'Avión E'),
    ('V006', 'Ciudad F', 'Aeropuerto F', '21:30:00', '2024-01-10', '2024-01-10', 'Avión F'),
    ('V001', 'Ciudad A', 'Aeropuerto A', '08:00:00', '2023-12-15', '2023-12-15', 'Avión A'),
    ('V002', 'Ciudad B', 'Aeropuerto B', '10:30:00', '2023-12-20', '2023-12-20', 'Avión B'),
    ('V003', 'Ciudad C', 'Aeropuerto C', '13:45:00', '2023-12-25', '2023-12-25', 'Avión C'),
	('V004', 'Ciudad D', 'Aeropuerto D', '15:20:00', '2023-12-30', '2023-12-30', 'Avión D');
   
