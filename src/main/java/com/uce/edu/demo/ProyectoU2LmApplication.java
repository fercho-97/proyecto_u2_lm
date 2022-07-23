package com.uce.edu.demo;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.estudiante.service.IEstudianteJpaService;
import com.uce.edu.demo.registro.service.ICiudadanoEcService;
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
import com.uce.edu.demo.service.ICiudadanoService;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelService;
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

	@Autowired
	private IHotelService iHotelService;
	
	@Autowired
	private IHabitacionService iHabitacionService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
/*
		Hotel h1= new Hotel();
		
		h1.setNombre("Hilton Colon GUY");
		h1.setDireccion("Malecon 2000");
		

		this.iHotelService.insertar(h1);
		
		*/
		
		Hotel h1= new Hotel();
		
		h1.setId(1);
		
	
		
		Habitacion habi1 = new Habitacion();
		habi1.setNumero("A234");
		habi1.setPiso("10");
		habi1.setTipo("Familiar");
		habi1.setHotel(h1);// se puede buscar el hotel o insertar directamente. basta que tenga el id
		
		this.iHabitacionService.insertar(habi1);
		
		Habitacion habi2 = new Habitacion();
		habi2.setNumero("A125");
		habi2.setPiso("1");
		habi2.setTipo("Matrimonial");
		habi2.setHotel(h1);
		
		this.iHabitacionService.insertar(habi2);
		
		
		
	}

}
