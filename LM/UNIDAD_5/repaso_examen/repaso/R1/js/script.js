// ====== VARIABLES GLOBALES ======
// Mantiene el elemento del DOM que el usuario ha clicado actualmente
let jugadorSeleccionado = null;

// ====== CONSTANTES DE REFERENCIA ======
// Seleccionamos los elementos del HTML una sola vez para mejorar el rendimiento
const listaJugadores = document.getElementById("listaJugadores");
const detalleNombre = document.getElementById("detalleNombre");
const detallePosicion = document.getElementById("detallePosicion");
const detalleGoles = document.getElementById("detalleGoles");
const btnSumarGol = document.getElementById("btnSumarGol");
const btnBorrar = document.getElementById("btnBorrar");
const filtroPosicion = document.getElementById("filtroPosicion");
const formNuevoJugador = document.getElementById("formNuevoJugador");
const mensajeForm = document.getElementById("mensajeForm");

// ====== FUNCIONES DE LÓGICA ======

// Quita la clase 'seleccionado' de todos los elementos para limpiar la vista
function quitarSeleccionATodos() {
    const tarjetas = document.querySelectorAll(".jugador");
    tarjetas.forEach((j) => j.classList.remove("seleccionado"));
}

// Sincroniza el panel derecho (Detalles) con los datos del jugador seleccionado
function actualizarPanel(jugador) {
    if (jugador) {
        // Obtenemos los datos desde el objeto dataset (atributos data-*) del elemento
        detalleNombre.textContent = `${jugador.querySelector(".nombre").textContent} (#${jugador.dataset.dorsal})`;
        detallePosicion.textContent = jugador.dataset.posicion;
        detalleGoles.textContent = jugador.dataset.goles;
    } else {
        // Resetea el panel si no hay nadie seleccionado
        detalleNombre.textContent = "—";
        detallePosicion.textContent = "—";
        detalleGoles.textContent = "—";
    }
}

// Gestiona la lógica de selección visual
function seleccionarJugador(jugador) {
    quitarSeleccionATodos(); // Limpiamos selecciones previas
    jugador.classList.add("seleccionado"); // Destacamos la tarjeta actual
    jugadorSeleccionado = jugador; // Guardamos la referencia global
    actualizarPanel(jugador); // Refrescamos el panel derecho
}

// Crea una tarjeta nueva dinámicamente y le asigna sus eventos
function crearTarjetaJugador(nombre, dorsal, posicion, goles) {
    const article = document.createElement("article");
    article.classList.add("jugador");
    article.tabIndex = 0; // Permite el foco mediante teclado
    
    // Guardamos los datos en el elemento para facilitar futuras consultas
    article.dataset.dorsal = dorsal;
    article.dataset.posicion = posicion;
    article.dataset.goles = goles;

    article.innerHTML = `
        <h3 class="nombre">${nombre}</h3>
        <p class="meta">Dorsal <strong class="dorsal">${dorsal}</strong> · <span class="posicion">${posicion}</span></p>
        <p class="stats">Goles: <strong class="goles">${goles}</strong></p>
    `;

    // Vinculamos el clic a la nueva tarjeta recién creada
    article.addEventListener("click", function () {
        seleccionarJugador(this);
    });

    return article;
}

// Asegura que las tarjetas cargadas desde el HTML tengan sus eventos listos
function engancharClicksJugadoresExistentes() {
    const tarjetas = document.querySelectorAll(".jugador");
    tarjetas.forEach((tarjeta) => {
        tarjeta.addEventListener("click", function () {
            seleccionarJugador(this);
        });
    });
}

// 

// ====== EVENTOS DE CONTROL ======

// Lógica para incrementar goles
btnSumarGol.addEventListener("click", () => {
    if (jugadorSeleccionado) {
        let nuevosGoles = Number(jugadorSeleccionado.dataset.goles) + 1;
        // Actualizamos tanto el dataset interno como la vista visual
        jugadorSeleccionado.dataset.goles = nuevosGoles;
        jugadorSeleccionado.querySelector(".goles").textContent = nuevosGoles;
        detalleGoles.textContent = nuevosGoles;
    }
});

// Lógica para eliminar un jugador de la lista
btnBorrar.addEventListener("click", () => {
    if (jugadorSeleccionado) {
        jugadorSeleccionado.remove(); // Borra del DOM
        jugadorSeleccionado = null; // Limpia la variable global
        actualizarPanel(null); // Limpia el panel derecho
    }
});

// Lógica de filtrado en tiempo real
filtroPosicion.addEventListener("change", (e) => {
    const valor = e.target.value;
    document.querySelectorAll(".jugador").forEach((tarjeta) => {
        // Si el valor es 'todas' o coincide con la posición, mostramos (block), sino ocultamos (none)
        const cumple = (valor === "todas" || tarjeta.dataset.posicion === valor);
        tarjeta.style.display = cumple ? "block" : "none";
    });
});

// Lógica de creación de nuevos jugadores
formNuevoJugador.addEventListener("submit", (e) => {
    e.preventDefault(); // Evitamos que la página se recargue
    const nombre = document.getElementById("nuevoNombre").value;
    const dorsal = document.getElementById("nuevoDorsal").value;
    const posicion = document.getElementById("nuevaPosicion").value;
    const goles = document.getElementById("nuevosGoles").value;

    if (nombre && dorsal) {
        const nuevaTarjeta = crearTarjetaJugador(nombre, dorsal, posicion, goles);
        listaJugadores.appendChild(nuevaTarjeta);
        formNuevoJugador.reset(); // Vaciamos el formulario tras añadir
        mensajeForm.textContent = "Jugador añadido";
    }
});

// Inicialización: vinculamos los eventos a los jugadores que ya están en el HTML
engancharClicksJugadoresExistentes();