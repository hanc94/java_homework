package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

import java.util.ArrayList;

public class MaquinaDulces {
    private ArrayList<Celda>celdas=new ArrayList<Celda>();
    private double saldo;

    public void agregarCelda(String codCelda){
            Celda c = new Celda(codCelda);
            celdas.add(c);
    }

    public void mostrarConfiguracion(){
        for (Celda celda : celdas) {
            System.out.println("Celda:" + celda.getCodigo());
        }
    }
    public Celda buscarCelda(String cod) {
        try {
            for (Celda celda : celdas) {
                if (cod.equals(celda.getCodigo())) {
                    return celda;
                }
            }
            return null;
        }catch (NullPointerException exception){
            return null;
        }
    }
    public void cargarProducto(Producto p,String cod,int stock){
        Celda celdaRecuperada = buscarCelda(cod);
        celdaRecuperada.ingresarProducto(p, stock);
    }
    public void mostrarProductos(){
        for(Celda celda:celdas){
            if(celda.getStock() !=0) {
                System.out.println("Celda:" + celda.getCodigo() +
                        " Stock:" + celda.getStock() + " Producto" +
                        celda.getProducto().getCodigo() + " Precio" +
                        celda.getProducto().getPrecio());
            }else{
                System.out.println("Celda:" + celda.getCodigo() +
                        " Stock:" + celda.getStock() + " Producto no asignado");
            }
        }
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

        return null;

    }/*
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
    }*/
}
