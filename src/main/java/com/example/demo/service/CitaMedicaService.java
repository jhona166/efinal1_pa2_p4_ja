package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.demo.repository.modelo.CitaMedica;

public interface CitaMedicaService {
	public void insertar(CitaMedica cita);

	public void actualizar(CitaMedica cita);

	public CitaMedica buscarPorNumero(String numeroCita);
	
	public void agendar(String numero, LocalDateTime fecha, BigDecimal valor, String lugar, String cedDoctor,
			String cedPaciente);
	
	public void actualizarPorCitaMedica(String numero, String Diagnostico, String receta,LocalDateTime fechaProxima);
}
