# Implementación de infraestructura TI para Nucleoo

## Consideraciones IMPORTANTES

1. **El proyecto se entregará vía GitHub:** [Enlace de entrega del proyecto]

2. **La gestión de versiones es obligatoria** para que el proyecto sea evaluado:
   - a. Debemos ver varios *commits* para comprobar la evolución del proyecto.  
   - b. Proyectos realizados "por arte de magia", con un único *commit* final, varios *commits* con el mismo contenido, pocos *commits* o *commits* en un espacio muy breve de tiempo, se entenderán como **no realizados por el alumno**.  
   - c. Si no se cumple este requisito, la calificación del proyecto será de **cero (0) puntos**.

3. **La defensa del proyecto es obligatoria.**  
   Si no se realiza la defensa, la calificación del proyecto será de **cero (0) puntos**.

---

## Descripción del proyecto

La empresa **Nucleoo**, situada en el corazón de **Gran Vía en Granada**, desarrolla fundamentalmente consultoría informática para otras empresas granadinas, y nos ha pedido diseñar una **infraestructura TI** para su sede, con **3 niveles de trabajadores** según los recursos físicos y de información a los que van a poder acceder:

- **Técnicos**
- **Desarrolladores**
- **Administradores**

---

## Tareas a realizar

Para ello vamos a utilizar nuestros conocimientos de los dos primeros temas de **Sistemas Informáticos (SI)**, centrados en:

- Gestión de archivos  
- Gestión de usuarios y procesos  

Además, aplicaremos lo nuevo que iremos aprendiendo sobre **scripts** y **gestión de redes en Linux**, para ofrecerles una solución **fiable, escalable, duradera y sencilla**, de forma que pueda explicarse fácilmente al cliente.

> Recordar que este primer enunciado es solo la **tarea inicial**, la cual iremos modificando en distintos incrementos, tal y como sucede en la industria real, con metodologías como la **metodología ágil**.

---

## Tarea inicial

*** 1. Creacion de usuarios ***

- a.Habrá tres grupos de usuarios en el sistema. Técnicos, desarrolladores y
administradores.
```bash
    sudo groupadd administradores
    sudo groupadd desarrolladores
    sudo groupadd Tecnicos
```
- b. De cada tipo se crearán 5 usuarios, menos el grupo de administradores que
será únicamente administrador1 y administrador2.
```bash
sudo adduser --home /opt/home/tecnico1 --ingroup Tecnicos tecnico1
sudo adduser --home /opt/home/administrador2 --ingroup administradores administrador2
sudo adduser --home /opt/home/desarrollador5 --ingroup desarrolladores desarrollador5
```

- c. Cada usuario tendrá su carpeta home. Además, dentro de /opt, se crearán
carpetas compartidas para depositar los repositorios.
```bash
sudo mkdir compartido
```

*** 2.Creación de estructura de archivos y carpetas.***
- a. en /opt existirá una carpeta llamada compartido, y dentro la carpeta src donde estarán los códigos fuentes, la carpeta docs con la documentación, la carpeta config con los archivos de configuración y la carpeta recovery con los archivos sql para recuperar la base de datos en caso de caída o pérdida de datos.
```bash
sudo mkdir src docs config recovery
sudo touch src/.c src/.py src/.java
sudo touch config/app.conf config/database.ini config/settings.yaml recovery/backup_11:21.sql recovery/backup_31.sql
sudo touch docs/manual.txt docs/guia.md
sudo chown root:administrador compartido/
sudo chmod 755 compartido/
```
- b. los únicos que deberian tener archivos de escritura sobre los archivos de
confguración (config) deberán ser los administradores. El código fuente solo deberían poder modificarlo los tecnicos y los administradores, mientras que todos deberían tener permiso de lectura para toda la carpeta compartida.
Los archivos de recovery deberían ser suscptibles de ser modificados solo por los administradores, pero leido por todos.
``` bash
sudo chown root:desarrolladores config/
sudo chmod 750 config/
sudo chmod 754 src/

```
-c. El código fuente solo deberían poder modificarlo los desarrolladores y los
administradores, mientras que todos los demás deberían tener permiso de
lectura para toda la carpeta compartida. Los archivos de recovery deberían ser susceptibles de ser modificados solo por los administradores, pero leído por todos.
```bash
sudo chmod 744 recovery/
```
- d. la documentación deberá poderse modificar solo por técnicos,
desarrolladores y administradores, pero si hay más usuarios en el sistema
deberían solo poder leer el contenido de los archivos
```bash
sudo chmod 764 docs/
```


*** 3.Automatizacion***
3.3. Genera las órdenes pertinentes para que, una vez al día, el sistema se
asegure que no hay archivos fuera de sus carpetas. Debería quedar en
/opt/compartido:
- a. En src los ejecutables y codigo fuente (.py, .c, .cpp, .js, .sh todos los que sepáis).
```bash
find /opt/compartido/src/ -type f ! \( -name "*.py" -o -name "*.c" -o -name "*.cpp" -o -name "*.js" -o -name "*.sh" \) -exec mv {} /opt/compartido/src/ \;
```
- b. En config los archivos de configuración (.cfg)
```bash
find /opt/compartido/config/ -type f ! -name "*.cfg" -exec mv {} /opt/compartido/config/ \;
```
- c. En docs la documentacion (.pdf, .md, .doc, .odt, .docx, .txt)
```bash
find /opt/compartido/docs/ -type f ! \( -name "*.pdf" -o -name "*.md" -o -name "*.doc" -o -name "*.odt" -o -name "*.docx" -o -name "*.txt" \) -exec mv {} /opt/compartido/docs/ \;

```
- d. En recovery los archivos de recuperacion de la base de datos (.sql)
```bash
find /opt/compartido/recovery/ -type f ! -name "*.sql" -exec mv {} /opt/compartido/recovery/ \;
```
```bash
0 0 * * * /usr/opt/compartido/borrado.sh
```

**EXPLICACION DEL SCRIPT**
