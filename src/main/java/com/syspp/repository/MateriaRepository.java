package com.syspp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.syspp.model.Materia;

@RepositoryRestResource(path = "materias", collectionResourceRel = "materias")
public interface MateriaRepository extends JpaRepository<Materia, Long> {

}
