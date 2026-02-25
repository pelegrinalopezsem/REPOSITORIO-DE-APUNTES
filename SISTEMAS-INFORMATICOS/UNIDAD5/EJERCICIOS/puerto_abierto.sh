puerto_abierto() {
  local host=$1
  local puerto=$2
  
  # Espera máximo 2 segundos antes de darlo por cerrado
  timeout 2 bash -c "echo > /dev/tcp/$host/$puerto" 2>/dev/null
  
  if [ $? -eq 0 ]; then
    echo "$puerto abierto en $host"
  else
    echo "$puerto cerrado en $host"
  fi
}