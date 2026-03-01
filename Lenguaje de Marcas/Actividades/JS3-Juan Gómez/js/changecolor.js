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

let fechaCompleta = document.createElement('p');
fechaCompleta.style.color = "white";
contenido.insertBefore(fechaCompleta, contenido.firstChild);

function actualizarFechaHora() {
  const horario = new Date();
  const hora = horario.getHours().toString().padStart(2, '0');
  const minutos = horario.getMinutes().toString().padStart(2, '0');
  const segundos = horario.getSeconds().toString().padStart(2, '0');
  const dia = horario.getDate().toString().padStart(2, '0');
  const mes = (horario.getMonth() + 1).toString().padStart(2, '0');
  const anio = horario.getFullYear().toString();

  fechaCompleta.textContent = `${dia}/${mes}/${anio} ${hora}:${minutos}:${segundos}`;
}

actualizarFechaHora();
setInterval(actualizarFechaHora, 1000);

// Actividad 3

function intervalo3Minutos(){
  setInterval(() => {
    const continuar = confirm("¿Deseas continuar viendo la página?");
    if (!continuar) {
      window.location.href = "https://www.google.com";
    }
}, 1800000);
}
intervalo3Minutos()

// Actividad 4

const altoAnchoTexto = document.createElement('p');

altoAnchoTexto.style.color = "white";
contenido.insertBefore(altoAnchoTexto, contenido.firstChild);

function actualizarAltoAncho() {
  const ancho = window.innerWidth;
  const alto = window.innerHeight;
  altoAnchoTexto.textContent = `Ancho: ${ancho}px, Alto: ${alto}px`;
}
actualizarAltoAncho();
window.addEventListener('resize', actualizarAltoAncho);

// Actividad 5

let btnOculto = document.getElementById('btnoculto');

function ocultarBoton() {
  if (btnOculto.value == "oculto") {
    btnOculto.style.display = "none";
  }
}
btnOculto.addEventListener('click', ocultarBoton)