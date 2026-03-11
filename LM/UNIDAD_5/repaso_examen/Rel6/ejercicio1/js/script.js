const form = document.getElementById("pedidoForm");
//Pone un borde negro cuando haces click en algun elemnto del formulario
form.addEventListener("focus", (e) => {
    if (e.target.tagName === "INPUT" || e.target.tagName === "SELECT") {
        e.target.style.border = "2px solid blue";
    }
}, true);
//Cuando terminas con el elemnto del formulario devuelve el borde al original
form.addEventListener("blur", (e) => {
    if (e.target.tagName === "INPUT" || e.target.tagName === "SELECT") {
        e.target.style.border = "";
    }
}, true);
//Imprime por consola el producto elegido
document.getElementById("producto").addEventListener("change", (e) => {
    console.log("Producto seleccionado:", e.target.value);
});
//Si los datos estan bien introducidos se envia el formulario correctamente
form.addEventListener("submit", (e) => {
    e.preventDefault();
    const nombre = document.getElementById("nombre").value;
    const email = document.getElementById("email").value;
    const cantidad = document.getElementById("cantidad").value;

    if (nombre === "" || email === "" || cantidad <= 0) {
        console.log("Error: Todos los campos son obligatorios y la cantidad debe ser mayor a 0");
    } else {
        console.log("Formulario enviado correctamente");
    }
});