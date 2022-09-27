package com.catalisa.miniprojetorecirende.model.dto;


import com.catalisa.miniprojetorecirende.model.PontoDeTrocaModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class EstacaoDeColetaDto {
    private Long id;
    private String razaoSocial;
    private String nomeFantasia;
    private String logradouro;
    private String cidade;
    private String estado;

<<<<<<< HEAD
    public EstacaoDeColetaDto(PontoDeTrocaModel estacaoDeColetaModel) {
        this.id = estacaoDeColetaModel.getId();
        this.razaoSocial = estacaoDeColetaModel.getRazaoSocial();
        this.nomeFantasia = estacaoDeColetaModel.getNomeFantasia();
        this.logradouro = estacaoDeColetaModel.getLogradouro();
        this.cidade = estacaoDeColetaModel.getCidade();
        this.estado = estacaoDeColetaModel.getEstado();
    }

    public static List<EstacaoDeColetaDto> convert(List<PontoDeTrocaModel> estacaoDeColetaModels) {
        return estacaoDeColetaModels.stream().map(EstacaoDeColetaDto::new).collect(Collectors.toList());
=======
    public EstacaoDeColetaDto(PontoDeTrocaModel pontoDeTrocaModel) {
        this.id = pontoDeTrocaModel.getId();
        this.razaoSocial = pontoDeTrocaModel.getRazaoSocial();
        this.nomeFantasia = pontoDeTrocaModel.getNomeFantasia();
        this.logradouro = pontoDeTrocaModel.getLogradouro();
        this.cidade = pontoDeTrocaModel.getCidade();
        this.estado = pontoDeTrocaModel.getEstado();
    }

    public static List<EstacaoDeColetaDto> convert(List<PontoDeTrocaModel> pontoDeTrocaModels) {
        return pontoDeTrocaModels.stream().map(EstacaoDeColetaDto::new).collect(Collectors.toList());
>>>>>>> 1a2140476167589c7d933952877d0d3b0ea92c70
    }
}
