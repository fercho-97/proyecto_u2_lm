package com.uce.edu.demo;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		LOG.info("Persona Typed: " + this.iPersonaJpaService.buscarPorCedulaTyped("1470"));

		LOG.info("Persona Named: " + this.iPersonaJpaService.buscarPorCedulaNamed("1880"));

		LOG.info("Persona TypedNamed: " + this.iPersonaJpaService.buscarPorCedulaTypedNamed("1796"));

		Persona p1 = new Persona();
		p1.setApellido("Suarez");
		p1.setCedula("1234");
		p1.setGenero("F");
		p1.setNombre("Andres");
		// this.iPersonaJpaService.guardar(p1);

		List<Persona> listaPersonas = this.iPersonaJpaService.buscarPorNombreApellido("Andres", "Suarez");

		for (Persona item : listaPersonas) {
			LOG.info("Persona : " + item);
		}

	}

}
