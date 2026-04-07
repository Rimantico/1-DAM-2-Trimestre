// Funciones para introducir cada trbajador horas  aleatorias en arrays

let numeroAleatorio = 0;
let totalHorasTrabajador = 0;
let contadorTrabajador1 = 0;
let contadorTrabajador2 = 0;
let contadorTrabajador3 = 0;
let contadorTrabajador4 = 0;
let contadorTrabajador5 = 0;

let trabajador1 = [];
let trabajador2 = [];
let trabajador3 = [];
let trabajador4 = [];
let trabajador5 = [];
let textotrabajador1 = document.getElementById("trabajador1");
let textotrabajador2 = document.getElementById("trabajador2");
let textotrabajador3 = document.getElementById("trabajador3");
let textotrabajador4 = document.getElementById("trabajador4");
let textotrabajador5 = document.getElementById("trabajador5");

let trabajador1btn = document.getElementById("trabajador1btn");
let trabajador2btn = document.getElementById("trabajador2btn");
let trabajador3btn = document.getElementById("trabajador3btn");
let trabajador4btn = document.getElementById("trabajador4btn");
let trabajador5btn = document.getElementById("trabajador5btn");

trabajador1btn.addEventListener("click", funcionTrabajador1);
trabajador2btn.addEventListener("click", funcionTrabajador2);
trabajador3btn.addEventListener("click", funcionTrabajador3);
trabajador4btn.addEventListener("click", funcionTrabajador4);
trabajador5btn.addEventListener("click", funcionTrabajador5);

informaciontrabajador1 = document.getElementById("trabajador1info");
informaciontrabajador2 = document.getElementById("trabajador2info");
informaciontrabajador3 = document.getElementById("trabajador3info");
informaciontrabajador4 = document.getElementById("trabajador4info");
informaciontrabajador5 = document.getElementById("trabajador5info");

let horastrabajadas1 = 0;
let horastrabajadas2 = 0;
let horastrabajadas3 = 0;
let horastrabajadas4 = 0;
let horastrabajadas5 = 0;

let calculohoras1Realizado = false;
let calculohoras2Realizado = false;
let calculohoras3Realizado = false;
let calculohoras4Realizado = false;
let calculohoras5Realizado = false;

let horascompletas1 = false;
let horascompletas2 = false;
let horascompletas3 = false;
let horascompletas4 = false;
let horascompletas5 = false;

let restoTrabajadores = 0;

let nominaTrabajador1 = 0;
let nominaTrabajador2 = 0;
let nominaTrabajador3 = 0;
let nominaTrabajador4 = 0;
let nominaTrabajador5 = 0;

// Funciones
function funcionTrabajador1() {
  if (contadorTrabajador1 >= 7) {
    alert(
      "El trabajador 1 ya ha trabajado 7 dias, no puede trabajar más días.",
    );
    return;
  }
  numeroAleatorio = Math.random() * (10 - 8) + 8;
  if (numeroAleatorio > 8.59 && numeroAleatorio < 9) {
    numeroAleatorio = 8.59;
  } else if (numeroAleatorio > 9.59 && numeroAleatorio < 10) {
    numeroAleatorio = 9.59;
  } else numeroAleatorio.toFixed(2);
  trabajador1.push(numeroAleatorio);
  textotrabajador1.innerHTML =
    "El trabajador 1 ha trabajado " + numeroAleatorio.toFixed(2) + " horas.";
  contadorTrabajador1++;
}

function funcionTrabajador2() {
  if (contadorTrabajador2 >= 7) {
    alert(
      "El trabajador 2 ya ha trabajado 7 dias, no puede trabajar más días.",
    );
    return;
  }
  numeroAleatorio = Math.random() * (10 - 8) + 8;
  if (numeroAleatorio > 8.59 && numeroAleatorio < 9) {
    numeroAleatorio = 8.59;
  } else if (numeroAleatorio > 9.59 && numeroAleatorio < 10) {
    numeroAleatorio = 9.59;
  } else numeroAleatorio.toFixed(2);
  trabajador2.push(numeroAleatorio);
  textotrabajador2.innerHTML =
    "El trabajador 2 ha trabajado " + numeroAleatorio.toFixed(2) + " horas.";
  contadorTrabajador2++;
}

