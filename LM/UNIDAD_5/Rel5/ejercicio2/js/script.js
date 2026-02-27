const nombreProducto = document.getElementById("inputNombreProducto").value;
const precioProducto = parseFloat(document.getElementById("inputPrecioProducto").value);
const añadirProducto = document.getElementById("btnAniadirProducto")
const resultadoProductos = document.getElementById("listaProductos")
const resultadoTotalPrecio = document.getElementById("totalCompraH2")
let precioTotal = 0
añadirProducto.addEventListener("click", function (event) {
    event.preventDefault();
    const nombreProducto = inputNombreProducto.value
    const precioProducto = parseFloat(inputPrecioProducto.value)
    precioTotal += precioProducto;
    //PARA INTRODUCIR LOS DATOS DE LA LISTA DE LA COMPRA Y COMPROBAR QUE NO SE INTRODUCE VALORES VACIOS
    if(nombreProducto != "" && precioProducto != 0){
        const li = document.createElement("li")
        li.innerHTML += " " +nombreProducto + " : " + precioProducto + "€ |"
        document.getElementById("listaProductos").appendChild()
        resultadoTotalPrecio.innerHTML = ""
        resultadoTotalPrecio.innerHTML += "Total: " + precioTotal + " €"
    } else {
        alert ("NO HAS INTRODUCIDO DATOS")
    }
})

