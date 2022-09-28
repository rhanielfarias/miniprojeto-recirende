package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.model.UsuarioModel;
import com.catalisa.miniprojetorecirende.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    public List<UsuarioModel> buscarPorTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> buscarId(Long id) {
        return usuarioRepository.findById(id);
    }

    public UsuarioModel cadastrar(UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    public UsuarioModel alterar(UsuarioModel usuario, Long id) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
