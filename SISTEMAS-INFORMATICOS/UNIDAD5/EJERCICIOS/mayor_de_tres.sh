#!/bin/bash

mayor_de_tres() {
    numeroMasGrande=$1
    primerNumero=$1
    segundoNumero=$2
    tercerNumero=$3

    if [ "$segundoNumero" -gt "$numeroMasGrande" ]; then
        numeroMasGrande=$segundoNumero
    fi

    if [ "$tercerNumero" -gt "$numeroMasGrande" ]; then
        numeroMasGrande=$tercerNumero
    fi

    echo $numeroMasGrande
}

mayor_de_tres "$1" "$2" "$3"
