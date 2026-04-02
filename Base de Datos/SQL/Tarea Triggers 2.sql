-- Actividad 1
DELIMITER $$

CREATE TRIGGER TR_Productos_Insert
BEFORE INSERT ON products
FOR EACH ROW
BEGIN
    IF NEW.productLine = 'Classic Cars' THEN
        SET NEW.HtmlDescription = CONCAT('<strong>', NEW.productDescription, '</strong>');
        
    ELSEIF NEW.productLine = 'Planes' THEN
        SET NEW.HtmlDescription = CONCAT('<strong><em>', NEW.productDescription, '</em></strong>');
        
    ELSE
        SET NEW.HtmlDescription = NEW.productDescription;
    END IF;
END $$

DELIMITER ;

-- Actividad 2

DELIMITER $$

CREATE TRIGGER TR_Productos_Update
AFTER UPDATE ON products
FOR EACH ROW
BEGIN
    DECLARE texto TEXT;

    -- buyPrice
    IF OLD.buyPrice <> NEW.buyPrice THEN
        SET texto = CONCAT(
            NOW(), ' Campo: buyPrice. Valor_anterior:', OLD.buyPrice,
            '. Valor_actual: ', NEW.buyPrice, '\n'
        );

        UPDATE orders o
        JOIN orderdetails od ON o.orderNumber = od.orderNumber
        SET o.comments = CONCAT(IFNULL(o.comments,''), texto)
        WHERE od.productCode = NEW.productCode;
    END IF;

    -- quantityInStock
    IF OLD.quantityInStock <> NEW.quantityInStock THEN
        SET texto = CONCAT(
            NOW(), ' Campo: quantityInStock. Valor_anterior:', OLD.quantityInStock,
            '. Valor_actual: ', NEW.quantityInStock, '\n'
        );

        UPDATE orders o
        JOIN orderdetails od ON o.orderNumber = od.orderNumber
        SET o.comments = CONCAT(IFNULL(o.comments,''), texto)
        WHERE od.productCode = NEW.productCode;
    END IF;

END $$

DELIMITER ;

-- Actividad 3
CREATE TABLE Pedidos_historico (
    orderNumber INT,
    orderDate DATE,
    requiredDate DATE,
    shippedDate DATE,
    status VARCHAR(50),
    comments TEXT,
    customerNumber INT,
    orderLineNumber INT,
    productCode VARCHAR(15),
    quantityOrdered INT,
    priceEach DECIMAL(10,2)
);

CREATE TABLE Pedidos_historico (
    orderNumber INT,
    orderDate DATE,
    requiredDate DATE,
    shippedDate DATE,
    status VARCHAR(50),
    comments TEXT,
    customerNumber INT,
    orderLineNumber INT,
    productCode VARCHAR(15),
    quantityOrdered INT,
    priceEach DECIMAL(10,2)
);

DELIMITER $$

CREATE TRIGGER TR_Productos_Delete
BEFORE DELETE ON products
FOR EACH ROW
BEGIN

    -- 1. Guardar en histórico
    INSERT INTO Pedidos_historico (
        orderNumber, orderDate, requiredDate, shippedDate,
        status, comments, customerNumber,
        orderLineNumber, productCode, quantityOrdered, priceEach
    )
    SELECT 
        o.orderNumber, o.orderDate, o.requiredDate, o.shippedDate,
        o.status, o.comments, o.customerNumber,
        od.orderLineNumber, od.productCode, od.quantityOrdered, od.priceEach
    FROM orders o
    JOIN orderdetails od ON o.orderNumber = od.orderNumber
    WHERE od.productCode = OLD.productCode
    AND o.orderDate < '2020-01-01';

    -- 2. Borrar orderdetails
    DELETE FROM orderdetails
    WHERE orderNumber IN (
        SELECT orderNumber FROM (
            SELECT orderNumber FROM Pedidos_historico
        ) AS temp
    );

    -- 3. Borrar orders
    DELETE FROM orders
    WHERE orderNumber IN (
        SELECT orderNumber FROM (
            SELECT orderNumber FROM Pedidos_historico
        ) AS temp
    );

END $$

DELIMITER ;
DELIMITER ;