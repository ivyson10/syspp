package com.syspp.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Materia extends AbstractEntity {

	private String nome;
	
	private Integer CargaHoraria;

	@ManyToOne
	private Aluno aluno;
	
	@ManyToOne
	private Professor professor;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCargaHoraria() {
		return CargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}
	
	
	
}
