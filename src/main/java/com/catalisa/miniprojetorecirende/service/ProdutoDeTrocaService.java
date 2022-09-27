package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.model.ProdutoDeTrocaModel;
import com.catalisa.miniprojetorecirende.repository.IProdutoDeTrocaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoDeTrocaService {


    @Autowired
    private IProdutoDeTrocaRepository iProdutoDeTrocaRepository;

    public ProdutoDeTrocaModel cadastrarProdutoDeTroca(ProdutoDeTrocaModel produtoDeTrocaModel) {
        return iProdutoDeTrocaRepository.save(produtoDeTrocaModel);
    }

    public List<ProdutoDeTrocaModel> exibirTodosProdutosDeTroca() {
        return iProdutoDeTrocaRepository.findAll();
    }

    public Optional<ProdutoDeTrocaModel> exibirProdutosDeTrocaViaId(Long id) {
        return iProdutoDeTrocaRepository.findById(id);
    }

    public ProdutoDeTrocaModel alterarProdutosDeTroca(ProdutoDeTrocaModel produtoDeTrocaModel) {
        return iProdutoDeTrocaRepository.save(produtoDeTrocaModel);
    }

    public void deletarProdutoDeTroca(Long id) {
        iProdutoDeTrocaRepository.deleteById(id);
    }
}
