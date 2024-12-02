package com.felipeAG.trabalhoSpring.repository;

import com.felipeAG.trabalhoSpring.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoR extends JpaRepository<Produto, Long> {
}
