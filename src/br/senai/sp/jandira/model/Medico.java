package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

	private String nome;
	private LocalDate dataDeNascimento;
	private Genero genero;
	private Especialidade[] especialidade;
	private String crm;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setEspecialidade(Especialidade[] especialidade) {
		this.especialidade = especialidade;
	}

	public Especialidade[] getEspecialidade() {
		return especialidade;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getCrm() {
		return crm;
	}

}
