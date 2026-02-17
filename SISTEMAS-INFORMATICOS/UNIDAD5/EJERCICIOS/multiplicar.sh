#!/bin/bash

MULTIPLICAR() {  
  resultado=$(($1 * $2))   # Multiplicar los valores
  echo $resultado          # Devolver el resultado
}

# Pasar los argumentos del script a la función
resultado=$(MULTIPLICAR "$1" "$2")

echo "El resultado es: $resultado"
