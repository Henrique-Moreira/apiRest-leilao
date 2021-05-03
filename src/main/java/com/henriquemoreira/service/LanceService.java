package com.henriquemoreira.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henriquemoreira.domain.Lance;
import com.henriquemoreira.repository.LanceRepository;

@Service
public class LanceService {

	@Autowired
	LanceRepository repository;

	public Lance findById(Integer id) {
		return repository.findById(id).orElseThrow(() -> new LanceNaoEncontradoException(id));
	}

	public List<Lance> todos() {
		return repository.findAll();
	}

	public Lance save(Lance entity) {
		return repository.save(entity);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}

	public Lance atualiza(Integer id, Lance entity) {
		entity.setId(id);
		return repository.save(entity);
	}
}
