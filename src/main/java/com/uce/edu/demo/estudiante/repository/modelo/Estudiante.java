package com.uce.edu.demo.estudiante.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@NamedQuery(name = "Estudiante.buscarPorNombreApellido", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.apellido = :datoApellido ORDER BY e.semestre ASC, e.categoria DESC ")
@NamedQuery(name = "Estudiante.buscarPorNombreCategoria", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.categoria = :datoCategoria ORDER BY e.semestre ASC")
@NamedQuery(name = "Estudiante.buscarPorNombreApellidoSemestre", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.apellido = :datoApellido AND e.semestre = :datoSemestre")
@NamedQuery(name = "Estudiante.buscarPorApellidoOrCategoria", query = "SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido OR e.categoria = :datoCategoria")

public class Estudiante {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_id_seq")
	@SequenceGenerator(name = "estu_id_seq", sequenceName = "estu_id_seq", allocationSize = 1)
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "semestre")
	private String semestre;

	@Column(name = "categoria")
	private String categoria;

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", semestre=" + semestre
				+ ", categoria=" + categoria + "]";
	}

	// SET Y GET
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
