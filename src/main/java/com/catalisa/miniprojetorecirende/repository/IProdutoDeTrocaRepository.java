package com.catalisa.miniprojetorecirende.repository;

import com.catalisa.miniprojetorecirende.model.ProdutoDeTrocaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdutoDeTrocaRepository extends JpaRepository<ProdutoDeTrocaModel, Long> {
}
