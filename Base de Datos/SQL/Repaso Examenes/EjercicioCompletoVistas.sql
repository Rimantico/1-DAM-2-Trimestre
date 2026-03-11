CREATE SCHEMA IF NOT EXISTS bd_libreria;
USE bd_Libreria;

-- Creación de las tablas

CREATE TABLE Editoriales(
CodigoEditorial CHAR(5) PRIMARY KEY ,
NombreEditorial VARCHAR(255),
Direccion VARCHAR(255),
CodigoPostal CHAR(5),
Telefono CHAR(12),
Email VARCHAR(255)
);

CREATE TABLE Autores(
CodigoAutor INT PRIMARY KEY AUTO_INCREMENT,
Nombre VARCHAR(255),
Apellidos VARCHAR(255),
FechaNacimiento DATE
);

CREATE TABLE Libros(
ISBN CHAR(13) PRIMARY KEY,
Titulo VARCHAR(255),
Autor INT,
Editorial CHAR(5),
Precio INT,
FechaEdicion DATE,

CONSTRAINT FK_LibrosAutores FOREIGN KEY(Autor) REFERENCES Autores(CodigoAutor) ON UPDATE CASCADE ON DELETE SET NULL,
CONSTRAINT FK_LibrosEditoriales FOREIGN KEY(Editorial) REFERENCES Editoriales(CodigoEditorial) ON UPDATE CASCADE ON DELETE RESTRICT
);

-- Inserciones

INSERT INTO Editoriales(CodigoEditorial,NombreEditorial,CodigoPostal)
VALUES
	('E001','Santillana','41566'),
    ('E002','McGraw Hill','41566'),
    ('E003','Ra-Ma','41566'),
    ('E004','Prentice-Hall','41566'),
    ('E005','Garceta','41566');
    
INSERT INTO Autores(Nombre, Apellidos, FechaNacimiento)
VALUES
('Gabriel','García Márquez','1927-03-06'),
('Isabel','Allende','1942-08-02'),
('J.K.','Rowling','1965-07-31'),
('George','Orwell','1903-06-25'),
('Jane','Austen','1775-12-16'),
('Stephen','King','1947-09-21'),
('Agatha','Christie','1890-09-15'),
('Ernest','Hemingway','1899-07-21');
    
INSERT INTO Libros(ISBN,Titulo,Autor,Editorial,Precio,FechaEdicion)
VALUES
('9780000000001','Introduccion a SQL',1,'E001',25,'2020-05-10'),
('9780000000002','Bases de Datos Avanzadas',1,'E002',30,'2021-03-15'),
('9780000000003','Aprendiendo MySQL',1,'E001',28,'2019-07-20'),
('9780000000004','Modelado de Datos',1,'E003',32,'2022-01-12'),

('9780000000005','Programacion en Java',2,'E001',35,'2018-09-10'),
('9780000000006','Estructuras de Datos',2,'E002',40,'2017-11-25'),
('9780000000007','Algoritmos Basicos',3,'E003',22,'2019-04-14'),
('9780000000008','Desarrollo Web',3,'E002',27,'2021-06-30'),
('9780000000009','HTML y CSS',4,'E001',20,'2016-08-18'),
('9780000000010','JavaScript Moderno',4,'E003',26,'2022-10-05'),
('9780000000011','Python para Todos',5,'E002',29,'2020-12-01'),
('9780000000012','Introduccion a Linux',5,'E003',24,'2018-03-11'),
('9780000000013','Seguridad Informatica',6,'E001',33,'2023-02-19'),
('9780000000014','Redes de Computadores',7,'E002',31,'2019-09-09'),
('9780000000015','Inteligencia Artificial',8,'E003',45,'2024-01-20');

-- ACTIVIDADES REALES

-- Actividad 1

SELECT * from Editoriales;

UPDATE Editoriales
SET CodigoEditorial = 'E007'
WHERE CodigoEditorial = 'E005';

-- Actividad 2

INSERT INTO Editoriales(CodigoEditorial,NombreEditorial,CodigoPostal)
SELECT 'E006','Santillana-IberoAmericana', CodigoPostal
FROM Editoriales
WHERE CodigoEditorial = 'E001';

-- Actividad 3

UPDATE Editoriales
SET CodigoEditorial =CONCAT('ED',SUBSTRING(CodigoEditorial,2));

-- Actividad 4

UPDATE Libros
SET Precio = (Precio*0.1)+Precio
WHERE Editorial = 'ED007';

-- Actividad 5

Select * from Libros;

UPDATE Libros
SET FechaEdicion = DATE_ADD(FechaEdicion, INTERVAL 1 YEAR)
Where ISBN = '9780000000001';

-- Actividad 6

DELETE FROM Libros
WHERE Autor = 1;

-- Actividad 7

CREATE VIEW Vista_1 AS
SELECT
	ISBN, Titulo, Autor, Editorial, Precio , FechaEdicion, CONCAT(Autores.Apellidos , " " , Autores.Nombre) AS 'Nombre Completo'
FROM
	Libros
INNER JOIN Autores on Libros.Autor = Autores.CodigoAutor;

SELECT * FROM Vista_1;

-- Actividad 8

CREATE VIEW Vista_2 AS
SELECT 
	ISBN, Titulo, Autor, Precio, FechaEdicion, CONCAT(LEFT(Autores.Nombre,1),".",Autores.Apellidos) AS 'Nombre Con Iniciales'
FROM
	Libros
INNER JOIN Autores ON Libros.Autor = Autores.CodigoAutor;

SELECT * from Vista_2;

-- Actividad 9

RENAME TABLE Vista_1 TO V_libros_NombreCompleto;

RENAME TABLE Vista_2 TO V_libros_NombreConIniciales;

-- Actividad 10

SHOW FULL TABLES FROM bd_libreria
WHERE table_type = 'VIEW';

DROP VIEW V_libros_NombreCompleto;