package com.clearminds.componentes;

public class Celda {
    private Producto p;
    private int stock;
    private String codigo;

    public void ingresarProducto(Producto p,int stock){
        this.p=p;
        this.stock = stock;
    }
    public Celda(String codigo){
        this.codigo = codigo;
    }

    public Producto getProducto() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCodigo() {
        try {
            return codigo;
        }catch (NullPointerException e){
            return null;
        }
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
