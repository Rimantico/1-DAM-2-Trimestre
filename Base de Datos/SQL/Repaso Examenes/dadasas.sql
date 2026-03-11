create schema bd_libreria;
use bd_libreria;

CREATE TABLE editoriales (
    codigo_editorial CHAR(4) PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);
CREATE TABLE autores (
    id_autor INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE libros (
    id_libro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    codigo_editorial CHAR(4),
    id_autor INT,

    FOREIGN KEY (codigo_editorial) 
        REFERENCES editoriales(codigo_editorial)
        ON UPDATE CASCADE
        ON DELETE RESTRICT,

    FOREIGN KEY (id_autor) 
        REFERENCES autores(id_autor)
        ON UPDATE CASCADE
        ON DELETE SET NULL
);

INSERT INTO editoriales VALUES
('E001','Santillana'),
('E002','McGraw Hill'),
('E003','Ra-Ma'),
('E004','Prentice-Hall'),
('E005','Garceta');

INSERT INTO autores (nombre) VALUES
('Juan Pérez'),
('Ana López'),
('Carlos Martín'),
('Laura García');

INSERT INTO libros (titulo,codigo_editorial,id_autor) VALUES
-- Santillana
('Matemáticas Básicas','E001',1),
('Lengua Española','E001',2),
('Historia Universal','E001',1),

-- McGraw Hill
('Programación en Java','E002',1),
('Bases de Datos','E002',3),
('Redes Informáticas','E002',1),

-- Ra-Ma
('Sistemas Operativos','E003',2),
('Seguridad Informática','E003',3),
('Inteligencia Artificial','E003',1),

-- Prentice-Hall
('Algoritmos','E004',3),
('Estructuras de Datos','E004',1),
('Ingeniería del Software','E004',4),

-- Garceta
('Electrónica Básica','E005',2),
('Automatización Industrial','E005',3),
('Robótica','E005',4);

-- Actividad 1

SELECT * from Editoriales;

UPDATE Editoriales
SET codigo_editorial = 'E007'
WHERE codigo_editorial = 'E005';

-- Actividad 2

INSERT INTO Editoriales(codigo_editorial, nombre)
SELECT 'E006' , 'Santillana-Iberoamericana'
FROM Editoriales
WHERE codigo_editorial = 'E001';

-- Actividad 3
UPDATE Editoriales
SET codigo_editorial = CONCAT('ED',LEFT(codigo_editorial, 2));

-- Activida 4

SELECT * from Libros;

UPDATE Libros
SET Precio = (Precio*0.1)+Precio
WHERE codigo_editorial = 'E007';

-- Actividad 5


