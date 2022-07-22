package com.uce.edu.demo.registro.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.registro.repository.modelo.CiudadanoAc;

@Repository
@Transactional
public class CiudadanoEcRepositoryImpl implements ICiudadanoEcRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public CiudadanoAc buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CiudadanoAc.class, id);
	}

	@Override
	public void insetar(CiudadanoAc ciudadanoEc) {
		// TODO Auto-generated method stub
		this.entityManager.persist(ciudadanoEc);
	}

	@Override
	public void actualizar(CiudadanoAc ciudadanoEc) {
		// TODO Auto-generated method stub
		this.entityManager.merge(ciudadanoEc);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPorId(id));
	}

}
