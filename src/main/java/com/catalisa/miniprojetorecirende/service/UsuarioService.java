package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.model.UsuarioModel;
import com.catalisa.miniprojetorecirende.model.UsuarioSaidaDto;
import com.catalisa.miniprojetorecirende.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //  public int calcularPontuação(UsuarioModel usuarioModel) {
//        ArrayList arrayList = new ArrayList();
//        List<UsuarioModel> objetos = usuarioRepository.findAll();
//        int size = objetos.size() * 1500;
//        return  size;
//    }


    public List<UsuarioSaidaDto> buscarPorTodos() {
        List<UsuarioModel> usuarioModels = usuarioRepository.findAll();
        return UsuarioSaidaDto.converter(usuarioModels);
    }

    public Optional<UsuarioModel> buscarId(Integer codigo) {
        return usuarioRepository.findById(codigo);
    }

    public UsuarioModel cadastrar(UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    public UsuarioModel alterar(UsuarioModel usuario, Integer codigo) {
        usuario.getCodigo();
        return usuarioRepository.save(usuario);
    }

    public void deletar(Integer codigo) {
        usuarioRepository.deleteById(codigo);
    }
}
