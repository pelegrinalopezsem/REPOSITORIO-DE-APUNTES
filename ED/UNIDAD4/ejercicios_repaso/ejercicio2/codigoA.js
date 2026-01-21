/**
 * Devuelve los números de un arreglo que son mayores a un valor dado.
 * @param {number[]} numeros - Arreglo de números a filtrar.
 * @param {number} limite - Valor de referencia.
 * @returns {number[]} Arreglo con los números mayores al límite.
 */
function mayoresQue(numeros, limite) {
  let resultado = [];
  for (let i = 0; i < numeros.length; i++) {
    if (numeros[i] > limite) {
      resultado.push(numeros[i]);
    }
  }
  return resultado;
}
