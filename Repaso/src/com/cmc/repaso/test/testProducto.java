package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class testProducto {
    public static void main(String[] args) {
        Producto metro = new Producto("metro", 1000);

        metro.imprimir();

        double precioPromo = metro.calcularPrecioPromo(10);

        System.out.println(precioPromo);

        metro.setPrecio(1200);
        metro.imprimir();
        precioPromo = metro.calcularPrecioPromo(10);
        System.out.println(precioPromo);
    }

}
