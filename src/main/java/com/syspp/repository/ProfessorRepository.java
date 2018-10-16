package com.syspp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.syspp.model.Professor;

@RepositoryRestResource(path = "professores", collectionResourceRel = "professores")
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
