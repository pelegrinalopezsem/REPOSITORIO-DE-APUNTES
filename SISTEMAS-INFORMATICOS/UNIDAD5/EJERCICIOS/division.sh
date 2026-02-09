#!/bin/bash

division_entero(){
    # 1. Validar cantidad de argumentos
    if [ $# -ne 2 ]; then
        echo "Error: Se necesitan exactamente dos números."
        return 1
    fi

    # 2. Validar división por cero
    if [ $2 -eq 0 ]; then
        echo "Error: No se puede dividir entre cero."
        return 1
    fi

    # 3. Cálculo (SIN espacios después del =)
    resultado=$(( $1 / $2 ))
    echo $resultado
}

division_entero $1 $2