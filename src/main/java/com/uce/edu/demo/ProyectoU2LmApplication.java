package com.uce.edu.demo;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJpaService;

@SpringBootApplication
public class ProyectoU2LmApplication implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2LmApplication.class);

	@Autowired
	private IPersonaJpaService iPersonaJpaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
		Persona e4 = new Persona();

		e4.setNombre("Pepito7");
		e4.setApellido("Perez7");

		this.iPersonaJpaService.guardar(e4);
		
		
		
		
		
		//LOG.info("Se ha actualizado el estudiante: " + this.iEstudianteJpaService.buscar(3));

		//this.iPersonaJpaService.eliminar(3);
		//this.iPersonaJpaService.eliminar(5);

		//LOG.info("Se ha busado el estudiante: " + this.iEstudianteJpaService.buscar(2));

	}

}
