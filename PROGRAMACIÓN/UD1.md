# **Unidad Didáctica 1: Fundamentos de la Programación, Tipos de Datos y Estructuras de Control**

## **1. Introducción a la Programación**

### **1.1 ¿Qué es la Programación?**  
La **programación informática** es una disciplina que implica el diseño, desarrollo, depuración y mantenimiento de **código fuente** con el fin de crear aplicaciones y sistemas que puedan ser ejecutados por una computadora. En esencia, la programación consiste en proporcionar instrucciones detalladas que una máquina puede interpretar y ejecutar para realizar tareas específicas de manera precisa y repetible.

Existen diversos paradigmas de programación, como la **programación estructurada**, la **programación orientada a objetos** y la **programación funcional**, cada uno con sus propios enfoques y metodologías para resolver problemas mediante código. La programación no solo consiste en escribir código, sino también en comprender el flujo lógico de las instrucciones, optimizar el rendimiento y asegurar que el programa funcione de manera correcta en diferentes entornos.

Los lenguajes de programación como **Python**, **Java** y **C++** actúan como un puente entre los seres humanos y las computadoras, permitiendo a los programadores describir operaciones complejas de manera legible para los humanos, pero comprensible para la máquina.

### **1.2 El Rol de los Programadores**  
Los **programadores** son profesionales especializados en traducir problemas del mundo real a un conjunto de instrucciones que puedan ser interpretadas por un sistema informático. Su rol va más allá de simplemente escribir código: implica un proceso iterativo que comienza con la comprensión profunda de un problema, la conceptualización de una solución algorítmica y la posterior implementación en un lenguaje de programación específico.

Los programadores no solo se centran en la **sintaxis** del lenguaje, sino también en la **lógica algorítmica**, el uso eficiente de recursos computacionales, y la creación de soluciones que sean **escalables**, **mantenibles** y **robustas**. A menudo, colaboran con otros profesionales, como analistas de sistemas, ingenieros de software, diseñadores de interfaces de usuario y especialistas en bases de datos, para desarrollar aplicaciones complejas.

El rol de un programador también incluye la **prueba de software** para detectar y corregir errores (depuración) y la **optimización del rendimiento** del código para garantizar que las soluciones sean eficientes en términos de tiempo de ejecución y uso de memoria. A medida que las tecnologías avanzan, los programadores deben estar en constante actualización para aprender nuevos lenguajes y paradigmas que se ajusten a los desafíos contemporáneos.

### **1.3 Software vs Hardware**  
En el ámbito de la informática, es crucial comprender la distinción entre **software** y **hardware**, ya que ambos elementos forman los componentes fundamentales de cualquier sistema informático.

#### **1.3.1 Software**
El **software** se refiere al conjunto de instrucciones, datos y programas que dirigen el comportamiento del hardware de un sistema informático. Es, esencialmente, la parte intangible de un sistema que controla la interacción con el hardware. El software puede clasificarse en varias categorías, incluyendo:

- **Software de sistema**: Incluye los sistemas operativos (como **Windows**, **macOS**, **Linux**), que gestionan los recursos del hardware y proporcionan servicios básicos para las aplicaciones.
- **Software de aplicación**: Son los programas diseñados para realizar tareas específicas para el usuario, como **navegadores web** (Google Chrome, Firefox), **aplicaciones de procesamiento de texto** (Microsoft Word) o **programas de edición gráfica** (Adobe Photoshop).
- **Software de desarrollo**: Herramientas como entornos de desarrollo integrados (**IDE**, por sus siglas en inglés) que ayudan a los programadores a escribir, depurar y mantener el código. Ejemplos incluyen **Visual Studio**, **Eclipse** o **PyCharm**.

El desarrollo de software implica un ciclo de vida completo que abarca el análisis de requisitos, el diseño, la codificación, las pruebas y el mantenimiento. Sin software, el hardware no podría realizar ninguna operación significativa, ya que este es quien controla todas las acciones que la computadora realiza.

#### **1.3.2 Hardware**
Por otro lado, el **hardware** se refiere a los componentes físicos que componen un sistema informático, es decir, la parte tangible que ejecuta el software. El hardware incluye dispositivos como:

