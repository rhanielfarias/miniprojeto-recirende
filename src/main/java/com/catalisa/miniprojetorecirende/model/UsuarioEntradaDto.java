//package com.catalisa.miniprojetorecirende.model;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.hibernate.validator.constraints.br.CPF;
//
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import java.time.LocalDate;
//
//@Getter
//@Setter
//@NoArgsConstructor
//public class UsuarioEntradaDto {
//
//    @NotBlank(message = "O nome é obrigatório")
//    private String nomeUsuario;
//    @NotBlank(message = "E-mail obrigatório")
//    @Email
//    private String email;
//
//    private LocalDate dataNascimento;
//
//    @NotBlank(message = "CPF obrigatório")
//    @CPF
//    private String cpf;
//
//    private long telefone;
//
//    public UsuarioModel converterEmObjeto() {
//        return new UsuarioModel(nomeUsuario, dataNascimento, cpf, email, telefone);
//    }
//}
