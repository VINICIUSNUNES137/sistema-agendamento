package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		//VETOR COM 3 PLANOS DE SAÚDE
//		PlanoDeSaude plano1 = new PlanoDeSaude();
//		plano1.setOperadora("Unimed");
//		plano1.setTipoDoPlano("bronze");
//		
//
//		PlanoDeSaude[] planos = {plano1,
//				new PlanoDeSaude("Porto Seguro"),
//				new PlanoDeSaude("Allianz", "OURO")
//		};
//		
//		
//		System.out.println(planos[0].getOperadora());
//		System.out.println(planos[1].getOperadora());
//		System.out.println(planos[2].getOperadora());
//		
//		
//		ArrayList<String> cidades = new ArrayList<>();
//		cidades.add("São Paulo");
//		cidades.add("Jandira");
//		cidades.add("Barueri");
//		cidades.add("Cotia");
//		cidades.add("Itapevi");
//		cidades.add("Carapicuíba");
//		cidades.add("Osasco");
//		
//		System.out.println(cidades.get(3)); // solicitando a string "COTIA"
//		System.out.println(cidades.size()); // solicitando o tamanho do array "lenght"
//		
//		ArrayList<PlanoDeSaude> plano2 = new ArrayList<>();
//		plano2.add(new PlanoDeSaude("Notredame"));
//		plano2.add(new PlanoDeSaude("Ativia", "Advanced"));
//		plano2.add(new PlanoDeSaude("Bio Saúde"));
//		plano2.add(new PlanoDeSaude("Blue Med", "Exclusive"));
//		
//		PlanoDeSaude planoNovo = new PlanoDeSaude();
//		planoNovo.setOperadora("AmePlan");
//		planoNovo.setTipoDoPlano("Prata");
//		
//		plano2.add(planoNovo);
//		
//		plano2.get(0).setTipoDoPlano("Basic");
//		
//		System.out.println(plano2.get(0).getDadosDoPlano());
//		System.out.println(plano2.get(4).getDadosDoPlano());
//		
//		
//		int nota1 = 10;
//		Integer nota2 = 5;
//		
//
//		ArrayList<Double> precosList = new ArrayList<>();
//		precosList.add(5.9);
//		precosList.add(8.2);
		
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Ouro");
		PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Platina");
		
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		
		int i = 0;
		
		while (i < planos.size()) {
			System.out.println(planos.get(i).getOperadora());	
			i++;
		}
		
		//looping FOR
		
		System.out.println("-------------FOR EACH------------");
		for (PlanoDeSaude plano : planos) {
			System.out.println(plano.getOperadora());
		}
		
		
		System.out.println("-----------FAZENDO------------");
		
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		especialidade1.setDescricao("Cuida do Coração");
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Clinico Geral");
		especialidade2.setDescricao("Cuida de tudo");
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Neurologista");
		especialidade3.setDescricao("Cuida do cérebro");
		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Pediatra");
		especialidade4.setDescricao("Cuida das crianças");
		
		ArrayList<Especialidade> listaDeEspecialidades = new ArrayList<>();
		listaDeEspecialidades.add(especialidade1);
		listaDeEspecialidades.add(especialidade2);
		listaDeEspecialidades.add(especialidade3);
		listaDeEspecialidades.add(especialidade4);
		
		for (Especialidade especialidade : listaDeEspecialidades) {
			System.out.printf("%s => %s\n", especialidade.getNome(), especialidade.getDescricao());
		}
		
		
		
		
//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//		
//		System.out.println(dao.listarTodos());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