- **CPU (Unidad Central de Procesamiento)**: Es el "cerebro" de la computadora, responsable de ejecutar las instrucciones proporcionadas por el software.
- **Memoria RAM (Memoria de Acceso Aleatorio)**: Almacena temporalmente datos y programas en uso para proporcionar acceso rápido al procesador.
- **Dispositivos de almacenamiento**: Incluyen **discos duros (HDD)**, **unidades de estado sólido (SSD)** y otros medios de almacenamiento donde se guarda permanentemente el software y los datos.
- **Periféricos de entrada/salida**: Componentes como el teclado, ratón, monitor e impresora que permiten la interacción entre el usuario y la computadora.

El **hardware** y el **software** deben trabajar en conjunto de manera eficiente. El software le indica al hardware qué hacer, mientras que el hardware proporciona los recursos necesarios para ejecutar las instrucciones del software. Sin hardware, el software no tendría los medios para funcionar, y sin software, el hardware sería simplemente una colección de componentes inactivos.

### **1.4 Relación entre Programación, Software y Hardware**  
La **programación** actúa como el mecanismo por el cual el **software** interactúa y controla el **hardware**. Un programador debe comprender cómo funciona el hardware subyacente, ya que el rendimiento y la optimización del software dependen en gran medida de la arquitectura del hardware.

Por ejemplo, un programador que trabaja en el desarrollo de aplicaciones de alto rendimiento, como videojuegos o simulaciones científicas, debe tener en cuenta la capacidad del hardware para procesar grandes volúmenes de datos y la rapidez con que se accede a la memoria. Del mismo modo, el software embebido que controla dispositivos físicos, como electrodomésticos inteligentes o automóviles autónomos, requiere una programación que se adapte a las limitaciones del hardware en términos de capacidad de procesamiento y almacenamiento.

Este entendimiento profundo de cómo el software traduce las instrucciones en acciones físicas a través del hardware es esencial para la creación de soluciones tecnológicas eficientes y funcionales.

---

## **2. Lenguajes de Programación**

### **2.1 Concepto de Lenguaje de Programación**  
Un **lenguaje de programación** es un conjunto estructurado de instrucciones y reglas que los programadores utilizan para comunicarse con las computadoras, especificando las operaciones que deben realizarse para resolver un problema o completar una tarea. Estos lenguajes permiten a los programadores escribir código que una máquina puede interpretar y ejecutar. De esta manera, los lenguajes de programación sirven como intermediarios entre el **lenguaje humano** y el **lenguaje máquina**, traduciendo las ideas abstractas y los procesos algorítmicos en un formato comprensible para el hardware.

Los lenguajes de programación cuentan con una **sintaxis** y una **semántica** definida, lo que significa que tienen reglas estrictas sobre cómo se deben estructurar las instrucciones (sintaxis) y cómo estas instrucciones deben ser interpretadas por la máquina (semántica). La capacidad de un programador para organizar el código de manera lógica y eficiente depende de su dominio del lenguaje y su comprensión de los conceptos fundamentales de la **programación estructurada** y **orientada a objetos**.

Además de proporcionar instrucciones para la ejecución de operaciones básicas como cálculos matemáticos, procesamiento de datos y gestión de memoria, los lenguajes de programación permiten la **modularización** del código a través de funciones, clases y otros mecanismos que facilitan la reutilización y la organización lógica de grandes proyectos.

### **2.2 Diferencias entre Lenguajes de Bajo y Alto Nivel**  
Los lenguajes de programación se dividen en categorías según su nivel de abstracción respecto al **hardware** subyacente. Esta clasificación influye en el **control** que un programador tiene sobre los recursos de la máquina y en la **facilidad de uso** del lenguaje.

#### **2.2.1 Lenguajes de Bajo Nivel**
Los **lenguajes de bajo nivel** están más estrechamente alineados con el **lenguaje máquina**, que es el código binario utilizado directamente por la **CPU** para ejecutar instrucciones. Estos lenguajes ofrecen un control preciso sobre los recursos del hardware, como la memoria y el procesamiento, lo que los hace ideales para aplicaciones en las que la eficiencia y el rendimiento son críticos. Sin embargo, son más complejos de aprender y utilizar, ya que requieren que el programador trabaje muy cerca de la arquitectura del hardware.

Uno de los ejemplos más comunes de lenguajes de bajo nivel es el **lenguaje ensamblador**, que permite a los programadores escribir instrucciones a nivel de registro de la CPU, gestionando directamente los **recursos del sistema**. Aunque ofrece una eficiencia máxima en términos de velocidad de ejecución y uso de memoria, su uso implica una comprensión detallada de la arquitectura de la máquina y un manejo manual de aspectos que en lenguajes de alto nivel se abstraen, como la gestión de la memoria y la manipulación directa de direcciones.

