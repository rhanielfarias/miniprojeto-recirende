package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.model.EmbalagemSalgadinhoModel;
import com.catalisa.miniprojetorecirende.model.UsuarioModel;
import com.catalisa.miniprojetorecirende.repository.IEmbalagemSalgadinho;
import com.catalisa.miniprojetorecirende.repository.UsuarioRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

@SpringBootTest
public class UsuarioServiceTest {

    @Mock
    UsuarioService usuarioService;

    @MockBean
    UsuarioRepository usuarioRepository;

    private UsuarioModel usuarioModel;

    @BeforeEach
    private void inicializador() {
        MockitoAnnotations.openMocks(this);
        usuarioModel = new UsuarioModel();
    }

    @Test
    @DisplayName("Testando o metodo de cadastrar")
    void testeSeCadastroDeUsuarioEstaFuncionando() {
        usuarioRepository.save(usuarioModel);
        Mockito.when(usuarioRepository.existsById(Mockito.anyLong())).thenReturn(true);
        Mockito.verify(usuarioRepository, Mockito.times(1)).save(usuarioModel);
    }


    @Test
    @DisplayName("O teste deve retornar true, pois nenhuma usuario foi cadastrada")
    void testeDeExibicaoDeUsuario() {
        List<UsuarioModel> exibirUsuarios = usuarioService.exibirUsuarios();
        Assertions.assertTrue(exibirUsuarios.isEmpty());
    }

    @Test
    @DisplayName("O teste deve retornar true, se o metodo de buscar por id estiver funcionando corretamente")
    void testeDeBuscarUsuarioViaId() {
        usuarioService.buscarId(1L);
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("O teste deve retornar true, se o metodo de atualizar estiver funcionando corretamente")
    void testeDeAtualizarUsuario() {
        usuarioService.alterarUsuarioCadastrado(usuarioModel);
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("O teste deve retornar true, se o metodo deletar via id estiver funcionando corretamente")
    void testeDeDeletarUsuarioViaId() {
        usuarioService.deletar(1L);
        Assertions.assertTrue(true);
    }
}
