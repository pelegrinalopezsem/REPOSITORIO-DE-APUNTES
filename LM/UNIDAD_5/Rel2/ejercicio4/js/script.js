let precios = document.getElementsByClassName("precio");
let valor;

for (const precio of precios) {
    precio.style.fontWeight = "bold";
    valor = parseFloat(precio.textContent.trim());
    if (valor > 50) {
        precio.style.color = "red";
    }
}

