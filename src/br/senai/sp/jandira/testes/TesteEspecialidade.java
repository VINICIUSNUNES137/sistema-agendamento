package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class TesteEspecialidade {

    public static void main(String[] args) {

        Especialidade especialidade0 = new Especialidade("Cardiologista", "cuida do coração");
        Especialidade especialidade1 = new Especialidade("Pediatra", "cuida das crianças");
        Especialidade especialidade2 = new Especialidade("Neurologista", "cuida dos cérebros");
        Especialidade especialidade3 = new Especialidade("Ortopedista", "cuida dos ossos");

        //gravar
        EspecialidadeDAO.gravar(especialidade0);
        EspecialidadeDAO.gravar(especialidade1);
        EspecialidadeDAO.gravar(especialidade2);
        EspecialidadeDAO.gravar(especialidade3);

        System.out.println("----------------");

        for (Especialidade e : EspecialidadeDAO.listarTodos()) {
            System.out.println("Código: " + e.getCodigo());
            System.out.println("Nome: " + e.getNome());
            System.out.println("Descrição: " + e.getDescricao());
            System.out.println("----------------");
        }
        
        //EspecialidadeDAO.excluir(especialidade2);
        
              System.out.println("------depois----------");

        for (Especialidade e : EspecialidadeDAO.listarTodos()) {
            System.out.println("Código: " + e.getCodigo());
            System.out.println("Nome: " + e.getNome());
            System.out.println("Descrição: " + e.getDescricao());
            System.out.println("----------------");
        }
        

//              System.out.println("-------------------");
//        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
//            System.out.println("Código: " + p.getCodigo());
//            System.out.println("Operadora: " + p.getOperadora());
//            System.out.println("-------------------");
//
//        }
//        System.out.println(especialidade0.getCodigo());
//        System.out.println(especialidade1.getCodigo());
//        System.out.println(especialidade2.getCodigo());
//        System.out.println(especialidade3.getCodigo());
    }
}
