package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.model.PontoDeTrocaModel;
import com.catalisa.miniprojetorecirende.model.dto.EstacaoDeColetaDto;
import com.catalisa.miniprojetorecirende.repository.IPontoDeTrocaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PontoDeTrocaService {

    @Autowired
    IPontoDeTrocaRepository iPontoDeTrocaRepository;

    public List<EstacaoDeColetaDto> listaDeEstacao() {
        List<PontoDeTrocaModel> estacao = iPontoDeTrocaRepository.findAll();
        return EstacaoDeColetaDto.convert(estacao);
    }

    public Optional<PontoDeTrocaModel> buscarPorid(Long id) {
        return iPontoDeTrocaRepository.findById(id);
    }

    public PontoDeTrocaModel cadastrar(PontoDeTrocaModel pontoDeTrocaModel) {
        pontoDeTrocaModel.getId();
        pontoDeTrocaModel.getRazaoSocial();
        pontoDeTrocaModel.getNomeFantasia();
        pontoDeTrocaModel.getCnpj();
        pontoDeTrocaModel.getLogradouro();
        pontoDeTrocaModel.getCidade();
        pontoDeTrocaModel.getEstado().toUpperCase();
        return iPontoDeTrocaRepository.save(pontoDeTrocaModel);
    }

    public void deletarcadastro(Long id) {
        iPontoDeTrocaRepository.deleteById(id);
    }
}
