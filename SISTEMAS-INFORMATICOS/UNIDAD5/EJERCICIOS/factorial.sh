factorial() {
    base=$1
    resultado=1


    for ((i=1; i<=base; i++)); do
        resultado=$((resultado * i))
    done
    echo $resultado

}

factorial $1 
