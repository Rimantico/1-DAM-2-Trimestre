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
