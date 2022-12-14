package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.model.EmbalagemSalgadinhoModel;
import com.catalisa.miniprojetorecirende.model.UsuarioModel;
import com.catalisa.miniprojetorecirende.repository.IEmbalagemSalgadinho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmbalagemSalgadinhoService {

    @Autowired
    private IEmbalagemSalgadinho iEmbalagemSalgadinho;

    @Autowired
    UsuarioService usuarioService;


    public EmbalagemSalgadinhoModel cadastrarEmbalagens(EmbalagemSalgadinhoModel embalagemSalgadinhoModel) {
//        if (iEmbalagemSalgadinho.findById(id)){ //query para numero de serie
//            //se voltar resultado gera erro
//        }//caso contrario cadastra
        embalagemSalgadinhoModel.getUsuarioModel().getId();
        UsuarioModel usuario = usuarioService.buscarId(embalagemSalgadinhoModel.getUsuarioModel().getId()).orElseThrow();
        usuarioService.incrementaPontos(usuario, 1500);

        return iEmbalagemSalgadinho.save(embalagemSalgadinhoModel);
    }

    public List<EmbalagemSalgadinhoModel> exibirListaDeEmbalagens() {
        return iEmbalagemSalgadinho.findAll();
    }

    public Optional<EmbalagemSalgadinhoModel> buscarEmbalagemViaId(Long id) {
        return iEmbalagemSalgadinho.findById(id);

    }

    public EmbalagemSalgadinhoModel alterarEmbalagens(EmbalagemSalgadinhoModel embalagemSalgadinhoModel) {
        return iEmbalagemSalgadinho.save(embalagemSalgadinhoModel);
    }

    public void deletarEmbalagens(Long id) {
        iEmbalagemSalgadinho.deleteById(id);
    }


}





//        Optional<EmbalagemSalgadinhoModel> optionalEmbalagemSalgadinhoModel = iEmbalagemSalgadinho.findById(id);
//        if (optionalEmbalagemSalgadinhoModel.isEmpty()) {
//            throw new RuntimeException("Erro: este usuário não foi encontrado no sistema");
//        }
//
//        EmbalagemSalgadinhoModel salgadinhoModel = optionalEmbalagemSalgadinhoModel.get();
////        Status statusInfo = contas.getStatus();
////        contaCarregada.setStatus(statusInfo);


//        //EmbalagemSalgadinhoModel saldoAtualizado = embalagemSalgadinhoModel.setSaldoDePontos(1500);
//       embalagemSalgadinhoModel.getUsuarioModel().getId();
//       if (embalagemSalgadinhoModel.getUsuarioModel().getId().i)
//
//       Double soma = embalagemSalgadinhoModel.getPontoDeTrocaModel().getPntsDistribuidos() +1500;
//       embalagemSalgadinhoModel.getPontoDeTrocaModel().setPntsDistribuidos(soma);
//        return iEmbalagemSalgadinho.save(embalagemSalgadinhoModel);


//
//    public boolean existsByNumeroDeSerie(String numeroDeSerie){
//        return iEmbalagemSalgadinho.existsByNumeroDeSerie(numeroDeSerie);
//    }