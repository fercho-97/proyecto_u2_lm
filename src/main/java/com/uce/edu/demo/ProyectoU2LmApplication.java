package com.uce.edu.demo;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;
import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJpaService;

@SpringBootApplication
public class ProyectoU2LmApplication implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2LmApplication.class);

	@Autowired
	private IPersonaJpaService iPersonaJpaService;

	@Autowired
	private IEstudianteJpaService iEstudianteJpaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		LOG.info("Estudiante Native 1: ");

		List<Estudiante> listaEstudiante1 = this.iEstudianteJpaService
				.buscarPorApellidoSemestreOrCategoriaNative("Buitron", "sexto", "Baja");

		for (Estudiante item : listaEstudiante1) {
			LOG.info("Estudiante: " + item);

		}

		LOG.info("Estudiante Native 2: ");

		List<Estudiante> listaEstudiante2 = this.iEstudianteJpaService.buscarPorSemestreCategoriaNative("quinto",
				"Excelencia");

		for (Estudiante item : listaEstudiante2) {
			LOG.info("Estudiante: " + item);

		}

		LOG.info("Estudiante Named Native 1: ");

		List<Estudiante> listaEstudiante3 = this.iEstudianteJpaService.buscarPorNombreOrCategoriaNamedNative("Juan",
				"Promedio");

		for (Estudiante item : listaEstudiante3) {
			LOG.info("Estudiante: " + item);

		}

		LOG.info("Estudiante Named Native 2: ");

		List<Estudiante> listaEstudiante4 = this.iEstudianteJpaService
				.buscarPorNombreOrCategoriaOrSemestreNamedNative("Nicol", "Excelencia", "primero");

		for (Estudiante item : listaEstudiante4) {
			LOG.info("Estudiante: " + item);

		}

	}

}
