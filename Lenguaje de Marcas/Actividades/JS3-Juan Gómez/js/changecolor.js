let btnRojo = document.getElementById('btnrojo');
let btnVerde = document.getElementById('btnverde');
let btnAzul = document.getElementById('btnazul');
let btnAmarillo = document.getElementById('btnamarillo');
let btnReset = document.getElementById('btnreset');
let box = document.querySelector('.box');

// Actividad 1 y pagina por defecto

function setColorRojo() {
  if (btnRojo.value == "rojo") {
    box.style.background = "#FF0000";
    titulo.style.color = "#FF0000"
  }
}

function setColorVerde() {
  if (btnVerde.value == "verde") {
    box.style.background = "#00FF00";
    titulo.style.color = "#00FF00"
  }
}

function setColorAzul() {
  if (btnAzul.value == "azul") {
    box.style.background = "#0000FF";
    titulo.style.color = "#0000FF"
  }
}

function setColorAmarillo() {
  if (btnAmarillo.value == "amarillo") {
    box.style.background = "#FFFF00";
    titulo.style.color = "#FFFF00"
  }
}

function setColorReset() {
  if (btnReset.value == "reset") {
    box.style.background = "#000000";
    titulo.style.color = "#FFFFFF"
  }
}

// Apartado 1 act 1

let btnRosa = document.getElementById('btnrosa')

function setColorRosa() {
  if (btnRosa.value == "rosa") {
    box.style.background = "pink"
    titulo.style.color = "pink"
  }
}

// Apartado 2 act 1

let animacionEntrada = document.querySelectorAll('input[type="button"]');

animacionEntrada.forEach(btn => {
  btn.addEventListener('mouseenter', function () {
    this.style.transform = "scale(1.1)";
  });
  btn.addEventListener('mouseleave', function () {
    this.style.transform = "scale(1)";
  });
});

// Apartado 3 act 1

let contenido = document.querySelector('.contenido');
let titulo = document.createElement('h1')
titulo.textContent = "Cambiar el color del cuadrado con botones"
contenido.insertBefore(titulo, contenido.firstChild)
titulo.style.color = "white"

// Apartado 4 act 1

let imagenes = ['./images/imagen1.jpeg', './images/imagen2.jpeg', './images/imagen3.jpeg'];
let indiceImagen = 0;
let btnImagen = document.getElementById('btnimagen')

function cambiarImagen() {
  if (btnImagen.value == "imagen") {
    box.style.backgroundImage = "url('./images/imagen" + (indiceImagen + 1) + ".jpeg')";
    box.style.backgroundSize = "cover";
    indiceImagen = (indiceImagen + 1) % imagenes.length;
  }
}
btnImagen.addEventListener('click', cambiarImagen)

// Actividad 2

let horario = new Date()

let hora = horario.getHours().toString().padStart(2, '0')
let minutos = horario.getMinutes().toString().padStart(2, '0')
let segundos = horario.getSeconds().toString().padStart(2, '0')

let dia = horario.getDay().toString().padStart(2, '0')
let mes = horario.getMonth().toString().padStart(2, '0')
let anio = horario.getFullYear().toString().padStart(2, '0')

let fechaCompleta = `${dia}:${mes + 1}:${anio}`

contenido.insertBefore(fechaCompleta, contenido.firstChild)