package com.uce.edu.demo.registro.repository;

import com.uce.edu.demo.registro.repository.modelo.CiudadanoAc;

public interface ICiudadanoEcRepository {

	public CiudadanoAc buscarPorId(Integer id);

	public void insetar(CiudadanoAc ciudadanoAc);

	public void actualizar(CiudadanoAc ciudadanoAc);

	public void eliminar(Integer id);
}
