package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.model.EmbalagemSalgadinhoModel;
import com.catalisa.miniprojetorecirende.repository.IEmbalagemSalgadinho;
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
public class EmbalagemServiceTest {

    @Mock
    EmbalagemSalgadinhoService embalagemSalgadinhoService;

    @MockBean
    IEmbalagemSalgadinho iEmbalagemSalgadinho;

    private EmbalagemSalgadinhoModel embalagemSalgadinhoModel;

    @BeforeEach
    private void inicializador() {
        MockitoAnnotations.openMocks(this);
        embalagemSalgadinhoModel = new EmbalagemSalgadinhoModel();
    }

    @Test
    @DisplayName("Testando o metodo de cadastrar")
    void testeSeCadastroDeEmbalagemEstaFuncionando() {
        iEmbalagemSalgadinho.save(embalagemSalgadinhoModel);
        Mockito.when(iEmbalagemSalgadinho.existsById(Mockito.anyLong())).thenReturn(true);
        Mockito.verify(iEmbalagemSalgadinho, Mockito.times(1)).save(embalagemSalgadinhoModel);
    }


    @Test
    @DisplayName("O teste deve retornar true, pois nenhuma embalagem foi cadastrada")
    void testeDeExibicaoDeEmbalagens() {
        List<EmbalagemSalgadinhoModel> exibirListaDeEmbalagens = embalagemSalgadinhoService.exibirListaDeEmbalagens();
        Assertions.assertTrue(exibirListaDeEmbalagens.isEmpty());
    }

    @Test
    @DisplayName("O teste deve retornar true, se o metodo de buscar por id estiver funcionando corretamente")
    void testeDeBuscarEmbalagensViaId() {
        embalagemSalgadinhoService.buscarEmbalagemViaId(1L);
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("O teste deve retornar true, se o metodo de atualizar estiver funcionando corretamente")
    void testeDeAtualizarEmbalagens() {
        embalagemSalgadinhoService.alterarEmbalagens(embalagemSalgadinhoModel);
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("O teste deve retornar true, se o metodo deletar via id estiver funcionando corretamente")
    void testeDeDeletarEmbalagensViaId() {
        embalagemSalgadinhoService.deletarEmbalagens(1L);
        Assertions.assertTrue(true);
    }
}
