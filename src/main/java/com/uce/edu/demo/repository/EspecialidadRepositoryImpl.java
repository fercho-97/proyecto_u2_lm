package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetomany.Especialidad;

@Repository
@Transactional
public class EspecialidadRepositoryImpl implements IEspecialidadRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insetar(Especialidad especialidad) {
		// TODO Auto-generated method stub
		this.entityManager.persist(especialidad);
	}

	@Override
	public void actualizar(Especialidad especialidad) {
		// TODO Auto-generated method stub
		this.entityManager.merge(especialidad);
	}

	@Override
	public Especialidad buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Especialidad.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}

}
