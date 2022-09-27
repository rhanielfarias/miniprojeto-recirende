package com.catalisa.miniprojetorecirende.repository;

import com.catalisa.miniprojetorecirende.model.PontoDeTrocaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPontoDeTrocaRepository extends JpaRepository<PontoDeTrocaModel, Long> {
}
