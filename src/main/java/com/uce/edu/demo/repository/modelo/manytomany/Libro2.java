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
@Table(name = "libro2")
public class Libro2 {

	@Id
	@Column(name = "libr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr2_id_seq")
	@SequenceGenerator(name = "libr2_id_seq", sequenceName = "libr2_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "libr_titulo")
	private String titulo;

	@Column(name = "libr_cantidad_paginas")
	private Integer cantidadPaginas;

	@OneToMany(mappedBy = "libro2")
	private List<Libro2Autor2> libro2Autor2s;

	@Override
	public String toString() {
		return "Libro2 [id=" + id + ", titulo=" + titulo + ", cantidadPaginas=" + cantidadPaginas + ", libro2Autor2s="
				+ libro2Autor2s + "]";
	}

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(Integer cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public List<Libro2Autor2> getLibro2Autor2s() {
		return libro2Autor2s;
	}

	public void setLibro2Autor2s(List<Libro2Autor2> libro2Autor2s) {
		this.libro2Autor2s = libro2Autor2s;
	}

}
