package com.catalisa.miniprojetorecirende.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "embalagens")
public class EmbalagemSalgadinhoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marca_salgadinho_embalagem", length = 12, nullable = false)
    private String marcaSalgadinho;


    @Column(name = "numero_de_serie_embalagem", length = 8, nullable = false)
    //tamanho maximo de número de série de 8 digitos
    private String numeroDeSerie;



//    @Column
//    private Integer pontos;
//
//    @ManyToOne
//    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
//    private UsuarioModel usuarioModel;

//    @ManyToOne
//    @JoinColumn(name = "ponto_coleta_id", referencedColumnName = "id")
//    private PontoDeTrocaModel pontoDeTrocaModel;

}
