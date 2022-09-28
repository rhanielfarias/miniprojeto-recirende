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
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Obrigatório por o nome")
    private String nomeUsuario;

    @Column
    private LocalDate dataNascimento;

    @CPF
    private String cpf;
    @Email
    private String email;

    @Column(length = 10)
    private long telefone;

    @JsonIgnore
    @OneToMany(mappedBy = "usuarioModel", cascade = CascadeType.ALL)
    private List<EmbalagemSalgadinhoModel> embalagemSalgadinhoModels;

    public UsuarioModel(String nomeUsuario, LocalDate dataNascimento, String cpf, String email, long telefone) {
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public UsuarioModel() {
    }
}
