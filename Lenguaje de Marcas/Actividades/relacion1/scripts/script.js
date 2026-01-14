function ej1() {
  alert(
    "Soy Juan Gómez Ruiz y estoy cursando 1ºDAM y me gustaria trabajar de programador o de técnico informático "
  );
}
function ej2() {
  let suma = 0;
  let numero;

  do {
    numero = Number(prompt("Introduce un número (0 para terminar:)"));
    suma += numero;
  } while (numero !== 0);
  alert("La suma de todos los numeros introducidos es: " + suma);
}
function ej3() {
  let numeros = [];
  let cifra;

  for (let i = 1; i <= 4; i++) {
    cifra = Number(prompt("Introduzca el" + i + "º valor"));
    if (cifra >= 10) {
      alert("Introduce un numero de una cifra");
      break;
    } else numeros[i] = cifra;
  }
  alert("Los numeros son " + numeros);
}
function ej4() {
  let nota;
  nota = Number(prompt("Introduce tu nota:"));

  if (nota >= 0 && nota <= 10) {
    if (nota >= 9) {
      alert("Tienes un sobresaliente");
    } else if (nota >= 7) {
      alert("Tienes un Notable");
    } else if (nota >= 6) {
      alert("Tienes una nota aceptable");
    } else if (nota >= 5) {
      alert("Tienes una nota Suficiente");
    } else {
      alert("Tienes un insuficiente");
    }
  } else alert("Introduzca una nota válida");
}
function ej5() {
  let array = [];
  let opcion;
  do {
    opcion = Number(
      prompt(
        "--- Menu de opciones ---\n1. Introducir los 10 Digitos\n2. Mostrar la Suma\n3. Mostrar el mayor valor\n4. Mostrar el menor valor\n5. Media de los valores\n6. Salir"
      )
    );
    switch (opcion) {
      case 1:
        let entrada;
        for (let i = 0; i < 10; i++) {
          entrada = Number(
            prompt(
              "--- Introducción de valores ---\nPor favor, Introduzca el " +
                (i + 1) +
                "º valor:"
            )
          );
          array.push(entrada);
        }
        alert("Los numeros del array son: " + array);
        break;
      case 2:
        let suma = 0;
        for (let i = 0; i < 10; i++) {
          suma += array[i];
        }
        alert("El resultado de la Suma es de " + suma);
        break;
      case 3:
        let mayor = array[0];

        for (let i = 0; i < 10; i++) {
          if (mayor < array[i]) {
            mayor = array[i];
          }
        }
        alert("El numero mas grande de nuestro array es: " + mayor);
        break;
      case 4:
        let menor = array[0];

        for (let i = 0; i < 10; i++) {
          if (menor > array[i]) {
            menor = array[i];
          }
        }
        alert("El numero mas grande de nuestro array es: " + menor);
        break;
      case 5:
        let media = 0;
        for (let i = 0; i < 10; i++) {
          media += array[i];
        }
        media = media /10

        alert("La media es de " + media)
        break
      case 6:
        alert("Saliendo del programa...");
    }
  } while (opcion != 6);
}
