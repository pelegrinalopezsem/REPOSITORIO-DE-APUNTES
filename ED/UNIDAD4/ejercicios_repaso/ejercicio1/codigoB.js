/**
 * Suma los números de un arreglo que son mayores a un valor dado.
 * @param {number[]} numeros - Arreglo de números a evaluar.
 * @param {number} limite - Valor de referencia.
 * @returns {number} Suma de los números mayores al límite.
 */
function sumaMayoresQue(numeros, limite) {
  let suma = 0;
  for (let i = 0; i < numeros.length; i++) {
    if (numeros[i] > limite) {
      suma = suma + numeros[i];
    }
  }
  return suma;
}
