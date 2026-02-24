obtener_propietario(){
    if [ ! -s "$2" ]; then
    echo "Formato no valido o vacio"
    else
    ls -l $1
    echo "$1 : prop"
    fi

}