package com.syspp.model;

public enum Dia {
	SEGUNDA("Segunda"),
	TERCA("Terca"),
	QUARTA("Quarta"),
	QUINTA("Quinta"),
	SEXTA("Sexta");
	
	private String descricao;

	
	private Dia(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}

	
}
