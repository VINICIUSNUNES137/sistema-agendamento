package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteDao {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        String[] linha0 = {"Cotia", "Itapevi", "Jandira"};
        String[] linha1 = {"Barueri", "Carapicuíba", "Pirapora"};
        String[] linha2 = {"Osasco", "Itu", "Valinhos"};
        String[] linha3 = {"Presidente Prudente", "São Roque", "Pindamonhangaba"};
        
        String[][] linhas = {linha0, linha1, linha2, linha3};
        
        System.out.println(linhas[2][2]);
        
        String[][] frutas = {
            {"Banana", "Pera", "Maçã"},
            {"Melancia", "Uva", "Abacate"},
            {"Ameixa", "Pêssego", "Nectarina"}
        };
        
        System.out.println(frutas[0][1]);
        System.out.println(frutas[2][2]);
        

        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
        PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Ouro");
        PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Platina");

        System.out.println(PlanoDeSaude.getContador());

        System.out.println(plano1.getCodigo());
        System.out.println(plano4.getCodigo());

        PlanoDeSaudeDAO.gravar(plano1);
        PlanoDeSaudeDAO.gravar(plano2);
        PlanoDeSaudeDAO.gravar(plano3);
        PlanoDeSaudeDAO.gravar(plano4);

        System.out.println("-------------------");
        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Operadora: " + p.getOperadora());
            System.out.println("-------------------");

        }
        
//        int b[][]= new int[4][5];
//        
//        
//        int a[][] = {{1, 2 ,3}, {4, 5, 6}, {7, 8, 0}, {0, 0, 0}};
//        
//        
//        PlanoDeSaudeDAO.excluir(101);
//                System.out.println("---------após exclusão----------");
//        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
//            System.out.println("Código: " + p.getCodigo());
//            System.out.println("Operadora: " + p.getOperadora());
//            System.out.println("-------------------");
//
//        }

        //testar o método getPlanoDeSaude do DAO
        PlanoDeSaude p = PlanoDeSaudeDAO.getPlanoDeSaude(103);
        System.out.println("Código: " + p.getCodigo());
        System.out.println("Operadora: " + p.getOperadora());
//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//		dao.gravar(plano3);
//		dao.gravar(plano4);
//		
//		for(PlanoDeSaude plano : dao.listarTodos()) {
//			System.out.println(plano.getOperadora());
//		}
//		

        


    }

}
