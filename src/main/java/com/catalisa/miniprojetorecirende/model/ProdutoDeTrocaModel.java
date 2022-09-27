package com.catalisa.miniprojetorecirende.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produto_de_troca")
public class ProdutoDeTrocaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_do_produto", length = 75, nullable = false)
    private String nomeDoProduto;

    @Column(name = "pontos_de_troca", length = 225, nullable = false)
    private BigDecimal pontosDeTroca;


}
