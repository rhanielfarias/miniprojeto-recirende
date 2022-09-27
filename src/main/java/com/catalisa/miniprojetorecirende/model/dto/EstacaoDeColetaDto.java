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
    }
}
