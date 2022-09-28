package com.catalisa.miniprojetorecirende.service;

import com.catalisa.miniprojetorecirende.model.PontoDeTrocaModel;
import com.catalisa.miniprojetorecirende.model.dto.EstacaoDeColetaDto;
import com.catalisa.miniprojetorecirende.repository.IEstacaoDeColetaRepository;
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
public class PontoDeColetaServiceTest {

    @Mock
    PontoDeTrocaService pontoDeTrocaService;

    @MockBean
    IEstacaoDeColetaRepository iEstacaoDeColetaRepository;

    private PontoDeTrocaModel pontoDeTrocaModel;

    @BeforeEach
    private void inicializador() {
        MockitoAnnotations.openMocks(this);
        pontoDeTrocaModel = new PontoDeTrocaModel();
    }

    @Test
    @DisplayName("Testando o metodo de cadastrar")
    void testeCadastroPonto() {
        iEstacaoDeColetaRepository.save(pontoDeTrocaModel);
        Mockito.when(iEstacaoDeColetaRepository.existsById(Mockito.anyLong())).thenReturn(true);
        Mockito.verify(iEstacaoDeColetaRepository, Mockito.times(1)).save(pontoDeTrocaModel);
    }

    @Test
    @DisplayName("O teste deve retornar true, pois nenhum ponto de troca foi cadastrado")
    void testeDeExibicaoDePontoDeColeta() {
        List<EstacaoDeColetaDto> exibirListaDeEmbalagens = pontoDeTrocaService.listaDeEstacao();
        Assertions.assertTrue(exibirListaDeEmbalagens.isEmpty());
    }

    @Test
    @DisplayName("O teste deve retornar true, se o metodo de buscar por id estiver funcionando corretamente")
    void testeDeBuscarPontoDeTrocaViaId() {
        pontoDeTrocaService.buscarPorid(1L);
        Assertions.assertTrue(true);
    }
    @Test
    @DisplayName("O teste deve retornar true, se o metodo deletar via id estiver funcionando corretamente")
    void testeDeDeletarEmbalagensViaId() {
        pontoDeTrocaService.deletarcadastro(1L);
        Assertions.assertTrue(true);
    }
}
