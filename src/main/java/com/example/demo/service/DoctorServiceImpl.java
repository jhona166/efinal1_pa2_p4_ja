package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DoctorRepo;
import com.example.demo.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public void crear(Doctor doctor) {
		this.doctorRepo.insertar(doctor);

	}

	@Override
	public Doctor buscar(Integer id) {
		return this.doctorRepo.seleccionar(id);
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		return this.doctorRepo.buscarPorCedula(cedula);
	}

	@Override
	public void actualizar(Doctor doctor) {
		this.doctorRepo.actualizar(doctor);

	}

	@Override
	public void eliminar(Integer id) {
		this.doctorRepo.eliminar(id);

	}

}
