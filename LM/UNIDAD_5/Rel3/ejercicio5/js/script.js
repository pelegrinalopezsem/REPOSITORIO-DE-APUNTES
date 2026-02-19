    const nuevoAlbum1 = document.createElement("li");
    nuevoAlbum1.textContent = '"Xapomelon" - La Pegatina';
    const albumTalco = document.getElementById("talco");
    albumTalco.parentNode.insertBefore(nuevoAlbum1, albumTalco);

    const nuevoAlbum2 = document.createElement("li");
    nuevoAlbum2.textContent = '"Street Gigs" - The Locos';
    const listaAlbumes = document.getElementById("albumes");
    listaAlbumes.appendChild(nuevoAlbum2);
