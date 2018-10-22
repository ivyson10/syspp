package com.syspp.model;

import javax.persistence.Entity;

@Entity
public class Materia extends AbstractEntity {

	private String nome;
	
	private Integer CargaHoraria;

	private String turno;
	
	private String professor;
	
	private String sigla;
	
	private Dia dia;
	
	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

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
