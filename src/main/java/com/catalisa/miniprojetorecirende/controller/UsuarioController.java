package com.catalisa.miniprojetorecirende.controller;

import com.catalisa.miniprojetorecirende.model.UsuarioModel;
import com.catalisa.miniprojetorecirende.model.dto.EstacaoDeColetaDto;
import com.catalisa.miniprojetorecirende.model.dto.UsuariosDto;
import com.catalisa.miniprojetorecirende.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@Validated
@RequestMapping(path = "/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioModel> cadastrarUsuario(@Valid @RequestBody UsuarioModel usuarioModel) {
        usuarioModel.setPontos(0);
        UsuarioModel usuario = usuarioService.cadastrar(usuarioModel);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UsuariosDto>> mostrarUsuarios() {
        return ResponseEntity.ok(usuarioService.listaDeUsuario());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<UsuarioModel>> buscarViaId(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.buscarId(id));
    }


    @PutMapping(path = "/{id}")
    public ResponseEntity<UsuarioModel> alterarUsuario(@Valid @RequestBody UsuarioModel usuarioModel) {
        return ResponseEntity.ok(usuarioService.alterarUsuarioCadastrado(usuarioModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        usuarioService.deletar(id);
    }

}
