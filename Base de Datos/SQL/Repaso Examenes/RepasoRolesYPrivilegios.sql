
-- Creacion de usuarios
CREATE USER admindb@localhost IDENTIFIED BY '1234';
CREATE USER aperez_ventas@localhost IDENTIFIED BY '1234';
CREATE USER lmartin_ventas@localhost IDENTIFIED BY '1234';
CREATE USER p_cuevas_ventas@localhost IDENTIFIED BY '1234';
CREATE USER arodriguez_administracion@localhost IDENTIFIED BY '1234';

-- Actividad 1

GRANT ALL PRIVILEGES ON *.* TO admindb@localhost;

-- Actividad 2

-- DPTO VENTAS
CREATE ROLE dpto_ventas@localhost;

GRANT dpto_ventas@localhost TO aperez_ventas@localhost;
GRANT dpto_ventas@localhost TO lmartin_ventas@localhost;
GRANT dpto_ventas@localhost TO p_cuevas_ventas@localhost;

-- DPTO ADMINISTRACION
CREATE ROLE dpto_administracion@localhost;
GRANT dpto_administracion@localhost TO arodriguez_administracion@localhost;

-- Actividad 3
-- Lectura
GRANT SELECT ON bd_neptuno2.* TO dpto_ventas@localhost;
-- Inserciones y modificación de registros
GRANT INSERT, UPDATE ON bd_neptuno2.clientes TO dpto_ventas@localhost;
GRANT INSERT,UPDATE ON bd_neptuno2.envios TO dpto_ventas@localhost;
GRANT INSERT,UPDATE ON bd_neptuno2.pedidos TO dpto_ventas@localhost;

-- Borrar registros

GRANT DELETE ON bd_neptuno2.envios TO dpto_ventas@localhost;
GRANT DELETE ON bd_neptuno2.detalles TO dpto_ventas@localhost;
GRANT DELETE ON bd_neptuno2.pedidos TO dpto_ventas@localhost;

SHOW GRANTS FOR aperez_ventas@localhost;

-- Departamento de administracion

GRANT ALL PRIVILEGES ON bd_neptuno2.categorias TO dpto_administracion@localhost;
GRANT ALL PRIVILEGES ON bd_neptuno2.productos TO dpto_administracion@localhost;
GRANT ALL PRIVILEGES ON bd_neptuno2.empleados TO dpto_administracion@localhost;
GRANT ALL PRIVILEGES ON bd_neptuno2.clientes TO dpto_administracion@localhost;

GRANT SELECT ON bd_neptuno2.* TO dpto_administracion@localhost;

-- Mostar todos los usuarios del sistema
SELECT user FROM mysql.user;

GRANT SELECT ON sakila.customer TO arodriguez_administracion@localhost;
GRANT SELECT ON sakila.category TO arodriguez_administracion@localhost;
GRANT SELECT ON sakila.inventory TO arodriguez_administracion@localhost;
GRANT SELECT ON sakila.payment TO  arodriguez_administracion@localhost;
GRANT SELECT ON sakila.rental TO arodriguez_administracion@localhost;
GRANT SELECT ON sakila.staff TO arodriguez_administracion@localhost;
GRANT SELECT ON sakila.store TO arodriguez_administracion@localhost;
GRANT SELECT ON sakila.address TO arofriguez_administracion@localhost;

REVOKE SELECT ON sakila.customer FROM arodriguez_administracion@localhost;


REVOKE DELETE ON *.* FROM dpto_ventas@localhost;