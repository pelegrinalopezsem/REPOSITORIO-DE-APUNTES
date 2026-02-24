buscar_por_extension(){
    find "$1" -type f -iname "*.$2"
}

buscar_por_extension $1 $2