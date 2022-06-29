package com.uce.edu.demo.estudiante.repository;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;

public interface IEstudianteJpaRepository {

	public Estudiante buscarPorId(Integer id);
	public void insetar (Estudiante estudiante);
	public void actualizar (Estudiante estudiante);
	public void eliminar (Integer id);
	
}
