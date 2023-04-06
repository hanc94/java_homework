package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto {
    public static void main(String[] args) {
        Telefono tel = new Telefono(20,"claro","2131294214");
        Contacto c = new Contacto("elias","guzman",tel,67);
        c.imprimir();
    }
}
