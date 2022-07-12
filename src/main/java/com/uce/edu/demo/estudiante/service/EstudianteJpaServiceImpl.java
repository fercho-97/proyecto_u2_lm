package com.uce.edu.demo.estudiante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.estudiante.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService {

	@Autowired
	private IEstudianteJpaRepository iEstudianteJpaRepository;

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.insetar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.actualizar(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.eliminar(id);
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorId(id);
	}

	@Override
	public List<Estudiante> buscarPorNombreOrApellidoTyped(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreOrApellidoTyped(nombre, apellido);
	}

	@Override
	public List<Estudiante> buscarPorNombreSemestreTyped(String nombre, String semestre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreSemestreTyped(nombre, semestre);
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoNamed(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreApellidoNamed(nombre, apellido);
	}

	@Override
	public List<Estudiante> buscarPorNombreCategoriaNamed(String nombre, String categoria) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreCategoriaNamed(nombre, categoria);
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoSemestreTypedNamed(String nombre, String apellido, String semestre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreApellidoSemestreTypedNamed(nombre, apellido, semestre);
	}

	@Override
	public List<Estudiante> buscarPorApellidoOrCategoriaTypedNamed(String apellido, String categoria) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorApellidoOrCategoriaTypedNamed(apellido, categoria);
	}

}
