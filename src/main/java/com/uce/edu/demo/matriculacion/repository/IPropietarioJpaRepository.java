package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.repository.modelo.Propietario;

public interface IPropietarioJpaRepository {

	public void insertar(Propietario p);

	public void borrar(String cedula);

	public Propietario buscarPorCedula(String cedula);
}
