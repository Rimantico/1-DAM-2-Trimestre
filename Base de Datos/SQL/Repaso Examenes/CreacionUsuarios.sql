USE bd_libreria;

UPDATE Libros
SET Precio = Precio-(Precio * 0.05)
WHERE Autores = (SELE
