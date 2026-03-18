
-- Actividad 1

SELECT * from clientes_historico;

CREATE TABLE `Clientes_Historico` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(5) NOT NULL,
  `empresa` varchar(40) NOT NULL,
  `contacto` varchar(30) DEFAULT NULL,
  `cargo_contacto` varchar(30) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `ciudad` varchar(15) DEFAULT NULL,
  `region` varchar(15) DEFAULT NULL,
  `cp` varchar(10) DEFAULT NULL,
  `pais` varchar(15) DEFAULT NULL,
  `telefono` varchar(24) DEFAULT NULL,
  `fax` varchar(24) DEFAULT NULL,
  `Fecha Modificacion` TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_cliente1` (`codigo`),
  UNIQUE KEY `uq_cliente2` (`empresa`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8mb3;




DELIMITER $$

CREATE TRIGGER TR_Clientes
AFTER UPDATE on clientes
FOR EACH ROW
BEGIN
INSERT INTO clientes_historico(id,codigo,empresa,contacto,cargo_contacto,direccion,ciudad,region,cp,pais,telefono,fax,`Fecha Modificacion`)
VALUES(
old.`id`,
old.`codigo`,
old.`empresa`,
old.`contacto`,
old.`cargo_contacto`,
old.`direccion`,
old.`ciudad`,
old.`region`,
old.`cp`,
old.`pais`,
old.`telefono`,
old.`fax`,
NOW()
);

END $$
DELIMITER ;

-- Actividad 2

ALTER TABLE Empleados
ADD column Edad INT;

Select * from Empleados;

DELIMITER $$

CREATE TRIGGER TR_EmpleadosInsertEdad
BEFORE INSERT ON Empleados
FOR EACH ROW
BEGIN
SET NEW.EDAD =  TIMESTAMPDIFF(YEAR, NEW.fecha_nacimiento, CURDATE());
END $$

DELIMITER ;

DELIMITER $$

CREATE TRIGGER TR_EmpleadosUpdateEdad
BEFORE UPDATE ON empleados
FOR EACH ROW
BEGIN
IF old.fecha_nacimiento <> new.fecha_nacimiento
THEN
	SET NEW.Edad = TIMESTAMPDIFF(YEAR,NEW.fecha_nacimiento, CURDATE());
END IF;
END $$

DELIMITER ;

-- Actividad 3

DELIMITER $$

CREATE TRIGGER TR_ClientesDeleteHistorico
BEFORE DELETE on Clientes
FOR EACH ROW
BEGIN

DELETE FROM clientes_historico WHERE id = old.id; 

END $$

DELIMITER ;