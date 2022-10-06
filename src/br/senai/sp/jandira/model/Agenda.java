package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

	private Paciente paciente;
	private Especialidade especialidade;
	private Medico medico;
	private LocalDate dataDaConsulta;
	private LocalTime horaDaConsulta;
	private String observacao;
	private boolean comparecimento;

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setDataDaConsulta(LocalDate dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}

	public LocalDate getDataDaConsulta() {
		return dataDaConsulta;
	}

	public void setHoraDaConsulta(LocalTime horaDaConsulta) {
		this.horaDaConsulta = horaDaConsulta;
	}

	public LocalTime getHoraDaConsulta() {
		return horaDaConsulta;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public boolean getComparecimento() {
		return comparecimento;
	}

	public void setComparecimento(boolean comparecimento) {
		this.comparecimento = comparecimento;
	}

}
