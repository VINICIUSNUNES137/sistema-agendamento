package br.senai.sp.jandira.model;

public class Especialidade {

    private static int contador = 100;
    private Integer codigo;
    private String nome;
    private String descricao;

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        atualizarCodigo();
    }

    public Especialidade() {
        atualizarCodigo();
    }

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

    public Integer getCodigo() {
        return codigo;
    }

    public void atualizarCodigo() {
        this.codigo = contador;
        contador++;
    }

}
