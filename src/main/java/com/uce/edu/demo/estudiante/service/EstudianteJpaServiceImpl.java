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

	@Override
	public List<Estudiante> buscarPorApellidoSemestreOrCategoriaNative(String apellido, String semestre,
			String categoria) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorApellidoSemestreOrCategoriaNative(apellido, semestre, categoria);
	}

	@Override
	public List<Estudiante> buscarPorSemestreCategoriaNative(String semestre, String categoria) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorSemestreCategoriaNative(semestre, categoria);
	}

	@Override
	public List<Estudiante> buscarPorNombreOrCategoriaNamedNative(String nombre, String categoria) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreOrCategoriaNamedNative(nombre, categoria);
	}

	@Override
	public List<Estudiante> buscarPorNombreOrCategoriaOrSemestreNamedNative(String nombre, String categoria,
			String semestre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreOrCategoriaOrSemestreNamedNative(nombre, categoria, semestre);
	}

	@Override
	public List<Estudiante> buscarDinamicamente(String nombre, String apellido, String semestre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarDinamicamente(nombre, apellido, semestre);
	}

	@Override
	public List<Estudiante> busquedaDinamicaPredicados(String nombre, String apellido, String semestre,
			String categoria) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.busquedaDinamicaPredicados(nombre, apellido, semestre, categoria);
	}

}
