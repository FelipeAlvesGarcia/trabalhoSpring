package com.felipeAG.trabalhoSpring.repository;

import com.felipeAG.trabalhoSpring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteR  extends JpaRepository<Cliente, Long> {

}
