const titulos = document.getElementsByTagName("h1")
const subtitulos = document.getElementsByTagName("h2")
for (const titulo of titulos) {
    titulo.textContent = "Historia del Ska-Punk: Álbumes Icónicos";
    titulo.style.color = "red";
}
for (const subtitulo of subtitulos) {
    subtitulo.textContent = "Desde los 80 hasta hoy";
    subtitulo.style.backgroundColor = "#33"
}