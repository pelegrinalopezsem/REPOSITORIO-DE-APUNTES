**Ejemplo de DTD**
<!ELEMENT tienda (nombre,pokemon+)>
<!ELEMENT nombre (#PCDATA)>
<!ELEMENT pokemon (nombre, tipo+, precio)>
<!ELEMENT tipo (#PCDATA)>
<!ELEMENT precio (#PCDATA)>

**Tipos de ocurrencias**
+ indica que el elemento debe aparecer al menos una vez.
* indica que el elemento puede aparecer cero o más veces.
? indica que el elemento es opcional y puede aparecer una o ninguna vez.

# 🧩 3. XML Schema Definition (XSD)

## 3.1. Introducción a XSD
**XSD (XML Schema Definition)** es un lenguaje usado para definir la **estructura, contenido y restricciones** de un documento XML.

### 🔹 Ventajas de XSD sobre DTD
- **Escrito en XML** → totalmente compatible y más legible.  
- **Soporta tipos de datos avanzados** (números, fechas, booleanos, etc.).  
- **Extensible** → permite crear tipos personalizados y usar *namespaces*.  
- **Validación precisa** → permite restringir longitud, patrones, rangos y ocurrencias.  
- **Interoperable** → facilita el intercambio de datos entre sistemas.

---

## 3.2. Sintaxis de XSD

### 📄 Estructura básica
```xml
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="persona">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="nombre" type="xs:string"/>
        <xs:element name="edad" type="xs:integer"/>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
</xs:schema>
