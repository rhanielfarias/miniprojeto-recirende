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
    private Long id;

    @Column(nullable = false, length = 12)
    private String marcaSalgadinho;

    @Column(nullable = false, length = 8) //tamanho maximo de número de série de 8 digitos
    private String numeroDeSerie;

    private Integer pontos;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private UsuarioModel usuarioModel;

    @ManyToOne
    @JoinColumn(name = "ponto_coleta_id", referencedColumnName = "id")
    private PontoDeTrocaModel pontoDeTrocaModel;


}
