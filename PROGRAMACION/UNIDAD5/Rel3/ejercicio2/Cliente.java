package PROGRAMACION.UNIDAD5.Rel3.ejercicio2;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nombre;
    private String dni;
    private String telefono;
    private String email;
    private String direccion;
    ArrayList<String> dnis = new ArrayList<>();

    public Cliente(int id, String nombre, String dni, String telefono, String email, String direccion) {
        setId(id);
        this.nombre = nombre;
        setDni(dni);
        setDireccion(direccion);
        setEmail(email);
        this.direccion = direccion;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        dnis.add(dni);
        if (!dnis.contains(dni) && !dni.isEmpty()) {
            this.dni = dni;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() == 9) {
            this.telefono = telefono;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente [getId()=" + getId() + ", getNombre()=" + getNombre() + ", getDni()=" + getDni()
                + ", getTelefono()=" + getTelefono() + ", getEmail()=" + getEmail() + ", getDireccion()="
                + getDireccion() + "]";
    }

    
}


