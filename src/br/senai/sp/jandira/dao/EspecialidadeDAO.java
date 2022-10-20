package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidades.add(especialidade);
    } //construtor criado

    public EspecialidadeDAO() {
    }//construtor root

    public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);
    }

    public static void atualizar(Especialidade especialidade) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidade.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidade);
                break;
            }
        }
    }

    public static boolean excluir(Especialidade especialidade) {

        for (Especialidade e : especialidades) {
            if (Objects.equals(e.getCodigo(), especialidade.getCodigo())) {
                especialidades.remove(e);
                return true;
            }
        }

        return false;
    }

    public static ArrayList<Especialidade> listarTodos() {
        return especialidades;
    }

    public static void criarTabelaTeste() {
        Especialidade e0 = new Especialidade("Cardiologista", "cuida do coração");
        Especialidade e1 = new Especialidade("Pediatra", "cuida das crianças");
        Especialidade e2 = new Especialidade("Neurologista", "cuida dos cérebros");
        Especialidade e3 = new Especialidade("Ortopedista", "cuida dos ossos");

        //gravar
        EspecialidadeDAO.gravar(e0);
        EspecialidadeDAO.gravar(e1);
        EspecialidadeDAO.gravar(e2);
        EspecialidadeDAO.gravar(e3);

    }

//    ublic static DefaultTableModel getTabelModel() {
//
//        //matriz que receberá os planosDeSaude
//        //que serão utilizados na tabela (JTable)
//        Object[][] dados = new Object[planos.size()][3];
//
//        //for each para extrair cada objeto plano de saúde do
//        //do arraylist planos e separar cada dado na matriz dados
//        int i = 0;
//        for (PlanoDeSaude p : planos) {
//            dados[i][0] = p.getCodigo();
//            dados[i][1] = p.getOperadora();
//            dados[i][2] = p.getTipoDoPlano();
//            i++;
//        }
//
//        //Definir um vetor coom os nomes das colunas da tabela
//        String[] titulos = {"Código", "Nome da Operadora", "Tipo do Plano"};
//
//        //criar um modelo que será utilizado pela JTable
//        //para exibir os dados dos planos
//        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
//
//        return tableModel;
//
//    }
    public static DefaultTableModel getTableModel() {

        Object[][] dados = new Object[especialidades.size()][3];

        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }
        String[] titulos = {"Código", "Nome Da Especialidade", "Descrição"};
        
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        
        return tableModel;
    }

}
