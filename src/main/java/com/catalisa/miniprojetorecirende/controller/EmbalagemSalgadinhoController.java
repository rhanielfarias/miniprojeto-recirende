package com.catalisa.miniprojetorecirende.controller;


import com.catalisa.miniprojetorecirende.model.EmbalagemSalgadinhoModel;
import com.catalisa.miniprojetorecirende.service.EmbalagemSalgadinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/embalagens")
public class EmbalagemSalgadinhoController {

    @Autowired
     private EmbalagemSalgadinhoService embalagemSalgadinhoService;

    @PostMapping
    public ResponseEntity<EmbalagemSalgadinhoModel> cadastrarProdutoDeTroca(@RequestBody EmbalagemSalgadinhoModel embalagemSalgadinhoModel){
        EmbalagemSalgadinhoModel embalagemSalgadinho = embalagemSalgadinhoService.cadastrarEmbalagens(embalagemSalgadinhoModel);
        return new ResponseEntity<>(embalagemSalgadinho, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmbalagemSalgadinhoModel>> exibirTodasEmbalagens(){
        return ResponseEntity.ok(embalagemSalgadinhoService.exibirListaDeEmbalagens());
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<EmbalagemSalgadinhoModel> alterarEmbalagens(@RequestBody EmbalagemSalgadinhoModel embalagemSalgadinhoModel){
        return ResponseEntity.ok(embalagemSalgadinhoService.alterarEmbalagens(embalagemSalgadinhoModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarEmbalagem(@PathVariable UUID id){
        embalagemSalgadinhoService.deletarEmbalagens(id);
    }
}
