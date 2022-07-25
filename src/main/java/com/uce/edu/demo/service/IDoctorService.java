package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.onetomany.Doctor;

public interface IDoctorService {

	public void insetar(Doctor doctor);

	public void actualizar(Doctor doctor);
	
	public Doctor buscarPorId(Integer id);

	public void eliminar(Integer id);
	
}
