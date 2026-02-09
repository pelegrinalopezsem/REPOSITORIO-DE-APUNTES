#!/bin/bash

#!/bin/bash

perimetroCirculo(){
    if [ $# -ne 1 ]; then
    echo "Hace falta los datos para calular el perimetro"
    fi
    perimetro=$(( 2 * 3,1415 * $1 ))
    echo "EL PERIMETRO DEL CIRCULO ES: $perimetro"
}

perimetroCirculo $1