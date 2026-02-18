DROP DATABASE IF EXISTS actividada;
CREATE DATABASE actividada;
USE actividada;

CREATE TABLE Editoriales (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nombre_editorial VARCHAR(100),
    direccion VARCHAR(150),
    codigo_postal VARCHAR(10),
    telefono VARCHAR(15),
    email VARCHAR(100)
);

CREATE TABLE Autores (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    apellidos VARCHAR(150),
    fecha_nacimiento DATE
);

CREATE TABLE Libros (
    ISBN VARCHAR(20) PRIMARY KEY,
    titulo VARCHAR(150),
    autor INT,
    editorial INT,
    precio DECIMAL(8,2),
    fecha_edicion DATE,
    FOREIGN KEY (autor) REFERENCES Autores(codigo),
    FOREIGN KEY (editorial) REFERENCES Editoriales(codigo)
);


INSERT INTO Editoriales (nombre_editorial, direccion, codigo_postal, telefono, email) VALUES
('Planeta', 'Calle A', '28001', '911111111', 'planeta@email.com'),
('Anaya', 'Calle B', '41001', '922222222', 'anaya@email.com');

INSERT INTO Autores (nombre, apellidos, fecha_nacimiento) VALUES
('Gabriel', 'García Márquez', '1967-03-06'),
('Arturo', 'Pérez Reverte', '1951-11-25'),
('AutorJoven', 'Ejemplo', '1990-01-01');

INSERT INTO Libros (ISBN, titulo, autor, editorial, precio, fecha_edicion) VALUES
('1111', 'Libro 1', 1, 1, 20.00, '2000-01-01'),
('2222', 'Libro 2', 2, 2, 25.00, '2005-01-01'),
('3333', 'Libro 3', 3, 1, 30.00, '2010-01-01');

-- Actividad 1

UPDATE Libros l
JOIN Autores a ON l.autor = a.codigo
SET l.precio = l.precio * 0.95
WHERE a.fecha_nacimiento < '1980-01-01';

-- Actividad 2

INSERT INTO Autores (nombre, apellidos, fecha_nacimiento)
SELECT first_name, last_name, NULL
FROM sakila.actor;

-- Actividad 3

CREATE OR REPLACE VIEW v_autores AS
SELECT 
    codigo,
    nombre,
    apellidos,
    CASE 
        WHEN fecha_nacimiento IS NULL 
            THEN 'Sin fecha nacimiento'
        ELSE DATE_FORMAT(fecha_nacimiento, '%Y-%m-%d')
    END AS fecha_nacimiento
FROM Autores;

-- Actividad 4

CREATE OR REPLACE VIEW v_editoriales AS
SELECT 
    codigo,
    nombre_editorial,
    direccion,
    codigo_postal,
    telefono,
    email,
    CASE
        WHEN codigo_postal LIKE '28%' THEN 'Madrid'
        WHEN codigo_postal LIKE '08%' THEN 'Barcelona'
        WHEN codigo_postal LIKE '41%' THEN 'Sevilla'
        WHEN codigo_postal LIKE '46%' THEN 'Valencia'
        ELSE 'Desconocida'
    END AS ciudad
FROM Editoriales;

-- Actividad 5

CREATE USER IF NOT EXISTS 'invitado'@'localhost' IDENTIFIED BY '1234';

GRANT ALL PRIVILEGES ON libreria.* TO 'invitado'@'localhost';

GRANT SELECT, UPDATE ON world.* TO 'invitado'@'localhost';

FLUSH PRIVILEGES;

-- Actividad 6

SHOW GRANTS FOR 'invitado'@'localhost';

-- Actividad 7

REVOKE UPDATE ON world.* FROM 'invitado'@'localhost';

FLUSH PRIVILEGES;



