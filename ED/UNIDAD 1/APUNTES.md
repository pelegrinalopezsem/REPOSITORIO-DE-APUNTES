# **Git y GitHub**


- [**Git y GitHub**](#git-y-github)
  - [\*\*1- ¿Que es Git?](#1--que-es-git)
    - [**1.1- ¿Para qué sirve?**](#11--para-qué-sirve)
    - [**1.2- ¿Como fuciona?**](#12--como-fuciona)
  - [**2- ¿Como se instala desde Linux?**](#2--como-se-instala-desde-linux)
    - [**2-1- ¿Como se instala Git en Windows?**](#2-1--como-se-instala-git-en-windows)
  - [**3-Configuración de Git**](#3-configuración-de-git)
    - [**3-1.- Comandos basicos de Git**](#3-1--comandos-basicos-de-git)
  - [**4-GitHub**](#4-github)
    - [**4.1-Pasos basicos con GitHub**](#41-pasos-basicos-con-github)
      - [Crear un **REPOSITORIO**:](#crear-un-repositorio)
      - [**CONECTAR** a un repositorio local:](#conectar-a-un-repositorio-local)
      - [Subir cambios al repositorio remoto](#subir-cambios-al-repositorio-remoto)
      - [**4.4. Clonar un Repositorio con `git clone`**](#44-clonar-un-repositorio-con-git-clone)


## **1- ¿Que es Git?
Git es un sistema de control de versiones. Fue creado por Linus Torvalds (el creador de Linux) en 2005 y se usa principalmente para gestionar el código fuente de proyectos de software, aunque también puede usarse para cualquier tipo de archivo.

![Logo de Git](../UNIDAD%201/imagenes/git.png)

### **1.1- ¿Para qué sirve?**
Git te permite:

-Guardar el historial de cambios en tus archivos.

-Colaborar con otras personas en un mismo proyecto sin sobrescribir su trabajo.

-Volver atrás en el tiempo si algo sale mal.

-Trabajar con ramas (branches), lo que permite desarrollar nuevas funciones sin afectar el código principal.

### **1.2- ¿Como fuciona?**
-Git guarda los cambios de tus archivos en algo llamado un repositorio.

-Cada conjunto de cambios que guardas se llama un commit.

-Puedes tener copias del repositorio localmente (en tu computadora) y también en una plataforma remota como GitHub, GitLab o Bitbucket.

## **2- ¿Como se instala desde Linux?**
En la mayoría de las distribuciones de Linux, como **Ubuntu** o **Debian**, Git se puede instalar directamente desde el administrador de paquetes de la distribución. Sigue los siguientes pasos para instalarlo:

```bash
sudo apt update
sudo apt install git
```
![instalación](../UNIDAD%201/imagenes/terminal1.png)

Git estará disponible inmediatamente después de la instalación y puedes verificar su versión ejecutando el comando `git --version` (explicado más adelante).

![comprobación](../UNIDAD%201/imagenes/terminal2.png)

### **2-1- ¿Como se instala Git en Windows?**
En **Windows**, Git se instala utilizando un instalador gráfico. Puedes descargar el instalador desde la [página oficial de Git](https://git-scm.com/download/win). 

**Pasos para instalar en Windows**

1. Descarga el archivo `.exe` desde el sitio web.
2. Ejecuta el instalador y sigue las instrucciones, seleccionando las opciones predeterminadas a menos que necesites configuraciones personalizadas.
3. Tras la instalación, podrás utilizar Git tanto desde la **terminal Git Bash** como desde la **línea de comandos (CMD)** de Windows.


## **3-Configuración de Git**
Introducimos los parametros basicos que son el **nombre** y el **correo electronico**

**PARA CONFIGURAR TU NOMBRE Y EL CORREO ELECTRONICO LO HACEMOS ATRAVES DE LA TERMINAL**

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@ejemplo.com"
```
Un comando para comprobar que ha funcionado y has guardado los nuevos parametros

![parametros](../UNIDAD%201/imagenes/termina3.png)

### **3-1.- Comandos basicos de Git**
Inicializa un nuevo repositorio Git en el directorio actual.
```bash
git init
```

Clona un repositorio remoto a tu máquina local.
```bash
git clone [url]
```
Muestra el estado actual del repositorio: archivos modificados, añadidos o sin seguimiento.
```bash
git status
```

Añade un archivo específico al área de preparación (staging area) para el próximo commit.
```bash
git add [archivo]
```


Añade todos los archivos modificados y nuevos al área de preparación.
```bash
git add .
```


Guarda los cambios preparados en el repositorio local con un mensaje descriptivo.
```bash
git commit -m "mensaje"
```


Envía los commits locales al repositorio remoto.
```bash
git push
```


Descarga y fusiona los cambios del repositorio remoto en tu rama actual.
```bash
git pull
```


Lista las ramas locales existentes en el repositorio.
```bash
git branch
```


Cambia a otra rama o crea una nueva si se usa con -b (por ejemplo, git checkout -b nueva-rama).
```bash
git checkout [rama]
```

## **4-GitHub**
GitHub es una plataforma en la nube y un servicio de alojamiento de código que utiliza el sistema de control de versiones Git para facilitar la colaboración, el almacenamiento y la gestión de proyectos de software y otros tipos de contenido

![Logo de GitHub](../UNIDAD%201/imagenes/github.png)

### **4.1-Pasos basicos con GitHub**

#### Crear un **REPOSITORIO**:
1. Entra a tu cuenta de [github.com](https://github.com).
2. Haz clic en "New Repository".
3. Ponle un nombre, elige si es público o privado, y añade una descripción si quieres.
4. Puedes agregar un README.md, un .gitignore y una licencia si lo deseas.

#### **CONECTAR** a un repositorio local:

Una vez que tienes un repositorio local y un repositorio remoto creado en GitHub, necesitas **enlazarlos** para poder sincronizar los cambios entre ambos.

Para conectar un repositorio local con un repositorio remoto en GitHub, utiliza el comando `git remote add`. Este comando vincula el repositorio local con el remoto, lo que te permitirá subir y descargar cambios fácilmente.
Cambia a otra rama o crea una nueva si se usa con -b (por ejemplo, git checkout -b nueva-rama).
```bash
git checkout [rama]
```


**Comando para enlazar el repositorio local**

```bash
git remote add origin https://github.com/usuario/repo.git
```

#### Subir cambios al repositorio remoto

Después de realizar commits en tu repositorio local, puedes **subir esos cambios** al repositorio remoto en GitHub utilizando el comando `git push`. Este comando sincroniza el historial de versiones de tu repositorio local con el remoto, permitiendo que los colaboradores vean y trabajen sobre los cambios más recientes.

**Comando para subir cambios**

```bash
git push origin master
```

#### **4.4. Clonar un Repositorio con `git clone`**

Clonar un repositorio es el proceso mediante el cual descargas una **copia completa** del repositorio remoto en tu máquina local. Esta acción es útil cuando deseas comenzar a trabajar en un proyecto existente o cuando necesitas acceder a un repositorio por primera vez.

**Comando para clonar un repositorio**

```bash
git clone https://github.com/usuario/repo.git
```