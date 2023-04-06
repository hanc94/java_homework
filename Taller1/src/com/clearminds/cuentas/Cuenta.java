package com.clearminds.cuentas;

public class Cuenta {

    private String Id;
    private String Tipo ="A";
    private double Saldo= 0.0;

    public Cuenta(String Id) {
        this.Id = Id;
        Tipo = "A";
    }
    public Cuenta(String Id,String Tipo, double Saldo ){
        this.Id = Id;
        this.Saldo = Saldo;
        this.Tipo = Tipo;
    }
    public Cuenta(String Id,char Tipo, double Saldo ){
        this.Id = Id;
        this.Saldo = Saldo;
        this.Tipo = String.valueOf(Tipo);
    }
    public String getId(){
       return Id;
    }

    public String getTipo(){
        return Tipo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }
    public void setTipo(char tipo) {
        this.Tipo = String.valueOf(tipo);
    }
    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public void imprimir(){
        String  cuenta= "**********\n" +
                "CUENTA\n"+
                "**********\n" +
                "Número de Cuenta: "+this.Id+"\n"+
                "Tipo: "+this.Tipo+"\n"+
                "Saldo: USD"+this.Saldo+"\n"+
                "**********\n";
        System.out.println(cuenta);
    }

    public void imprimirMiEstilo(){
        String  cuenta= "-------------\n" +
                "CUENTA\n"+
                "-------------\n" +
                "Número de Cuenta: "+this.Id+"\n"+
                "Tipo: "+this.Tipo+"\n"+
                "Saldo: USD"+this.Saldo+"\n"+
                "-------------\n";
        System.out.println(cuenta);
    }
}
