#!/bin/bash

verificar_impar() {
    numero=2
    resultado=$(($1 % $numero))

    if [ $resultado -eq 0 ]; then
        echo "ES PAR"
    else
        echo "ES IMPAR"
    fi
}

verificar_impar "$1"