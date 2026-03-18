<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Procesando datos</title>
</head>

<body>

<h2>Datos recibidos</h2>

<?php

$nombre = $_POST['nombre'];
$email = $_POST['email'];
$edad = $_POST['edad'];
$fecha = $_POST['fecha'];
$hora = $_POST['hora'];
$ciudad = $_POST['ciudad'];

echo "Nombre: " . $nombre . "<br>";
echo "Email: " . $email . "<br>";
echo "Edad: " . $edad . "<br>";
echo "Fecha de nacimiento: " . $fecha . "<br>";
echo "Hora de registro: " . $hora . "<br>";
echo "Ciudad: " . $ciudad . "<br>";

echo "<br>Intereses:<br>";

if(isset($_POST['intereses'])){
    foreach($_POST['intereses'] as $interes){
        echo "- " . $interes . "<br>";
    }
}

?>

<br>
<a href="../enviado.html">Confirmar envío</a><br>
<a href="../index.html">Volver al inicio</a>

</body>
</html>