package com.uce.edu.demo.matriculacion.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.repository.modelo.Propietario;

@Repository
@Transactional
public class PropietarioJpaRepositoryImpl implements IPropietarioJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		this.entityManager.persist(p);
	}

	@Override
	public Propietario buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Propietario.class, cedula);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPorCedula(cedula));

	}

}
