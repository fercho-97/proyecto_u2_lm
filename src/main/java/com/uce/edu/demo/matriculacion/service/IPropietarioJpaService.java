package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.repository.modelo.Propietario;

public interface IPropietarioJpaService {

	public void insertar(Propietario p);

	public void borrarPorCedula(String cedula);
}
