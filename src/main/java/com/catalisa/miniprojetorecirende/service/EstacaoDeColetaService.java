package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.enumerations.factory.EstadoFactory;
import com.catalisa.miniprojetorecirende.model.PontoDeTrocaModel;
import com.catalisa.miniprojetorecirende.model.dto.EstacaoDeColetaDto;
import com.catalisa.miniprojetorecirende.repository.IEstacaoDeColetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstacaoDeColetaService {

    @Autowired
    IEstacaoDeColetaRepository iEstacaoDeColetaRepository;

    public List<EstacaoDeColetaDto> listaDeEstacao() {
        List<PontoDeTrocaModel> estacao = iEstacaoDeColetaRepository.findAll();
        return EstacaoDeColetaDto.convert(estacao);
    }

    public Optional<PontoDeTrocaModel> buscarPorid(Long id) {
        return iEstacaoDeColetaRepository.findById(id);
    }

    public PontoDeTrocaModel cadastrar(PontoDeTrocaModel estacaoDeColetaModel, EstadoFactory estadoFactory) {
       String estado = String.valueOf(estadoFactory.estado(estacaoDeColetaModel.getEstado()));
        estacaoDeColetaModel.setEstado(estado);
        return iEstacaoDeColetaRepository.save(estacaoDeColetaModel);
    }

    public void deletarcadastro(Long id) {
        iEstacaoDeColetaRepository.deleteById(id);
    }
}
