package com.cmc.entidades;

public class Telefono {
    private String operadora;
    private String numero;
    public Telefono(String operadora,String numero){
        this.operadora = operadora;
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "operadora='" + operadora + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
