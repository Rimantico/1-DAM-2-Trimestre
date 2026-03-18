-- Actividad 1
DELIMITER $$

CREATE FUNCTION Prefijo(CADENA VARCHAR(100), NUM_CHAR INT)
RETURNS VARCHAR(100)
DETERMINISTIC
BEGIN

RETURN CONCAT(UPPER(LEFT(CADENA, NUM_CHAR)), '-');

END $$

DELIMITER ;

-- Actividad 2
DELIMITER $$

CREATE FUNCTION Iniciales_Empleado(ID INT)
RETURNS CHAR(2)
DETERMINISTIC
BEGIN

DECLARE v_nombre VARCHAR(50);
DECLARE v_apellido VARCHAR(50);

SELECT nombre, apellido
INTO v_nombre, v_apellido
FROM empleados
WHERE id = ID;

RETURN CONCAT(UPPER(LEFT(v_nombre,1)), UPPER(LEFT(v_apellido,1)));

END $$

DELIMITER ;

-- Actividad 3
DELIMITER $$

CREATE FUNCTION Edad_Empleado(ID INT)
RETURNS INT
DETERMINISTIC
BEGIN

DECLARE v_fecha DATE;

SELECT fecha_nacimiento
INTO v_fecha
FROM empleados
WHERE id = ID;

RETURN TIMESTAMPDIFF(YEAR, v_fecha, CURDATE());

END $$

DELIMITER ;

-- Actividad 4

DELIMITER $$

CREATE PROCEDURE Empleados_por_sexo(IN GENERO VARCHAR(10))
BEGIN

IF GENERO = 'HOMBRE' THEN

SELECT nombre, apellido, sexo, Edad_Empleado(id) AS edad
FROM empleados
WHERE sexo = 'HOMBRE';

ELSEIF GENERO = 'MUJER' THEN

SELECT nombre, apellido, sexo, Edad_Empleado(id) AS edad
FROM empleados
WHERE sexo = 'MUJER';

END IF;

END $$

DELIMITER ;

-- Actividad 5

DELIMITER $$

CREATE PROCEDURE Actualizar_Stock(
IN p_descripcion VARCHAR(100),
IN p_categoria INT,
IN p_cantidad INT
)

BEGIN

DECLARE existe INT;

SELECT COUNT(*)
INTO existe
FROM productos
WHERE descripcion = p_descripcion;

IF existe > 0 THEN

UPDATE productos
SET unidades_existencia = unidades_existencia + p_cantidad
WHERE descripcion = p_descripcion;

ELSE

INSERT INTO productos(descripcion, categoria, unidades_existencia)
VALUES(p_descripcion, p_categoria, p_cantidad);

END IF;

END $$

DELIMITER ;

-- Actividad 6
DELIMITER $$

CREATE PROCEDURE ActualizarIVA(IN p_iva DECIMAL(5,2))

BEGIN

UPDATE productos
SET iva = p_iva,
notas = CONCAT(
descripcion,' - Precio: ',
precio_unidad,' - IVA: ',
p_iva,' - Precio con IVA: ',
precio_unidad + (precio_unidad * p_iva / 100)
);

END $$

DELIMITER ;