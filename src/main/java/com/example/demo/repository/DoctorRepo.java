package com.example.demo.repository;

import com.example.demo.repository.modelo.Doctor;

public interface DoctorRepo {
	public void insertar(Doctor doctor);

	public Doctor seleccionar(Integer id);

	public void actualizar(Doctor doctor);

	public void eliminar(Integer id);
	
	public Doctor buscarPorCedula(String cedula);
	
}
