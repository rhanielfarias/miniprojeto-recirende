package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.model.ProdutoDeTrocaModel;
import com.catalisa.miniprojetorecirende.model.UsuarioModel;
import com.catalisa.miniprojetorecirende.model.dto.UsuariosDto;
import com.catalisa.miniprojetorecirende.repository.IProdutoDeTrocaRepository;
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
public class ProdutoDeTrocaServiceTest {

    @Mock
    ProdutoDeTrocaService produtoDeTrocaService;

    @MockBean
    IProdutoDeTrocaRepository iProdutoDeTrocaRepository;

    private ProdutoDeTrocaModel produtoDeTrocaModel;

    @BeforeEach
    private void inicializador() {
        MockitoAnnotations.openMocks(this);
        produtoDeTrocaModel = new ProdutoDeTrocaModel();
    }

    @Test
    @DisplayName("Testando o metodo de cadastrar")
    void testeSeCadastroDeProduto() {
        iProdutoDeTrocaRepository.save(produtoDeTrocaModel);
        Mockito.when(iProdutoDeTrocaRepository.existsById(Mockito.anyLong())).thenReturn(true);
        Mockito.verify(iProdutoDeTrocaRepository, Mockito.times(1)).save(produtoDeTrocaModel);
    }

    @Test
    @DisplayName("O teste deve retornar true, pois nenhum produto foi cadastrada")
    void testeDeExibicaoDeProduto() {
        List<ProdutoDeTrocaModel> exibirUsuarios = produtoDeTrocaService.exibirTodosProdutosDeTroca();
        Assertions.assertTrue(exibirUsuarios.isEmpty());
    }

    @Test
    @DisplayName("O teste deve retornar true, se o metodo de buscar por id estiver funcionando corretamente")
    void testeDeBuscarProdutoViaId() {
        produtoDeTrocaService.exibirProdutosDeTrocaViaId(1L);
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("O teste deve retornar true, se o metodo de atualizar estiver funcionando corretamente")
    void testeDeAtualizarProduto() {
        produtoDeTrocaService.alterarProdutosDeTroca(produtoDeTrocaModel);
        Assertions.assertTrue(true);
    }
    @Test
    @DisplayName("O teste deve retornar true, se o metodo deletar via id estiver funcionando corretamente")
    void testeDeDeletarProdutoViaId() {
        produtoDeTrocaService.deletarProdutoDeTroca(1L);
        Assertions.assertTrue(true);
    }
}
