package com.example.demo.repository;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

public interface PacienteRepo {
	public void insertar(Paciente paciente);
	public Paciente seleccionar(Integer id);
	public void actualizar(Paciente paciente);
	public Paciente buscarPorCedula(String cedula);
	public void eliminar(Integer id);
}
