package com.henriquemoreira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henriquemoreira.domain.ItemDeLeilao;

@Repository
public interface ItemDeLeilaoRepository extends JpaRepository<ItemDeLeilao, Integer>{

}
