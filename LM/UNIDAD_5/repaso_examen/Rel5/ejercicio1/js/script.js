// Obtener la lista
let lista = document.getElementById("lista");

// Función para añadir un nuevo elemento
function añadirNuevaLista() {
    let contadorLista = lista.childElementCount;
    let nuevaLista = document.createElement("li");
    nuevaLista.textContent = "Elemento " + (contadorLista + 1);
    lista.appendChild(nuevaLista);
}

// Función para eliminar el último elemento
function eliminarLista() {
    if (lista.lastElementChild) {
        lista.lastElementChild.remove();
    } else {
        alert("No hay elementos para eliminar");
    }
}

// Función para modificar el último elemento
function modificarLista() {
    if (lista.lastElementChild) {
        lista.lastElementChild.textContent = "Elemento Modificado";
    } else {
        alert("No hay elementos para modificar");
    }
}

// Asociar botones a sus funciones
const botonAñadir = document.getElementById("btnAniadir");
const botonEliminar = document.getElementById("btnBorrar");
const botonModificar = document.getElementById("btnEditar");

botonAñadir.addEventListener("click", añadirNuevaLista);
botonEliminar.addEventListener("click", eliminarLista);
botonModificar.addEventListener("click", modificarLista);