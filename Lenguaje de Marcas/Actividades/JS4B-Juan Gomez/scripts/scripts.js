const imagenes = [
    './images/carusel/imagen1.jpg',
    './images/carusel/imagen2.jpg',
    './images/carusel/imagen3.jpg',
    './images/carusel/imagen4.jpg',
    './images/carusel/imagen5.jpg',
    './images/carusel/imagen6.jpg',
    './images/carusel/imagen7.jpg',
]
let indice = 0

function siguienteImagen() {
    indice = (indice + 1) % imagenes.length
    document.getElementById('pasafotos').src = imagenes[indice]
}
function anteriorImagen() {
    indice = (indice - 1 + imagenes.length) % imagenes.length
    document.getElementById('pasafotos').src = imagenes[indice]
}   

// Listeners

document.getElementById('siguiente').addEventListener('click', siguienteImagen)
document.getElementById('anterior').addEventListener('click', anteriorImagen)