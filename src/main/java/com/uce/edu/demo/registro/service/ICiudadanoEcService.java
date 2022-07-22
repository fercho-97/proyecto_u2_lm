package com.uce.edu.demo.registro.service;

import com.uce.edu.demo.registro.repository.modelo.CiudadanoAc;

public interface ICiudadanoEcService {

	public CiudadanoAc buscarPorId(Integer id);

	public void insetar(CiudadanoAc ciudadanoEc);

	public void actualizar(CiudadanoAc ciudadanoEc);

	public void eliminar(Integer id);
}
