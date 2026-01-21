/**
 * Busca un usuario por su nombre en un arreglo de usuarios.
 * Retorna el primer usuario que coincida o null si no se encuentra.
 * @param {Object[]} usuarios - Arreglo de objetos usuario.
 * @param {string} nombre - Nombre del usuario a buscar.
 * @returns {Object|null} El usuario encontrado o null si no existe.
 */
function buscarUsuario(usuarios, nombre) {
  let usuarioEncontrado = null;
  for (let i = 0; i < usuarios.length; i++) {
    if (usuarios[i].name === nombre) {
      usuarioEncontrado = usuarios[i];
    }
  }
  return usuarioEncontrado;
}
