package com.henriquemoreira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henriquemoreira.domain.Lance;

@Repository
public interface LanceRepository extends JpaRepository<Lance, Integer>{

}
