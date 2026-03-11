// Variable global que mantiene la suma acumulada de los precios
let totalCompra = 0;

// Función auxiliar para obtener el texto escrito dentro de un input por su ID
function obtenerValorInput(id) {
    return document.getElementById(id).value;
}

// Crea un nuevo elemento de lista (<li>) con el formato "Nombre ........... Precio€"
function crearElementoLista(nombreProducto, precioProducto) {
    const nuevoElemento = document.createElement("li");
    nuevoElemento.innerHTML = nombreProducto + " ........... " + precioProducto + "€";
    return nuevoElemento;
}

// Actualiza el título H2 mostrando cuántos elementos hay en la lista y el total acumulado
function actualizarTotalCompra() {
    const listaCompra = document.getElementById("listaProductos");
    // .childElementCount cuenta cuántos elementos <li> hay dentro de la lista <ul>
    document.getElementById("totalCompraH2").innerHTML = 
        "Total " + listaCompra.childElementCount + " productos: " + totalCompra + "€";
}

// Función principal que se ejecuta al pulsar el botón de añadir
function aniadirProducto() {
    const listaCompra = document.getElementById("listaProductos");
    const nombreProducto = obtenerValorInput("inputNombreProducto");
    // parseFloat convierte el texto del input a número decimal para poder sumar
    const precioProducto = parseFloat(obtenerValorInput("inputPrecioProducto"));

    // Validación: solo añade si hay nombre y el precio es un número mayor a 0
    if (nombreProducto && precioProducto > 0) {
        // 1. Crear el ítem
        const nuevoElemento = crearElementoLista(nombreProducto, precioProducto);
        // 2. Insertarlo en la lista visual (el <ul>)
        listaCompra.appendChild(nuevoElemento);

        // 3. Sumar al total global y refrescar la pantalla
        totalCompra += precioProducto;
        actualizarTotalCompra();
    } else {
        console.log("Introduce un nombre y un precio válido.");
    }
}

// Vincula el evento click del botón con la función aniadirProducto
document.getElementById("btnAniadirProducto").addEventListener("click", aniadirProducto);