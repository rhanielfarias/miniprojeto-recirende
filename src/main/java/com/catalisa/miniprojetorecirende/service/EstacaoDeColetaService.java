package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.model.EstacaoDeColetaModel;
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
        List<EstacaoDeColetaModel> estacao = iEstacaoDeColetaRepository.findAll();
        return EstacaoDeColetaDto.convert(estacao);
    }

    public Optional<EstacaoDeColetaModel> buscarPorid(Long id) {
        return iEstacaoDeColetaRepository.findById(id);
    }

    public EstacaoDeColetaModel cadastrar(EstacaoDeColetaModel estacaoDeColetaModel) {
        estacaoDeColetaModel.getId();
        estacaoDeColetaModel.getRazaoSocial();
        estacaoDeColetaModel.getNomeFantasia();
        estacaoDeColetaModel.getCnpj();
        estacaoDeColetaModel.getLogradouro();
        estacaoDeColetaModel.getCidade();
        estacaoDeColetaModel.getEstado().toUpperCase();
        return iEstacaoDeColetaRepository.save(estacaoDeColetaModel);
    }

    public void deletarcadastro(Long id) {
        iEstacaoDeColetaRepository.deleteById(id);
    }
}
