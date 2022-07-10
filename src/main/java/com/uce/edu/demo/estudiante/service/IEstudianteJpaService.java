package com.uce.edu.demo.estudiante.service;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;

public interface IEstudianteJpaService {

	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(Integer id);
	public Estudiante buscar (Integer id);
	
}
