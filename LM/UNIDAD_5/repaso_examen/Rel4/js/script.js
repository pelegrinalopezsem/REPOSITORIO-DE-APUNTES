//EJERCICIO1
//Funcion que muestra una alerta
function mostrarAlerta(){
    alert("¡Siente la Energía de Burn!")
}
//Busca el elemento por el id
const imagen = document.getElementById("imgClick")
//Cuando se detecta que se hace click en la imagenHover salta la alerta.
imagen.addEventListener("click", mostrarAlerta)

//EJERCICIO2
let imagenHover = document.getElementById("imgHover")
//Funcion que al pasar dentro de la foto el raton se cambia la foto
imagenHover.addEventListener("mouseover", function(event){
    imagenHover.dataset.original = imagenHover.src
    imagenHover.src = "https://picsum.photos/id/238/200/300"
});
//La funcion que restablece a la foto original cuanndo sale el raton de la foto
imagenHover.addEventListener("mouseout", function(event) {
    if (imagenHover.dataset.original) {
        imagenHover.src = imagenHover.dataset.original;
    }
});

//EJERCICIO 3
//Cuando pulsas una tecla lo muestra por consola
const campoTexto = document.getElementById("campoTexto")
campoTexto.addEventListener("keydown", function(event) {
    console.log("Tecla presionada: " + event.key)
})

//EJERCICIO 4
//Muestra lo que se ha escrito sin necesidad de recargar la pagina
const formulario = document.getElementById("formulario")
const inputnombre = document.getElementById("nombre")
const resultado = document.getElementById("resultado")

formulario.addEventListener("submit", function (event) {
    event.preventDefault();
    const nombre = inputnombre.value
    resultado.innerHTML += "<br>Energia Recargada, <em>" + nombre + "</em>"
})

//EJERCICIO 5
const input = document.getElementById("codigo")
const parrafo = document.getElementById("mensaje")
input.addEventListener("focus", function() {
    this.style.border = "2px solid green"
    parrafo.textContent = "Introduce tu codigo de energia"
    
})
input.addEventListener("blur", function() {
    this.style.border = ""
    parrafo.textContent = ""
    
})