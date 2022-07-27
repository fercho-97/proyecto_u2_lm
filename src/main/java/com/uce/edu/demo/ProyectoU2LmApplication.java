package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.cajero.repository.modelo.DetalleFactura;
import com.uce.edu.demo.cajero.repository.modelo.Factura;
import com.uce.edu.demo.cajero.service.IFacturaService;
import com.uce.edu.demo.repository.modelo.manytomany.Autor2;
import com.uce.edu.demo.repository.modelo.manytomany.Libro2;
import com.uce.edu.demo.repository.modelo.manytomany.Libro2Autor2;
import com.uce.edu.demo.service.IAutor2Service;
import com.uce.edu.demo.service.ILibro2Autor2Service;
import com.uce.edu.demo.service.ILibro2Service;

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

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2LmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Factura f1 = this.iFacturaService.consultar(1);
		LOG.info("numero: " +f1.getNumero());
		LOG.info("fecha: " +f1.getFecha());
		LOG.info("cliente: " + f1.getCliente().getNumeroTarjeta());
		
		List<DetalleFactura> detalleFacturas = f1.getDetalleFacturas();
		
		for(DetalleFactura deta : detalleFacturas) {
			
			LOG.info("deatlle: " + deta);
		}
		
/*
		// 1 libro - 2 autores

		Autor2 a1 = new Autor2();
		a1.setNombre("Juan");

		Autor2 a2 = new Autor2();
		a2.setNombre("Michael");

		this.iAutor2Service.insetar(a1);
		this.iAutor2Service.insetar(a2);

		Libro2 l1 = new Libro2();
		l1.setTitulo("las montanas");
		l1.setCantidadPaginas(300);

		this.iLibro2Service.insetar(l1);

		Libro2Autor2 m1 = new Libro2Autor2();
		m1.setAutor2(a1);
		m1.setLibro2(l1);

		Libro2Autor2 m2 = new Libro2Autor2();
		m2.setAutor2(a2);
		m2.setLibro2(l1);

		this.iLibro2Autor2Service.insetar(m1);
		this.iLibro2Autor2Service.insetar(m2);

		// 1 autor - 2 libros

		Autor2 a3 = new Autor2();
		a3.setNombre("Mario Vargas");

		this.iAutor2Service.insetar(a3);

		Libro2 l2 = new Libro2();
		l2.setTitulo("la ciudad y los perros");
		l2.setCantidadPaginas(620);

		Libro2 l3 = new Libro2();
		l3.setTitulo("la fiesta del chivo");
		l3.setCantidadPaginas(470);

		this.iLibro2Service.insetar(l2);
		this.iLibro2Service.insetar(l3);

		Libro2Autor2 m3 = new Libro2Autor2();
		m3.setAutor2(a3);
		m3.setLibro2(l2);

		Libro2Autor2 m4 = new Libro2Autor2();
		m4.setAutor2(a3);
		m4.setLibro2(l3);

		this.iLibro2Autor2Service.insetar(m3);
		this.iLibro2Autor2Service.insetar(m4);
*/
		
		
		
	}

}
