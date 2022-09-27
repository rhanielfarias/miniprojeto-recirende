package com.catalisa.miniprojetorecirende.controller;

import com.catalisa.miniprojetorecirende.model.EstacaoDeColetaModel;
import com.catalisa.miniprojetorecirende.model.ProdutoDeTrocaModel;
import com.catalisa.miniprojetorecirende.model.dto.EstacaoDeColetaDto;
import com.catalisa.miniprojetorecirende.service.EstacaoDeColetaService;
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
    EstacaoDeColetaService estacaoDeColetaService;

    @GetMapping
    public ResponseEntity<List<EstacaoDeColetaDto>> mostrarEstacoes(){return  ResponseEntity.ok(estacaoDeColetaService.listaDeEstacao());}

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<EstacaoDeColetaModel>> buscarIdColeta(@PathVariable Long id){
        return ResponseEntity.ok(estacaoDeColetaService.buscarPorid(id));
    }

    @PostMapping
    public ResponseEntity<EstacaoDeColetaModel> cadastrarEstacaoDeColeta(@RequestBody @Valid EstacaoDeColetaModel estacaoDeColetaModel){
        EstacaoDeColetaModel estacao = estacaoDeColetaService.cadastrar(estacaoDeColetaModel);
        return new ResponseEntity<>(estacao, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<EstacaoDeColetaModel> alterarEstacao(@RequestBody EstacaoDeColetaModel estacaoDeColetaModel) {
        return ResponseEntity.ok(estacaoDeColetaService.cadastrar(estacaoDeColetaModel));
    }
    @DeleteMapping(path = "/{id}")
    public void deletarEstacao(@PathVariable Long id){
        estacaoDeColetaService.deletarcadastro(id);
    }
}
