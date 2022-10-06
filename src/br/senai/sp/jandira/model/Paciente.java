package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	private String email;
	private PlanoDeSaude planoDeSaude;
	private LocalDate dataDeNascimento;
	private Endereco endereco;
	private String rg;
	private String cpf;
	private String telefone;
	private Genero genero;
	private String tipoSanguineo;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

}
