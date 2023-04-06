package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {
    public static void main(String[] args) {
        Telefono t1=new Telefono(20,"claro","3141414");
        Telefono t2=new Telefono(20,"wow","3141414");
        Contacto c1=new Contacto("julia","pinzon",t1,45);
        Contacto c2=new Contacto("juana","la loca",t2,54);
        AdminContactos ac = new AdminContactos();

        System.out.println(ac.buscarMasPesado(c1,c2).getApellido());

        System.out.println(ac.compararOperadoras(c1,c2));

    }
}
