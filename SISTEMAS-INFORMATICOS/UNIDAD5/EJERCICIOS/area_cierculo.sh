#!/bin/bash

areaCirculo(){
    if [ $# -ne 1 ]; then
    echo "Hace falta el radio"
    fi
    area=$(( 3,1415 * $1 * $1))
    echo "EL AREA DEL CIRCULO ES: $area"
}

areaCirculo $1