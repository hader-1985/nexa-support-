CREATE DATABASE sbr;
USE sbr;
CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    direccion VARCHAR(150) NOT NULL
    );

-- Tabla de técnicos
CREATE TABLE tecnicos (
    id_tecnico INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT UNIQUE, -- Relación 1 a 1 con usuarios
    especialidad VARCHAR(100),
    disponible BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

-- Tabla de servicios
CREATE TABLE servicios (
    id_servicio INT AUTO_INCREMENT PRIMARY KEY,
    nombre_servicio VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10,2) DEFAULT 0.00
);

-- Tabla de tickets de soporte
CREATE TABLE tickets (
    id_ticket INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,       -- Cliente que abre el ticket
    id_servicio INT,      -- Servicio solicitado
    id_tecnico INT,       -- Técnico asignado
    descripcion TEXT,
    estado ENUM('pendiente', 'en_proceso', 'resuelto') DEFAULT 'pendiente',
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_servicio) REFERENCES servicios(id_servicio),
    FOREIGN KEY (id_tecnico) REFERENCES tecnicos(id_tecnico)
);

-- Tabla de notificaciones
CREATE TABLE notificaciones (
    id_notificacion INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    mensaje VARCHAR(255),
    leido BOOLEAN DEFAULT FALSE,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);