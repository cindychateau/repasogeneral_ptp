package com.codingdojo.cynthia;

public class RepasoApplication {

	public static void main(String[] args) {
		
		Metodos met = new Metodos();
		met.saludar();
		
		int suma = met.sumatoria(15, 10); //suma = 25
		System.out.println(suma);
		
		
		Alumno juana = new Alumno(); //Todavia nosé su nombre
		Alumno pedro = new Alumno("Pedro", "Paramo");
		
		juana.setNombre("Juana");
		juana.setApellido("De Arco");
		
		System.out.println(pedro.getApellido());
		
		System.out.println(Alumno.cantidadAlumnos);
		
	}

}
