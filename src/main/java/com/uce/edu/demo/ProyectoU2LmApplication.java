package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.registro.repository.modelo.CiudadanoAc;
import com.uce.edu.demo.registro.repository.modelo.Pasaporte;
import com.uce.edu.demo.registro.service.ICiudadanoEcService;
import com.uce.edu.demo.service.ICiudadanoService;
import com.uce.edu.demo.service.IPersonaJpaService;

@SpringBootApplication
public class ProyectoU2LmApplication implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2LmApplication.class);

	@Autowired
	private IPersonaJpaService iPersonaJpaService;

	@Autowired
	private IEstudianteJpaService iEstudianteJpaService;

	@Autowired
	private ICiudadanoService iCiudadanoService;
	
	@Autowired
	private ICiudadanoEcService iCiudadanoEcService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Pasaporte p1 = new Pasaporte();
		p1.setNumero("4589632");
		p1.setFechaCaducidad(LocalDateTime.now());
		p1.setFechaEmision(LocalDateTime.now());
		

		
		
		CiudadanoAc c1 = new CiudadanoAc();
		c1.setNombre("Alejandro");
		c1.setApellido("Monntes");
		c1.setCedula("18932684");
		c1.setFechaNacimiento(LocalDateTime.now());
		c1.setPasaporte(p1);
		
		p1.setCiudadanoEc(c1);
		this.iCiudadanoEcService.insetar(c1);
		
		
	
		CiudadanoAc c2 = new CiudadanoAc();
		c2.setNombre("Pedro");
		c2.setApellido("Prado");
		c2.setCedula("17125883");
		c2.setFechaNacimiento(LocalDateTime.now());
		
		
		this.iCiudadanoEcService.actualizar(c2);
		
		
		this.iCiudadanoEcService.eliminar(2);
		

		
		
		

	}

}
