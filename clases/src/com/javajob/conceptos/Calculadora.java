package com.javajob.conceptos;

public class Calculadora {
    public double sumar(double a, double b) {
        return a + b;
    }
    public double restar(double a, double b) {
        return a - b;
    }
    public double multiplicar(double a,double b){
        return a*b;
    }
    public double dividir(double a,double b){
        return a/b;
    }
    public void imprimir(double []r ){
        for(int i = 0;i<r.length-1;i++){
            System.out.println(r[i]);
        }

    }
}