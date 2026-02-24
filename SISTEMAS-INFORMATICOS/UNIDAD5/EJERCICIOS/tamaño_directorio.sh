tamaño_directorio(){
$resultado=$( du -sb "$1" )
echo "Tamaño del directoiro: $resultado"
}

tamaño_directorio $1