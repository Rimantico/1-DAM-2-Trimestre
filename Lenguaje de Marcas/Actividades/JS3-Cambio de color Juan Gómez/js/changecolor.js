let btnRojo = document.getElementById('btnrojo');
let btnVerde = document.getElementById('btnverde');
let btnAzul = document.getElementById('btnazul');
let btnAmarillo= document.getElementById('btnamarillo');
let btnRosa = document.getElementById('btnrosa');
let btnReset = document.getElementById('btnreset');
let box = document.querySelector('.box');
let btnImagen = document.getElementById('btnimagen')


// Poner color boton

function setColorRojo() {
  if(btnRojo.value == "rojo") {
    box.style.background = "#FF0000";
    editarTexto.style.color="#FF0000"
  }
}

function setColorVerde() {
  if(btnVerde.value == "verde") {
    box.style.background = "#00FF00";
      editarTexto.style.color="#00FF00"
  }
}

function setColorAzul() {
  if(btnAzul.value == "azul") {
    box.style.background = "#0000FF";
      editarTexto.style.color="#0000FF"
  }
}

function setColorAmarillo() {
  if(btnAmarillo.value == "amarillo") {
    box.style.background = "#FFFF00";
    editarTexto.style.color="#FFFF00"
  }
}

function setColorRosa(){
  if(btnRosa.value == "rosa"){
    box.style.background = "#FFC0CB";
    editarTexto.style.color="#FFC0CB"
  }
}

function setColorReset() {
  if(btnReset.value == "reset") {
    box.style.background = "#000000";
    editarTexto.style.color="#000000"
  }
}

// Actividad 1

// Cambiar imagen

var imagen =  document.getElementById('imagen')

imagen.style.height="20vh"


function cambiarImagen(){
  if(imagen.src.match("imagen1.jfif")){
    imagen.src="./images/imagen2.jpg"
  }else{
    imagen.src = "./images/imagen1.jfif"
  }
}

// Cambiar el titulo de la pagina

let editarTexto = document.getElementById('titulo')
editarTexto.style.backgroundColor="white"
editarTexto.style.marginBottom="10px"

// Listeners para los botones


btnRojo.addEventListener("mouseover" ,botonEncimaRojo)
btnRojo.addEventListener("mouseout",botonSalidaRojo)
btnRojo.addEventListener("mousedown", botonPresionadoRojo)
btnRojo.addEventListener("mouseup" ,botonDejarRojo)

btnVerde.addEventListener("mouseover", botonEncimaVerde)
btnVerde.addEventListener("mouseout", botonSalidaVerde)
btnVerde.addEventListener("mousedown", botonPresionadoVerde)
btnVerde.addEventListener("mouseup", botonDejarVerde)

btnAzul.addEventListener("mouseover", botonEncimaAzul)
btnAzul.addEventListener("mouseout" , botonSalidaAzul)
btnAzul.addEventListener("mousedown", botonPresionadoAzul)
btnAzul.addEventListener("mouseup" ,botonDejarAzul)

btnAmarillo.addEventListener("mouseover" , botonEncimaAmarillo)
btnAmarillo.addEventListener("mouseout" , botonSalidaAmarillo)
btnAmarillo-addEventListener("mousedown", botonPresionadoAmarillo)
btnAmarillo,addEventListener("mouseup", botonDejarAmarillo)

btnRosa.addEventListener("mouseover", botonEncimaRosa)
btnRosa.addEventListener("mouseout", botonSalidaRosa)
btnRosa.addEventListener("mousedown", botonPresionadoRosa)
btnRosa.addEventListener("mouseup", botonDejarRosa)

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

// Cambiar el color cuando se quede presionado el boton

function botonPresionadoRojo(){
  btnRojo.style.backgroundColor="red"
}

function botonPresionadoVerde(){
  btnVerde.style.backgroundColor="green"
}

function botonPresionadoAzul(){
  btnAzul.style.backgroundColor="blue"
}

function botonPresionadoAmarillo(){
  btnAmarillo.style.backgroundColor="yellow"
}

function botonPresionadoRosa(){
  btnRosa.style.backgroundColor="pink"
}

// Cambiar el color original cuando se deje de presionar

function botonDejarRojo(){
  btnRojo.style.backgroundColor="rgb(191, 219, 29)"
}

function botonDejarVerde(){
  btnVerde.style.backgroundColor="rgb(191, 219, 29)"
}

function botonDejarAzul(){
  btnAzul.style.backgroundColor="rgb(191, 219, 29)"
}
function botonDejarAmarillo(){
  btnAmarillo.style.backgroundColor="rgb(191, 219, 29)"
}
function botonDejarRosa(){
  btnRosa.style.backgroundColor="rgb(191, 219, 29)"
}