function funcionTrabajador3() {
  if (contadorTrabajador3 >= 7) {
    alert(
      "El trabajador 3 ya ha trabajado 7 dias, no puede trabajar más días.",
    );
    return;
  }
  numeroAleatorio = Math.random() * (10 - 8) + 8;
  if (numeroAleatorio > 8.59 && numeroAleatorio < 9) {
    numeroAleatorio = 8.59;
  } else if (numeroAleatorio > 9.59 && numeroAleatorio < 10) {
    numeroAleatorio = 9.59;
  } else numeroAleatorio.toFixed(2);
  trabajador3.push(numeroAleatorio);
  textotrabajador3.innerHTML =
    "El trabajador 3 ha trabajado " + numeroAleatorio.toFixed(2) + " horas.";
  contadorTrabajador3++;
}

function funcionTrabajador4() {
  if (contadorTrabajador4 >= 7) {
    alert(
      "El trabajador 4 ya ha trabajado 7 dias, no puede trabajar más días.",
    );
    return;
  }
  numeroAleatorio = Math.random() * (10 - 8) + 8;
  if (numeroAleatorio > 8.59 && numeroAleatorio < 9) {
    numeroAleatorio = 8.59;
  } else if (numeroAleatorio > 9.59 && numeroAleatorio < 10) {
    numeroAleatorio = 9.59;
  } else numeroAleatorio.toFixed(2);
  trabajador4.push(numeroAleatorio);
  textotrabajador4.innerHTML =
    "El trabajador 4 ha trabajado " + numeroAleatorio.toFixed(2) + " horas.";
  contadorTrabajador4++;
}

function funcionTrabajador5() {
  if (contadorTrabajador5 >= 7) {
    alert(
      "El trabajador 5 ya ha trabajado 7 dias, no puede trabajar más días.",
    );

    return;
  }
  numeroAleatorio = Math.random() * (10 - 8) + 8;
  if (numeroAleatorio > 8.59 && numeroAleatorio < 9) {
    numeroAleatorio = 8.59;
  } else if (numeroAleatorio > 9.59 && numeroAleatorio < 10) {
    numeroAleatorio = 9.59;
  } else numeroAleatorio.toFixed(2);
  trabajador5.push(numeroAleatorio);
  textotrabajador5.innerHTML =
    "El trabajador 5 ha trabajado " + numeroAleatorio.toFixed(2) + " horas.";
  contadorTrabajador5++;
}

// Calcular cuantas horas de mas o de menos ha hecho cada trabajador

informaciontrabajador1.addEventListener("click", calcularHorasTrabajador1);
informaciontrabajador2.addEventListener("click", calcularHorasTrabajador2);
informaciontrabajador3.addEventListener("click", calcularHorasTrabajador3);
informaciontrabajador4.addEventListener("click", calcularHorasTrabajador4);
informaciontrabajador5.addEventListener("click", calcularHorasTrabajador5);

function calcularHorasTrabajador1() {
    if(calculohoras1Realizado == false){
        alert("Primero debes calcular las horas trabajadas del trabajador 1");
        return;
    }
  for (let i = 0; i < trabajador1.length; i++) {
    if (trabajador1[i] >= 9) {
      horastrabajadas1 += trabajador1[i] - 9;
      calculohoras1Realizado = true;
    } else horastrabajadas1 -= trabajador1[i] - 9;
    calculohoras1Realizado = true;
  }
  alert(horastrabajadas1);
}
function calcularHorasTrabajador2() {
    if(calculohoras2Realizado == false){
        alert("Primero debes calcular las horas trabajadas del trabajador 2");
        return;
    }
  for (let i = 0; i < trabajador2.length; i++) {
    if (trabajador2[i] >= 9) {
      horastrabajadas2 += trabajador2[i] - 9;
      calculohoras2Realizado = true;
    } else horastrabajadas2 -= trabajador2[i] - 9;
    calculohoras2Realizado = true;
  }
  alert(horastrabajadas2);
}
function calcularHorasTrabajador3() {
    if(calculohoras3Realizado == false){
        alert("Primero debes calcular las horas trabajadas del trabajador 3");
        return;
    }
  for (let i = 0; i < trabajador3.length; i++) {
    if (trabajador3[i] >= 9) {
      horastrabajadas3 += trabajador3[i] - 9;
      calculohoras3Realizado = true;
    } else horastrabajadas3 -= trabajador3[i] - 9;
    calculohoras3Realizado = true;
  }
  alert(horastrabajadas3);
}
function calcularHorasTrabajador4() {
    if(calculohoras4Realizado == false){
        alert("Primero debes calcular las horas trabajadas del trabajador 4");
        return;
    }
  for (let i = 0; i < trabajador4.length; i++) {
    if (trabajador4[i] >= 9) {
      horastrabajadas4 += trabajador4[i] - 9;
      calculohoras4Realizado = true;
    } else horastrabajadas4 -= trabajador4[i] - 9;
    calculohoras4Realizado = true;
  }
  alert(horastrabajadas4);
}
function calcularHorasTrabajador5() {
    if(calculohoras5Realizado == false){
        alert("Primero debes calcular las horas trabajadas del trabajador 5");
        return;
    }
  for (let i = 0; i < trabajador5.length; i++) {
    if (trabajador5[i] >= 9) {
      horastrabajadas5 += trabajador5[i] - 9;
      calculohoras5Realizado = true;
    } else horastrabajadas5 -= trabajador5[i] - 9;
    calculohoras5Realizado = true;
  }
  alert(horastrabajadas5);
}

