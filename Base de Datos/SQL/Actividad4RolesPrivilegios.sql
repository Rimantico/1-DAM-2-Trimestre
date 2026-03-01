-- Crear Usuarios

CREATE USER 'adminbd'@'localhost' IDENTIFIED BY 'Admin123!';
CREATE USER 'aperez_ventas'@'localhost' IDENTIFIED BY 'Ventas123!';
CREATE USER 'lmartin_ventas'@'localhost' IDENTIFIED BY 'Ventas123!';
CREATE USER 'p_cuevas_ventas'@'localhost' IDENTIFIED BY 'Ventas123!';
CREATE USER 'arodriguez_administracion'@'localhost' IDENTIFIED BY 'Admin123!';

-- Crear Roles

CREATE ROLE 'dpto_ventas';
CREATE ROLE 'dpto_administracion';

-- Permisos de usuario

GRANT ALL PRIVILEGES ON *.* TO 'adminbd'@'localhost' WITH GRANT OPTION;

-- Permisos al departamento de ventas

GRANT USAGE ON *.* TO 'dpto_ventas';
GRANT SELECT ON neptuno.* TO 'dpto_ventas';
GRANT INSERT, UPDATE ON neptuno.clientes TO 'dpto_ventas';
GRANT INSERT, UPDATE ON neptuno.envios TO 'dpto_ventas';
GRANT INSERT, UPDATE ON neptuno.pedidos TO 'dpto_ventas';

GRANT DELETE ON neptuno.envios TO 'dpto_ventas';
GRANT DELETE ON neptuno.detalles TO 'dpto_ventas';
GRANT DELETE ON neptuno.pedidos TO 'dpto_ventas';

-- Asignar rol ventas a usuarios

GRANT 'dpto_ventas' TO 'aperez_ventas'@'localhost';
GRANT 'dpto_ventas' TO 'lmartin_ventas'@'localhost';
GRANT 'dpto_ventas' TO 'p_cuevas_ventas'@'localhost';

SET DEFAULT ROLE 'dpto_ventas' TO 
'aperez_ventas'@'localhost',
'lmartin_ventas'@'localhost',
'p_cuevas_ventas'@'localhost';

-- Mostrar permisos del usuario 

SHOW GRANTS FOR 'aperez_ventas'@'localhost';

-- Permisos Departamento Administración

GRANT ALL PRIVILEGES ON neptuno.categorias TO 'dpto_administracion';
GRANT ALL PRIVILEGES ON neptuno.productos TO 'dpto_administracion';
GRANT ALL PRIVILEGES ON neptuno.empleados TO 'dpto_administracion';
GRANT ALL PRIVILEGES ON neptuno.clientes TO 'dpto_administracion';

GRANT SELECT ON neptuno.* TO 'dpto_administracion';

-- Asignar Rol Administracion

GRANT 'dpto_administracion' TO 'arodriguez_administracion'@'localhost';

SET DEFAULT ROLE 'dpto_administracion' 
TO 'arodriguez_administracion'@'localhost';

-- Mostrar todos los usuarios del sistema

SELECT user, host FROM mysql.user;

-- Permitir consultar tablas especificas en sakila

GRANT SELECT ON sakila.customer TO 'arodriguez_administracion'@'localhost';
GRANT SELECT ON sakila.category TO 'arodriguez_administracion'@'localhost';
GRANT SELECT ON sakila.inventory TO 'arodriguez_administracion'@'localhost';
GRANT SELECT ON sakila.payment TO 'arodriguez_administracion'@'localhost';
GRANT SELECT ON sakila.rental TO 'arodriguez_administracion'@'localhost';
GRANT SELECT ON sakila.staff TO 'arodriguez_administracion'@'localhost';
GRANT SELECT ON sakila.store TO 'arodriguez_administracion'@'localhost';
GRANT SELECT ON sakila.address TO 'arodriguez_administracion'@'localhost';

-- Modificar la contraseña

ALTER USER 'arodriguez_administracion'@'localhost' 
IDENTIFIED BY 'NuevaClave123!';

-- Renombrar permiso DELETE de rol de ventas
REVOKE DELETE ON neptuno.envios FROM 'dpto_ventas';
REVOKE DELETE ON neptuno.detalles FROM 'dpto_ventas';
REVOKE DELETE ON neptuno.pedidos FROM 'dpto_ventas';
