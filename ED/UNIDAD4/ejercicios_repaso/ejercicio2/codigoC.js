/**
 * Devuelve el número más grande entre tres números distintos.
 * Retorna false si hay números repetidos.
 * @param {number} num1 - Primer número.
 * @param {number} num2 - Segundo número.
 * @param {number} num3 - Tercer número.
 * @returns {number|boolean} El número más grande, o false si hay repetidos.
 */
function mayorEntreTres(num1, num2, num3) {
  if (num1 === num2 || num1 === num3 || num2 === num3) {
    return false;
  }
  if (num1 > num2 && num1 > num3) {
    return num1;
  }
  if (num2 > num1 && num2 > num3) {
    return num2;
  }
  return num3;
}
