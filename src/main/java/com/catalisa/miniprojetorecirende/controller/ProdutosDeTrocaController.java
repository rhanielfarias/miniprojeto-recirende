package com.catalisa.miniprojetorecirende.controller;

import com.catalisa.miniprojetorecirende.model.ProdutoDeTrocaModel;
import com.catalisa.miniprojetorecirende.service.ProdutoDeTrocaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/produtosDeTroca")
public class ProdutosDeTrocaController {

    @Autowired
    private ProdutoDeTrocaService produtoDeTrocaService;

    @PostMapping
    public ResponseEntity<ProdutoDeTrocaModel> cadastrarProdutoDeTroca(@RequestBody ProdutoDeTrocaModel produtoDeTrocaModel){
        ProdutoDeTrocaModel produtosDeTroca = produtoDeTrocaService.cadastrarProdutoDeTroca(produtoDeTrocaModel);
        return new ResponseEntity<>(produtosDeTroca, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDeTrocaModel>> exibirProdutosDeTroca(){
        return ResponseEntity.ok(produtoDeTrocaService.exibirTodosProdutosDeTroca());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<ProdutoDeTrocaModel>> exibirProdutosDeTrocaViaId(@PathVariable Long id){
        return ResponseEntity.ok(produtoDeTrocaService.exibirProdutosDeTrocaViaId(id));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ProdutoDeTrocaModel> alterarProdutosDeTroca(@RequestBody ProdutoDeTrocaModel produtoDeTrocaModel){
        return ResponseEntity.ok(produtoDeTrocaService.alterarProdutosDeTroca(produtoDeTrocaModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deleterProdutoDeTroca(@PathVariable Long id){
        produtoDeTrocaService.deletarProdutoDeTroca(id);
    }
}
