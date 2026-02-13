let todosLosAnimales = document.querySelectorAll(".animal");

todosLosAnimales.forEach(animal => {
    animal.style.backgroundColor = "lightyellow";
});


const boton = document.querySelector("#resaltarAnimales")
boton.addEventListener("click", function() {
    todosLosAnimales.forEach(animal => {
    animal.style.backgroundColor = "green";
    animal.style.fontSize = "120px"
});

})