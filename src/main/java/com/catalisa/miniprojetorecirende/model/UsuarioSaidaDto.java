package com.catalisa.miniprojetorecirende.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
public class UsuarioSaidaDto {
    private Integer codigo;
    private String nomeUsuario;
    private LocalDate dataNascimento;
    private String email;

//    public UsuarioSaidaDto(UsuarioModel usuarioModel) {
//        this.codigo = usuarioModel.getId();
//        this.nomeUsuario = usuarioModel.getNomeUsuario();
//        this.dataNascimento = usuarioModel.getDataNascimento();
//        this.email = usuarioModel.getEmail();
//    }

//    public static List<UsuarioSaidaDto> converter(List<UsuarioModel> usuarioModels) {
//        return usuarioModels.stream().map(UsuarioSaidaDto::new).collect(Collectors.toList());
//
//    }
}