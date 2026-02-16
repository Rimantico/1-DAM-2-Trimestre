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

btnRojo.addEventListener("mouseover" ,botonEncimaRojo)
// Animación cuando pase por encima el boton

function botonEncimaRojo(){
  btnRojo.style.transform ="scale(1.5 , 2.5)"
}