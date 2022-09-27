package com.catalisa.miniprojetorecirende.repository;

import com.catalisa.miniprojetorecirende.model.EmbalagemSalgadinhoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IEmbalagemSalgadinho extends JpaRepository<EmbalagemSalgadinhoModel, Long> {
}
