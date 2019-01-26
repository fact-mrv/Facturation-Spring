package com.meruvia.facturation2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meruvia.facturation2.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
