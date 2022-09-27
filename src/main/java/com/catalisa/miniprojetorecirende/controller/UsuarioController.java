package com.catalisa.miniprojetorecirende.controller;

import com.catalisa.miniprojetorecirende.model.UsuarioModel;
import com.catalisa.miniprojetorecirende.model.UsuarioSaidaDto;
import com.catalisa.miniprojetorecirende.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

@GetMapping(path = "/usuario")
public ResponseEntity<List<UsuarioSaidaDto>> buscarTodos () {
    return  ResponseEntity.ok(usuarioService.buscarPorTodos());
}
    @GetMapping(path = "/usuario/{codigo}")
    public ResponseEntity<Optional<UsuarioModel>> buscarId(@PathVariable Integer codigo) {
        return ResponseEntity.ok(usuarioService.buscarId(codigo));
    }

    @PostMapping(path = "/usuario")
    public ResponseEntity<UsuarioModel> cadastrarUsuario(@RequestBody @Valid UsuarioModel usuarioModel) {
        UsuarioModel usuario = usuarioService.cadastrar(usuarioModel);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @PutMapping(path = "/usuario/{codigo}")
    public ResponseEntity<UsuarioModel> alterarUsuario(@RequestBody UsuarioModel usuario, @PathVariable Integer codigo) {
        return ResponseEntity.ok(usuarioService.alterar(usuario, codigo));
    }

    @DeleteMapping(path = "/usuario/{codigo}")
    public void deletarUsuario(@PathVariable Integer codigo) {
        usuarioService.deletar(codigo);
    }

}