Ventajas de los lenguajes de bajo nivel:
- **Máximo control sobre el hardware**.
- **Alta eficiencia** en cuanto a rendimiento.
  
Desventajas:
- **Dificultad de aprendizaje**.
- **Propenso a errores**, debido a la falta de abstracción y automatización.

#### **2.2.2 Lenguajes de Alto Nivel**
En contraste, los **lenguajes de alto nivel** son más cercanos al **lenguaje humano** y proporcionan una mayor **abstracción** sobre los detalles del hardware. Estos lenguajes permiten que los programadores se centren en la **resolución de problemas** a un nivel más alto sin preocuparse por los detalles de la gestión de memoria, el manejo de registros o las direcciones de memoria, ya que estas tareas son gestionadas automáticamente por el **compilador** o **intérprete**.

Ejemplos de lenguajes de alto nivel incluyen **Python**, **Java** y **C++**. Estos lenguajes suelen ser más fáciles de aprender y utilizar, ya que ofrecen bibliotecas y **frameworks** que simplifican muchas tareas comunes, como la gestión de archivos, el procesamiento de datos y la interfaz de usuario.

Ventajas de los lenguajes de alto nivel:
- **Facilidad de uso**: La sintaxis más cercana al lenguaje natural facilita la escritura y lectura del código.
- **Portabilidad**: Muchos lenguajes de alto nivel son independientes de la plataforma, lo que significa que el mismo código puede ejecutarse en diferentes sistemas operativos con mínimas modificaciones.
- **Reducción de errores**: Los lenguajes de alto nivel incluyen mecanismos automáticos para la gestión de memoria y la detección de errores comunes.

Desventajas:
- **Menor control sobre el hardware**: La abstracción que proporcionan los lenguajes de alto nivel puede llevar a una menor optimización en cuanto al rendimiento.
- **Consumo de recursos**: La gestión automática de aspectos como la memoria y el procesamiento a veces implica un mayor uso de recursos en comparación con los lenguajes de bajo nivel.

### **2.3 Ejemplos de Lenguajes de Programación Populares**  
Existen cientos de lenguajes de programación, cada uno diseñado para diferentes aplicaciones y enfoques. A continuación, se describen algunos de los lenguajes más populares y sus características distintivas:

#### **2.3.1 Python**
**Python** es un lenguaje de alto nivel que se ha vuelto extremadamente popular debido a su simplicidad y legibilidad. Es ampliamente utilizado en **desarrollo web**, **análisis de datos**, **inteligencia artificial** y **automatización de tareas**. Python se caracteriza por:

- **Sintaxis clara y concisa**: Python promueve una legibilidad del código que facilita el aprendizaje, por lo que es ideal para principiantes.
- **Gran cantidad de bibliotecas**: Python ofrece una amplia gama de bibliotecas que cubren casi cualquier tarea, desde el análisis de datos (**Pandas**, **NumPy**) hasta el desarrollo web (**Django**, **Flask**).
- **Interpretado**: Python no requiere compilación previa, lo que permite un desarrollo más ágil al permitir que el código se ejecute directamente.

#### **2.3.2 Java**
**Java** es un lenguaje de programación de alto nivel, orientado a objetos, que es ampliamente utilizado en aplicaciones empresariales y móviles. Uno de sus mayores atractivos es su capacidad de ser **independiente de la plataforma**, gracias a la **Máquina Virtual de Java (JVM)**, lo que significa que un programa escrito en Java puede ejecutarse en cualquier sistema operativo que tenga una JVM instalada.

- **Orientación a objetos**: Java está diseñado bajo los principios de la programación orientada a objetos, lo que facilita la reutilización de código y el mantenimiento de grandes proyectos.
- **Portabilidad**: El lema de Java es "Escribe una vez, ejecuta en cualquier lugar" (Write Once, Run Anywhere), lo que lo convierte en una excelente opción para aplicaciones multiplataforma.
- **Amplio uso en Android**: Java es el lenguaje principal para el desarrollo de aplicaciones Android.

#### **2.3.3 C++**
**C++** es un lenguaje de programación que combina características de **lenguajes de alto y bajo nivel**, lo que lo hace extremadamente potente para aplicaciones donde el control del hardware es crítico, pero también se requiere una abstracción suficiente para proyectos complejos.

