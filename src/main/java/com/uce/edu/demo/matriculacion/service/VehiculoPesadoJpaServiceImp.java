package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.repository.IVehiculoJpaRepository;
import com.uce.edu.demo.matriculacion.repository.modelo.Vehiculo;

@Service
@Qualifier("pesado")
public class VehiculoPesadoJpaServiceImp implements IVehiculoJpaService {

	@Autowired
	private IVehiculoJpaRepository iVehiculoJpaRepository;

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoJpaRepository.insertar(v);
	}

	@Override
	public Vehiculo buscarPorPalca(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoJpaRepository.buscarPorPlaca(placa);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoJpaRepository.actualizar(v);
	}

	@Override
	public void borrarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoJpaRepository.buscarPorPlaca(placa);
	}

	@Override
	public BigDecimal calcularValor(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula = precio.multiply(new BigDecimal(0.12));

		return valorMatricula;
	}

}
