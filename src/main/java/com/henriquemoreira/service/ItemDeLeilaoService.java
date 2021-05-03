package com.henriquemoreira.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henriquemoreira.domain.ItemDeLeilao;
import com.henriquemoreira.repository.ItemDeLeilaoRepository;

@Service
public class ItemDeLeilaoService {

		@Autowired
	 	ItemDeLeilaoRepository repository;

		public ItemDeLeilao findById(Integer id) {
			return repository.findById(id).orElseThrow(() -> new LanceNaoEncontradoException(id));
		}
		
		public List<ItemDeLeilao> todos() {
			return repository.findAll();
		}

		public ItemDeLeilao save(ItemDeLeilao entity) {
			return repository.save(entity);
		}

		public void delete(Integer id) {
			repository.deleteById(id);
		}
		
		public ItemDeLeilao atualiza(Integer id, ItemDeLeilao entity) {
			entity.setId(id);
			return repository.save(entity);
		}
	}
