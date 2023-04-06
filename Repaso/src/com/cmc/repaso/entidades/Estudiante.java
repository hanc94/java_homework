package com.cmc.repaso.entidades;

public class Estudiante {
    String nombre;
    double nota;
    String resultado;

    public Estudiante(String nombre){
        this.nombre = nombre;
    }
    public void calificar(double nota){
        if(nota <8){
            resultado = "F";
        }else if (nota >= 8 ){
            resultado = "A";
        }
        this.nota = nota;
    }
    public void imprimir(){
        System.out.println("El estudiante "+nombre+" tiene"+
                " una calificación de "+nota+
                ", tiene una "+resultado);
    }
}
