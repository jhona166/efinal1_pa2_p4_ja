package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CitaMedicaRepo;
import com.example.demo.repository.DoctorRepo;
import com.example.demo.repository.PacienteRepo;
import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

@Service
public class CitaMedicaServiceImpl implements CitaMedicaService{
	@Autowired
	private CitaMedicaRepo citaMedicaRepo;
	@Autowired
	private DoctorRepo doctorRepo;
	@Autowired
	private PacienteRepo pacienteRepo;
	
	@Override
	public void insertar(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.citaMedicaRepo.insertar(cita);
	}

	@Override
	public void actualizar(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.citaMedicaRepo.actualizar(cita);
	}

	@Override
	public CitaMedica buscarPorNumero(String numeroCita) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepo.buscarPorNumero(numeroCita);
	}

	@Override
	public void agendar(String numero, LocalDateTime fecha, BigDecimal valor, String lugar, String cedDoctor,
			String cedPaciente) {
		// TODO Auto-generated method stub
		CitaMedica cita = new CitaMedica();
		cita.setNumero(numero);
		cita.setFecha(fecha);
		cita.setValor(valor);
		cita.setLugar(lugar);

		Doctor doctor = this.doctorRepo.buscarPorCedula(cedDoctor);
		cita.setDoctor(doctor);

		Paciente paciente = this.pacienteRepo.buscarPorCedula(cedPaciente);
		cita.setPaciente(paciente);

		this.citaMedicaRepo.insertar(cita);
	}

	@Override
	public void actualizarPorCitaMedica(String numero,String diagnostico, String receta, LocalDateTime fechaProxima) {
		// TODO Auto-generated method stub
		CitaMedica cita = this.citaMedicaRepo.buscarPorNumero(numero);
		cita.setDiagnostico(diagnostico);
		cita.setReceta(receta);
		cita.setFechaControl(fechaProxima);

		this.citaMedicaRepo.actualizar(cita);

	}

}
