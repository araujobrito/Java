package com.aula.api.domain.cliente;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "clientes")
@Entity(name = "cliente")
@Getter
@NoArgsConstructor
//@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "razao_social", nullable = false)
    private String razaoSocial;

    @Column(name = "cnpj", nullable = false, unique = true, length = 18)
    private String cnpj;

    @Column(name = "nome_responsavel", nullable = false)
    private String nomeResponsavel;

    @Column(name = "email", nullable = false, unique = false)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "telefone", nullable = false, length = 20)
    private String telefone;

    public Cliente(String razaoSocial, String cnpj, String nomeResponsavel, String email, String senha, String telefone) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.nomeResponsavel = nomeResponsavel;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

}
