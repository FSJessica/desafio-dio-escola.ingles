package br.com.escola.ingles.controller;

import br.com.escola.ingles.domain.dto.Aluno;
import br.com.escola.ingles.domain.entity.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import br.com.escola.ingles.service.AlunoService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService service;

    @PutMapping(value = "/inserir")
    public ResponseEntity<AlunoEntity> adicionarAluno(@RequestBody Aluno aluno){
        System.out.println(aluno);
        return ResponseEntity.ok(service.inserirAluno(aluno));
    }

    @GetMapping(value = "/listar")
    public ResponseEntity<List<AlunoEntity>> listarAlunos(){
        return ResponseEntity.ok(service.listarAlunos());
    }
}
