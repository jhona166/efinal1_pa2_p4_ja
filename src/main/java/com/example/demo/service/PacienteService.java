package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Paciente;
@Service
public interface PacienteService {
	public void crear(Paciente paciente);
	public Paciente buscar(Integer id);
	public void actualizar(Paciente paciente);
	public Paciente buscarPorCedula(String cedula);
	public void eliminar(Integer id);
}
