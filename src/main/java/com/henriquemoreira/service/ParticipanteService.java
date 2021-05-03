package com.henriquemoreira.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henriquemoreira.domain.ItemDeLeilao;
import com.henriquemoreira.domain.Participante;
import com.henriquemoreira.repository.ParticipanteRepository;

@Service
public class ParticipanteService {

	@Autowired
	ParticipanteRepository repository;

	public Participante findById(Integer id) {
		return repository.findById(id).orElseThrow(() -> new LanceNaoEncontradoException(id));
	}

	public List<Participante> todos() {
		return repository.findAll();
	}

	public Participante save(Participante entity) {
		return repository.save(entity);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}

	public Participante atualiza(Integer id, Participante entity) {
		entity.setId(id);
		return repository.save(entity);
	}
}
