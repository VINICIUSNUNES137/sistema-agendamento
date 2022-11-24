package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String nome;
    private String telefone;
    private String email;
    private LocalDate dataDeNascimento;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                
                
                //dataDeNascimento;
    }

}
