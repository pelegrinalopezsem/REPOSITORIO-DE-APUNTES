#!/bin/bash

areaCirculo(){
    if [ $# -ne 2 ]; then
    echo "Hace falta los datos para calcular el area"
    fi
    area=$(($1 * $2))
    echo "EL AREA DEL RECTANGULO ES: $area"
}

areaCirculo $1 $2