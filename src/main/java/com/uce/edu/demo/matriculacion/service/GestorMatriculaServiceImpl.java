package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.repository.IMatriculaJpaRepository;
import com.uce.edu.demo.matriculacion.repository.IPropietarioJpaRepository;
import com.uce.edu.demo.matriculacion.repository.IVehiculoJpaRepository;
import com.uce.edu.demo.matriculacion.repository.modelo.Matricula;
import com.uce.edu.demo.matriculacion.repository.modelo.Propietario;
import com.uce.edu.demo.matriculacion.repository.modelo.Vehiculo;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService {

	@Autowired
	private IVehiculoJpaRepository iVehiculoJpaRepository;

	@Autowired
	@Qualifier("liviano")
	private IVehiculoJpaService iVehiculoServiceLiviano;

	@Autowired
	@Qualifier("pesado")
	private IVehiculoJpaService iVehiculoServicePesado;

	@Autowired
	private IMatriculaJpaRepository iMatriculaRepository;

	@Autowired
	private IPropietarioJpaRepository iPropietarioJpaRepository;

	@Override
	public BigDecimal valorMatricula(Vehiculo v) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula = null;
		BigDecimal descuento = new BigDecimal(7).divide(new BigDecimal(100));

		if (v.getTipo().equals("L")) {
			// Liviano
			valorMatricula = this.iVehiculoServiceLiviano.calcularValor(v.getPrecio());
		} else {
			// Pesado
			valorMatricula = this.iVehiculoServicePesado.calcularValor(v.getPrecio());
		}

		if (valorMatricula.compareTo(new BigDecimal(2000)) == 1) {

			valorMatricula = valorMatricula.subtract(valorMatricula.multiply(descuento));
		}

		return valorMatricula;
	}

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Vehiculo v = this.iVehiculoJpaRepository.buscarPorPlaca(placa);

		Propietario p = this.iPropietarioJpaRepository.buscarPorCedula(cedula);

		Matricula m = new Matricula();
		m.setFechaMatricula(LocalDate.now());
		m.setValorMatricula(this.iVehiculoServiceLiviano.calcularValor(v.getPrecio()));
		m.setPropietario(p);
		m.setVehiculo(v);
		this.iMatriculaRepository.insertar(m);

	}

}
