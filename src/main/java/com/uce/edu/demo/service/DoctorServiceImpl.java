package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IDoctorRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepository iDoctorRepository;
	
	
	@Override
	public void insetar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.iDoctorRepository.insetar(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.iDoctorRepository.actualizar(doctor);
	}

	@Override
	public Doctor buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iDoctorRepository.buscarPorId(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iDoctorRepository.eliminar(id);
	}

}
