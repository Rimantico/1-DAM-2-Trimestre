CREATE SCHEMA EjercicioRepasoInserciones;
USE EjercicioRepasoInserciones;

-- Creacion de tablas

CREATE TABLE Alumno(
NumMatricula INT PRIMARY KEY AUTO_INCREMENT,
Nombre VARCHAR(255),
FechaNacimiento DATE,
Telefono CHAR(12)
);

CREATE TABLE Profesor(
IdProfesor INT PRIMARY KEY AUTO_INCREMENT,
NIF_P CHAR(9) UNIQUE,
Nombre VARCHAR(255),
Especialidad VARCHAR(255),
Telefono CHAR(12)
);

CREATE TABLE Asignatura(
CodAsignatura INT PRIMARY KEY AUTO_INCREMENT,
Nombre VARCHAR(255),
IdProfesor INT,

CONSTRAINT FK_AsignaturaProfesorIdProfesor FOREIGN KEY (IdProfesor) REFERENCES Profesor(IdProfesor)
);

CREATE TABLE Recibe(
NumMatricula INT,
CodAsignatura INT,
CursoEscolar CHAR(5),
PRIMARY KEY(NumMatricula, CodAsignatura, CursoEscolar),

CONSTRAINT FK_RecibeAsignatura FOREIGN KEY(CodAsignatura) REFERENCES Asignatura(CodAsignatura),
CONSTRAINT FK_RecibeAlumno FOREIGN KEY (NumMatricula) REFERENCES Alumno(NumMatricula)
);

-- Inserciones

INSERT INTO Profesor(NIF_P, Nombre, Especialidad, Telefono)
VALUES
	('12345678A','Nacho','SQL' ,'688721365'),
    ('12345678B','Francis','Java' ,'688721365');
    
INSERT INTO Asignatura(Nombre,IdProfesor)
VALUES
	('Base de Datos',1),
    ('Programacion',2),
    ('Lenguaje de Marcas',2),
    ('Entornos de Desarrollo',1);
    
INSERT INTO Alumno(Nombre,FechaNacimiento,Telefono)
VALUES
	('Juan','2007-10-14',688721365),
    ('Helena','2007-01-10',688721365),
    ('Jorge','2006-05-05',688721365),
    ('Alejandro','2000-10-10',1234456789),
    ('Jose','2007-10-13',098765432),
    ('Antonio','2001-10-03',394856102),
    ('Pablo','1990-10-05',256384596),
    ('Mario','1995-10-07',254178354),
    ('Carlos','2015-10-09',527185635),
    ('Benjamin','2000-01-08',758436924);
    
INSERT INTO Recibe(NumMatricula,CodAsignatura,CursoEscolar)
VALUES
	(1,1,'25-26'),
    (1,2,'25-26'),
    (2,1,'25-26'),
    (2,2,'25-26'),
    (3,1,'25-26'),
    (3,2,'25-26'),
    (4,1,'25-26'),
    (4,2,'25-26'),
    (5,1,'25-26'),
    (5,2,'25-26'),
    (6,1,'25-26'),
    (6,2,'25-26'),
    (7,1,'25-26'),
    (7,2,'25-26'),
    (8,1,'25-26'),
    (8,2,'25-26'),
    (9,1,'25-26'),
    (9,2,'25-26'),
    (10,1,'25-26'),
    (10,2,'25-26');
    
    -- Actividad 1
    
    INSERT INTO Alumno(Nombre,FechaNacimiento)
    VALUES
		('Adrian','2008-09-15'),
        ('Alvaro','2007-11-04'),
        ('Amel','2006-04-18');
        
	-- Actividad 2
    
    SELECT * from Alumno;
    
    UPDATE Alumno
    SET Telefono=123456789
    WHERE NumMatricula = 11;
    
    UPDATE Alumno
    SET Telefono=123456789
    WHERE NumMatricula = 12;
    
    UPDATE Alumno
    SET Telefono=123456789
    WHERE NumMatricula = 13;
    
    -- Actividad 3
    
    UPDATE Alumno
    Set FechaNacimiento = CONCAT('2000',DATE_FORMAT(FechaNacimiento,'-%m-%d'));
    
    
    -- Actividad 4
    
    Select * FROM Profesor;
    
    UPDATE Profesor
    SET Especialidad = 'Informatica'
    WHERE Telefono IS NOT NULL AND LEFT(NIF_P,1) <> 9;
    
    DELETE FROM Recibe WHERE CodAsignatura = 1;
    DELETE FROM Asignatura WHERE CodAsignatura = 1;
    DELETE FROM Asignatura WHERE CodAsignatura = 2;
    
    
    
    
    
    