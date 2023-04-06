package com.clearminds.test;

import com.clearminds.componentes.MaquinaDulces;
import com.clearminds.componentes.Producto;

public class TestIncrementarProductos {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B", 4);
		
		maquina.cargarProducto(new Producto("BDCR", "Gatorade", 2.54),"D",5);
		maquina.mostrarProductos();
		System.out.println("------------Luego de incrementar---------");
		
		maquina.incrementarProductos("KE34", 6);
		
		maquina.mostrarProductos();
	}
}
