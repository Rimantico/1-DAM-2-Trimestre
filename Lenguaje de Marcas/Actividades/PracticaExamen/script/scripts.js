/* let valores = [];
let numeros = [];
let contadorNumeros = 0;

let numerosIntroducir = prompt(
  "Introduzca separado por espacios numeros (maximo 10 numeros)"
);

valores.push(numerosIntroducir);

for (let i = 0; i < numerosIntroducir.length; i++) {

    if (numerosIntroducir[i] != ' ') {

        if (numeros[contadorNumeros] === undefined) {
            numeros[contadorNumeros] = numerosIntroducir[i];
        } else {
            numeros[contadorNumeros] += numerosIntroducir[i];
        }

    } else {
        contadorNumeros++;
    }
}

let numeroMenor = Number(numeros[0]);

if(numeros.length <= 10){

    for(let i = 0; i < numeros.length; i++){
        for(let j = i + 1; j < numeros.length; j++){

            if(Number(numeros[i]) > Number(numeros[j])){
                
                let temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;

            }

        }
    }

    alert(numeros + " , ");

}else{
    alert("No puede haber mas de 10 numeros");
} */

// Actividad 2

let jugador1 = 101;
let jugador2 = 101;
let juegoTerminado = false;
let turno = 1;
let numeroAleatorio = 0;

document.getElementById("jugador1").innerHTML = jugador1;
document.getElementById("jugador2").innerHTML = jugador2;
document.getElementById("numeroaleatorio").innerHTML = numeroAleatorio;

// Se ejecute la función que indique
document.getElementById("botonjugador1").addEventListener("click",presionarBotonJugador1);

function presionarBotonJugador1() {
    if(juegoTerminado){
        return;
    }
    if(turno != 1){
        alert("No es tu turno")
        return;
    }

  let numeroAleatorio = Math.floor(Math.random() * (25-0) +0);
  if(jugador1 >= numeroAleatorio){
      jugador1 = jugador1 - numeroAleatorio
      document.getElementById("jugador1").innerHTML = jugador1;
      document.getElementById("numeroaleatorio").innerHTML = numeroAleatorio

      if(jugador1 == 0){
        alert("¡Jugador 1 gana!");
        juegoTerminado = true;
      }
      turno = 2;
  }else
    alert("No puedes restar mas puntos porque te pasas")
    turno = 2;
}
function presionarBotonJugador2(){
    let numeroAleatorio = Math.floor(Math.random() * (25-0) +0);
}