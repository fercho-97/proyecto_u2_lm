package com.uce.edu.demo.estudiante.repository.modelo;

import java.io.Serializable;

public class EstudianteSencillo implements Serializable{

	private static final long serialVersionUID =1L;
	private String nombre;
	private String apellido;
	private String semestre;
	

	public EstudianteSencillo() {

	}

	public EstudianteSencillo(String nombre, String apellido, String semestre) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.semestre = semestre;
	}

	@Override
	public String toString() {
		return "EstudianteSencillo [nombre=" + nombre + ", apellido=" + apellido + ", semestre=" + semestre + "]";
	}

	// SET Y GET
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

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

}
