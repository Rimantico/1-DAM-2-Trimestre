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
CodAsignatura INT PRIMARY KEY,
Nombre VARCHAR(50),
IdProfesor INT,
CONSTRAINT FK_AsignaturaIdProfesor FOREIGN KEY (IdProfesor) REFERENCES Profesor(IdProfesor)
);

CREATE TABLE Recibe(
NumMatricula INT,
CodAsignatura INT ,
CursoEscolar VARCHAR (30),
PRIMARY KEY(NumMatricula, CodAsignatura, CursoEscolar),
CONSTRAINT FK_RecibeNumMatricula FOREIGN KEY (NumMatricula) REFERENCES Alumno(NumMatricula),
CONSTRAINT FK_RecibeCodAsignatura FOREIGN KEY (CodAsignatura) REFERENCES Asignatura(CodAsignatura)
);