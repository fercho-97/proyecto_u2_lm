package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Persona;

@Repository
@Transactional
public class PersonaJpaRepositoryImpl implements IPersonaJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void insetar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.persist(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.merge(persona);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		// Persona persona = this.buscarPorId(id);
		// this.entityManager.remove(persona);
		this.entityManager.remove(this.buscarPorId(id));
	}

	@Override
	public Persona buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		//
		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		return (Persona) jpqlQuery.getSingleResult();

	}

	@Override
	public Persona buscarPorCedulaTyped(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> miTypedQuery = this.entityManager
				.createQuery("SELECT p FROM Persona p WHERE p.cedula = :datoCedula", Persona.class);
		miTypedQuery.setParameter("datoCedula", cedula);
		return miTypedQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaNamed(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula");
		myQuery.setParameter("datoCedula", cedula);
		return (Persona) myQuery.getSingleResult();

	}

	@Override
	public Persona buscarPorCedulaTypedNamed(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula", Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();

	}

	@Override
	public Persona buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM persona WHERE pers_cedula = :datoCedula",
				Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return (Persona) myQuery.getSingleResult();

	}

	@Override
	public List<Persona> buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorNombreApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorNombreApellido",
				Persona.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		Query itQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.genero = :datoGenero");
		itQuery.setParameter("datoGenero", genero);
		return itQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query thisQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.nombre = :datoNombre");
		thisQuery.setParameter("datoNombre", nombre);
		return thisQuery.getResultList();
	}

	// ----------------------------------------------------
	@Override
	public int actualizarPorApellido(String genero, String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager
				.createQuery("UPDATE Persona p SET p.genero = :datoGenero WHERE p.apellido = :datoApellido");
		myQuery.setParameter("datoGenero", genero);
		myQuery.setParameter("datoApellido", apellido);

		return myQuery.executeUpdate();
	}

	@Override
	public int eliminarPorGenero(String genero) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("DELETE FROM Persona p WHERE p.genero = :datoGenero");
		myQuery.setParameter("datoGenero", genero);
		return myQuery.executeUpdate();
	}

	@Override
	public Persona buscarPorCedulaNamedNative(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedulaNative",
				Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaCriteriaApi(String cedula) {
		// TODO Auto-generated method stub

		// se creea la instancia de la interfaz criteriaBuilder fabrica para construir
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();

		// especificamos el retorno
		CriteriaQuery<Persona> myQuery = myBuilder.createQuery(Persona.class);

		// See empieza a construir el SQL
		// Root From
		Root<Persona> personaFrom = myQuery.from(Persona.class);// From

		TypedQuery<Persona> myQueryFinal = this.entityManager
				.createQuery(myQuery.select(personaFrom).where(myBuilder.equal(personaFrom.get("cedula"), cedula)));

		return myQueryFinal.getSingleResult();

		/*
		 * // TODO Auto-generated method stub //SELECT p FROM Persona p WHERE p.cedula =
		 * :datoCedula //creamos una instancia de la interfaz CriteriaBuilder Fabrica
		 * para cosntruir el SQL CriteriaBuilder
		 * myBuilder=this.entityManager.getCriteriaBuilder();
		 * 
		 * //Especificamos el retorno de mi SQL CriteriaQuery<Persona> myQuery=
		 * myBuilder.createQuery(Persona.class);
		 * 
		 * //Aqui empezamos a construir el SQL //Root FROM Root<Persona> personaFrom=
		 * myQuery.from(Persona.class); //FROM Persona
		 * //myQuery.select(personaFrom);//Select p From Persona //Las condiciones where
		 * en criteria API se los conoce como predicados Predicate
		 * p1=myBuilder.equal(personaFrom.get("cedula"), cedula);//p.cedula =
		 * :datoCedula
		 * 
		 * CriteriaQuery<Persona> myQueryCompleto=myQuery.select(personaFrom).where(p1);
		 * 
		 * //Finalizado mi query completo
		 * 
		 * TypedQuery<Persona> myQueryFinal=
		 * this.entityManager.createQuery(myQueryCompleto); return
		 * myQueryFinal.getSingleResult();
		 */

	}

	@Override
	public Persona buscaDinamica(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Persona> myQuery = myCriteria.createQuery(Persona.class);

		Root<Persona> myTabla = myQuery.from(Persona.class);

		Predicate predicadoNombre = myCriteria.equal(myTabla.get("nombre"), nombre);
		Predicate predicadoApellido = myCriteria.equal(myTabla.get("apellido"), apellido);

		Predicate miPredicadoFinal = null;

		if (genero.equals("M")) {

			miPredicadoFinal = myCriteria.and(predicadoNombre, predicadoApellido);
		} else {
			miPredicadoFinal = myCriteria.or(predicadoNombre, predicadoApellido);
		}

		myQuery.select(myTabla).where(miPredicadoFinal);

		TypedQuery<Persona> myQueryFinal = this.entityManager.createQuery(myQuery);

		return myQueryFinal.getSingleResult();
	}

	@Override
	public Persona busquedaDinamicaPredicados(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub

		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Persona> myQuery = myCriteria.createQuery(Persona.class);

		Root<Persona> myTabla = myQuery.from(Persona.class);

		Predicate predicadoNombre = myCriteria.equal(myTabla.get("nombre"), nombre);
		Predicate predicadoApellido = myCriteria.equal(myTabla.get("apellido"), apellido);
		Predicate predicadoGenero = myCriteria.equal(myTabla.get("genero"), apellido);

		Predicate miPredicadoFinal = null;

		if (genero.equals("M")) {

			miPredicadoFinal = myCriteria.or(predicadoNombre, predicadoApellido);
			
			miPredicadoFinal = myCriteria.and(miPredicadoFinal,predicadoGenero);
		} else {
			
			miPredicadoFinal = myCriteria.and(predicadoNombre, predicadoApellido);
			miPredicadoFinal = myCriteria.or(miPredicadoFinal,predicadoGenero);
		}

		myQuery.select(myTabla).where(miPredicadoFinal);

		TypedQuery<Persona> myQueryFinal = this.entityManager.createQuery(myQuery);

		return myQueryFinal.getSingleResult();

	}

}
