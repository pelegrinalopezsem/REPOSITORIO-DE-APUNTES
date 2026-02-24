obtener_propietario(){
    if [ ! -f "$1" ]; then
        echo "Error: El archivo '$1' no existe o es un directorio."
        return 1
    fi

    local prop=$(stat -c '%U' "$1")
    
    echo "Archivo: $1 | Propietario: $prop"
}

obtener_propietario $1