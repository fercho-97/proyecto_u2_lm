package com.uce.edu.demo;

import java.math.BigDecimal;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.cajero.service.IFacturaService;
import com.uce.edu.demo.matriculacion.repository.modelo.Propietario;
import com.uce.edu.demo.matriculacion.repository.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.service.IGestorMatriculaService;
import com.uce.edu.demo.matriculacion.service.IPropietarioJpaService;
import com.uce.edu.demo.matriculacion.service.IVehiculoJpaService;
import com.uce.edu.demo.service.IAutor2Service;
import com.uce.edu.demo.service.ILibro2Autor2Service;
import com.uce.edu.demo.service.ILibro2Service;
import com.uce.edu.demo.service.IPersonaJpaService;

@SpringBootApplication
public class ProyectoU2LmApplication implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2LmApplication.class);

	@Autowired
	private ILibro2Service iLibro2Service;

	@Autowired
	private IAutor2Service iAutor2Service;

	@Autowired
	private ILibro2Autor2Service iLibro2Autor2Service;
	
	@Autowired
	private IFacturaService iFacturaService;
	
	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
	@Autowired
	@Qualifier("liviano")
	private IVehiculoJpaService iVehiculoLivianoJpaService;

	@Autowired
	@Qualifier("pesado")
	private IVehiculoJpaService iVehiculoPesadoJpaService;

	@Autowired
	private IPropietarioJpaService iPropietarioJpaService;

	@Autowired
	private IGestorMatriculaService iGestorMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		Propietario p1 = new Propietario();
		p1.setNombre("Juan");
		p1.setApellido("Aguinaga");
		p1.setCedula("170189");

		this.iPropietarioJpaService.insertar(p1);

		LOG.info("se ingreso el propietario: " + p1);

		Propietario p2 = new Propietario();
		p2.setNombre("Domenica");
		p2.setApellido("Lascano");
		p2.setCedula("171744");

		this.iPropietarioJpaService.insertar(p2);

		LOG.info("se ingreso el propietario: " + p2);

		Vehiculo v1 = new Vehiculo();
		v1.setMarca("chevrolet");
		v1.setModelo("onix");
		v1.setPlaca("PYU0895");
		v1.setPrecio(new BigDecimal(5000));
		v1.setTipo("L");

		this.iVehiculoLivianoJpaService.insertar(v1);
		LOG.info("se ingreso el vehiculo: " + v1);

		Vehiculo v2 = new Vehiculo();
		v2.setMarca("HINO");
		v2.setModelo("serie500");
		v2.setPlaca("LBA7899");
		v2.setPrecio(new BigDecimal(10000));
		v2.setTipo("P");

		this.iVehiculoLivianoJpaService.insertar(v2);
		LOG.info("se ingreso el vehiculo: " + v2);

		this.iGestorMatriculaService.matricular("171744", "PYU0895");

		this.iGestorMatriculaService.matricular("171744", "LBA7899");
		
		
	}

}
