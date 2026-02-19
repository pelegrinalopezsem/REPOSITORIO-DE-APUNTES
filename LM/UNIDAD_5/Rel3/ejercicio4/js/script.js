    const integrantes = document.getElementById("integrantes").getElementsByTagName("li");
    for (const integrante of integrantes) {
        if (integrante.textContent === "Batería") {
            integrante.textContent = "Trompetista"; 
        }
    }
