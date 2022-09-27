package com.catalisa.miniprojetorecirende.model.dto;


import com.catalisa.miniprojetorecirende.model.EstacaoDeColetaModel;
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
    private  String cidade;
    private String estado;

    public EstacaoDeColetaDto(EstacaoDeColetaModel estacaoDeColetaModel){
        this.id = estacaoDeColetaModel.getId();
        this.razaoSocial = estacaoDeColetaModel.getRazaoSocial();
        this.nomeFantasia = estacaoDeColetaModel.getNomeFantasia();
        this.logradouro = estacaoDeColetaModel.getLogradouro();
        this.cidade = estacaoDeColetaModel.getCidade();
        this.estado = estacaoDeColetaModel.getEstado();
    }

    public static List<EstacaoDeColetaDto> convert(List<EstacaoDeColetaModel> estacaoDeColetaModels){
        return estacaoDeColetaModels.stream().map(EstacaoDeColetaDto::new).collect(Collectors.toList());
    }
}
