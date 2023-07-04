package com.example.demo.service;

import com.example.demo.repository.modelo.Doctor;

public interface DoctorService {
	public void crear(Doctor doctor);

	public Doctor buscar(Integer id);

	public void actualizar(Doctor doctor);

	public void eliminar(Integer id);
	
	public Doctor buscarPorCedula(String cedula);
}
