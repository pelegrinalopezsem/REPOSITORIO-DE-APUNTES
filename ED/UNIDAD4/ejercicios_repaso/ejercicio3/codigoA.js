/**
 * Calcula el promedio de un arreglo de números.
 * @param {number[]} numeros - Arreglo de números.
 * @returns {number} Promedio de los números en el arreglo.
 */
function promedio(numeros) {
  let suma = 0;
  for (let i = 0; i < numeros.length; i++) {
    suma += numeros[i];
  }
  return suma / numeros.length;
}
