package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import com.uce.edu.demo.matriculacion.repository.modelo.Vehiculo;

public interface IVehiculoJpaService {

	public void insertar(Vehiculo v);

	public Vehiculo buscarPorPalca(String placa);

	public void actualizar(Vehiculo v);

	public void borrarPorPlaca(String placa);
	
	public BigDecimal calcularValor(BigDecimal precio);
	
}
