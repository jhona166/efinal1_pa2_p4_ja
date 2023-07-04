package com.example.demo.repository;

import com.example.demo.repository.modelo.CitaMedica;

public interface CitaMedicaRepo {
	public void insertar(CitaMedica cita);

	public void actualizar(CitaMedica cita);

	public CitaMedica buscarPorNumero(String numeroCita);

}
