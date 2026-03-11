let productoActivo = null;

// ===== CONSTANTES =====
const zonaProductos = document.getElementById("zonaProductos");
const resumenNombre = document.getElementById("resumenNombre");
const resumenSeccion = document.getElementById("resumenSeccion");
const resumenUnidades = document.getElementById("resumenUnidades");

const btnAnadirUnidad = document.getElementById("btnAnadirUnidad");
const btnPasarPedido = document.getElementById("btnPasarPedido");
const filtroSeccion = document.getElementById("filtroSeccion");

const listaPedido = document.getElementById("listaPedido");

const formNuevoProducto = document.getElementById("formNuevoProducto");
const mensajeForm = document.getElementById("mensajeForm");

// ===== FUNCIONES =====

function quitarActivoATodos() {
    const tarjetasProducto = document.querySelectorAll(".producto");
    tarjetasProducto.forEach((p) => p.classList.remove("seleccionado"));
  /*
  1. Seleccionar todos los elementos ".producto"
  2. Recorrerlos
  3. Quitar la clase "activo" a todos
  */
}

function actualizarResumen(producto) {
    if (producto) {
        resumenNombre.textContent = producto.querySelector(".nombre").textContent;
        resumenSeccion.textContent = producto.dataset.seccion;
        resumenUnidades.textContent = producto.dataset.unidades;
    } else {
        // 5. Resetear si no hay producto
        resumenNombre.textContent = "—";
        resumenSeccion.textContent = "—";
        resumenUnidades.textContent = "—";
    }
  /*
  SI producto existe:
    1. Leer el nombre desde ".nombre"
    2. Leer la sección desde producto.dataset.seccion
    3. Leer las unidades desde producto.dataset.unidades
    4. Pintar esos datos en el resumen
  SI no existe:
    5. Poner "—" en los tres campos
  */
}

function seleccionarProducto(producto) {
    quitarActivoATodos();
    producto.classList.add("seleccionado");
    productoActivo = producto;
    actualizarResumen(producto);
  /*
  1. Si producto no existe, no hacer nada
  2. Quitar la clase activa al resto
  3. Añadir la clase "activo" al producto pulsado
  4. Guardarlo en la variable global productoActivo
  5. Actualizar el resumen
  */
}

function engancharClickProducto(producto) {
    producto.addEventListener("click", function() {
        console.log("Click")
        seleccionarProducto(this); // 'this' es el producto que acabas de clicar
    });
  /*
  1. Añadir un evento click al producto
  2. Dentro del evento, llamar a seleccionarProducto(producto)
  */
}

function prepararProductosExistentes() {
    console.log("Preparando productos");

    const productos = document.querySelectorAll(".producto");
    productos.forEach((p) => engancharClickProducto(p));
  /*
  1. Seleccionar todos los productos ".producto"
  2. Recorrerlos
  3. Llamar a engancharClickProducto en cada uno
  */
}

function anadirUnidadAlActivo() {
    let unidades = Number(productoActivo.dataset.unidades);
    // 3. Sumar 1
    unidades = unidades + 1;
    // 4. Guardar en dataset
    productoActivo.dataset.unidades = unidades;
    // 5. Actualizar número visible
    const unidadesHTML = productoActivo.querySelector(".unidades");
    unidadesHTML.textContent = unidades;
    // 6. Actualizar resumen
    actualizarResumen(productoActivo);
  /*
  1. Si no hay producto activo, no hacer nada
  2. Leer las unidades desde productoActivo.dataset.unidades
  3. Convertir el valor a número
  4. Sumar 1
  5. Guardar el nuevo valor en dataset
  6. Actualizar el texto visible dentro de ".unidades"
  7. Actualizar el resumen
  */
}

function filtrarProductos(valorFiltro) {
    
    // 1. Seleccionar todos los productos
    const productos = document.querySelectorAll(".producto");

    // 2. Recorrerlos
    productos.forEach(function(producto){

        const seccionProducto = producto.dataset.seccion;

        // 3. Si el filtro es "Todas", mostrar todos
        if (valorFiltro === "Todas") {
            producto.style.display = "block";
        }

        // 4. Si coincide la sección, mostrar
        else if (seccionProducto === valorFiltro) {
            producto.style.display = "block";
        }

        // 5. Si no coincide, ocultar
        else {
            producto.style.display = "none";
        }

    });
  /*
  1. Seleccionar todos los productos ".producto"
  2. Recorrerlos
  3. Leer la sección de cada producto con dataset.seccion
  4. Si valorFiltro es "Todas", mostrar todos
  5. Si no, mostrar solo los que coincidan
  6. Ocultar los demás
  */
}

