package org.example.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String numero;
    private String cep;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.complemento = dados.complemento();
        this.bairro = dados.bairro();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.cep = dados.cep();
        this.uf = dados.uf();
    }

    public void atualizarEndereco(DadosEndereco endereco) {
        if(endereco.logradouro()!=null){
            this.logradouro = endereco.logradouro();
        }
        if(endereco.complemento()!=null){
            this.complemento = endereco.complemento();
        }
        if(endereco.bairro()!=null){
            this.bairro = endereco.bairro();
        }
        if(endereco.cidade()!=null){
            this.cidade = endereco.cidade();
        }
        if(endereco.numero()!=null){
            this.numero = endereco.numero();
        }
        if(endereco.cep()!=null){
            this.cep = endereco.cep();
        }

        if(endereco.uf()!=null){
            this.uf = endereco.uf();
        }
    }
}
