package com.catalisa.miniprojetorecirende.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Table(name = "estacao_coleta")
@Entity
public class EstacaoDeColetaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column @NotNull
    private String razaoSocial;
    @Column
    private String nomeFantasia;
    @Column @NotNull @CNPJ
    private String cnpj;
    @Column @NotNull
    private String Logradouro;
    @Column
    private String cidade;
    @Column @NotNull
    private String estado;
}
