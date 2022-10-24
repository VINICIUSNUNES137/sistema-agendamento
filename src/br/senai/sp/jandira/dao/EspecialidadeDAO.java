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
    
       public static Especialidade getEspecialidade (Integer codigo) {
        
        for(Especialidade e : especialidades) {
            if(e.getCodigo().equals(codigo)){
                return e;
            }
        }   
        return null;      
    } 

    public static void atualizar(Especialidade especialidade) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidade.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidade);
                break;
            }
        }
    }

    public static boolean excluir(Integer codigo) {

        for (Especialidade e : especialidades) {
                    
            if (e.getCodigo().equals(codigo)) {
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
        Especialidade e4 = new Especialidade("Dermatologista", "cuida da pele");
        Especialidade e5 = new Especialidade("Oftalmologista", "cuida dos olhos");
        Especialidade e6 = new Especialidade("Nutricionista", "cuida da alimentação");
        Especialidade e7 = new Especialidade("Ortopedista", "cuida dos ossos");
        Especialidade e8 = new Especialidade("Psiquiatra", "cuida da mente");
        Especialidade e9 = new Especialidade("Fisioterapeuta", "cuida da restruturação da movimentação do corpo");
        Especialidade e10 = new Especialidade("Gastroenterologista", "cuida do aparelho digestivo");
        Especialidade e11 = new Especialidade("Ergometrista", "cuida da postura");
        Especialidade e12 = new Especialidade("Anestesiologista", "cuida da dor com base em anestésicos");
        Especialidade e13 = new Especialidade("Endócrinologista", "cuida do sistema endócrino");

        //gravar
        EspecialidadeDAO.gravar(e0);
        EspecialidadeDAO.gravar(e1);
        EspecialidadeDAO.gravar(e2);
        EspecialidadeDAO.gravar(e3);
        EspecialidadeDAO.gravar(e4);
        EspecialidadeDAO.gravar(e5);
        EspecialidadeDAO.gravar(e6);
        EspecialidadeDAO.gravar(e7);
        EspecialidadeDAO.gravar(e8);
        EspecialidadeDAO.gravar(e9);
        EspecialidadeDAO.gravar(e10);
        EspecialidadeDAO.gravar(e11);
        EspecialidadeDAO.gravar(e12);
        EspecialidadeDAO.gravar(e13);

    }

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
