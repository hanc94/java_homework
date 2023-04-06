package com.cmc.test;

import com.cmc.colecciones.Directorio;
import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestDirectorio {
    public static void main(String[] args) {
        Telefono telefono =new Telefono("claro","3146657987");
        Telefono telefono1 =new Telefono("tigo","3146657987");
        Contacto contacto1 = new Contacto("1039401","el loco","maximiliano");
        Contacto contacto2 = new Contacto("103123401","la  ñangara","cdb");
        Directorio direc = new Directorio();

        direc.agregarContacto(contacto1);
        direc.agregarContacto(contacto2);
        Contacto buscarContacto=direc.buscarContacto("1039401");
        System.out.println(buscarContacto);
        direc.eliminarContacto("1039401");
        direc.imprimir();
    }
}
