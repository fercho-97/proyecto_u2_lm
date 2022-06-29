package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.to.PersonaTo;

public interface IPersonaJpaService {

	public void guardar(Persona persona);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	public Persona buscar (Integer id);
	public List<Persona> buscarTodos();
}
