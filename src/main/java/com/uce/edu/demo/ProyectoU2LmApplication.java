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

		Persona e4 = new Persona();
		/*
		 * e4.setNombre("Juan"); e4.setApellido("Perez"); e4.setCedula("1990");
		 * e4.setGenero("M");
		 * 
		 * this.iPersonaJpaService.guardar(e4);
		 * 
		 * Persona e5 = new Persona();
		 * 
		 * e5.setNombre("Alejandra"); e5.setApellido("Perez"); e5.setCedula("1230");
		 * e5.setGenero("F");
		 * 
		 * this.iPersonaJpaService.guardar(e5);
		 * 
		 * 
		 */

		// LOG.info("Persona encontrada: " +
		// this.iPersonaJpaService.buscarPorCedula("1470"));

		List<Persona> listaPersona = this.iPersonaJpaService.buscarPorNombre("Alejandra");

		for (Persona item : listaPersona) {

			LOG.info("Persona: " + item);
		}

		List<Persona> listaPersonaGenero = this.iPersonaJpaService.buscarPorGenero("M");

		for (Persona item : listaPersonaGenero) {

			LOG.info("Persona: " + item);
		}

	}

}
