package com.catalisa.miniprojetorecirende.model.dto;

import com.catalisa.miniprojetorecirende.model.UsuarioModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class UsuariosDto {

   private Long id;
    private String nomeUsuario;
    private String email;
    private String telefone;
    private Integer pontos;

public UsuariosDto(UsuarioModel usuarioModel){
    this.id = usuarioModel.getId();
    this.nomeUsuario= usuarioModel.getNomeUsuario();
    this.email = usuarioModel.getEmail();
    this.telefone = usuarioModel.getTelefone();
    this.pontos = usuarioModel.getPontos();
}

public static List<UsuariosDto> convert(List<UsuarioModel>usuarioModels){
    return usuarioModels.stream().map(UsuariosDto::new).collect(Collectors.toList());
}
}
