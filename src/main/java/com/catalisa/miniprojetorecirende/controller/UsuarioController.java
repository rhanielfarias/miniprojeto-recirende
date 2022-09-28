package com.catalisa.miniprojetorecirende.controller;

import com.catalisa.miniprojetorecirende.model.UsuarioModel;
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
@RequestMapping(path = "/usuarios")
@Validated
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioModel>> buscarTodos() {
        return ResponseEntity.ok(usuarioService.buscarPorTodos());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<UsuarioModel>> buscarId(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.buscarId(id));
    }

    @PostMapping
    public ResponseEntity<UsuarioModel> cadastrarUsuario(@RequestBody @Valid UsuarioModel usuarioModel) {
        UsuarioModel usuario = usuarioService.cadastrar(usuarioModel);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<UsuarioModel> alterarUsuario(@RequestBody UsuarioModel usuario, @PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.alterar(usuario, id));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        usuarioService.deletar(id);
    }

}
