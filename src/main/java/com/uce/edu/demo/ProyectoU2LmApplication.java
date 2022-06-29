package com.uce.edu.demo;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteJdbcService;
import com.uce.edu.demo.estudiante.to.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.service.IPersonaJpaService;
import com.uce.edu.demo.to.PersonaTo;

@SpringBootApplication
public class ProyectoU2LmApplication implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2LmApplication.class);

	@Autowired
	private IEstudianteJdbcService iEstudianteJdbcService;

	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;

	@Autowired
	private IPersonaJpaService iPersonaJpaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		LOG.info("Dato con JPA: " + this.iPersonaJpaService.buscar(2));
		
		Persona persona = new Persona();
		persona.setApellido("Davalos");
		persona.setNombre("Guillermo");
		persona.setId(5);
		
		this.iPersonaJpaService.guardar(persona);
		*/
		
		/*
		Persona persona1 = new Persona();
		persona1.setApellido("Solis");
		persona1.setNombre("Claudia");
		persona1.setId(4);
		
		this.iPersonaJpaService.actualizar(persona1);
		*/
		
		this.iPersonaJpaService.eliminar(1);

	}

}
