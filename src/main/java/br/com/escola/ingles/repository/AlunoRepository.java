package br.com.escola.ingles.repository;

import br.com.escola.ingles.domain.dto.Aluno;
import br.com.escola.ingles.domain.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {

}
