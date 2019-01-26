package com.meruvia.facturation2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meruvia.facturation2.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long>{

}
