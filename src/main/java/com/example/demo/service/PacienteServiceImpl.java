package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PacienteRepo;
import com.example.demo.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements PacienteService{
	@Autowired
	private PacienteRepo pacienteRepo;

	@Override
	public void crear(Paciente paciente) {
		this.pacienteRepo.insertar(paciente);

	}

	@Override
	public Paciente buscar(Integer id) {
		return this.pacienteRepo.seleccionar(id);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		return this.pacienteRepo.buscarPorCedula(cedula);
	}

	@Override
	public void actualizar(Paciente paciente) {
		this.pacienteRepo.actualizar(paciente);

	}

	@Override
	public void eliminar(Integer id) {
		this.pacienteRepo.eliminar(id);

	}
}
