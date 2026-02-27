const buscador = document.getElementById('buscador');
const listaLibros = document.querySelector('#lista-libros ul');
const listaFavoritos = document.querySelector('#favoritos ul');

buscador.addEventListener("keydown", (e) => {
    console.log("Tecla presionada:", e.key);
});

buscador.addEventListener("keyup", function () {
    let filtro = this.value.toLowerCase();
    let libros = document.querySelectorAll(".libro");

    libros.forEach(function (libro) {
        let nombre = libro.getAttribute("data-autor").toLowerCase();
        if (nombre.includes(filtro)) {
            libro.style.display = "block";
        } else {
            libro.style.display = "none";
        }
    });
    });
