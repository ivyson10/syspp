package com.syspp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.syspp.model.Aluno;

@RepositoryRestResource(path = "alunos", collectionResourceRel = "alunos")
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
