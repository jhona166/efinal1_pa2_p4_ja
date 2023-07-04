package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepoImpl implements PacienteRepo {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Paciente paciente) {
		this.entityManager.persist(paciente);

	}

	@Override
	public Paciente seleccionar(Integer id) {
		return this.entityManager.find(Paciente.class, id);
	}

	

	@Override
	public void actualizar(Paciente paciente) {
		this.entityManager.merge(paciente);

	}
	
	@Override
	public Paciente buscarPorCedula(String cedula) {
		TypedQuery<Paciente> myQuery = this.entityManager.createQuery("SELECT e FROM Paciente e WHERE e.cedula= :datoCedula", Paciente.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Paciente paciente = this.seleccionar(id);
		this.entityManager.remove(paciente);
	}

	
}
