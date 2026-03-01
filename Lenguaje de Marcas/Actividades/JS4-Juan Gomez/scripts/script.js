const imagenes = [
    './images/imagen1.jpg',
    './images/imagen2.jpg',
    './images/imagen3.jpg',
    './images/imagen4.jpg',
    './images/imagen5.jpg',
    './images/imagen6.jpg',
    './images/imagen7.jpg',
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