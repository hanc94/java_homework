package com.javajob.conceptos;

public class Auto {
    private String marca;
    private double precio;
    private int anio;
    public Auto(){
    }
    public Auto(String marca,double precio, int anio){
        this.marca = marca;
        this.precio = precio;
        this.anio = anio;
    }


    public String getMarca(){
        return marca;
    }

    public int getAnio(){
        return anio;
    }
    public double getPrecio(){
        return precio;
    }

    public void setMarca(String marca){
     this.marca=marca;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setAnio(int anio){
        this.anio=anio;
    }


}
