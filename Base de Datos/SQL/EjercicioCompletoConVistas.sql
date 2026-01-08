create schema bd_libreria;
use bd_libreria;

-- Creación de tablas

CREATE TABLE Editoriales(
Codigo CHAR(4) PRIMARY KEY,
NombreEditorial VARCHAR(50),
Direccion VARCHAR(50),
CodigoPostal CHAR(9),
Telefono CHAR(10),
Email VARCHAR(60)
);

CREATE TABLE Autores(
Codigo INT PRIMARY KEY,
Nombre VARCHAR(50),
Apellidos VARCHAR(50),
FechaNacimiento DATE
);

CREATE TABLE Libros(
ISBN INT PRIMARY KEY,
Titulo VARCHAR(50),
Autor INT,
Editorial CHAR(4),
Precio INT,
FechaEdicion YEAR,
CONSTRAINT FK_LibrosAutor FOREIGN KEY Libros(Autor) REFERENCES Autores(Codigo),
CONSTRAINT FK_LibrosEditorial FOREIGN KEY Libros(Editorial) REFERENCES Editoriales(Codigo)
);

-- Inserción de Datos

INSERT INTO Editoriales(NombreEditorial,Codigo) VALUES
('Santillana','E001'),
('McGraw-Hill','E002'),
('Ra-Ma','E003'),
('Prentice-Hall','E004'),
('Garceta','E005');