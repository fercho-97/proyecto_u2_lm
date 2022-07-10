package com.uce.edu.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.repository.IPropietarioJpaRepository;
import com.uce.edu.demo.matriculacion.repository.modelo.Propietario;

@Service
public class PropietarioJpaServiceImpl implements IPropietarioJpaService{

	@Autowired
	private IPropietarioJpaRepository iPropietarioJpaRepository;
	
	
	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioJpaRepository.insertar(p);
	}

	@Override
	public void borrarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		this.iPropietarioJpaRepository.borrar(cedula);
	}

}
