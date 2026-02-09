#!/bin/bash

volumenCirculo(){
    if [ $# -ne 1 ]; then
    echo "Hace falta el radio"
    fi
    volumen=$(echo "3.1415 * $1 * $1" | bc)
    echo $volumen
}

volumenCirculo $1