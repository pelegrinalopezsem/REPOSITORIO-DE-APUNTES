let listados = document.getElementsByTagName("li")
for (const listado of listados) {
    listado.style.border = "2px solid black";
}

const boton = document.querySelector("#marcarFrutas")
boton.addEventListener("click", function () {
    for (const listado of listados) {
        listado.style.backgroundColor = "#FFB7B2";
        listado.textContent = "✅"
    }

})


