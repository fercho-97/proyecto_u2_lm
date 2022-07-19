package com.uce.edu.demo.estudiante.repository.modelo;

import java.io.Serializable;

public class EstudianteContadorCondicion implements Serializable {

	private static final long serialVersionUID = 1L;

	private String semestre;
	private Long numero;
	

	public EstudianteContadorCondicion() {

	}

	public EstudianteContadorCondicion(String semestre, Long numero) {
		super();
		this.semestre = semestre;
		this.numero = numero;
		
	}

	@Override
	public String toString() {
		return "EstudianteContadorCondicion [semestre=" + semestre + ", numero=" + numero + "]";
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	

}
