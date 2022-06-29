package com.uce.edu.demo.estudiante.to;

public class EstudianteTo {

	private int id;
	private String nombre;
	private String apellido;
	private String semestre;
	private String categoria;

	// Constructor
	public EstudianteTo() {

	}

	public EstudianteTo(int id, String nombre, String apellido, String semestre, String categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.semestre = semestre;
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", semestre=" + semestre
				+ ", categoria=" + categoria + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
