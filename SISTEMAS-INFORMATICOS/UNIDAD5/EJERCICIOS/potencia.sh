#!/bin/bash

potencia() {
    base=$1
    elevado=$2
    resultado=1

    for ((i=1; i<=elevado; i++)); do
        resultado=$((resultado * base))
    done

    echo $resultado
}

potencia $1 $2
