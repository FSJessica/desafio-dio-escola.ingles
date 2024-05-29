package br.com.escola.ingles.domain.entity;

import br.com.escola.ingles.domain.dto.Aluno;
import br.com.escola.ingles.domain.dto.Professor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TurmaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private ProfessorEntity professor;

    @ElementCollection
    @CollectionTable(name="listaAlunos")
    private List<AlunoEntity> alunos;

}
