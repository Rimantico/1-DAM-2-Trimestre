CREATE SCHEMA InsercionesEj1;
use InsercionesEj1;

-- Creacion de las tablas

CREATE TABLE Profesor(
IdProfesor INT PRIMARY KEY,
NIF_P CHAR(9) UNIQUE,
Nombre VARCHAR(50),
Especialidad VARCHAR(50),
Telefono CHAR(10)
);

CREATE TABLE Alumno(
NumMatricula INT PRIMARY KEY,
Nombre VARCHAR(50),
FechaNacimiento DATE ,
Telefono CHAR(10)
);

CREATE TABLE Asignatura(
CodAsignatura CHAR(6) PRIMARY KEY,
Nombre VARCHAR(50),
IdProfesor INT,
CONSTRAINT FK_AsignaturaIdProfesor FOREIGN KEY (IdProfesor) REFERENCES Profesor(IdProfesor)
);

CREATE TABLE Recibe(
NumMatricula INT,
CodAsignatura CHAR(6) ,
CursoEscolar VARCHAR (30),
PRIMARY KEY(NumMatricula, CodAsignatura, CursoEscolar),
CONSTRAINT FK_RecibeNumMatricula FOREIGN KEY (NumMatricula) REFERENCES Alumno(NumMatricula),
CONSTRAINT FK_RecibeCodAsignatura FOREIGN KEY (CodAsignatura) REFERENCES Asignatura(CodAsignatura)
);

-- Insercion de datos

INSERT into Profesor values
(1, '12345678H', 'Pepe', 'Informática', '666123456'),
(2, '12345678M', 'Novato', 'Informática', '666444456');

INSERT INTO Asignatura values  
('LLMM', 'Lenguajes de marcas', 1),
('BBDD', 'Bases de datos', 1),
('PROG', 'Programación', 1),
('PPMM', 'Programación dispositivos móviles', 2);

INSERT INTO Alumno values 
(1, 'Alumno1', '1999-01-01', '12345678'),
(2, 'Alumno2', '1999-01-01', '12345679'),
(3, 'Alumno3', '1999-01-01', '12345678'),
(4, 'Alumno4', '1999-01-01', '12345678'),
(5, 'Alumno5', '1999-01-01', '12345678'),
(6, 'Alumno5', '2000-01-01', '12145678'),
(7, 'Alumno7', '2000-01-01', '12225678'),
(8, 'Alumno8', '2000-01-01', '62345678'),
(9, 'Alumno9', '2000-01-01', '92345678'),
(10, 'Alumno10', '2000-01-01', '82345678');

INSERT INTO recibe values 
(1, 'LLMM', '1dam'),
(1, 'PROG', '1dam'),
(1, 'BBDD', '1dam'),
(1, 'PPMM', '2dam'),
(2, 'LLMM', '1dam'),
(2, 'BBDD', '1dam'),
(3, 'LLMM', '1dam'),
(3, 'BBDD', '1dam'),
(4, 'LLMM', '1dam'),
(4, 'BBDD', '1dam'),
(5, 'LLMM', '1dam'),
(5, 'BBDD', '1dam'),
(6, 'LLMM', '1dam'),
(6, 'BBDD', '1dam'),
(7, 'LLMM', '1dam'),
(7, 'BBDD', '1dam'),
(8, 'LLMM', '1dam'),
(8, 'BBDD', '1dam'),
(9, 'LLMM', '1dam'),
(9, 'BBDD', '1dam'),
(10, 'LLMM', '1dam'),
(10, 'BBDD', '1dam');

