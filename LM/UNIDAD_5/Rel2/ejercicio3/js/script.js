const noticias = document.querySelectorAll(".noticia")
    for (const noticia of noticias) {
        noticia.style.backgroundColor = "lightgray";
        noticia.style.color = "blue";
        noticia.textContent = "🔥" + noticia.textContent;
    }
