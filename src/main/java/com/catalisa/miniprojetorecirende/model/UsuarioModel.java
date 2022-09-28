package com.catalisa.miniprojetorecirende.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_usuario", length = 75, nullable = false)
    @NotBlank(message = "Obrigatório por o nome")
    private String nomeUsuario;

    @Column(name = "data_de_nascimento_usuario")
    private LocalDate dataNascimento;

    @Column(name = "cpf_usuario", length = 12, nullable = false)
    @CPF(message = "Cpf inválido")
    private String cpf;

    @Column(name = "email_usuario", length = 50, nullable = false)
    @Email(message = "Email inválido")
    private String email;

    @Column(name = "telefone_usuario", length = 30, nullable = false)
    private String telefone;


    @JsonIgnore
    @OneToMany(mappedBy = "usuarioModel", cascade = CascadeType.ALL)
    private List<EmbalagemSalgadinhoModel> embalagemSalgadinhoModels = new ArrayList<>();





//    private int pontuacao = embalagemSalgadinhoModels.size() * 1500;
//
//    public UsuarioModel(String nomeUsuario, LocalDate dataNascimento, String cpf, String email, long telefone) {
//        this.nomeUsuario = nomeUsuario;
//        this.dataNascimento = dataNascimento;
//        this.cpf = cpf;
//        this.email = email;
//        this.telefone = telefone;
//    }

}
