let btnRojo = document.getElementById('btnrojo');
let btnVerde = document.getElementById('btnverde');
let btnAzul = document.getElementById('btnazul');
let btnAmarillo= document.getElementById('btnamarillo');
let btnRosa = document.getElementById('btnrosa');
let btnReset = document.getElementById('btnreset');
let box = document.querySelector('.box');

// Poner color boton

function setColorRojo() {
  if(btnRojo.value == "rojo") {
    box.style.background = "#FF0000";
  }
}

function setColorVerde() {
  if(btnVerde.value == "verde") {
    box.style.background = "#00FF00";
  }
}

function setColorAzul() {
  if(btnAzul.value == "azul") {
    box.style.background = "#0000FF";
  }
}

function setColorAmarillo() {
  if(btnAmarillo.value == "amarillo") {
    box.style.background = "#FFFF00";
  }
}

function setColorRosa(){
  if(btnRosa.value == "rosa"){
    box.style.background = "#FFC0CB";
  }
}

function setColorReset() {
  if(btnReset.value == "reset") {
    box.style.background = "#000000";
  }
}

// Listeners para los botones

btnRojo.addEventListener("mouseover" ,botonEncimaRojo)
btnRojo.addEventListener("mouseout",botonSalidaRojo)

btnVerde.addEventListener("mouseover", botonEncimaVerde)
btnVerde.addEventListener("mouseout", botonSalidaVerde)

btnAzul.addEventListener("mouseover", botonEncimaAzul)
btnAzul.addEventListener("mouseout" , botonSalidaAzul)

btnAmarillo.addEventListener("mouseover" , botonEncimaAmarillo)
btnAmarillo.addEventListener("mouseout" , botonSalidaAmarillo)

btnRosa.addEventListener("mouseover", botonEncimaRosa)
btnRosa.addEventListener("mouseout", botonSalidaRosa)

btnReset.addEventListener("mouseout", botonEncimaReset)
btnReset.addEventListener("mouseout", botonSalidaReset)

// Animación cuando pase por encima el boton

function botonEncimaRojo(){
  btnRojo.style.transform ="scale(1.5 , 2.5)"
}

function botonEncimaVerde(){
  btnVerde.style.transform="scale(1.5, 2.5)"
}

function botonEncimaAzul(){
  btnAzul.style.transform="scale(1.5,2.5)"
}

function botonEncimaAmarillo(){
  btnAmarillo.style.transform="scale(1.5,2.5)"
}

function botonEncimaRosa(){
  btnRosa.style.transform="scale(1.5,2.5)"
}

function botonEncimaReset(){
  btnReset.style.transform="scale(1.5,2.5)"
}

// Animación para cuando salga el raton de encima del boton

function botonSalidaRojo(){
  btnRojo.style.transform="scale(1,1)"
}
function botonSalidaVerde(){
  btnVerde.style.transform="scale(1,1)"
}

function botonSalidaAzul(){
  btnAzul.style.transform="scale(1,1)"
}

function botonSalidaAmarillo(){
  btnAmarillo.style.transform="scale(1,1)"
}

function botonSalidaRosa(){
  btnRosa.style.transform="scale(1,1)"
}

function botonSalidaReset(){
  btnReset.style.transform="scale(1,1)"
}