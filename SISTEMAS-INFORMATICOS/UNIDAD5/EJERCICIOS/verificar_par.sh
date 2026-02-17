#!/bin/bash

verificar_par() {
    numero=2
    resultado=$(($1 % $numero))

    if [ $resultado -eq 0 ]; then
        echo "ES PAR"
    else
        echo "ES IMPAR"
    fi
}

verificar_par "$1"
