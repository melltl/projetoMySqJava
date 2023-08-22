package org.example.controller;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

import org.example.domain.paciente.DadosCadastroPaciente;
import org.example.domain.paciente.Paciente;
import org.example.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("pacientes")
public class PacientesController {
    @Autowired
    private PacienteRepository repositoty;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados){
        repositoty.save(new Paciente(dados));


    }
}