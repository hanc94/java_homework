package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {
    public static void main(String[] args) {
        Telefono tel = new Telefono(20,"movi","098234234");
        AdminTelefono at =new AdminTelefono();
        at.activarMensajeria(tel);
        tel.imprimir();
    }
}
