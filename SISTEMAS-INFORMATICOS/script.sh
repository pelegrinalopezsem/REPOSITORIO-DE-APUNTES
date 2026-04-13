#!/bin/bash

# Guardamos la URL que el usuario pasa como primer argumento
URL="$1"

# Bucle infinito: repetimos hasta encontrar la URL final
while :; do

  # curl:
  # -s → modo silencioso (no muestra barras ni mensajes)
  # -o /dev/null → descarta el contenido de la página (solo queremos la cabecera)
  # -w "%{redirect_url}" → imprime SOLO la URL de redirección si existe
  NUEVA=$(curl -s -o /dev/null -w "%{redirect_url}" "$URL")

  # Si NUEVA está vacía, significa que NO hay redirección
  # Por tanto, hemos llegado a la URL final
  if [ -z "$NUEVA" ]; then
    echo "$URL"   # Mostramos la URL final
    exit 0        # Salimos del script
  fi

  # Si sí había redirección, actualizamos la URL
  # y seguimos el bucle para comprobar si hay más saltos
  URL="$NUEVA"
done

