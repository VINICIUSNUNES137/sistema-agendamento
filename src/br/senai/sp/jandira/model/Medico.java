package br.senai.sp.jandira.model;

import br.senai.sp.jandira.dao.MedicoDAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Medico extends Pessoa {

    private String crm;
    private ArrayList<Especialidade> especialidades;
    private static int contador = 100;
    private Integer codigo;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    
    public Medico() {
        atualizarCodigo();
    }

    public Medico(String nome, String crm) {
        setNome(nome);
        this.crm = crm;
        //this.especialidades = especialidades;
        atualizarCodigo();

    }
    
    //teste

    public Medico(Integer codigo, String nome, String crm, String telefone, String email, String dataDeNascimento) {

        this.codigo = codigo;
        super.setNome(nome);
        this.crm = crm;
        super.setTelefone(telefone);
        super.setEmail(email);
        super.setDataDeNascimento(dataDeNascimento);
        this.contador = codigo;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public String getEspecialidadesStr() {
        return especialidades.toString();
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void atualizarCodigo() {
        contador++;
        this.codigo = contador;

    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo
                + ";"
                + this.getNome()
                + ";"
                + this.crm
                + ";"
                + super.getTelefone()
                + ";"
                + super.getEmail()
                + ";"
                + super.getDataDeNascimento()
                + ";"
                + this.getEspecialidades();
    }

}
