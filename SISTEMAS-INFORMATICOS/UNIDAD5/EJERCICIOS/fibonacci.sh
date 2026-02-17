#!/bin/bash

fibonacci() {
    posicion=$1   
    if [ "$posicion" -eq 0 ]; then
        echo 0
        return
    elif [ "$posicion" -eq 1 ]; then
        echo 1
        return
    fi

    fib_anterior=0  
    fib_actual=1     
    for ((indice=2; indice<=posicion; indice++)); do
        fib_siguiente=$((fib_anterior + fib_actual)) 
        fib_anterior=$fib_actual
        fib_actual=$fib_siguiente
    done

    echo $fib_actual
}

fibonacci $1

