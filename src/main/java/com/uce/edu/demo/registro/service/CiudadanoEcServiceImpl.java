package com.uce.edu.demo.registro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.registro.repository.ICiudadanoEcRepository;
import com.uce.edu.demo.registro.repository.modelo.CiudadanoAc;

@Service
public class CiudadanoEcServiceImpl implements ICiudadanoEcService {

	@Autowired
	private ICiudadanoEcRepository iCiudadanoEcRepository;

	@Override
	public CiudadanoAc buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iCiudadanoEcRepository.buscarPorId(id);
	}

	@Override
	public void insetar(CiudadanoAc ciudadanoAc) {
		// TODO Auto-generated method stub
		this.iCiudadanoEcRepository.insetar(ciudadanoAc);
		;
	}

	@Override
	public void actualizar(CiudadanoAc ciudadanoAc) {
		// TODO Auto-generated method stub
		this.iCiudadanoEcRepository.actualizar(ciudadanoAc);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iCiudadanoEcRepository.eliminar(id);
	}

}
