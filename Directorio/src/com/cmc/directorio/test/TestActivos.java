package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
    public static void main(String[] args) {
        Telefono t1 = new Telefono(20,"claro","3141414");
        Contacto c1 = new Contacto("chan","andres",t1,55);
        c1.imprimir();
        AdminContactos ac=new AdminContactos();
        ac.activarUsuario(c1);
        c1.imprimir();
    }
}
