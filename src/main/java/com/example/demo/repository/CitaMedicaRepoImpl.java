package com.example.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements CitaMedicaRepo{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CitaMedica cita) {
		this.entityManager.persist(cita);

	}

	@Override
	public void actualizar(CitaMedica cita) {
		this.entityManager.merge(cita);

	}

	@Override
	public CitaMedica buscarPorNumero(String numeroCita) {
		TypedQuery<CitaMedica> myQuery = this.entityManager
				.createQuery("SELECT c FROM CitaMedica c WHERE c.numero= :datoNumero", CitaMedica.class);
		myQuery.setParameter("datoNumero", numeroCita);

		return myQuery.getSingleResult();
	}

	
}
