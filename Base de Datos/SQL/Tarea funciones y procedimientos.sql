-- 1.- Crea una función Prefijo que tenga como parámetro de entrada una cadena de caracteres (CADENA) y un número de caracteres (NUM_CHAR). La función deberá devolver los primeros NUM_CHAR caracteres de CADENA en mayúsculas, seguido de un guión. Prueba la función sobre el campo Categoría de la tabla Categorías.

DELIMITER $$

CREATE FUNCTION Prefijo (CADENA VARCHAR(255), NUM_CHAR INT)
RETURNS VARCHAR(255)
DETERMINISTIC
BEGIN
	RETURN CONCAT(UPPER(LEFT(CADENA, NUM_CHAR)), '-');
END $$

DELIMITER ;

Select categoria , Prefijo(Categoria,3) AS Prefijo_Categoria FROM categorias;

-- 2. Crea una función Iniciales_Empleado que devuelva las iniciales en mayúsculas a partir de un id de Empleado. Ejemplo: El empleado Pepe López con id=8 (Nombre "Pepe", Apellido "López") devolverá "PL".

DROP FUNCTION Iniciales_Empleado;

DELIMITER $$

CREATE FUNCTION Iniciales_Empleado(ID_Empleado INT)
RETURNS CHAR(2)
DETERMINISTIC
BEGIN
	DECLARE v_iniciales CHAR(2);


   SELECT CONCAT(UPPER(LEFT(nombre,1)),UPPER(LEFT(apellidos,1)))
   INTO v_iniciales
   FROM empleados
   WHERE id = ID_Empleado;
   
   RETURN v_iniciales;
    
END $$

DELIMITER ;

SELECT Iniciales_Empleado(3);



-- 3. Crea una función Edad_Empleado que devuelva la edad de un empleado. El parámetro de entrada será el id del empleado.

DROP FUNCTION Edad_Empleado;


DELIMITER $$


CREATE FUNCTION Edad_Empleado(ID_Empleado INT)
RETURNS INT
DETERMINISTIC
BEGIN

DECLARE v_años INT;

SELECT TIMESTAMPDIFF(YEAR, fecha_nacimiento, CURDATE()) 
INTO v_años 
FROM empleados
where id=ID_Empleado;

RETURN v_años;

END $$

DELIMITER ;

select Edad_Empleado(4);

-- 4. Crea un procedimiento Empleados_por_sexo que tenga como entrada un parámetro con dos posibles valores: "HOMBRE", "MUJER".
-- Deberá mostrar por pantalla los datos de los empleados del sexo solicitado. Así como la edad de cada empleado.

select nombre , tratamiento from empleados;

DELIMITER $$

CREATE PROCEDURE Empleados_Sexo(IN GENERO VARCHAR(6))
BEGIN

IF GENERO = 'HOMBRE' THEN
select nombre  , tratamiento
from empleados 
where tratamiento IN ('Sr.','Dr.');
ELSEIF GENERO = 'MUJER' THEN
select nombre , tratamiento
from empleados
where tratamiento IN ('Srta.');
END IF;

END $$

DELIMITER ;

CALL Empleados_Sexo('HOMBRE')