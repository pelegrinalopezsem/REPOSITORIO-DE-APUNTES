-- Eliminar base de datos si existe
DROP DATABASE IF EXISTS andalucia_db;

-- Crear base de datos con codificación UTF-8
CREATE DATABASE IF NOT EXISTS andalucia_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE andalucia_db;

-- Crear la tabla personas
CREATE TABLE personas (
    id INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    sexo ENUM('M', 'H') NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    provincia VARCHAR(100) NOT NULL,
    municipio VARCHAR(150) NOT NULL,
    nivel_estudios VARCHAR(50),
    situacion_laboral VARCHAR(50),
    ingresos_anuales INT,
    estado_civil VARCHAR(20),
    num_hijos INT,
    nivel_socioeconomico VARCHAR(20),
    ocupacion VARCHAR(50),
    madre INT,
    padre INT,
    FOREIGN KEY (madre) REFERENCES personas(id),
    FOREIGN KEY (padre) REFERENCES personas(id)
) ENGINE=InnoDB;

-- Desactivar comprobación de claves foráneas temporalmente
SET FOREIGN_KEY_CHECKS=0;

-- Cargar datos desde CSV si existe
LOAD DATA INFILE '/home/alumnoM/Descargas/andalucia.csv'
INTO TABLE personas
FIELDS TERMINATED BY ','  
ENCLOSED BY '"' 
LINES TERMINATED BY '\n' 
IGNORE 1 ROWS;

