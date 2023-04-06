package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
    private Celda celda1;
    private Celda celda2;
    private Celda celda3;
    private Celda celda4;
    private double saldo=0;

    public void configurarMaquina(String cod1,String cod2,String cod3,String cod4){
        try {
            celda1 = new Celda(cod1);
            celda2 = new Celda(cod2);
            celda3 = new Celda(cod3);
            celda4 = new Celda(cod4);
        }catch (NullPointerException e){
            System.out.println("celda nula");
        }
    }
    public void mostrarConfiguracion(){
        try {
            System.out.println("CELDA 1:"+celda1.getCodigo()+"\n"+
                    "CELDA 2:"+celda2.getCodigo()+"\n"+
                    "CELDA 3:"+celda3.getCodigo() + "\n" +
                    "CELDA 4:"+celda4.getCodigo() + "\n");

        }catch (NullPointerException e){
            System.out.println("producto nulo");
        }
    }
    public Celda buscarCelda(String cod) {
        try{
            if (cod.equals(celda1.getCodigo())) {
                return celda1;
            }
        }catch (NullPointerException ignore){
            }
        try {
            if (cod.equals(celda2.getCodigo())) {
                return celda2;
            }
        }catch (NullPointerException ignore){
            }
        try{
            if (cod.equals(celda3.getCodigo())) {
                return celda3;
            }
        }catch (NullPointerException ignore){
        }try{
            if (cod.equals(celda4.getCodigo())) {
            return celda4;
            }
        }catch (NullPointerException ignore){
    }
            return null;
    }
    public void cargarProducto(Producto p,String cod,int stock){
        Celda celdaRecuperada = buscarCelda(cod);
        celdaRecuperada.ingresarProducto(p, stock);
    }
    public void mostrarProductos(){
        System.out.println("***********CELDA "+celda1.getCodigo()+
                "\n\tStock:"+celda1.getStock());
        try {
            System.out.println("\tNombre Producto:"+celda1.getProducto().getNombre()+
                    "\n\tPrecio Producto:"+celda1.getProducto().getPrecio()+
                    "\n\tCódigo Producto:"+celda1.getProducto().getCodigo());
        }catch (NullPointerException e){
            System.out.println("\tLa celda no tiene producto!!!");
        }

        System.out.println("***********CELDA "+celda2.getCodigo()+
                "\n\tStock:"+celda2.getStock());
        try {
            System.out.println("Nombre Producto:"+
                    celda2.getProducto().getNombre()+
                    "\n\tPrecio Producto:"+celda2.getProducto().getPrecio()+
                    "\n\tCódigo Producto:"+celda2.getProducto().getCodigo());
        }catch (NullPointerException e){
            System.out.println("\tLa celda no tiene producto!!!");
        }
        System.out.println("***********CELDA "+celda3.getCodigo()+
                "\n\tStock:"+celda3.getStock());
        try {
            System.out.println("\tNombre Producto:"+
                    celda3.getProducto().getNombre()+
                    "\n\tPrecio Producto:"+celda3.getProducto().getPrecio()+
                    "\n\tCódigo Producto:"+celda3.getProducto().getCodigo());
        }catch (NullPointerException e){
            System.out.println("\tLa celda no tiene producto!!!");
        }
        System.out.println("***********CELDA "+celda4.getCodigo()+
                "\n\tStock:"+celda4.getStock());
        try {
            System.out.println("\tNombre Producto:"+
                    celda4.getProducto().getNombre()+
                    "\n\tPrecio Producto:"+celda4.getProducto().getPrecio()+
                    "\n\tCódigo Producto:"+celda4.getProducto().getCodigo());
        }catch (NullPointerException e){
            System.out.println("\tLa celda no tiene producto!!!");
        }
            System.out.println("Saldo: "+saldo);
    }
    public Producto buscarProductoEnCelda(String cod){

        try {
            Celda celdarecuperada = buscarCelda(cod);
            if (celdarecuperada != null) {
                return celdarecuperada.getProducto();
            }
            return null;
        }catch (NullPointerException e){
            return null;
        }
    }
    public double consultarPrecio(String cod){
            Celda celdarecuperada = buscarCelda(cod);
            return celdarecuperada.getProducto().getPrecio();
    }
    public Celda buscarCeldaProducto(String cod) {
        try{
            if (cod.equals(celda1.getProducto().getCodigo())) {
                return celda1;
            }
        }catch (NullPointerException ignore){
        }
        try {
            if (cod.equals(celda2.getProducto().getCodigo())) {
                return celda2;
            }
        }catch (NullPointerException ignore){
        }
        try{
            if (cod.equals(celda3.getProducto().getCodigo())) {
                return celda3;
            }
        }catch (NullPointerException ignore){
        }try{
            if (cod.equals(celda4.getProducto().getCodigo())) {
                return celda4;
            }
        }catch (NullPointerException ignore){
        }
        return null;

    }
    public void incrementarProductos(String cod,int stockPlus){
        Celda celdaEncontrada = buscarCeldaProducto(cod);
        celdaEncontrada.setStock(celdaEncontrada.getStock()+stockPlus);
    }
    public void vender(String cod){
        Celda celdaRecuperda = buscarCelda(cod);
        celdaRecuperda.setStock(celdaRecuperda.getStock()-1);
        saldo = saldo + celdaRecuperda.getProducto().getPrecio();
        //mostrarProductos();
    }
    public double venderConCambio(String cod,double saldo){
        Celda celdaRecuperada =buscarCelda(cod);
        double cambio = saldo - celdaRecuperada.getProducto().getPrecio();
        mostrarProductos();
        celdaRecuperada.setStock(celdaRecuperada.getStock()-1);
        this.saldo = this.saldo + celdaRecuperada.getProducto().getPrecio();
        return cambio;
    }
}
