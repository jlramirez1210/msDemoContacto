package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Contacto;

public interface AgendaJpaSpring extends JpaRepository<Contacto, Integer> {
	Contacto findByEmail(String email);

	@Transactional
	@Modifying
	@Query("Delete from Contacto c where c.email=?")
	void eliminarPorEmail(String email);
}
