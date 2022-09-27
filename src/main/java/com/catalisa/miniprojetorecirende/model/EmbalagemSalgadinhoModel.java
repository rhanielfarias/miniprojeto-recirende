package com.catalisa.miniprojetorecirende.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "embalagens")
public class EmbalagemSalgadinhoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false, length = 12)
    private String marcaSalgadinho;


    @ManyToOne
    @JoinColumn(name = "ponto_de_Coleta_id", referencedColumnName = "id")
    private PontoDeTrocaModel pontoDeTrocaModel;
}
