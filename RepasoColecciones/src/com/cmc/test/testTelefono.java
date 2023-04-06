package com.cmc.test;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class testTelefono {
    public static void main(String[] args) {
        Telefono tel = new Telefono("claro","3146657987");
        Telefono tel1 = new Telefono("tigo","3146657987");
        Contacto cont = new Contacto("1018467383","andres","pelaez");
        cont.agregarTelefono(tel);
        cont.agregarTelefono(tel1);
        System.out.println(cont);
    }
}
