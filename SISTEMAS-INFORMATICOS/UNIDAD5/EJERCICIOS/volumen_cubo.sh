#!/bin/bash

volumen_cubo() {
    volumen=$1
    elevado=3
    resultado=1

    for ((i=1; i<=elevado; i++)); do
        resultado=$((resultado * volumen))
    done

    echo $resultado
}

volumen_cubo $1 