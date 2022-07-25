package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.onetomany.Especialidad;

public interface IEspecialidadService {

	public void insetar(Especialidad especialidad);

	public void actualizar(Especialidad especialidad);
	
	public Especialidad buscarPorId(Integer id);

	public void eliminar(Integer id);
}
