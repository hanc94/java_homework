package com.cmc.flujo;

public class Validador {
    public void validarEdad(int edad){
        if(edad>18){
            System.out.println("Es mayor de edad");
        }
        else if(edad<18){
            System.out.println("Es menor de edad");
        }else{
            System.out.println("");
        }
    }
}
