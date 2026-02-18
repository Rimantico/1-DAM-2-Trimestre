CREATE USER IF NOT EXISTS adminbd@localhost IDENTIFIED BY '1234';
CREATE USER IF NOT EXISTS aperez_ventas@localhost IDENTIFIED BY '1234';
CREATE USER IF NOT EXISTS lmartin_ventas@localhost IDENTIFIED BY '1234';
CREATE USER IF NOT EXISTS p_cuevas_ventas@localhost IDENTIFIED BY '1234';
CREATE USER IF NOT EXISTS arodriguez_administracion@localhost IDENTIFIED BY '1234';
DROP USER adminbd@localhost;
DROP USER aperez_ventas@localhost;
DROP USER lmartin_ventas@localhost;
DROP USER p_cuevas_ventas@localhost;
DROP USER arodriguez_administracion@localhost;

Select user,host
FROM mysql.user;
-- Dar todos los privilegios
GRANT ALL PRIVILEGES ON *.* TO admindb;