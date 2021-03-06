package com.henriquemoreira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henriquemoreira.domain.Participante;
import com.henriquemoreira.service.ParticipanteService;

@RestController
@RequestMapping("/participante")
public class ParticipanteController {

	@Autowired
	private ParticipanteService service;
	
	@GetMapping("/id")
	public Participante lance(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@GetMapping
	public List<Participante> lances() {
		return service.todos();
	}
	
	@PostMapping
	public Participante novo(@RequestBody Participante entity) {
		return service.save(entity);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	@PutMapping("/{id}")
	public Participante atualiza(@PathVariable Integer id, @RequestBody Participante entity) {
		return service.atualiza(id, entity);
	}
}
