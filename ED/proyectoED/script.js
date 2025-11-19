// Victoria
let jugador1 = 0; let jugador2 = 0;

// Este es el juego
function juego(usuario) {
    const elementos = ['piedra', 'papel', 'tijera'];
    const maquina = elementos[Math.floor(Math.random() * elementos.length)]; //a ver lo que elige la maquina
    // Muestro cosas en pantalla
    document.getElementById('user-choice').textContent = `Tu elección: ${usuario}`;
    document.getElementById('computer-choice').textContent = `Elección de la máquina: ${maquina}`;

    // ¿Quién gana? Creo que funciona
    let ganador = '';

        if (usuario == maquina) {ganador = 'Es un empate 🤝';} else if (
            (usuario == 'piedra' && maquina == 'tijera') ||
            (usuario == 'papel' && maquina == 'piedra') ||
            (usuario == 'tijera' && maquina == 'papel')
        ) {ganador = '¡Gana jugador! 🎉'; jugador1++; } 
        else {ganador = 'Gana Maquina 😢'; jugador2++; }
    


    // Ganador
    document.getElementById('winner').textContent = `Ganador: ${ganador}`;

    // Puntos
    document.getElementById('user-wins').textContent = `Jugador: ${jugador1}`;
    document.getElementById('computer-wins').textContent = `Máquina: ${jugador2}`;
}
