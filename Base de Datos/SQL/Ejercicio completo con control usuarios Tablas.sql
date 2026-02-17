CREATE SCHEMA ejercicioCompletoControlUsuarios;
use ejercicioCompletoControlUsuarios;

CREATE TABLE Editoriales(
codigo INT PRIMARY KEY,
nombre_editorial VARCHAR(80),
direccion VARCHAR(30),
codigo_postal CHAR(9),
telefono VARCHAR(30),
email VARCHAR(80)
);

CREATE TABLE Autores(
codigo INT PRIMARY KEY,
nombre VARCHAR(50),
apellidos VARCHAR(50),
fecha_nacimiento DATE
);

CREATE TABLE Libros(
ISBN INT PRIMARY KEY,
titulo VARCHAR(50),
autor INT,
editorial INT,
precio INT,
fecha_edicion DATE,

CONSTRAINT FK_LibrosAutor FOREIGN KEY(autor) REFERENCES Autores(codigo),
CONSTRAINT FK_LibrosEditorial FOREIGN KEY(editorial) REFERENCES Editoriales(codigo)
);