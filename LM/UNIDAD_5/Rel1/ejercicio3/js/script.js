let botones = document.querySelectorAll(".boton");
for (const boton of botones) {
    boton.style.backgroundColor = "#FFB7B2"; 
}

const boton = document.querySelector("#cambiarEstilo")
boton.addEventListener("click", function () {
    for (const boton of botones) {
        boton.style.backgroundColor = "#DAF527";
    }
})


