package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.onetomany.Doctor;

public interface IDoctorRepository {

	
	public void insetar(Doctor doctor);

	public void actualizar(Doctor doctor);
	
	public Doctor buscarPorId(Integer id);

	public void eliminar(Integer id);
}
