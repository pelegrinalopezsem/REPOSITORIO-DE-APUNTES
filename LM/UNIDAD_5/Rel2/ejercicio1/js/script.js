const titulos = document.getElementsByTagName("h1")
const subtitulos = document.getElementsByTagName("h2")
for (let titulo of titulos) {
    titulo.textContent = "Última Hora: Impactantes Noticias";
}
for (let subtitulo of subtitulos) {
    subtitulo.textContent = "Mantente informado con nuestras noticias más recientes";
}