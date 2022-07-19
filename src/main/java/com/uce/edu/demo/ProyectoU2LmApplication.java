package com.uce.edu.demo;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;
import com.uce.edu.demo.estudiante.repository.modelo.EstudianteContadorCondicion;
import com.uce.edu.demo.estudiante.repository.modelo.EstudianteSencillo;
import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;
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

		List<EstudianteSencillo> listaEstudianteSencillo = this.iEstudianteJpaService
				.buscarPorApellidoOrNombreSencillo("Buitron", "Pablo");

		for (EstudianteSencillo item : listaEstudianteSencillo) {
			LOG.info("Estudiante Sencillo: " + item);

		}
		
		List<EstudianteContadorCondicion> listaEstudianteContador = this.iEstudianteJpaService
				.consultarCantidadSemestre("Promedio");

		for (EstudianteContadorCondicion item : listaEstudianteContador) {
			LOG.info("EstudianteContadorCondicion: " + item);

		}

	}

}
