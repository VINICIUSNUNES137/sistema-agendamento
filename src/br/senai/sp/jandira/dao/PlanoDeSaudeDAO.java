package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }

    public PlanoDeSaudeDAO() {

    }
    
    public static void atualizar(PlanoDeSaude planoDeSaude) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(planoDeSaude.getCodigo())) {
                planos.set(planos.indexOf(p), planoDeSaude);
                break;
            }
            
        }
    }

    public static void gravar(PlanoDeSaude planoDeSaude) {
        planos.add(planoDeSaude);
    }

    public static boolean excluir(Integer codigo) {
        for (PlanoDeSaude p : planos) {
            if (Objects.equals(p.getCodigo(), codigo)) {
                planos.remove(p);
                return true;
            }
        }
        return false;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        
        for(PlanoDeSaude p : planos) {
            if(p.getCodigo().equals(codigo)){
                return p;
            }
        }
        
        
        return null;      
    }

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;

    }

    public static void criarPlanosDeSaudeTeste() {

        PlanoDeSaude p1 = new PlanoDeSaude("Unimed", "Bronze");
        PlanoDeSaude p2 = new PlanoDeSaude("Unimed", "Ouro");
        PlanoDeSaude p3 = new PlanoDeSaude("Amil", "Advanced");
        PlanoDeSaude p4 = new PlanoDeSaude("Bradesco", "Exclusive");
        planos.add(p1);
        planos.add(p2);
        planos.add(p3);
        planos.add(p4);
    }

    public static DefaultTableModel getTabelModel() {

        //matriz que receberá os planosDeSaude
        //que serão utilizados na tabela (JTable)
        Object[][] dados = new Object[planos.size()][3];

        //for each para extrair cada objeto plano de saúde do
        //do arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }

        //Definir um vetor coom os nomes das colunas da tabela
        String[] titulos = {"Código", "Nome da Operadora", "Tipo do Plano"};

        //criar um modelo que será utilizado pela JTable
        //para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }

}
