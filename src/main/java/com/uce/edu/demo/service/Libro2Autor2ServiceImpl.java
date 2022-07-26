package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IAutor2Repository;
import com.uce.edu.demo.repository.ILibro2Autor2Repository;
import com.uce.edu.demo.repository.modelo.manytomany.Libro2Autor2;

@Service
public class Libro2Autor2ServiceImpl implements ILibro2Autor2Service{

	@Autowired
	private ILibro2Autor2Repository iLibro2Autor2Repository;
	@Override
	public void insetar(Libro2Autor2 libro2Autor2) {
		// TODO Auto-generated method stub
		this.iLibro2Autor2Repository.insetar(libro2Autor2);
	}

	
	
		
	

}
