package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IEspecialidadRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Especialidad;

@Service
public class EspecialidadServiceImpl implements IEspecialidadService{

	@Autowired
	private IEspecialidadRepository iEspecialidadRepository;
	
	@Override
	public void insetar(Especialidad especialidad) {
		// TODO Auto-generated method stub
		this.iEspecialidadRepository.insetar(especialidad);
	}

	@Override
	public void actualizar(Especialidad especialidad) {
		// TODO Auto-generated method stub
		this.iEspecialidadRepository.actualizar(especialidad);
	}

	@Override
	public Especialidad buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iEspecialidadRepository.buscarPorId(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iEspecialidadRepository.eliminar(id);
	}

	
	
	
}
