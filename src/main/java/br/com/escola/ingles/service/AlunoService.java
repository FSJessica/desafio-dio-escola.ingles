package br.com.escola.ingles.service;

import br.com.escola.ingles.domain.dto.Aluno;
import br.com.escola.ingles.domain.entity.AlunoEntity;
import br.com.escola.ingles.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository repository;

    public AlunoEntity inserirAluno(Aluno aluno){
        AlunoEntity alunoEntity = AlunoEntity.builder()
                .nome(aluno.getNome())
                .matricula(aluno.getMatricula())
                .nota(aluno.getNota())
                .build();
        return repository.save(alunoEntity);
    }

    public List<AlunoEntity> listarAlunos(){
        return repository.findAll();
    }

}
