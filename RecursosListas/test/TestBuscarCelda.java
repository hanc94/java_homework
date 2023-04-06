package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.MaquinaDulces;

public class TestBuscarCelda {

	public static void main(String[] args) {

		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		
		Celda celda=maquina.buscarCelda("C");
		if(celda!=null){
			System.out.println("Celda encontrada:"+celda.getCodigo());
		}else{
			System.out.println("No existe la celda buscada");
		}
		
		celda=maquina.buscarCelda("G");
		if(celda!=null){
			System.out.println("Celda encontrada:"+celda.getCodigo());
		}else{
			System.out.println("No existe la celda buscada");
		}
	}

}
