package org.example.domain.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.example.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(

        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        String telefone,
        String cpf,
        DadosEndereco endereco) {


}