- **Control eficiente del hardware**: C++ permite un control detallado de la memoria y el procesamiento, lo que lo convierte en una excelente opción para el desarrollo de **sistemas operativos**, **software embebido** y **videojuegos**.
- **Rendimiento**: Al ser un lenguaje compilado y proporcionar acceso a bajo nivel, los programas en C++ suelen ser altamente eficientes en términos de velocidad y uso de memoria.
- **Extensibilidad**: C++ admite tanto la programación estructurada como la programación orientada a objetos, ofreciendo una gran flexibilidad en la estructura de los programas.

---

## **3. Tipos de Datos y Variables en JavaScript**

En **JavaScript**, los **tipos de datos** y el manejo de **variables** son fundamentales para escribir código eficiente y comprensible. Los tipos de datos definen qué tipo de valor puede almacenar una variable y qué operaciones se pueden realizar sobre esos valores. JavaScript es un lenguaje de **tipado dinámico**, lo que significa que no es necesario especificar el tipo de dato cuando declaramos una variable; el tipo se asigna automáticamente según el valor que se le asigne.

### **3.1 Tipos de Datos Básicos**

En JavaScript, existen varios tipos de datos que se utilizan para representar distintos tipos de información. A continuación, se describen los más comunes:

#### **3.1.1 Números (`number`)**

En JavaScript, los números se manejan mediante el tipo de dato **number**, que puede representar tanto números enteros como números con decimales (flotantes). No existe una distinción explícita entre enteros y flotantes como en otros lenguajes; ambos se representan con el mismo tipo de dato.

- **Ejemplos:**
  - Enteros: `5`, `-3`
  - Flotantes: `3.14`, `-0.75`
  
JavaScript utiliza un formato de **punto flotante de precisión doble** (IEEE 754) para representar los números, lo que permite manejar un rango amplio de valores, aunque con algunas limitaciones de precisión en los decimales.

- **Operaciones comunes:** Adición, sustracción, multiplicación, división y exponentes.
  
**Ejemplo de uso:**
```javascript
let a = 10
let b = 3.14
console.log(a + b)  // Resultado: 13.14
```

#### **3.1.2 Cadenas de texto (`string`)**

