package com.cmc.colecciones;

import com.cmc.entidades.Contacto;

import java.util.ArrayList;

public class DirectorioLista extends Directorio{
    ArrayList<Contacto>contactos=new ArrayList<>();

    public void agregarContacto(Contacto cont){
        for (Contacto contacto : contactos) {
            if (cont.getCedula().equals(contacto.getCedula())) {
                //super.agregarContacto(cont);
                return;
            }
        }
        contactos.add(cont);
    }
    public Contacto buscarContacto(String cedula){
        for (Contacto contacto : contactos) {
            if (cedula.equals(contacto.getCedula())) {
                return contacto;
            }
        }
        return null;
    }
    public Contacto eliminarContacto(String cedula){
        for (Contacto contacto : contactos) {
            if (cedula.equals(contacto.getCedula())) {
                contactos.remove(contacto);
                return contacto;
            }
        }
        return null;
    }
    public void imprimir(){
        System.out.println(contactos);
    }

    @Override
    public String toString() {
        return "DirectorioLista{" +
                "contactos=" + contactos +
                '}';
    }
}
