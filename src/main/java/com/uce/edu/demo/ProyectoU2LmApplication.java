package com.uce.edu.demo;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Persona;

@SpringBootApplication
public class ProyectoU2LmApplication implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2LmApplication.class);

	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		//LOG.info("prueba de log4j");

		// System.out.println("Hola Mundo");
		
		Persona persona = new Persona();
		persona.setId(2);
		persona.setNombre("Alejandra");
		persona.setApellido("Carrazco");
		
		//insertar
		//this.iPersonaJdbcService.guardar(persona);
		
		Persona p1 = new Persona();
		p1.setId(4);
		p1.setNombre("Juan");
		p1.setApellido("Velez");
		
		//this.iPersonaJdbcService.actualizar(p1);
		
		//this.iPersonaJdbcService.eliminar(4);
		
		LOG.info(this.iPersonaJdbcService.buscar(1));

		
	}

}
