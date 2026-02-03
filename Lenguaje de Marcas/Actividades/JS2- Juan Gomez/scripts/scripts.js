let cadena1 
let cadena2 
cadena1=prompt("Introduce la primera  cadena de caracteres")
cadena2=prompt("Introduce la segunda cadena de caracteres")

let caracterescadena1 = cadena1.length
let caracterescadena2 = cadena2.length

if(cadena1.length<cadena2.length){
    let menor = 1
}
if(cadena1.length > 4 || cadena2 > 4){
    for(let i = 5 ; i<cadena1.length ; i++){
        cadena1.pop(i)
    }  
    for(let i = 0 ; i>2 ; i++){
        cadena1.push(".")
    }
}