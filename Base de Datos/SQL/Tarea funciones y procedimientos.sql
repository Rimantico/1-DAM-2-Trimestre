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

DELIMITER $$

CREATE FUNCTION Iniciales_Empleado(ID INT)
RETURNS CHAR(2)
DETERMINISTIC
BEGIN
	select nombre , apellidos from empleados WHERE id = ID;
	RETURN CONCAT(UPPER(LEFT(nombre,1)),UPPER(LEFT(apellidos,1)));
END $$

DELIMITER ;

Select id , Iniciales_Empleado("4") as IncialesEmpleado from empleados