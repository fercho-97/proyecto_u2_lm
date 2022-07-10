package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.repository.modelo.Vehiculo;

public interface IVehiculoJpaRepository {

	public void insertar(Vehiculo v);

	public Vehiculo buscarPorPlaca(String placa);

	public void actualizar(Vehiculo v);

	public void borrar(String placa);
}
