sumatorio() {
    base=$1
    resultado=0
    # for ((i=1; i<=base; i++)); do
    #     echo $resultado "+" $i "=" $(($resultado + $i))
    #     resultado=$(($resultado + $i))
    # done
    # echo $resultado

    echo $(($1 * ($1 + 1) / 2))

}

sumatorio $1 