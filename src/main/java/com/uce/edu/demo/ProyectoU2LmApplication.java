package com.uce.edu.demo;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.registro.service.ICiudadanoEcService;
import com.uce.edu.demo.repository.modelo.onetomany.Doctor;
import com.uce.edu.demo.repository.modelo.onetomany.Especialidad;
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
import com.uce.edu.demo.service.ICiudadanoService;
import com.uce.edu.demo.service.IDoctorService;
import com.uce.edu.demo.service.IEspecialidadService;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelService;
import com.uce.edu.demo.service.IPersonaJpaService;

@SpringBootApplication
public class ProyectoU2LmApplication implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2LmApplication.class);


	@Autowired
	private IHotelService iHotelService;
	
	@Autowired
	private IHabitacionService iHabitacionService;
	
	@Autowired
	private IDoctorService iDoctorService;
	
	@Autowired
	private IEspecialidadService iEspecialidadService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Doctor d1 = new Doctor();
		d1.setNombre("Miriam");
		d1.setApellido("Monstedeoca");
		d1.setCedula("197845");
		
		Especialidad e1 = new Especialidad();
		e1.setCodigo("G001");
		e1.setNombre("Ginecologia");
		e1.setDoctor(d1);
		
		this.iDoctorService.insetar(d1);
		this.iEspecialidadService.insetar(e1);
		
		
		Doctor d4 = new Doctor();
		d4.setNombre("Juliana");
		d4.setApellido("Reasco");
		d4.setCedula("112653");
		d4.setId(6);
		
		this.iDoctorService.actualizar(d4);
		
		this.iDoctorService.buscarPorId(2);
		
		this.iDoctorService.eliminar(1);
		
	}

}