-- Insertar datos adicionales con claves foráneas coherentes
INSERT INTO personas (id, nombre, apellido, sexo, fecha_nacimiento, provincia, municipio, nivel_estudios, situacion_laboral, ingresos_anuales, estado_civil, num_hijos, nivel_socioeconomico, ocupacion, madre, padre) VALUES
(1091,'Margarita','Romero','M','1958-06-10','Cádiz','Jerez','Primarios','Ama de Casa',0,'Casada',2,'Bajo','Ama de Casa',NULL,NULL),
(1092,'Crisostomo','Rosales','H','1950-02-15','Almería','Roquetas','Secundarios','Jubilado',11000,'Casado',2,'Medio','Jubilado',NULL,NULL),
(1093,'Natividad','Rossi','M','1954-08-23','Almería','Roquetas','Primarios','Ama de Casa',0,'Casada',2,'Medio','Ama de Casa',NULL,NULL),
(1094,'Demóstenes','Roza','H','1948-04-07','Huelva','Huelva','Primarios','Jubilado',8000,'Casado',2,'Bajo','Jubilado',NULL,NULL),
(1095,'Octavia','Rubio','M','1952-10-14','Huelva','Huelva','Primarios','Ama de Casa',0,'Casada',2,'Bajo','Ama de Casa',NULL,NULL),
(1096,'Donaciano','Rueda','H','1956-07-29','Sevilla','Dos Hermanas','Secundarios','Jubilado',12500,'Casado',1,'Medio','Jubilado',NULL,NULL),
(1097,'Perpetua','Ruelas','M','1960-01-06','Sevilla','Dos Hermanas','Primarios','Ama de Casa',0,'Casada',1,'Medio','Ama de Casa',NULL,NULL),
(1098,'Doroteo','Ruiz','H','1952-11-18','Málaga','Marbella','Secundarios','Jubilado',14000,'Casado',2,'Medio','Jubilado',NULL,NULL),
(1099,'Prudencia','Salas','M','1956-05-25','Málaga','Marbella','Secundarios','Ama de Casa',0,'Casada',2,'Medio','Ama de Casa',NULL,NULL),
(1100,'Egidio','Salazar','H','1950-03-11','Cádiz','Cádiz','Primarios','Jubilado',9500,'Casado',2,'Bajo','Jubilado',NULL,NULL),
(1101,'Quiteria','Salcedo','M','1954-09-19','Cádiz','Cádiz','Primarios','Ama de Casa',0,'Casada',2,'Bajo','Ama de Casa',NULL,NULL),
(1102,'Eligio','Salinas','H','1948-07-02','Granada','Motril','Secundarios','Jubilado',10500,'Casado',2,'Bajo','Jubilado',NULL,NULL),
(1103,'Rafaela','Saltara','M','1952-01-08','Granada','Motril','Primarios','Ama de Casa',0,'Casada',2,'Bajo','Ama de Casa',NULL,NULL),
(1104,'Epifanio','Samaniego','H','1956-11-14','Jaén','Úbeda','Primarios','Jubilado',8500,'Casado',3,'Bajo','Jubilado',NULL,NULL),
(1105,'Sabina','Sampedro','M','1960-06-22','Jaén','Úbeda','Primarios','Ama de Casa',0,'Casada',3,'Bajo','Ama de Casa',NULL,NULL),
(1106,'Estanislao','Sánchez','H','1954-09-03','Córdoba','Lucena','Secundarios','Jubilado',11000,'Casado',1,'Medio','Jubilado',NULL,NULL),
(1107,'Tecla','Sandoval','M','1958-03-11','Córdoba','Lucena','Primarios','Ama de Casa',0,'Casada',1,'Medio','Ama de Casa',NULL,NULL),
(1108,'Eusebio','Santamaría','H','1950-12-27','Sevilla','Alcalá','Secundarios','Jubilado',12000,'Casado',2,'Medio','Jubilado',NULL,NULL),
(1109,'Ursulina','Santana','M','1954-04-05','Sevilla','Alcalá','Primarios','Ama de Casa',0,'Casada',2,'Medio','Ama de Casa',NULL,NULL),
(1110,'Eutimio','Sarmiento','H','1948-08-19','Málaga','Fuengirola','Secundarios','Jubilado',13500,'Casado',2,'Medio','Jubilado',NULL,NULL),
(1111,'Valeriana','Satauste','M','1952-02-26','Málaga','Fuengirola','Secundarios','Ama de Casa',0,'Casada',2,'Medio','Ama de Casa',NULL,NULL),
(1112,'Evaristo','Saucedo','H','1956-06-04','Huelva','Lepe','Primarios','Jubilado',8000,'Casado',1,'Bajo','Jubilado',NULL,NULL),
(1113,'Walburga','Saudo','M','1960-12-12','Huelva','Lepe','Primarios','Ama de Casa',0,'Casada',1,'Bajo','Ama de Casa',NULL,NULL),
(1114,'Fabiano','Sauz','H','1952-04-18','Almería','El Ejido','Secundarios','Jubilado',10000,'Casado',2,'Bajo','Jubilado',NULL,NULL),
(1115,'Xenia','Sayas','M','1956-09-26','Almería','El Ejido','Primarios','Ama de Casa',0,'Casada',2,'Bajo','Ama de Casa',NULL,NULL),
(1116,'Faustino','Saynos','H','1950-07-08','Cádiz','San Fernando','Secundarios','Jubilado',9500,'Casado',2,'Bajo','Jubilado',NULL,NULL),
(1117,'Yanira','Saza','M','1954-01-15','Cádiz','San Fernando','Primarios','Ama de Casa',0,'Casada',2,'Bajo','Ama de Casa',NULL,NULL),
(1118,'Fulgencio','Scheid','H','1948-10-29','Sevilla','Coria','Secundarios','Jubilado',11500,'Casado',1,'Medio','Jubilado',NULL,NULL),
(1119,'Zenaida','Seco','M','1952-03-07','Sevilla','Coria','Primarios','Ama de Casa',0,'Casada',1,'Medio','Ama de Casa',NULL,NULL),
(1120,'Gerasimo','Secreto','H','1956-08-13','Sevilla','Sevilla','Secundarios','Jubilado',12500,'Casado',2,'Medio','Jubilado',NULL,NULL),
(1121,'Abigaíl','Segovia','M','1960-04-21','Sevilla','Sevilla','Primarios','Ama de Casa',0,'Casada',2,'Medio','Ama de Casa',NULL,NULL),
(1122,'Gildardo','Seis','H','1954-01-05','Málaga','Málaga','Primarios','Jubilado',9000,'Casado',1,'Bajo','Jubilado',NULL,NULL),
(1123,'Blanca','Seisdos','M','1958-07-11','Málaga','Málaga','Primarios','Ama de Casa',0,'Casada',1,'Bajo','Ama de Casa',NULL,NULL),
(1124,'Gislerio','Selma','H','1950-11-17','Córdoba','Córdoba','Secundarios','Jubilado',10500,'Casado',2,'Bajo','Jubilado',NULL,NULL),
(1125,'Cristina','Semence','M','1954-05-24','Córdoba','Córdoba','Primarios','Ama de Casa',0,'Casada',2,'Bajo','Ama de Casa',NULL,NULL),
(1126,'Godofredo','Semeno','H','1948-02-08','Granada','Granada','Primarios','Jubilado',8500,'Casado',3,'Bajo','Jubilado',NULL,NULL),
(1127,'Dionisia','Sencillo','M','1952-08-16','Granada','Granada','Primarios','Ama de Casa',0,'Casada',3,'Bajo','Ama de Casa',NULL,NULL),
(1128,'Gómez','Senén','H','1956-04-24','Jaén','Linares','Secundarios','Jubilado',11500,'Casado',3,'Bajo','Jubilado',NULL,NULL),
(1129,'Emilia','Senís','M','1960-10-02','Jaén','Linares','Primarios','Ama de Casa',0,'Casada',3,'Bajo','Ama de Casa',NULL,NULL),
(1130,'Graciano','Seno','H','1952-09-11','Cádiz','Jerez','Secundarios','Jubilado',10000,'Casado',1,'Bajo','Jubilado',NULL,NULL),
(1131,'Fabiana','Senra','M','1956-02-19','Cádiz','Jerez','Primarios','Ama de Casa',0,'Casada',1,'Bajo','Ama de Casa',NULL,NULL),
(1132,'Graciliano','Senta','H','1950-06-27','Almería','Adra','Primarios','Jubilado',8000,'Casado',1,'Bajo','Jubilado',NULL,NULL),
(1133,'Gabriela','Sentana','M','1954-12-05','Almería','Adra','Primarios','Ama de Casa',0,'Casada',1,'Bajo','Ama de Casa',NULL,NULL);

