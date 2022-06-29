package com.uce.edu.demo.estudiante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.estudiante.repository.IEstudianteJdbcRepository;
import com.uce.edu.demo.estudiante.to.EstudianteTo;

@Service
public class EstudianteJdbcServiceImpl implements IEstudianteJdbcService {

	@Autowired
	private IEstudianteJdbcRepository iEstudianteJdbcRepository;

	@Override
	public EstudianteTo buscar(int id) {
		// TODO Auto-generated method stub
		return this.iEstudianteJdbcRepository.buscarPorId(id);
	}

	@Override
	public void guardar(EstudianteTo estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteJdbcRepository.insetar(estudiante);
	}

	@Override
	public void actualizar(EstudianteTo estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteJdbcRepository.actualizar(estudiante);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.iEstudianteJdbcRepository.eliminar(id);

	}

}
