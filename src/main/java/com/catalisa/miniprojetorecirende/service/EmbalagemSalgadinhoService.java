package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.enumerations.Marcas;
import com.catalisa.miniprojetorecirende.model.EmbalagemSalgadinhoModel;
import com.catalisa.miniprojetorecirende.model.PontoDeTrocaModel;
import com.catalisa.miniprojetorecirende.repository.IEmbalagemSalgadinho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmbalagemSalgadinhoService {

    @Autowired
    private IEmbalagemSalgadinho iEmbalagemSalgadinho;



    public EmbalagemSalgadinhoModel cadastrarEmbalagens(EmbalagemSalgadinhoModel embalagemSalgadinhoModel) {
        //EmbalagemSalgadinhoModel saldoAtualizado = embalagemSalgadinhoModel.setSaldoDePontos(1500);
       embalagemSalgadinhoModel.getPontoDeTrocaModel().getId();
       Double soma = embalagemSalgadinhoModel.getPontoDeTrocaModel().getPntsDistribuidos() +1500;
       embalagemSalgadinhoModel.getPontoDeTrocaModel().setPntsDistribuidos(soma);
        return iEmbalagemSalgadinho.save(embalagemSalgadinhoModel);
    }

    public List<EmbalagemSalgadinhoModel> exibirListaDeEmbalagens() {
        return iEmbalagemSalgadinho.findAll();
    }

    public Optional<EmbalagemSalgadinhoModel> exibirEmbalabensPorId(Long id) {
        return iEmbalagemSalgadinho.findById(id);
    }

    public EmbalagemSalgadinhoModel alterarEmbalagens(EmbalagemSalgadinhoModel embalagemSalgadinhoModel) {
        return iEmbalagemSalgadinho.save(embalagemSalgadinhoModel);
    }

    public void deletarEmbalagens(long id) {
        iEmbalagemSalgadinho.deleteById(id);
    }
}
