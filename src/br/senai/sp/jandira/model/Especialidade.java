package br.senai.sp.jandira.model;

public class Especialidade {

    private String nome;
    private String descricao;

    // Método de Acesso getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

}
