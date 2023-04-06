package com.cmc.repaso.entidades;

public class Item {
    String nombre;
    int productosActuales;
    int productosDevueltos;
    int productosVendidos;

    public void imprimir(){
        System.out.println(nombre+":\n"+productosActuales+"\n"+
                productosDevueltos+"\n"+productosVendidos);
    }

    public void vender(int productosVendidos){
        productosActuales = productosActuales-productosVendidos;
        this.productosVendidos = productosVendidos+ this.productosVendidos;
    }
    public void devolver(int productosVendidos){
        this.productosVendidos = this.productosVendidos-productosVendidos;
        productosActuales = productosActuales + productosVendidos;
        productosDevueltos = productosDevueltos+productosVendidos;
    }
    public void setProductosActuales(int productosActuales){
        this.productosActuales = productosActuales;
    }
}
