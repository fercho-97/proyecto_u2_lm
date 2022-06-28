package com.uce.edu.demo;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteJdbcService;
import com.uce.edu.demo.estudiante.to.Estudiante;

@SpringBootApplication
public class ProyectoU2LmApplication implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2LmApplication.class);

	@Autowired
	private IEstudianteJdbcService iEstudianteJdbcService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Estudiante e1 = new Estudiante();

		e1.setId(1);
		e1.setNombre("Juan");
		e1.setApellido("Velastegui");
		e1.setSemestre("sexto");
		e1.setCategoria("Excelencia");

		this.iEstudianteJdbcService.guardar(e1);
		LOG.info("Se ingreso el estudiante: " + e1);

		Estudiante e2 = new Estudiante();

		e2.setId(2);
		e2.setNombre("Nicol");
		e2.setApellido("Ramirez");
		e2.setSemestre("cuarto");
		e2.setCategoria("Promedio");

		this.iEstudianteJdbcService.guardar(e2);
		LOG.info("Se ingreso el estudiante: " + e2);

		Estudiante e3 = new Estudiante();

		e3.setId(3);
		e3.setNombre("Pablo");
		e3.setApellido("Buitron");
		e3.setSemestre("sexto");
		e3.setCategoria("Promedio");

		this.iEstudianteJdbcService.guardar(e3);
		LOG.info("Se ingreso el estudiante: " + e3);

		Estudiante e4 = new Estudiante();

		e4.setNombre("Alejandra");
		e4.setApellido("Altamirano");
		e4.setSemestre("quinto");
		e4.setCategoria("Bajo");
		e4.setId(3);

		this.iEstudianteJdbcService.actualizar(e4);
		LOG.info("Se ha actualizado el estudiante: " + this.iEstudianteJdbcService.buscar(3));

		this.iEstudianteJdbcService.eliminar(1);

		LOG.info("Se ha busado el estudiante: " + this.iEstudianteJdbcService.buscar(2));

	}

}