function crearLineaPedido(producto) {
    // 1. Crear li
    const li = document.createElement("li");

    // 2. Leer datos
    const nombre = producto.querySelector(".nombre").textContent;
    const seccion = producto.dataset.seccion;
    const unidades = producto.dataset.unidades;

    // 3. Crear texto
    li.textContent = nombre + " - " + seccion + " - " + unidades + " unidades";

    // 4. Devolver li
    return li;
  /*
  1. Crear un elemento li
  2. Leer nombre, sección y unidades del producto
  3. Construir un texto tipo:
     "Arroz redondo - Despensa - 2 unidades"
  4. Asignar el texto al li
  5. Devolver el li
  */
}

function pasarProductoAPedido() {
     // 1. Si no hay producto activo, salir
    if (!productoActivo) {
        return;
    }

    // 2. Crear línea
    const linea = crearLineaPedido(productoActivo);

    // 3. Añadir a la lista
    listaPedido.appendChild(linea);
  /*
  1. Si no hay producto activo, no hacer nada
  2. Crear una línea llamando a crearLineaPedido(productoActivo)
  3. Añadir esa línea al final de #listaPedido
  */
}

function crearProducto(nombre, seccion, unidades) {
    // 1. Crear el div del producto
    const producto = document.createElement("div");
    producto.classList.add("producto");
    producto.tabIndex = 0;

    // 2. Guardar los datos en dataset
    producto.dataset.seccion = seccion;
    producto.dataset.unidades = unidades;

    // 3. Crear el contenido interno
    producto.innerHTML = `
        <h3 class="nombre">${nombre}</h3>
        <p class="seccion">Sección: <span>${seccion}</span></p>
        <p class="cantidad">Pedidas: <strong class="unidades">${unidades}</strong></p>
    `;

    // 4. Enganchar el click al nuevo producto
    producto.addEventListener("click", function() {
        seleccionarProducto(this);
    });

    return producto;
  /*
  1. Crear un div
  2. Añadir la clase "producto"
  3. Añadir tabindex = 0
  4. Guardar seccion y unidades en dataset
  5. Crear el contenido interno:
     - h3.nombre
     - p.seccion
     - p.cantidad con strong.unidades
  6. Enganchar el click del nuevo producto
  7. Devolver el producto creado
  */
}

function validarProducto(nombre, unidades) {
     if (nombre.trim() === "" || isNaN(unidades) || unidades < 0) {
        return false;
    }
    return true;
  /*
  1. Crear variable ok = true
  2. Si el nombre está vacío, ok = false
  3. Si unidades es menor que 0 o no es número, ok = false
  4. Devolver ok
  */
}

function anadirProductoDesdeFormulario() {
    // 1. Leer los valores del formulario
    const nombre = document.getElementById("nuevoNombre").value.trim();
    const seccion = document.getElementById("nuevaSeccion").value;
    const unidades = Number(document.getElementById("nuevasUnidades").value);

    // 2. Validar los datos
    if (validarProducto(nombre, unidades)) {

        // 3. Crear el producto
        const nuevoProducto = crearProducto(nombre, seccion, unidades);

        // 4. Insertarlo en la zona de productos
        zonaProductos.appendChild(nuevoProducto);

        // 5. Limpiar el formulario
        formNuevoProducto.reset();

        // 6. Mensaje de éxito
        mensajeForm.textContent = "Producto creado correctamente";

    } else {
        mensajeForm.textContent = "Datos incorrectos";
    }
  /*
  1. Leer nombre, sección y unidades del formulario
  2. Hacer trim en el nombre
  3. Convertir unidades a número
  4. Validar
  5. Si es correcto:
      - crear producto
      - añadirlo a zonaProductos
      - resetear el formulario
      - mostrar mensaje correcto
  6. Si no es correcto:
      - mostrar mensaje de error
  */
}

// ===== EVENTOS =====

btnAnadirUnidad.addEventListener("click", function () {
    anadirUnidadAlActivo();
  /*
  llamar a la función para añadir una unidad
  */
});

btnPasarPedido.addEventListener("click", function () {
    pasarProductoAPedido();
  /*
  llamar a la función para pasar el producto al pedido
  */
});

filtroSeccion.addEventListener("change", function () {
    filtrarProductos(this.value);
  /*
  llamar a la función de filtrar usando this.value
  */
});

formNuevoProducto.addEventListener("submit", function (event) {
  event.preventDefault(); // Evita que se recargue la página
    anadirProductoDesdeFormulario();
    /*
  1. Evitar el envío del formulario
  2. Llamar a la función para añadir producto
  */
});

// ===== INICIO =====
/*
1. Preparar los productos existentes
2. Seleccionar el primer producto si existe
3. Si no existe, limpiar el resumen
*/

prepararProductosExistentes();