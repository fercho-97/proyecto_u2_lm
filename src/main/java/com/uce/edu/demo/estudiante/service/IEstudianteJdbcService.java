package com.uce.edu.demo.estudiante.service;

import com.uce.edu.demo.estudiante.to.Estudiante;

public interface IEstudianteJdbcService {
	
	public Estudiante buscar(int id);
	public void guardar (Estudiante estudiante);
	public void actualizar (Estudiante estudiante);
	public void eliminar (int id);

}
