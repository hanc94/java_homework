package com.javajob.test;
import com.javajob.conceptos.*;
public class TestAuto {
    public static void main(String[] args) {

        Auto a1;//declaro variable a1 tipo com.javajob.conceptos.Auto
        a1= new Auto();//crea objeto en memoria

        System.out.println(a1.getMarca());//creo el objeto tipo com.javajob.conceptos.Auto y lo referencio en a1
        a1.setAnio(1900);
        a1.setMarca("viejitos");
        a1.setPrecio(100);
        System.out.println(a1.getMarca());
        System.out.println(a1.getAnio());
        System.out.println(a1.getPrecio());

        Auto a2;//declaro variable a1 tipo com.javajob.conceptos.Auto
        a2= new Auto();//crea objeto en memoria
        a2.setMarca("Tesla");//creo el objeto tipo com.javajob.conceptos.Auto y lo referencio en a1
        a2.setAnio(2020);
        a2.setPrecio(1000000);
        System.out.println(a2.getMarca());
        System.out.println(a2.getAnio());
        System.out.println(a2.getPrecio());

        Calculadora cal = new Calculadora();
        double [] res = new double[4];
        res[0] = cal.sumar(1,1);
        res[1] = cal.multiplicar(1,10);
        res[2] = cal.restar(1,1);//donde res=a-b
        res[3] = cal.dividir(20,10);// donde res = a/b
        cal.imprimir(res);
    }
}
