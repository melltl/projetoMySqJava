package org.example.domain.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.endereco.Endereco;


@Table(name = "pacientes")
@Entity(name = "Paciente")//indica que eh uma entidade jpa
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    @Embedded //mesmo sendo de outra classe eh como se fosse dessa so
    private Endereco endereco;


    public Paciente(DadosCadastroPaciente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone= dados.telefone();
        this.endereco = new Endereco(dados.endereco());
        this.cpf = dados.cpf();
    }
}