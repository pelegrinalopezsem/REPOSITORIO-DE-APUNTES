buscar_archivos_grandes() {
    find "$1" -type f -size +"$2"M | grep . || echo "No se encontraron archivos > $2 MB"
}

buscar_archivos_grandes "Documentos/" 50