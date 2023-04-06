package com.cmc.entidades;

import java.util.ArrayList;

public class Contacto {
    private String cedula;
    private String nombre;
    private String apellido;
    private ArrayList<Telefono>telefonos=new ArrayList<Telefono>();
    //Constructores
    public Contacto(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //get's and set's
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Sobrecarga función toString
    @Override
    public String toString() {
        return "Contacto{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefonos=" + telefonos +
                '}';
    }

    //Agrega los telefonos al lista arreglo.
    public void agregarTelefono(Telefono telefono){
        telefonos.add(telefono);
    }

}
