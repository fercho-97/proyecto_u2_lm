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
		
		
		
		LOG.info("Busqueda por Nombre o Apellido TYPED");

		List<Estudiante> listaEstudiante1 = this.iEstudianteJpaService.buscarPorNombreOrApellidoTyped("Juan",
				"Ramirez");

		for (Estudiante item : listaEstudiante1) {
			LOG.info("Estudiante: " + item);
			
			
		}

		LOG.info("Busqueda por Nombre y Semestre Typed");
		List<Estudiante> listaEstudiante2 = this.iEstudianteJpaService.buscarPorNombreSemestreTyped("Pablo", "septimo");

		for (Estudiante item : listaEstudiante2) {
			LOG.info("Estudiante: " + item);
		}

		LOG.info("Busqueda por Nombre y Apellido Named");
		List<Estudiante> listaEstudiante3 = this.iEstudianteJpaService.buscarPorNombreApellidoNamed("Juan",
				"Velastegui");

		for (Estudiante item : listaEstudiante3) {
			LOG.info("Estudiante: " + item);
		}

		
		LOG.info("Busqueda por Nombre y Categoria Named");
		List<Estudiante> listaEstudiante4 = this.iEstudianteJpaService.buscarPorNombreCategoriaNamed("Nicol",
				"Promedio");

		for (Estudiante item : listaEstudiante4) {
			LOG.info("Estudiante: " + item);
		}

		LOG.info("Busqueda por Nombre y Apellido y Semestre TypedNamed");
		List<Estudiante> listaEstudiante5 = this.iEstudianteJpaService
				.buscarPorNombreApellidoSemestreTypedNamed("Vianca", "Ramirez", "cuarto");

		for (Estudiante item : listaEstudiante5) {
			LOG.info("Estudiante: " + item);
		}

		LOG.info("Busqueda por Apellido o Categoria TypedNamed");
		List<Estudiante> listaEstudiante6 = this.iEstudianteJpaService.buscarPorApellidoOrCategoriaTypedNamed("Buitron",
				"quinto");

		for (Estudiante item : listaEstudiante6) {
			LOG.info("Estudiante: " + item);
		}

	}

}
