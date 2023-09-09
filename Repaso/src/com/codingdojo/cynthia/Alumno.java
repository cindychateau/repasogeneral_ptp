package com.codingdojo.cynthia;

public class Alumno {
	
	/*Variables miembro: caracterísiticas o atributos del objetos*/
	private Long id;
	private String nombre;
	private String apellido;
	private String curso;
	
	/*Variable estática: Pertenece a la clase NO al objeto*/
	public static int cantidadAlumnos = 0;
	
	/*Constructor: inicializar el objeto*/
	public Alumno() {
		cantidadAlumnos++;
	}
	
	/*Sobre cargara de constructores*/
	public Alumno (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		cantidadAlumnos++;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
