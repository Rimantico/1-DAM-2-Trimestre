create schema bd_libreria;
use bd_libreria;

-- Creación de tablas

CREATE TABLE Editoriales(
Codigo CHAR(6) PRIMARY KEY,
NombreEditorial VARCHAR(50),
Direccion VARCHAR(50),
CodigoPostal CHAR(9),
Telefono CHAR(10),
Email VARCHAR(60)
);

CREATE TABLE Autores(
Codigo CHAR(5) PRIMARY KEY,
Nombre VARCHAR(50),
Apellidos VARCHAR(50),
FechaNacimiento DATE
);

CREATE TABLE Libros(
ISBN CHAR(20) PRIMARY KEY,
Titulo VARCHAR(50),
Autor CHAR(4),
Editorial CHAR(6),
Precio INT,
FechaEdicion DATE,
CONSTRAINT FK_LibrosAutor FOREIGN KEY Libros(Autor) REFERENCES Autores(Codigo) ON DELETE RESTRICT ON UPDATE CASCADE,
CONSTRAINT FK_LibrosEditorial FOREIGN KEY Libros(Editorial) REFERENCES Editoriales(Codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Inserción de Datos

INSERT INTO Editoriales(NombreEditorial,Codigo) VALUES
('Santillana','E001'),
('McGraw-Hill','E002'),
('Ra-Ma','E003'),
('Prentice-Hall','E004'),
('Garceta','E005');

INSERT INTO Autores VALUES
('A001','Gabriel','García Márquez','1927-03-06'),
('A002','Miguel','de Cervantes Saavedra','1547-09-29'),
('A003','Isabel','Allende','1942-08-02'),
('A004','Julio','Cortázar','1914-08-26');

INSERT INTO Libros VALUE
('978-84-100-0001-1','El otoño eterno','A001','E001',19.95,'2010-05-12'),
('978-84-100-0002-2','Sombras del pasado','A002','E001',18.50,'2012-09-20'),
('978-84-100-0003-3','La última palabra','A003','E001',17.00,'2015-03-10'),
('978-84-100-0004-4','Crónicas del tiempo','A001','E002',21.00,'2011-11-01'),
('978-84-100-0005-5','Caminos cruzados','A004','E002',20.00,'2014-06-18'),
('978-84-100-0006-6','Voces en la niebla','A004','E002',16.75,'2016-01-25'),
('978-84-100-0007-7','Relatos breves','A001','E003',22.50,'2009-08-30'),
('978-84-100-0008-8','El mar infinito','A004','E003',19.00,'2013-04-14'),
('978-84-100-0009-9','La ciudad invisible','A002','E003',18.90,'2017-10-05'),
('978-84-100-0010-0','Memorias olvidadas','A001','E004',23.00,'2008-02-22'),
('978-84-100-0011-1','El viajero nocturno','A001','E004',15.50,'2011-07-09'),
('978-84-100-0012-2','Historias mínimas','A003','E004',17.80,'2015-12-01'),
('978-84-100-0013-3','Cartas al olvido','A001','E005',24.00,'2007-09-17'),
('978-84-100-0014-4','El eco del silencio','A003','E005',18.25,'2014-05-28'),
('978-84-100-0015-5','Sueños de papel','A004','E005',16.00,'2018-11-11');

-- Actividades

-- Actividad 3

UPDATE Editoriales
SET
	Codigo='E007'
WHERE
	NombreEditorial='Garceta';
    
-- Actividad 4

INSERT INTO Editoriales(Codigo,NombreEditorial,Direccion,CodigoPostal,Telefono,Email)
SELECT'E006','Santillana-Iberoamericana',Direccion,CodigoPostal,Telefono,Email
From Editoriales
WHERE Codigo='E001';

-- Actividad 5

UPDATE Editoriales
SET Codigo = REPLACE(Codigo, 'E', 'ED' );

-- Actividad 6

UPDATE Libros
SET
	Precio=(Precio*0.10)+Precio
WHERE
	Editorial='E007';
    
-- Actividad 7

UPDATE Libros
SET FechaEdicion = DATE_ADD(FechaEdicion, INTERVAL 1 YEAR)
WHERE ISBN = '978-84-100-0001-1';


-- Actividad 8

DELETE FROM Libros
WHERE Autor='A001';

-- Actividad 9

DELETE FROM Autores
WHERE Codigo IN(
    SELECT Autor
    FROM Libros
    GROUP BY Autor
    HAVING COUNT(*) = 1
);


-- Actividad 10

CREATE VIEW Vista_1 AS
    SELECT 
        ISBN,
        Titulo,
        Autor,
        Editorial,
        Precio,
        FechaEdicion,
		CONCAT(Autores.Apellidos , ' ' ,Autores.Nombre) AS 'Nombre Completo'
    FROM
        Libros
            LEFT JOIN
        Autores ON Autores.Codigo = Libros.Autor;
    
-- Actividad 11

CREATE VIEW Vista_2 AS
	SELECT
		ISBN,
        Titulo,
        Autor,
        Editorial,
        Precio,
        FechaEdicion,
        CONCAT(LEFT(Autores.Nombre, 1), '.', Autores.Apellidos) AS 'Nombre Con Iniciales'
	FROM
		Libros
			LEFT JOIN
		Autores ON Autores.Codigo = Libros.Autor;

-- Actividad 12

RENAME TABLE Vista_1
TO V_Libros_NombreCompleto;

-- Actividad 13

RENAME TABLE Vista_2
TO V_Libros_NombreConIniciales;

-- Actividad 14

SHOW FULL TABLES
WHERE TABLE_TYPE = 'VIEW';

-- Actividad 15

DROP VIEW V_Libros_NombreCompleto;
DROP VIEW V_Libros_NombreConIniciales

-- Actividad 16

