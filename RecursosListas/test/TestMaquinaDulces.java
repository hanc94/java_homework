package com.clearminds.test;

import com.clearminds.componentes.MaquinaDulces;

public class TestMaquinaDulces {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		
		maquina.mostrarConfiguracion();
	}
}
