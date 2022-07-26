package com.uce.edu.demo;

import java.util.HashSet;
import java.util.Set;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.manytomany.Autor;
import com.uce.edu.demo.repository.modelo.manytomany.Libro;
import com.uce.edu.demo.repository.modelo.onetomany.Doctor;
import com.uce.edu.demo.repository.modelo.onetomany.Especialidad;
import com.uce.edu.demo.service.IDoctorService;
import com.uce.edu.demo.service.IEspecialidadService;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelService;
import com.uce.edu.demo.service.ILibroService;

@SpringBootApplication
public class ProyectoU2LmApplication implements CommandLineRunner {

	private static Logger LOG = Logger.getLogger(ProyectoU2LmApplication.class);


	@Autowired
	private ILibroService iLibroService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Autor a1 = new Autor();
		a1.setNombre("Naguib Mahfuz");
		
		Autor a2 = new Autor();
		a2.setNombre("Lu Xun");
		
		Set<Autor> autores = new HashSet<>();
		autores.add(a1);
		autores.add(a2);
		
		
		Libro l1 = new Libro();
		l1.setTitulo("Diario de un loco");
		l1.setCantidadPaginas(500);
		l1.setAutores(autores);
		
		 this.iLibroService.insetar(l1);
	}

}
