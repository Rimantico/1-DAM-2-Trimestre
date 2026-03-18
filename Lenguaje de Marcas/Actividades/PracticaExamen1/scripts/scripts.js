// Actividad 1

// Apartado 1
let elementos = [];

for (let i = 0; i <= 250; i++) {
    elementos.push(i);
}

// Apartado 2 y 3
let indice = 0;
const elementoDisplay = document.getElementById("cambionumero");

function cambioCadaSegundo() {
    elementoDisplay.innerHTML = elementos[indice];
    if(elementos[indice] % 10 === 0){
        elementoDisplay.style.color = "red"
    }else
        if(elementos[indice] % 3 === 0){
            elementoDisplay.style.color = "yellow"
        }else
            if(elementos[indice] % 2 === 0){
                elementoDisplay.style.color = "green"
            }else
                elementoDisplay.style.color= "black;"
    indice++;
    if (indice > 250) indice = 0; // reinicia si quieres
}

setInterval(cambioCadaSegundo, 1000);

// Actividad 2

