package com.henriquemoreira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henriquemoreira.domain.Participante;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Integer>{

}
