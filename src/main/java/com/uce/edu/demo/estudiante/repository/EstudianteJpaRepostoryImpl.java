package com.uce.edu.demo.estudiante.repository;

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

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;

@Repository
@Transactional
public class EstudianteJpaRepostoryImpl implements IEstudianteJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void insetar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPorId(id));
	}

	// ------------------------------------------------------------------------------
	@Override
	public List<Estudiante> buscarPorNombreOrApellidoTyped(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> miTypedQuery = this.entityManager.createQuery(
				"SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre OR e.apellido = :datoApellido ORDER BY e.apellido DESC",
				Estudiante.class);
		miTypedQuery.setParameter("datoNombre", nombre);
		miTypedQuery.setParameter("datoApellido", apellido);
		return miTypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreSemestreTyped(String nombre, String semestre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> miTypedQuery = this.entityManager.createQuery(
				"SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre AND e.semestre = :datoSemestre ORDER BY e.apellido ASC",
				Estudiante.class);
		miTypedQuery.setParameter("datoNombre", nombre);
		miTypedQuery.setParameter("datoSemestre", semestre);
		return miTypedQuery.getResultList();
	}

	// ------------------------------------------------------------------------------
	@Override
	public List<Estudiante> buscarPorNombreApellidoNamed(String nombre, String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreApellido");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreCategoriaNamed(String nombre, String categoria) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreCategoria");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoCategoria", categoria);
		return (List<Estudiante>) myQuery.getResultList();
	}

	// ------------------------------------------------------------------------------
	@Override
	public List<Estudiante> buscarPorNombreApellidoSemestreTypedNamed(String nombre, String apellido, String semestre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager
				.createNamedQuery("Estudiante.buscarPorNombreApellidoSemestre", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoSemestre", semestre);
		return myQuery.getResultList();

	}

	@Override
	public List<Estudiante> buscarPorApellidoOrCategoriaTypedNamed(String apellido, String categoria) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellidoOrCategoria",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoCategoria", categoria);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorApellidoSemestreOrCategoriaNative(String apellido, String semestre,
			String categoria) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery(
				"SELECT * FROM estudiante WHERE apellido = :datoApellido AND semestre = :datoSemestre OR categoria = :datoCategoria",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoSemestre", semestre);
		myQuery.setParameter("datoCategoria", categoria);
		return (List<Estudiante>) myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorSemestreCategoriaNative(String semestre, String categoria) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery(
				"SELECT * FROM estudiante WHERE semestre = :datoSemestre AND categoria = :datoCategoria",
				Estudiante.class);
		myQuery.setParameter("datoSemestre", semestre);
		myQuery.setParameter("datoCategoria", categoria);
		return (List<Estudiante>) myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreOrCategoriaNamedNative(String nombre, String categoria) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager
				.createNamedQuery("Estudiante.buscarPorNombreOrCategoriaNamedNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoCategoria", categoria);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreOrCategoriaOrSemestreNamedNative(String nombre, String categoria,
			String semestre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager
				.createNamedQuery("Estudiante.buscarPorNombreOrCategoriaOrSemestreNamedNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoCategoria", categoria);
		myQuery.setParameter("datoSemestre", semestre);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarDinamicamente(String nombre, String apellido, String categoria) {
		// TODO Auto-generated method stub

		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Estudiante> myQuery = myCriteria.createQuery(Estudiante.class);

		Root<Estudiante> myTabla = myQuery.from(Estudiante.class);

		Predicate predicadoNombre = myCriteria.equal(myTabla.get("nombre"), nombre);

		Predicate predicadoApellido = myCriteria.equal(myTabla.get("apellido"), apellido);

		Predicate predicadoCategoria = myCriteria.equal(myTabla.get("categoria"), categoria);
		
		Predicate miPredicadoFinal = null;

		if (categoria.equals("Baja")) {

			miPredicadoFinal = myCriteria.or(predicadoNombre, predicadoApellido);
			miPredicadoFinal = myCriteria.and(miPredicadoFinal, predicadoCategoria);
			
		} else if (categoria.equals("Promedio")) {

			miPredicadoFinal = myCriteria.and(predicadoNombre, predicadoApellido, predicadoCategoria);
			
		}  else {

			miPredicadoFinal = myCriteria.and(predicadoApellido,predicadoCategoria);

		}

		myQuery.select(myTabla).where(miPredicadoFinal);

		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myQuery);

		return myQueryFinal.getResultList();
	}

	@Override
	public List<Estudiante> busquedaDinamicaPredicados(String nombre, String apellido, String semestre,
			String categoria) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Estudiante> myQuery = myCriteria.createQuery(Estudiante.class);

		Root<Estudiante> myTabla = myQuery.from(Estudiante.class);

		Predicate predicadoNombre = myCriteria.equal(myTabla.get("nombre"), nombre);

		Predicate predicadoApellido = myCriteria.equal(myTabla.get("apellido"), apellido);
		
		Predicate predicadoSemestre = myCriteria.equal(myTabla.get("semestre"), semestre);

		Predicate predicadoCategoria = myCriteria.equal(myTabla.get("categoria"), categoria);
		
		Predicate miPredicadoFinal = null;

		
		if (nombre.length()<=4) {

			miPredicadoFinal = myCriteria.and(predicadoNombre, predicadoApellido, predicadoSemestre);
		} else {
			
			miPredicadoFinal = myCriteria.and(predicadoNombre,predicadoCategoria);
			
		}
		
		myQuery.select(myTabla).where(miPredicadoFinal);

		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myQuery);

		return myQueryFinal.getResultList();
	}

}
