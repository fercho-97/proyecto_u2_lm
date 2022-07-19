package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;

public interface IPersonaJpaRepository {
	
	public List<Persona> buscarPorNombre(String nombre);

	public List<Persona> buscarPorApellido(String apellido);

	public List<Persona> buscarPorGenero(String genero);

	public Persona buscarPorCedula(String cedula);

	public Persona buscarPorId(Integer id);

	public void insetar(Persona persona);

	public void actualizar(Persona persona);

	public void eliminar(Integer id);
	
	//-------------------------------------------------------
	
	public int actualizarPorApellido(String genero,String apellido);
	public int eliminarPorGenero(String genero);
	
	//---------------------------------------------------------
	public Persona buscarPorCedulaTyped(String cedula);
	
	
	//---------------------------------------------------------
	public Persona buscarPorCedulaNamed(String cedula);

	public Persona buscarPorCedulaTypedNamed(String cedula);
	//---------------------------------------------------------
	
	public List<Persona> buscarPorNombreApellido(String nombre, String apellido);
	
	//---------------------------------------------------------
	public Persona buscarPorCedulaNative(String cedula);
	
	public Persona buscarPorCedulaNamedNative(String cedula);
	
	public Persona buscarPorCedulaCriteriaApi(String cedula);
	
	public Persona buscaDinamica(String nombre, String apellido, String genero);
	
	public Persona busquedaDinamicaPredicados(String nombre, String apellido, String genero);
	
	//----------------------------------------------------------
	
	public List<PersonaSencilla> buscarPorApellidoSencillo(String apellido);
	
	public List<PersonaContadorGenero> consultarCantidadGenero();
}
