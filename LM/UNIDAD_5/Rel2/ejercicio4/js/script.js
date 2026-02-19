let precios = document.querySelectorAll(".precio");

for (const precio of precios) {
    precio.style.fontWeight = "bold";
    let valor = parseFloat(precio.textContent.trim());
    if (valor > 50) {
        precio.style.color = "red";
    }
}

