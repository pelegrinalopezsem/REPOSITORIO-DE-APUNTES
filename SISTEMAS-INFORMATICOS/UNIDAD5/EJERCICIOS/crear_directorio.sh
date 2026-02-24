crear_directorio(){
    if [ -d "$ruta" ]; then
        echo "Directorio $ruta ya existe"
    else
        mkdir -p "$ruta"
        echo "Directorio $ruta ya creado"
    fi
}

ruta="./mi_carpeta"
crear_directorio 