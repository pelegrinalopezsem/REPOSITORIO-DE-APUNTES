//EJERCICIO 1
function mostrarAlerta() {
    alert("¡Siente la energia del Burn!")
}


const imagenAlerta = document.getElementById("imgClick")
imagenAlerta.addEventListener("click", mostrarAlerta)

//EJERCICIO 2

function cambiarImagen() {
    let imagenACambiar = documen.getElementById("imgHover")
    imagenACambiar.src = "https://picsum.photos/200?random=1" 
}

function restablecerImagen() {
    imagen.scr = imagenOriginal
}

let imagen = documen.getElementById("imgHover")
const imagenOriginal = imagen.scr

imagen.addEventListener("mouseover",cambiarImagen)
imagen.addEventListener("mouseover", restablecerImagen)

//EJERCICIO 3

const teclaPresionada = document.getElementById("campoTexto")
teclaPresionada.addEventListener("keydown", function(event){
    console.log("Tecla presionada: " + event.key)
})

//EJERCICIO 4
const formulario = document.getElementById("formulario")
const inputNombre = document.getElementById("nombre")
const resultado = document.getElementById("resultado")

formulario.addEventListener("submit", function (event) {
    event.preventDefault();
    const nombre = inputNombre.ariaValue
    //El innerHTML tiene en cuenta las lineas de codigo
    resultado.innerHTML += "Energia Recargada " + nombre 
})

//EJERCICIO 5
const input = document.getElementById("codigo")
const parrafo = document.getElementById("mensaje")
input.addEventListener("focus", function () {
    this.style.border = "2px solid green"
    parrafo.textContent = "Introduce tu codigo de energia"
})
input.addEventListener("blur", function () {
    this.style.border = ""
    parrafo.textContent = ""
})