package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class testEstudiante {

    public static void main(String[] args) {
        Estudiante edwin= new Estudiante("edwin");

        edwin.calificar(6);
        edwin.imprimir();
    }

}
