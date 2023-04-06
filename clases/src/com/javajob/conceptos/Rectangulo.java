package com.javajob.conceptos;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base,int altura){
        this.base = base;
        this.altura = altura;
    }
    public int calcularPerimetro(){
        return ((base*2)+(altura*2));
    }
    public int calcularArea(){
        return (base*altura);
    }
}
