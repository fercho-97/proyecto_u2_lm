package com.uce.edu.demo.estudiante.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.estudiante.to.Estudiante;

@Repository
public class EstudianteJdbcRepositoryImpl implements IEstudianteJdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Estudiante buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForObject("select * from estudiante where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

	@Override
	public void insetar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update(
				"insert into estudiante (id, nombre, apellido, semestre, categoria) values (?,?,?,?,?)",
				new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(),
						estudiante.getSemestre(), estudiante.getCategoria() });
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("update estudiante set nombre=?,apellido=?,semestre=?,categoria=? where id=?",
				new Object[] { estudiante.getNombre(), estudiante.getApellido(), estudiante.getSemestre(),
						estudiante.getCategoria(), estudiante.getId() });
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("delete from estudiante where id=?", new Object[] { id });

	}

}
