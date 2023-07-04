package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cita_medica")
public class CitaMedica {
	@Id
	@SequenceGenerator(name = "seq_cime", sequenceName = "seq_cime", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cime")
	@Column(name = "cime_id")
	private Integer id;

	@Column(name = "cime_numero_cita")
	private String numero;

	@Column(name = "cime_fecha_cita")
	private LocalDateTime fecha;

	@Column(name = "cime_valor_cita")
	private BigDecimal valor;

	@Column(name = "cime_lugar_cita")
	private String lugar;

	@Column(name = "cime_diagnostico")
	private String diagnostico;

	@Column(name = "cime_receta")
	private String receta;

	@Column(name = "cime_fecha_control")
	private LocalDateTime fechaControl;

	@ManyToOne
	@JoinColumn(name = "cime_id_paciente")
	private Paciente paciente;

	@ManyToOne
	@JoinColumn(name = "cime_id_doctor")
	private Doctor doctor;
	
	
	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", valor=" + valor + ", lugar="
				+ lugar + ", diagnostico=" + diagnostico + ", receta=" + receta + ", fechaControl=" + fechaControl
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	public LocalDateTime getFechaControl() {
		return fechaControl;
	}

	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	
	
	
	
	
	
	
	//Set and get
	
	
}
