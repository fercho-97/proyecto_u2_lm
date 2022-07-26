package com.uce.edu.demo.repository.modelo.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "autor2")
public class Autor2 {

	@Id
	@Column(name = "autr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autr2_id_seq")
	@SequenceGenerator(name = "autr2_id_seq", sequenceName = "autr2_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "autr_nombre")
	private String nombre;

	@OneToMany(mappedBy = "autor2")
	private List<Libro2Autor2> libro2Autor2s;

	@Override
	public String toString() {
		return "Autor2 [id=" + id + ", nombre=" + nombre + ", libro2Autor2s=" + libro2Autor2s + "]";
	}

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Libro2Autor2> getLibro2Autor2s() {
		return libro2Autor2s;
	}

	public void setLibro2Autor2s(List<Libro2Autor2> libro2Autor2s) {
		this.libro2Autor2s = libro2Autor2s;
	}

	

}
