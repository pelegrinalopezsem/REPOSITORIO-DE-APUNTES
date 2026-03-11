
//NUMEROS DE LA CALC
//BOTONES OPERACIONES
const botonSumar = document.getElementById("btnSumar")
const botonRestar = document.getElementById("btnRestar")
const botonDividir = document.getElementById("btnDividir")
const botonMultiplicar = document.getElementById("btnMultiplicar")
//RESULTADO
const resultado = document.getElementById("resultado")

botonSumar.addEventListener("click", function () {
    const numero1 = parseFloat(document.getElementById("numero1").value);
    const numero2 = parseFloat(document.getElementById("numero2").value);
    if(numero1 != 0 && numero2 != 0){
        let suma = numero1 + numero2
        resultado.innerHTML = suma
    } else {
        alert ("NO HAS INTRODUCIDO DATOS")
    }
})
botonRestar.addEventListener("click", function () {
    const numero1 = parseFloat(document.getElementById("numero1").value);
    const numero2 = parseFloat(document.getElementById("numero2").value);
    if(numero1 != 0 && numero2 != 0){
        let suma = numero1 - numero2
        resultado.innerHTML = suma
    } else {
        alert ("NO HAS INTRODUCIDO DATOS")
    }
})
botonDividir.addEventListener("click", function () {
    const numero1 = parseFloat(document.getElementById("numero1").value);
    const numero2 = parseFloat(document.getElementById("numero2").value);
    if(numero1 != 0 && numero2 != 0){
        let suma = numero1 / numero2
        resultado.innerHTML = suma
    } else {
        alert ("NO HAS INTRODUCIDO DATOS")
    }
})
botonMultiplicar.addEventListener("click", function () {
    const numero1 = parseFloat(document.getElementById("numero1").value);
    const numero2 = parseFloat(document.getElementById("numero2").value);
    if(numero1 != 0 && numero2 != 0){
        let suma = numero1 * numero2
        resultado.innerHTML = suma
    } else {
        alert ("NO HAS INTRODUCIDO DATOS")
    }
})