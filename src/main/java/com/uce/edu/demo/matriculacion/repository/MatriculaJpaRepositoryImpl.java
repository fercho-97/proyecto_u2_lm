package com.uce.edu.demo.matriculacion.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.repository.modelo.Matricula;

@Repository
//@Transactional
public class MatriculaJpaRepositoryImpl implements IMatriculaJpaRepository{

	//@PersistenceContext
	//private EntityManager entityManager;
	
	
	@Override
	public void insertar(Matricula m) {
		// TODO Auto-generated method stub
		//this.entityManager.persist(m);
		System.out.println("La matricula ingreso al sistema: " + m);
		
	}

}
