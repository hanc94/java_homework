package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {
    public static void main(String[] args) {
        Telefono[] tel = new Telefono[4];
        tel[0] = new Telefono(20,"movi","310012");
        tel[1] = new Telefono(20,"claro","310012");
        tel[2] = new Telefono(20,"claro","310012");
        tel[3] = new Telefono(20,"claro","310012");
        AdminTelefono at = new AdminTelefono();
        int nClaro = at.contarClaro(tel);
        System.out.println(nClaro);
    }
}
