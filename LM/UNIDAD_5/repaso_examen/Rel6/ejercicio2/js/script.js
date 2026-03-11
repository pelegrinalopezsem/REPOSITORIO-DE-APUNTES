
const productos = document.querySelectorAll(".producto");
const busqueda = document.getElementById("busqueda");
//Cuando pasas por encima del producto se le cambia el fondo de color azul
productos.forEach(producto => {
    producto.addEventListener("mouseover", () => {
        producto.style.backgroundColor = "lightblue";
    });
//Cuando el raton ya no esta encima que vuelva el fondo original
    producto.addEventListener("mouseout", () => {
        producto.style.backgroundColor = "";
    });
});
//Imprime la tecla que presionas
busqueda.addEventListener("keydown", (e) => {
    console.log("Tecla presionada:", e.key);
});

busqueda.addEventListener("keyup", function () {
    //Guarda lo que escribes en el bloque
    let filtro = this.value.toLowerCase();
    //Busca todos los productos de la lista productos
    let productos = document.querySelectorAll(".producto");
//Con este forEach se revisa los productos uno por uno
    productos.forEach(function (producto) {
        //Se mira el nombre
        let nombre = producto.getAttribute("data-nombre").toLowerCase();
        //Si el nombre tiene lo que escribe se muestra
        if (nombre.includes(filtro)) {
            producto.style.display = "block";
        } else {
            producto.style.display = "none";
        }
    });
});