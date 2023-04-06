package com.cmc.repaso.entidades;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre,double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        if (precio<0){
            this.precio = -1;
        }
        this.precio = precio;
    }
    public double calcularPrecioPromo(double porcentaje){

        return -precio*porcentaje/100+precio;
    }
    public void imprimir(){
        System.out.println("el producto "+nombre+
                " tiene el precio "+precio);
    }
}
