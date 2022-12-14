package com.catalisa.miniprojetorecirende.controller;

import com.catalisa.miniprojetorecirende.model.PontoDeTrocaModel;
import com.catalisa.miniprojetorecirende.model.dto.EstacaoDeColetaDto;
import com.catalisa.miniprojetorecirende.service.PontoDeTrocaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/coleta")
public class EstacaoDeColetaController {

    @Autowired
    PontoDeTrocaService pontoDeTrocaService;

    @GetMapping
    public ResponseEntity<List<EstacaoDeColetaDto>> mostrarEstacoes() {
        return ResponseEntity.ok(pontoDeTrocaService.listaDeEstacao());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<PontoDeTrocaModel>> buscarIdColeta(@PathVariable Long id) {
        return ResponseEntity.ok(pontoDeTrocaService.buscarPorid(id));
    }

    @PostMapping
    public ResponseEntity<PontoDeTrocaModel> cadastrarEstacaoDeColeta(@RequestBody @Valid PontoDeTrocaModel pontoDeTrocaModel) {
        PontoDeTrocaModel estacao = pontoDeTrocaService.cadastrar(pontoDeTrocaModel);
        return new ResponseEntity<>(estacao, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<PontoDeTrocaModel> alterarEstacao(@RequestBody PontoDeTrocaModel pontoDeTrocaModel) {
        return ResponseEntity.ok(pontoDeTrocaService.cadastrar(pontoDeTrocaModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarEstacao(@PathVariable Long id) {
        pontoDeTrocaService.deletarcadastro(id);
    }
}