-- Reactivar comprobación de claves foráneas
SET FOREIGN_KEY_CHECKS=1;


-- 1 dime el nombre y apellido de los cinco malagueños (provincia) de más edad
SELECT CONCAT(nombre, ' ', apellido) AS nombre_completo
FROM personas
WHERE provincia = 'Málaga'
ORDER BY TIMESTAMPDIFF(YEAR, fecha_nacimiento, CURDATE()) DESC
LIMIT 5;

-- 2 dime el maximo de ingresos anuales que tiene una persona con estudios primarios.
SELECT MAX(ingresos_anuales) AS max_ingresos
FROM personas
WHERE nivel_estudios = 'Primarios';
-- 3  dime la edad media de las personas cuya ocupación comience por la letra A
SELECT AVG(TIMESTAMPDIFF(YEAR, fecha_nacimiento, CURDATE())) AS edad_media
FROM personas
WHERE ocupacion LIKE 'A%';
-- 4  Dime las 3 primeras letras del estado civil de las personas de Dos Hermanas (pueblo, no que tengan hermanas).
SELECT LEFT(estado_civil, 3) AS estado_civil_corto
FROM personas
WHERE municipio = 'Dos Hermanas';
-- 5  Cuenta el numero de personas que son padre siendo mujer o madre siendo hombre
SELECT COUNT(*) AS conteo
FROM personas p
WHERE (sexo = 'M' AND id IN (SELECT padre FROM personas WHERE padre IS NOT NULL))
   OR (sexo = 'H' AND id IN (SELECT madre FROM personas WHERE madre IS NOT NULL));
-- 6  Dime la moda del estado civil
SELECT estado_civil
FROM personas
GROUP BY estado_civil
ORDER BY COUNT(*) DESC
LIMIT 1;
-- 7  Dime cuantos municipios diferentes de la provincia de Cádiz aparecen en la base de datos. 
SELECT COUNT(DISTINCT municipio) AS num_municipios
FROM personas
WHERE provincia = 'Cádiz';
-- 8  Dime la media de ingresos_anuales agrupada por estado_civil.
SELECT estado_civil, AVG(ingresos_anuales) AS media_ingresos
FROM personas
GROUP BY estado_civil;
-- 9  Dime los abuelos de la persona con id 1144
SELECT DISTINCT CONCAT(p.nombre, ' ', p.apellido) AS abuelo_abuela
FROM personas p
JOIN personas padre_madre ON p.id = padre_madre.madre OR p.id = padre_madre.padre
JOIN personas persona ON padre_madre.id = persona.madre OR padre_madre.id = persona.padre
WHERE persona.id = 1144;
-- 10 Dime los nietos de la persona con id 1093
SELECT DISTINCT CONCAT(p.nombre, ' ', p.apellido) AS nieto_nieta
FROM personas p
JOIN personas padre_madre ON p.madre = padre_madre.id OR p.padre = padre_madre.id
WHERE padre_madre.madre = 1093 OR padre_madre.padre = 1093;

