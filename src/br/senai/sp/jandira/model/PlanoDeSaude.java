package br.senai.sp.jandira.model;

public class PlanoDeSaude {

    private static int contador = 100;
    private Integer codigo;
    private String operadora;
    private String tipoDoPlano;

    // Método Construtor
    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        atualizarCodigo();
    }

    public PlanoDeSaude(String operadora, String tipoDoPlano) {
        this.operadora = operadora;
        this.tipoDoPlano = tipoDoPlano;
        atualizarCodigo();
    } 

    public PlanoDeSaude() {
        atualizarCodigo();
    }

    public Integer getCodigo() {
        return codigo;
    }

    private void atualizarCodigo() {
        this.codigo = contador;
        contador++;
    } //esse

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getOperadora() {
        return this.operadora;
    }

    public void setTipoDoPlano(String tipoDoPlano) {
        this.tipoDoPlano = tipoDoPlano;
    }

    public String getTipoDoPlano() {
        return this.tipoDoPlano;
    }

    public String getDadosDoPlano() {
        return "O plano é: " + this.operadora + " \n" + "O tipo do plano é: " + this.tipoDoPlano;

    }

    public static int getContador() {
        return contador;
    }

}
