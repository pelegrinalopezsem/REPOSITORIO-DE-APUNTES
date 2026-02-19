let listados = document.getElementsByTagName("li")
for (const listado of listados) {
    listado.style.background = "green";
    listado.textContent += "🎶"
}