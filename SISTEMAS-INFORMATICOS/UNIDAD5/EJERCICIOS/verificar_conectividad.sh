verificar_conectividad() {
  # Ejecuta ping, extrae la latencia con 'cut' y muestra el resultado
  ms=$(ping -c 1 "$1" | grep "time=" | cut -d "=" -f 4)

  if [ -n "$ms" ]; then
    echo "$1 responde (latencia: $ms)"
  else
    echo "$1 no responde"
  fi
}