Una **cadena de texto** o **string** es una secuencia de caracteres que se utiliza para representar texto. Las cadenas pueden ser creadas utilizando comillas simples (`'...'`), comillas dobles (`"..."`) o comillas invertidas (backticks, \`...\`).

- **Ejemplos:**
  ```javascript
  let saludo = "Hola, Mundo!"
  let nombre = 'Juan'
  ```

JavaScript permite realizar varias operaciones con cadenas, como concatenación, búsqueda de subcadenas, extracción de caracteres, etc. Además, las cadenas en JavaScript son **inmutables**, lo que significa que no se pueden cambiar una vez creadas, pero es posible crear nuevas cadenas basadas en modificaciones de las originales.

- **Operaciones comunes:** Concatenación (`+`), acceso a caracteres (`charAt()`), búsqueda (`indexOf()`).

**Ejemplo de concatenación:**
```javascript
let saludo = "Hola, " + "Mundo!"
console.log(saludo)  // Resultado: Hola, Mundo!
```

#### **3.1.3 Booleanos (`boolean`)**

Los **booleanos** son un tipo de dato que puede tener uno de dos valores: **`true`** (verdadero) o **`false`** (falso). Este tipo de dato es esencial para las operaciones lógicas y el control del flujo de los programas mediante **condicionales** y **bucles**.

- **Ejemplos:**
  ```javascript
  let esMayorDeEdad = true
  let esEstudiante = false
  ```

Los valores booleanos son el resultado de evaluaciones lógicas y se utilizan en expresiones que involucran operadores de comparación o lógicos (ver más adelante en las estructuras de control).

- **Operaciones comunes:** Comparaciones (`==`, `>`, `<`), operadores lógicos (`&&`, `||`, `!`).

**Ejemplo de comparación:**
```javascript
let edad = 20
let esAdulto = (edad >= 18)  // Resultado: true
```

#### **3.1.4 Nulo e Indefinido (`null` y `undefined`)**

- **`null`**: Representa la ausencia intencionada de un valor. Es un valor asignable que indica que una variable está vacía o no tiene ningún valor.
- **`undefined`**: Indica que una variable ha sido declarada pero no se le ha asignado ningún valor.

**Ejemplos:**
```javascript
let valorNulo = null  // Variable con valor null
let valorNoDefinido   // Variable sin asignar, tiene valor undefined
```

### **3.2 Variables**

En JavaScript, una **variable** es un contenedor que almacena un valor y cuyo contenido puede cambiar durante la ejecución del programa. Las variables permiten referenciar los datos mediante un nombre, lo que facilita su manipulación.

JavaScript ofrece tres palabras clave principales para declarar variables: **`var`**, **`let`** y **`const`**, cada una con diferentes características y ámbitos (scope).

#### **3.2.1 Declaración e inicialización de variables**

En JavaScript, puedes declarar una variable y asignarle un valor al mismo tiempo. A continuación, se describen las principales formas de declarar variables:

- **`var`**: Es la forma tradicional de declarar variables. Sin embargo, tiene un comportamiento menos predecible en cuanto a su ámbito, ya que es de **ámbito global o de función**.
  
- **`let`**: Introducido en ES6, `let` permite declarar variables con un **ámbito de bloque**, lo que lo hace más seguro y predecible que `var`.

- **`const`**: Se utiliza para declarar **constantes**, es decir, variables cuyo valor no puede ser reasignado una vez establecido. El ámbito también es de bloque, similar a `let`.

**Ejemplos de declaración:**
```javascript
let edad = 25  // Declaración con let
const nombre = "Ana"  // Declaración de constante
var pais = "España"  // Declaración con var
```

Es importante tener en cuenta que `const` se debe usar siempre que sepamos que el valor no va a cambiar. En cambio, `let` es más adecuado cuando el valor puede cambiar a lo largo de la ejecución del programa.

### **3.3 Reglas para Nombrar Variables**

El nombrado de variables en JavaScript debe seguir ciertas **reglas de sintaxis** y **convenciones de estilo** para garantizar la claridad del código y evitar errores.

#### **3.3.1 Reglas básicas**

- **Debe comenzar con una letra, guion bajo (`_`) o signo de dólar (`$`)**: El primer carácter de un nombre de variable debe ser una letra, un guion bajo o un símbolo de dólar. No puede comenzar con un número.
  
  - Ejemplos válidos: `nombreUsuario`, `_contador`, `$precio`.
  - Ejemplos no válidos: `1variable`, `*total`.

- **No puede contener espacios ni caracteres especiales**: Los nombres de variables no pueden contener espacios, ni caracteres como `@`, `#`, `%`, entre otros. Para simular espacios, es común usar **camelCase** o guiones bajos.

  - Ejemplos válidos: `nombreUsuario`, `nombre_usuario`.
  - Ejemplos no válidos: `nombre usuario`, `precio$`.

- **No puede ser una palabra reservada de JavaScript**: No puedes usar palabras reservadas del lenguaje como nombres de variables. Ejemplos de palabras reservadas son `for`, `while`, `if`, `class`, `function`.

#### **3.3.2 Buenas prácticas para nombrar variables**

- **Nombres descriptivos**: Las variables deben tener nombres que reflejen claramente su propósito. Evitar nombres genéricos como `x` o `y` a menos que sea en contextos muy simples o matemáticos.

  - Ejemplo: En lugar de `x`, usar `totalVentas` o `nombreUsuario`.

- **Notación consistente**: Es recomendable usar una convención de nombres consistente. En JavaScript, es común utilizar **camelCase**, donde la primera palabra va en minúscula y cada palabra posterior comienza con mayúscula.

  - Ejemplo: `nombreCompleto`, `cantidadProductos`.

---

## **4. Entrada y Salida de Datos en JavaScript**

En cualquier aplicación, la **interacción con el usuario** es esencial, ya que los programas a menudo requieren **entrada** de datos por parte del usuario y **salida** de información procesada. En **JavaScript**, este intercambio de información es sencillo y se maneja utilizando funciones que permiten capturar datos proporcionados por el usuario y mostrar resultados en la consola.

### **4.1 Funciones de Entrada: `prompt()`**

En JavaScript, la función más comúnmente utilizada para solicitar **entrada** de datos es **`prompt()`**. Esta función muestra un cuadro de diálogo que permite al usuario introducir un valor. Al utilizar `prompt()`, la ejecución del código se detiene hasta que el usuario introduce un valor y presiona "Aceptar" o "Cancelar". El valor que el usuario ingresa se devuelve como una **cadena de texto** (**string**), independientemente de si el usuario ingresa un número u otro tipo de dato.

#### **Funcionamiento de `prompt()`**
La sintaxis básica de `prompt()` es:

```javascript
let variable = prompt("Mensaje para el usuario:")
```

Aquí, `"Mensaje para el usuario"` es el texto que aparece en el cuadro de diálogo para guiar al usuario sobre qué valor debe ingresar. El valor ingresado se almacena en la **variable** especificada.

**Ejemplo:**
```javascript
let nombre = prompt("Introduce tu nombre:")
console.log("Hola, " + nombre + "!")
```

En este ejemplo, el programa solicita el nombre del usuario y luego lo muestra en la consola con un saludo personalizado.

#### **Consideraciones importantes:**
- **Tipo de dato devuelto:** `prompt()` siempre devuelve una **cadena de texto**, incluso si el usuario ingresa un número. Si necesitas realizar operaciones matemáticas con el valor ingresado, debes convertirlo explícitamente a un número.
- **Interrupción del flujo:** `prompt()` detiene la ejecución del código hasta que el usuario introduce un valor, lo que puede no ser ideal para aplicaciones con interacción continua o en tiempo real.

### **4.2 Funciones de Salida: `console.log()`**

En JavaScript, la función más común para mostrar **salida de información** durante el desarrollo es **`console.log()`**. Esta función envía mensajes a la **consola del navegador**, lo que es muy útil para depuración, ver el estado de variables o resultados intermedios del programa.

#### **Sintaxis de `console.log()`**
La sintaxis de `console.log()` es:

```javascript
console.log(valor1, valor2, ...)
```

- **valor1, valor2,...**: Los valores que deseas imprimir en la consola. Pueden ser variables, literales, expresiones o cualquier tipo de objeto.

**Ejemplo:**
```javascript
let nombre = "Ana"
console.log("Nombre del usuario:", nombre)
```

En este caso, el mensaje "Nombre del usuario: Ana" aparecerá en la consola del navegador.

### **4.3 Conversión entre Tipos de Datos**

Dado que `prompt()` devuelve siempre una **cadena de texto**, en muchas ocasiones es necesario **convertir** ese valor a otro tipo de dato, como números, para realizar operaciones matemáticas o comparaciones lógicas. En JavaScript, la conversión entre tipos de datos se realiza de manera explícita, ya que es un lenguaje de **tipado dinámico**. Las conversiones más comunes son de **cadena a número** y viceversa.

#### **Operaciones Aritméticas en JavaScript**

Antes de abordar la conversión, es importante entender las **operaciones aritméticas** básicas en JavaScript, que incluyen:

- **Suma (`+`)**: Adiciona dos números.
  ```javascript
  let suma = 10 + 5  // Resultado: 15
  ```

- **Resta (`-`)**: Resta un número de otro.
  ```javascript
  let resta = 10 - 5  // Resultado: 5
  ```

- **Multiplicación (`*`)**: Multiplica dos números.
  ```javascript
  let multiplicacion = 10 * 5  // Resultado: 50
  ```

- **División (`/`)**: Divide un número por otro.
  ```javascript
  let division = 10 / 2  // Resultado: 5
  ```

- **Módulo (`%`)**: Devuelve el resto de una división.
  ```javascript
  let modulo = 10 % 3  // Resultado: 1
  ```

Cuando necesitas hacer operaciones matemáticas con los datos ingresados por el usuario, es imprescindible convertir esas cadenas a números.

#### **Operaciones Lógicas en JavaScript**

Las operaciones lógicas en JavaScript te permiten evaluar condiciones y devolver un valor **booleano** (`true` o `false`). Los operadores lógicos incluyen:

- **AND lógico (`&&`)**: Evalúa si ambas condiciones son verdaderas.
  ```javascript
  let esAdulto = (edad >= 18 && edad <= 65)
  ```

- **OR lógico (`||`)**: Evalúa si al menos una de las condiciones es verdadera.
  ```javascript
  let esMenorOMayor = (edad < 18 || edad > 65)
  ```

- **NOT lógico (`!`)**: Invierte el valor de una condición.
  ```javascript
  let noEsAdulto = !(edad >= 18)
  ```

#### **Funciones de Conversión Comunes**
1. **`Number()`**: Convierte una cadena de texto a un número. Si no puede convertir el valor, devuelve `NaN` (Not a Number).
   ```javascript
   let numero = Number("123")  // Resultado: 123
   ```

2. **`parseInt()`**: Convierte una cadena a un número entero.
   ```javascript
   let entero = parseInt("123.45")  // Resultado: 123
   ```

3. **`parseFloat()`**: Convierte una cadena a un número decimal.
   ```javascript
   let decimal = parseFloat("123.45")  // Resultado: 123.45
   ```

4. **`String()`**: Convierte un número u otro tipo de dato a una cadena de texto.
   ```javascript
   let cadena = String(123)  // Resultado: "123"
   ```

#### **Conversión de entrada de usuario**

Cuando necesitas que el usuario ingrese un número y quieres realizar operaciones matemáticas, debes **convertir explícitamente** el valor devuelto por `prompt()`.

**Ejemplo de conversión:**
```javascript
let edad = Number(prompt("Introduce tu edad:"))
console.log("El próximo año tendrás " + (edad + 1) + " años.")
```

En este ejemplo, el valor ingresado por el usuario es convertido a un número usando `Number()`. Luego se utiliza para calcular la edad del usuario el próximo año y se muestra el resultado en la consola.

#### **Errores en la conversión**

Si el usuario ingresa un valor que no puede ser convertido a número, el resultado será **NaN** (Not a Number). JavaScript proporciona la función **`isNaN()`** para verificar si el valor ingresado es un número válido.

**Ejemplo de manejo de errores:**
```javascript
let edad = prompt("Introduce tu edad:")
if (isNaN(edad)) {
    console.log("Por favor, introduce un número válido.")
} else {
    edad = Number(edad)
    console.log("El próximo año tendrás " + (edad + 1) + " años.")
}
```

En este ejemplo, el programa verifica si el valor ingresado es un número válido antes de intentar convertirlo y realizar cálculos.

---

## **5. Estructuras de Control en JavaScript**

Las **estructuras de control** son un componente esencial de la programación, ya que permiten modificar el flujo de ejecución de un programa en función de determinadas **condiciones** o realizar **repeticiones** de tareas. Estas estructuras permiten que los programas tomen decisiones, ejecuten código bajo ciertas circunstancias y repitan operaciones hasta que se cumplan o dejen de cumplirse ciertas condiciones. Sin estructuras de control, los programas solo podrían ejecutar instrucciones de forma secuencial, limitando su capacidad para resolver problemas complejos y adaptarse a diferentes escenarios.

Las estructuras de control en **JavaScript** se dividen en dos categorías principales: **condicionales** y **bucles**. Las estructuras condicionales permiten tomar decisiones basadas en evaluaciones de condiciones, mientras que los bucles permiten repetir un conjunto de instrucciones hasta que se cumpla una condición específica.

### **5.1 Condicionales**

Las **estructuras condicionales** en JavaScript permiten que el programa ejecute diferentes bloques de código según si una condición evaluada es **verdadera** (`true`) o **falsa** (`false`). Esto permite a los programas ser más dinámicos y responder a diferentes entradas o situaciones.

En JavaScript, las condicionales se implementan utilizando las palabras clave **`if`**, **`else if`**, y **`else`**. Estas permiten definir múltiples rutas de ejecución en función de las condiciones que se cumplan.

#### **5.1.1 Sentencia `if`, `else if`, `else`**

La sintaxis básica de una estructura condicional `if` en JavaScript es la siguiente:

```javascript
if (condición) {
    // Código a ejecutar si la condición es verdadera
}
```

Si la **condición** es verdadera, el bloque de código dentro de la estructura `if` se ejecutará. Si la condición es falsa, el código dentro del `if` se omitirá. Para manejar la situación cuando la condición es falsa, podemos utilizar la estructura `else`.

- **Ejemplo básico de `if` y `else`:**

```javascript
let edad = 18
if (edad >= 18) {
    console.log("Eres mayor de edad")
} else {
    console.log("Eres menor de edad")
}
```

En este ejemplo, si el valor de la variable `edad` es mayor o igual a 18, el programa imprimirá "Eres mayor de edad". Si no, imprimirá "Eres menor de edad".

La palabra clave **`else if`** se usa para manejar múltiples condiciones en una secuencia condicional. Si la primera condición no es verdadera, el programa evaluará las siguientes condiciones `else if`, y, si ninguna se cumple, se ejecutará el bloque `else` al final.

- **Ejemplo con `else if`:**

```javascript
let edad = 16
if (edad < 13) {
    console.log("Eres un niño")
} else if (edad < 18) {
    console.log("Eres un adolescente")
} else {
    console.log("Eres un adulto")
}
```

En este caso, el programa evalúa si la edad es menor a 13, luego si es menor a 18, y si ninguna de esas condiciones es verdadera, el bloque `else` indica que la persona es adulta.

### **5.2 Operadores de Comparación y Lógicos**

Para que las estructuras condicionales funcionen correctamente, es necesario entender los **operadores de comparación** y los **operadores lógicos**, que permiten establecer las condiciones que se evaluarán en las sentencias `if`, `else if` y `else`.

#### **5.2.1 Operadores de Comparación**

Los **operadores de comparación** permiten comparar dos valores o variables. El resultado de una comparación es siempre un **valor booleano**: `true` o `false`. Los operadores de comparación más comunes en JavaScript son:

- `==` : Evalúa si dos valores son iguales (sin verificar el tipo).
- `===` : Evalúa si dos valores son estrictamente iguales (incluyendo el tipo).
- `!=` : Evalúa si dos valores son diferentes.
- `!==` : Evalúa si dos valores son estrictamente diferentes (incluyendo el tipo).
- `<`  : Menor que.
- `>`  : Mayor que.
- `<=` : Menor o igual que.
- `>=` : Mayor o igual que.

**Ejemplo de comparación:**

```javascript
let a = 10
let b = 5

if (a > b) {
    console.log("a es mayor que b")
}
```

En este ejemplo, la condición `a > b` evalúa si `a` es mayor que `b`. Como la condición es verdadera, el programa imprimirá "a es mayor que b".

#### **5.2.2 Operadores Lógicos**

Los **operadores lógicos** permiten combinar varias condiciones o invertir el resultado de una condición. Los operadores lógicos más utilizados en JavaScript son:

- **`&&`** (AND lógico): Devuelve `true` si ambas condiciones son verdaderas.
- **`||`** (OR lógico): Devuelve `true` si al menos una de las condiciones es verdadera.
- **`!`** (NOT lógico): Invierte el valor de una condición; si es `true`, lo convierte en `false` y viceversa.

**Ejemplo con operadores lógicos:**

```javascript
let edad = 20
if (edad >= 18 && edad <= 65) {
    console.log("Estás en edad laboral")
}
```

En este caso, ambas condiciones (`edad >= 18` y `edad <= 65`) deben ser verdaderas para que el bloque de código se ejecute. Si una de ellas es falsa, el programa no imprimirá nada.

### **5.3 Bucles**

Explicacion: [Video](https://screencast.apps.chrome/1-b5sV8ACnNmh3aDP824FqTcCtD17Nndo?createdTime=2024-10-03T04%3A31%3A25.090Z)

Los **bucles** son estructuras que permiten ejecutar repetidamente un bloque de código mientras se cumpla una condición específica o hasta que se haya recorrido una colección de elementos. Los bucles son útiles cuando se necesita realizar una operación repetitiva, como procesar una lista de elementos o realizar una tarea hasta que se alcance un valor deseado.

#### **5.3.1 Bucle `for`**

El bucle **`for`** se utiliza para **iterar** sobre una secuencia, como un rango de números o una colección de elementos (como un array). Cada vez que el bucle se ejecuta, el programa ejecuta el bloque de código asociado.

La sintaxis básica de un bucle `for` en JavaScript es:

```javascript
for (inicialización; condición; actualización) {
    // Código a ejecutar en cada iteración
}
```

- **Ejemplo con un rango de números:**

```javascript
for (let i = 0; i < 5; i++) {
    console.log(i)
}
```

Este bucle `for` ejecuta el bloque de código cinco veces, imprimiendo los números del `0` al `4`. La variable `i` se inicializa en `0`, y en cada iteración se incrementa hasta que deja de cumplir la condición `i < 5`.

#### **5.3.2 Bucle `while`**

El bucle **`while`** ejecuta repetidamente un bloque de código **mientras una condición sea verdadera**. Este bucle es útil cuando no se sabe cuántas iteraciones serán necesarias, y la condición depende de una evaluación dinámica.

La sintaxis básica del bucle `while` es:

```javascript
while (condición) {
    // Código a ejecutar mientras la condición sea verdadera
}
```

- **Ejemplo de bucle `while`:**

```javascript
let contador = 0
while (contador < 5) {
    console.log(contador)
    contador++
}
```

En este caso, el bucle imprimirá los números del `0` al `4`, ya que la condición es `contador < 5`. El valor de `contador` se incrementa en cada iteración.
