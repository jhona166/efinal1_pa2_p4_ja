package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.CitaMedicaService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PacienteService;

@SpringBootApplication
public class Efinal1Pa2P4JaApplication implements CommandLineRunner {
	@Autowired
	private PacienteService pacienteService;

	@Autowired
	private DoctorService doctorService;

	@Autowired
	private CitaMedicaService citaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Doctor doctor = new Doctor();
		doctor.setCedula("1727501515");
		doctor.setNombre("Daniel");
		doctor.setApellido("Lopez");
		doctor.setFechaNacimiento(LocalDateTime.now());
		doctor.setNumeroConsultorio("01");
		doctor.setGenero("M");
		doctor.setCodigo("A15");
		

		this.doctorService.crear(doctor);

		Doctor doctor1 = new Doctor();
		doctor1.setCedula("1727501516");
		doctor1.setNombre("Jefferson");
		doctor1.setApellido("Samaniego");
		doctor1.setFechaNacimiento(LocalDateTime.now());
		doctor1.setNumeroConsultorio("02");
		doctor.setGenero("M");
		doctor.setCodigo("A16");
		
		//1
		this.doctorService.crear(doctor1);

		Paciente paciente = new Paciente();
		paciente.setCedula("1727501510");
		paciente.setNombre("Jhonatan");
		paciente.setApellido("Altamirano");
		paciente.setFechaNacimiento(LocalDateTime.now());
		paciente.setCodigoSeguro("S01");
		paciente.setEstatura("1.65");
		paciente.setPeso("60KG");
		paciente.setGenero("M");

		//2
		this.pacienteService.crear(paciente);

		//3
		
		//String numero, LocalDateTime fecha, BigDecimal valor, String lugar, String cedDoctor,String cedPaciente
		this.citaMedicaService.agendar("1", LocalDateTime.now(), new BigDecimal(50), "HDCAM", doctor.getCedula(),paciente.getCedula());
		
		
		//4
		this.citaMedicaService.actualizarPorCitaMedica("1", "Fiebre","Omeprazol", LocalDateTime.now());
		

		
		
	}

}