-- 11 Dime la media de numero de hijos por mujer.
SELECT AVG(num_hijos) AS media_hijos_mujeres
FROM personas
WHERE sexo = 'M';

-- 12 Dime los 5 granadinos (provincia) que más cobran ordenados por la longitud en letras de su ocupacion. 
SELECT *
FROM personas
WHERE provincia = 'Granada'
ORDER BY ingresos_anuales DESC, CHAR_LENGTH(ocupacion) DESC
LIMIT 5;

-- 13 Dime la provincia con menos ingresos anuales de media.
SELECT provincia, SUM(ingresos_anuales) AS total_ingresos
FROM personas
GROUP BY provincia
ORDER BY total_ingresos DESC
LIMIT 1;
-- 14 Dime la provincia que tiene a los jubilados con menores ingresos anuales de media.
SELECT provincia, SUM(ingresos_anuales) AS total_ingresos
FROM personas
WHERE ocupacion = "Jubilado"
GROUP BY provincia
ORDER BY total_ingresos DESC
LIMIT 1;
-- 15 Dime el municipio con mas ingresos anuales sin contar a las personas que no cobran nada.
SELECT municipio, SUM(ingresos_anuales) AS total_ingresos
FROM personas
WHERE ingresos_anuales > 0
GROUP BY municipio
ORDER BY total_ingresos DESC
LIMIT 1;

-- 16 dime la media de edad de las personas con algun hijo con nombre empezando por la L.
SELECT AVG(TIMESTAMPDIFF(YEAR, fecha_nacimiento, CURDATE())) AS edad_media
FROM personas
WHERE id IN (
    SELECT DISTINCT padre
    FROM personas
    WHERE nombre LIKE 'L%' AND padre IS NOT NULL
);

-- 17 Dime la edad media de las personas que sean hermanas (de padre o de madre) de las personas de Málaga municipio.
SELECT AVG(TIMESTAMPDIFF(YEAR, fecha_nacimiento, CURDATE())) AS edad_media
FROM personas
WHERE (madre IN (SELECT madre FROM personas WHERE municipio='Málaga') 
       OR padre IN (SELECT padre FROM personas WHERE municipio='Málaga'))
  AND id NOT IN (SELECT id FROM personas WHERE municipio='Málaga');

-- 18 Dime la media de salarios anuales agrupados por el dia del mes en el que nacieron.
SELECT DAY(fecha_nacimiento) AS dia_mes, AVG(ingresos_anuales) AS media_ingresos
FROM personas
GROUP BY DAY(fecha_nacimiento)
ORDER BY dia_mes;

-- 19 Muestra la fecha de nacimiento en dia, mes y año de los jubilados que viven en Córdoba.
SELECT DAY(fecha_nacimiento) AS dia,
       MONTH(fecha_nacimiento) AS mes,
       YEAR(fecha_nacimiento) AS año
FROM personas
WHERE ocupacion='Jubilado' AND provincia='Córdoba';

-- 20 Muestra la cantidad de personas que nacieron en cada década del siglo XX.
SELECT CONCAT(FLOOR(YEAR(fecha_nacimiento)/10)*10, 's') AS decada,
       COUNT(*) AS num_personas
FROM personas
WHERE YEAR(fecha_nacimiento) BETWEEN 1900 AND 1999
GROUP BY decada;

-- 21. Muestra las 3 provincias con más edad media entre las personas casadas.
SELECT provincia, AVG(TIMESTAMPDIFF(YEAR, fecha_nacimiento, CURDATE())) AS edad_media
FROM personas
WHERE estado_civil='Casado'
GROUP BY provincia
ORDER BY edad_media DESC
LIMIT 3;

-- 22. Muestra el municipio (o municipios) con más personas paradas.
SELECT municipio, COUNT(*) AS num_parados
FROM personas
WHERE situacion_laboral='Parado'
GROUP BY municipio
ORDER BY num_parados DESC
LIMIT 1;

-- 23. Muestra cada municipio junto con el valor máximo de ingresos_anuales de entre las personas que son padres.
SELECT municipio, MAX(ingresos_anuales) AS max_ingresos_padres
FROM personas
WHERE id IN (SELECT DISTINCT padre FROM personas WHERE padre IS NOT NULL
UNION
+
+633+.
+++
...................................................................SELECT DISTINCT madre FROM personas WHERE madre IS NOT NULL)
GROUP BY municipio;
