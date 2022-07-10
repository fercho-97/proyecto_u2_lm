package com.uce.edu.demo.matriculacion.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

//@Entity
//@Table(name = "matricula")
public class Matricula {

	// @Column(name = "matri_fecha")
	private LocalDate fechaMatricula;

	// @Column(name = "matri_valor")
	private BigDecimal valorMatricula;

	// @Column(name = "matri_propietario")
	private Propietario p;

	// @Column(name = "matri_vehiculo")
	private Vehiculo v;

	@Override
	public String toString() {
		return "Matricula [fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula + ", p=" + p
				+ ", v=" + v + "]";
	}

	// SET Y GET
	public LocalDate getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDate fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	public Propietario getP() {
		return p;
	}

	public void setP(Propietario p) {
		this.p = p;
	}

	public Vehiculo getV() {
		return v;
	}

	public void setV(Vehiculo v) {
		this.v = v;
	}

}
