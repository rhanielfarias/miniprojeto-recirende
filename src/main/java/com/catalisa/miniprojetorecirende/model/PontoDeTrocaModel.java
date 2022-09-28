package com.catalisa.miniprojetorecirende.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@Table(name = "ponto_coleta")
@Entity
public class PontoDeTrocaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotNull
    private String razaoSocial;
    @Column
    private String nomeFantasia;
    @Column
    @NotNull
    @CNPJ
    private String cnpj;
    @Column
    @NotNull
    private String Logradouro;
    @Column
    private String cidade;
    @Column
    @NotNull
    private String estado;
//    @JsonIgnore
//    @OneToMany(mappedBy = "pontoDeTrocaModel",cascade = CascadeType.ALL)
//    private List<EmbalagemSalgadinhoModel> embalagemSalgadinhoModels;
}
