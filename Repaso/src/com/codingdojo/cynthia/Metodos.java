package com.codingdojo.cynthia;

public class Metodos {
	
	/*
	 * public, private protected -> permiso que tenemos
	 * static -> que es de la clase y NO de un objeto
	 * Valor de retorno -> lo que regresamos al llamar al método (String, List, int, void)
	 * nombre del método
	 * (parámetros a recibir)
	 */
	public void saludar() {
		System.out.println("¡Hola Mundo!");
	}
	
	//num1 = 15, num2 = 10
	public int sumatoria(int num1, int num2) {
		return num1+num2;
	}
	
	//Sobrecarga: tener más de 1 método con el msmo nombre, pero con comportamientos distintos
	//por que recibimos diferentes parámetros
	public int sumatoria(int num1, int num2, int num3) {
		System.out.print("Suma 2:"+ num1+num2);
		return num1+num2+num3;
	}
	
	
}
