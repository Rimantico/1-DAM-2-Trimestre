// Actividad 1

function actividad1() {
  const numeros = {
    1: "primero",
    2: "segundo",
    3: "tercero",
    4: "cuarto",
    5: "quinto",
    6: "sexto",
    7: "séptimo",
    8: "octavo",
    9: "noveno",
    10: "décimo",
  };

  while (true) {
    const ordinal = prompt('Introduce un número ordinal (ej: primero). Pulsa cancelar para salir.');
    if (ordinal === null) return;

    const clave = Object.keys(numeros).find(k => numeros[k].toLowerCase() === ordinal.toLowerCase());
    if (clave) {
      alert('El número cardinal es: ' + clave);
      return;
    } else {
      alert('Ordinal no válido');
    }
  }
}

// Actividad 2
function actividad2() {
  const numero1 = Number(prompt('Introduce el primer número'));
  const numero2 = Number(prompt('Introduce el segundo número'));
  if (isNaN(numero1) || isNaN(numero2)) {
    alert('Entrada no válida');
    return;
  }
  const suma = numero1 + numero2;
  alert('Suma: ' + suma);
  alert('Binario: ' + suma.toString(2));
  alert('Hexadecimal: ' + suma.toString(16));
}

// Actividad 4

function actividad4() {
  const cadena1 = prompt('Cadena 1');
  if (cadena1 === null) return;
  const cadena2 = prompt('Cadena 2');
  if (cadena2 === null) return;

  if (cadena1.includes(cadena2)) {
    alert('Es una subcadena');
  } else {
    alert('No es subcadena');
  }

  alert('Cadena 1: ' + cadena1.length);
  alert('Cadena 2: ' + cadena2.length);

  let nuevaCadena = cadena1.replace(/[aeiouáéíóú]/gi, v => v.toUpperCase());
  if (nuevaCadena.length > 5) {
    nuevaCadena = nuevaCadena.substring(0, 5) + '...';
  }
  alert(nuevaCadena);
}

// Actividad 5

function actividad5() {
  const base = Number(prompt('Introduzca la base'));
  const exponente = Number(prompt('Introduce el exponente'));
  if (isNaN(base) || isNaN(exponente)) {
    alert('Entrada no válida');
    return;
  }
  function potencia(b, e) {
    let resultado = 1;
    for (let i = 0; i < e; i++) resultado *= b;
    return resultado;
  }
  const resultado = potencia(base, exponente);
  alert('Resultado: ' + resultado);
  return resultado;
}

// Actividad 6

function actividad6() {
  const tabla = (numero, inicio) => {
    for (let i = inicio; i < inicio + 10; i++) {
      alert(numero + ' x ' + i + ' = ' + numero * i);
    }
  };
  const num = Number(prompt('Introduce un número'));
  if (isNaN(num)) {
    alert('Número no válido');
    return;
  }
  let inicio = Number(prompt('Introduce el inicio de la tabla (ej: 1)'));
  if (isNaN(inicio)) inicio = 1;
  do {
    tabla(num, inicio);
    inicio += 10;
  } while (confirm('¿Quieres continuar?'));
}

// Placeholder para actividad3 si no está implementada
function actividad3() {
  alert('Ejercicio 3 no implementado todavía.');
}
