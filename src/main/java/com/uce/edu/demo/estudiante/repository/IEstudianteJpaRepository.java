package com.uce.edu.demo.estudiante.repository;

import java.util.List;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;

public interface IEstudianteJpaRepository {

	public Estudiante buscarPorId(Integer id);

	public void insetar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public void eliminar(Integer id);

	// ----------------------------------------------------
	public List<Estudiante> buscarPorNombreOrApellidoTyped(String nombre, String apellido);

	public List<Estudiante> buscarPorNombreSemestreTyped(String nombre, String semestre);

	// ----------------------------------------------------
	public List<Estudiante> buscarPorNombreApellidoNamed(String nombre, String apellido);

	public List<Estudiante> buscarPorNombreCategoriaNamed(String nombre, String categoria);

	// ----------------------------------------------------
	public List<Estudiante> buscarPorNombreApellidoSemestreTypedNamed(String nombre, String apellido, String semestre);

	public List<Estudiante> buscarPorApellidoOrCategoriaTypedNamed(String apellido, String categoria);

	// ------------------------------------------------------
	public List<Estudiante> buscarPorApellidoSemestreOrCategoriaNative(String apellido, String semestre,
			String categoria);

	public List<Estudiante> buscarPorSemestreCategoriaNative(String semestre, String categoria);

	// ------------------------------------------------------
	public List<Estudiante> buscarPorNombreOrCategoriaNamedNative(String nombre, String categoria);

	public List<Estudiante> buscarPorNombreOrCategoriaOrSemestreNamedNative(String nombre, String categoria,
			String semestre);

	//--------------------------------------------------------
	public List<Estudiante> buscarDinamicamente(String nombre, String apellido, String categoria);

	public List<Estudiante> busquedaDinamicaPredicados(String nombre, String apellido, String semestre, String categoria);

}
