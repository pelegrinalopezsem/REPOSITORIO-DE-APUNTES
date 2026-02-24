cambiar_permisos(){
    if [ $# -eq 0 ]; then 
    echo "No has introducido el archivo"
    fi
    if [[ ! $1 =~ ^[0-7]{3,4}$ ]]; then
    echo "Formato de permisos inválido"
    exit 1
    fi
    chmod $1 $2
    echo 
}
cambiar_permisos $1 $2