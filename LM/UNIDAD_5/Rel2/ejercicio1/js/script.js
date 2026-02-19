const titulos = document.getElementsByTagName("h1")
const subtitulos = document.getElementsByTagName("h2")
for (const titulo of titulos) {
    titulo.textContent = "Última Hora: Impactantes Noticias";
}
for (const subtitulo of subtitulos) {
    subtitulo.textContent = "Mantente informado con nuestras noticias más recientes";
}