// Boton para calcular la nomina total de los trabajadores
let calcularnomina = document.getElementById("calcularnomina");
calcularnomina.addEventListener("click", calcularNominaTotal);
function calcularNominaTotal() {
  if (
    calculohoras1Realizado &&
    calculohoras2Realizado &&
    calculohoras3Realizado &&
    calculohoras4Realizado &&
    calculohoras5Realizado
  ) {
    if (horastrabajadas1 > 0) {
      nominaTrabajador1 = 200;
      horascompletas1 = true;
    } else if (horastrabajadas1 < 0) {
      restoTrabajadores += 200;
      horascompletas1 = false;
    }
    if (horastrabajadas2 > 0) {
      nominaTrabajador2 = 200;
      horascompletas2 = true;
    } else if (horastrabajadas2 < 0) {
      restoTrabajadores += 200;
        horascompletas2 = false;
    }
    if (horastrabajadas3 > 0) {
      nominaTrabajador3 = 200;
      horascompletas3 = true;
    } else if (horastrabajadas3 < 0) {
      restoTrabajadores += 200;
        horascompletas3 = false;
    }
    if (horastrabajadas4 > 0) {
      nominaTrabajador4 = 200;
      horascompletas4 = true;
    } else if (horastrabajadas4 < 0) {
      restoTrabajadores += 200;
        horascompletas4 = false;
    }
    if (horastrabajadas5 > 0) {
      nominaTrabajador5 = 200;
      horascompletas5 = true;
    } else if (horastrabajadas5 < 0) {
      restoTrabajadores += 200;
      horascompletas5 = false;
    }
  }
}

// Carrusel de tres imagenes con temporazidor de 3 segundos

let imagenes = ["./images/1.png", "./images/2.png", "./images/3.png"];
let indiceImagen = 0;
let imagenCarrusel = document.getElementById("carrusel");
function cambiarImagen() {
  imagenCarrusel.src = imagenes[indiceImagen];
  indiceImagen++;
  if (indiceImagen >= imagenes.length) {
    indiceImagen = 0;
  }
}
cambiarImagen();
setInterval(cambiarImagen, 3000);

// Efecto botones al pasar el raton por encima
let botones = document.querySelectorAll('input[type="button"]');
botones.forEach((boton) => {
  boton.addEventListener("mouseover", () => {
    boton.style.backgroundColor = "blue";
    boton.style.color = "white";
  });
});
botones.forEach((boton) => {
  boton.addEventListener("mouseout", () => {
    boton.style.backgroundColor = "";
    boton.style.color = "";
  });
});

// Efecto de cambio de color al hacer click en el boton
botones.forEach((boton) => {
  boton.addEventListener("click", () => {
    boton.style.backgroundColor = "yellow";
    boton.style.color = "white";
  });
});
// Efecto cuando dejo de hacer click en el boton
botones.forEach((boton) => {
  boton.addEventListener("mouseup", () => {
    boton.style.backgroundColor = "";
    boton.style.color = "";
  });
});
