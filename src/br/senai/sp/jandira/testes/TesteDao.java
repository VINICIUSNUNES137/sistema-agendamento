package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;

public class TesteDao {

    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        
//                Especialidade e1 = new Especialidade("Cardiologia", "cuidado com coração");
//        Especialidade e2 = new Especialidade("Pediatria", "cuidado com crianças");
//        
//        ArrayList<Especialidade> especialidades = new ArrayList<>();
//        especialidades.add(e1);
//        especialidades.add(e2);
//
//        Medico medico1 = new Medico("Robson", "232323", especialidades);
//        Medico medico2 = new Medico("Larissa", "434343", null);
//        Medico medico3 = new Medico("Daniel", "212121", null);
//        Medico medico4 = new Medico("Claudia", "989898", null);
//
//        MedicoDAO.gravar(medico1);
//        MedicoDAO.gravar(medico2);
//        MedicoDAO.gravar(medico3);
//        MedicoDAO.gravar(medico4);
//
//        System.out.println("-------------------");
//        for (Medico m : MedicoDAO.listarTodos()) {
//            System.out.println("Código: " + m.getCodigo());
//            System.out.println("Nome: " + m.getNome());
//            System.out.println("CRM: " + m.getCrm());
//            System.out.println("ESPECIALIDADES: " + m.getEspecialidades());
//            System.out.println("-------------------");
//
//        }

//        String[] linha0 = {"Cotia", "Itapevi", "Jandira"};
//        String[] linha1 = {"Barueri", "Carapicuíba", "Pirapora"};
//        String[] linha2 = {"Osasco", "Itu", "Valinhos"};
//        String[] linha3 = {"Presidente Prudente", "São Roque", "Pindamonhangaba"};
//        
//        String[][] linhas = {linha0, linha1, linha2, linha3};
//        
//        System.out.println(linhas[2][2]);
//        
//        String[][] frutas = {
//            {"Banana", "Pera", "Maçã"},
//            {"Melancia", "Uva", "Abacate"},
//            {"Ameixa", "Pêssego", "Nectarina"}
//        };
//        
//        System.out.println(frutas[0][1]);
//        System.out.println(frutas[2][2]);
//        
//
//        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
//        PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
//        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Ouro");
//        PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Platina");
//
//        System.out.println(PlanoDeSaude.getContador());
//
//        System.out.println(plano1.getCodigo());
//        System.out.println(plano4.getCodigo());
//
//        PlanoDeSaudeDAO.gravar(plano1);
//        PlanoDeSaudeDAO.gravar(plano2);
//        PlanoDeSaudeDAO.gravar(plano3);
//        PlanoDeSaudeDAO.gravar(plano4);
//
//        System.out.println("-------------------");
//        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
//            System.out.println("Código: " + p.getCodigo());
//            System.out.println("Operadora: " + p.getOperadora());
//            System.out.println("-------------------");
//
//        }
//        
////        int b[][]= new int[4][5];
////        
////        
////        int a[][] = {{1, 2 ,3}, {4, 5, 6}, {7, 8, 0}, {0, 0, 0}};
////        
////        
////        PlanoDeSaudeDAO.excluir(101);
////                System.out.println("---------após exclusão----------");
////        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
////            System.out.println("Código: " + p.getCodigo());
////            System.out.println("Operadora: " + p.getOperadora());
////            System.out.println("-------------------");
////
////        }
////
////        //testar o método getPlanoDeSaude do DAO
////        PlanoDeSaude p = PlanoDeSaudeDAO.getPlanoDeSaude(103);
////        System.out.println("Código: " + p.getCodigo());
////        System.out.println("Operadora: " + p.getOperadora());
//        
//        
//        
//        int i = PlanoDeSaudeDAO.listarTodos().indexOf(plano3);
//        System.out.println(i);
//        
//        
//        
//        
////		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
////		dao.gravar(plano1);
////		dao.gravar(plano2);
////		dao.gravar(plano3);
////		dao.gravar(plano4);
////		
////		for(PlanoDeSaude plano : dao.listarTodos()) {
////			System.out.println(plano.getOperadora());
////		}
////		
//
//        
    }

}
