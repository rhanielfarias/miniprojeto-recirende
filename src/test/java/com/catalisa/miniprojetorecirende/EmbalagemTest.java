package com.catalisa.miniprojetorecirende;

import com.catalisa.miniprojetorecirende.model.EmbalagemSalgadinhoModel;
import com.catalisa.miniprojetorecirende.repository.IEmbalagemSalgadinho;
import com.catalisa.miniprojetorecirende.service.EmbalagemSalgadinhoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

@SpringBootTest
public class EmbalagemTest {

    @Mock
    EmbalagemSalgadinhoService embalagemSalgadinhoService;

    @MockBean
    IEmbalagemSalgadinho iEmbalagemSalgadinho;

    private EmbalagemSalgadinhoModel embalagemSalgadinhoModel;

    @BeforeEach
    private void inicializador(){
        MockitoAnnotations.openMocks(this);
        embalagemSalgadinhoModel = new EmbalagemSalgadinhoModel();
    }

    @Test
    void exibirListaDeEmbalagensTest(){
        List<EmbalagemSalgadinhoModel> todasAsEmbalagensCadastradas = embalagemSalgadinhoService.exibirListaDeEmbalagens();
        Assertions.assertTrue(todasAsEmbalagensCadastradas.isEmpty());
    }

    @Test
    public void testeCadastroDeEmbalagensFuncionando(){
        Mockito.when(iEmbalagemSalgadinho.existsById(Mockito.anyLong())).thenReturn(true);
        iEmbalagemSalgadinho.save(embalagemSalgadinhoModel);
        Mockito.verify(iEmbalagemSalgadinho, Mockito.times(1)).save(embalagemSalgadinhoModel);
    }

}
