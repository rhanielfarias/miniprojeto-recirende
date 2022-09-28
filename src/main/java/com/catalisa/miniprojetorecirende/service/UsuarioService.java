package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.model.PontoDeTrocaModel;
import com.catalisa.miniprojetorecirende.model.UsuarioModel;
import com.catalisa.miniprojetorecirende.model.dto.EstacaoDeColetaDto;
import com.catalisa.miniprojetorecirende.model.dto.UsuariosDto;
import com.catalisa.miniprojetorecirende.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public UsuarioModel cadastrar(UsuarioModel usuarioModel) {

        return usuarioRepository.save(usuarioModel);
    }

    public UsuarioModel incrementaPontos(UsuarioModel usuarioModel, Integer pontos){
        usuarioModel.setPontos(usuarioModel.getPontos() + pontos);
        return usuarioRepository.save(usuarioModel);
    }

    public List<UsuariosDto> listaDeUsuario() {
        List<UsuarioModel> usuarios = usuarioRepository.findAll();
        return UsuariosDto.convert(usuarios);
    }

    public Optional<UsuarioModel> buscarId(Long id) {
        return usuarioRepository.findById(id);
    }

    public UsuarioModel alterarUsuarioCadastrado(UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
