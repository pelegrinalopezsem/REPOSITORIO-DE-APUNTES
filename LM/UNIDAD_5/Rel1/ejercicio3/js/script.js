let botones = document.querySelector(".boton");
    botones.style.backgroundColor = "#FFB7B2"; 


const boton = document.querySelector("#cambiarEstilo")
boton.addEventListener("click", function () {
    for (const boton of botones) {
        boton.style.backgroundColor = "#DAF527";
        boton.style.border = "2px solid black";
    }
})


