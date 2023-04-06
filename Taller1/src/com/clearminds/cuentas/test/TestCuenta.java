package com.clearminds.cuentas.test;

import com.clearminds.cuentas.Cuenta;

public class TestCuenta {
    public static void main(String[] args) {
    //creo el objeto Cuenta y lo referencio cuenta 1

        Cuenta cuenta1 = new Cuenta("03476");

        //coloco valor del saldo en la cuenta1

        cuenta1.setSaldo(675);

        //Creo objeto cuenta y lo referencio con cuenta2

        Cuenta cuenta2 = new Cuenta("03476","C",98);

        Cuenta cuenta3 = new Cuenta("03476");

        cuenta3.setTipo('C');


        System.out.println("------Valores Iniciales-------");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        System.out.println("-------VaLores modificados-------");
        cuenta1.setSaldo(444);
        cuenta3.setSaldo(567);
        cuenta2.setTipo("D");

        cuenta1.imprimirMiEstilo();
        cuenta2.imprimirMiEstilo();
        cuenta3.imprimirMiEstilo();


        Cuenta cuenta4 = new Cuenta("0001");

        cuenta4.setTipo('A');
        cuenta4.setSaldo(10);

        Cuenta cuenta5 = new Cuenta("0557",'C',10);

        Cuenta cuenta6 = new Cuenta("0666",'A',0);

        cuenta4.imprimirMiEstilo();
        cuenta5.imprimirMiEstilo();
        cuenta6.imprimirMiEstilo();
    }
}
