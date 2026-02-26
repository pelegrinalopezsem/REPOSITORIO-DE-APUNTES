//AÑADIR UNA LISTA
let lista = document.getElementById("lista")
let contadorLista = lista.childElementCount
function añadirNuevaLista() {
    let nuevaLista = document.createElement("li")
    nuevaLista.textContent = "Elemento " + (contadorLista + 1)
    lista.appendChild(nuevaLista)
    contadorLista++
}
const botonAñadir = document.getElementById("btnAniadir")
botonAñadir.addEventListener("click", añadirNuevaLista)