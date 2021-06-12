package ProjetoFinancas;

import java.util.Scanner;

public class FinancasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int opcao=-1,segundaOpcao=1;
		
		System.out.println("\n=================== Bem vindo ao sistema de finanças  =================");

		System.out.println("\nDigite os seus dados para ter acesso ao menu");
		
		System.out.println("\nDigite seu nome: ");
		String nome = read.next();
		System.out.println("\nDigite sua idade: ");
		int idade = read.nextInt();
		System.out.println("\nDigite sua profissao: ");
		String profissao = read.next();
		System.out.println("\nDigite o seu salario: ");
		double salario = read.nextDouble();

		Cliente cliente = new Cliente("cliente",0,"profissao",0);
		FundoDeEmergencia emergencia = new FundoDeEmergencia(0);

		
		cliente.setNome(nome);
		
		cliente.setIdade(idade);
		
		cliente.setProfissao(profissao);
		
		cliente.setSalario(salario);
				
		cliente.imprimirInfo();

		
		while(opcao != 0) {
			
			System.out.println("\n=================== Bem vindo ao sistema de finanças ==================          ");

			System.out.println("\nEscolha a sua opção de recomendação desejada!");
			
			System.out.println("\n1 - Gastos fixos \n2 - Despesas de lazer \n3 - Investimento \n4 - Doação \n5 - Fundo de emergência \n0 - Sair");

			System.out.println("Digite o numero: ");
			
			opcao = read.nextInt();
			

				if(opcao != 0) {
					  switch(opcao) {
						
							case 1:
								System.out.println("\n======= Gastos fixos =========");
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - Não");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
			
								break;
								
							case 2:
								System.out.println("\n======= Despesas de lazer =========");
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - Não");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								break;
								
							case 3:
								System.out.println("\n======= Investimento  =========");
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - Não");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								break;	
								
							case 4:
								System.out.println("\n======= Doação  =========");
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - Não");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								break;	
								
							case 5:
								System.out.println("\n======= Bem vindo a simulação de fundo de emergência  =========");
								System.out.println("Digite o valor de suas despesas medias: ");
								double despesas = read.nextDouble();
		
								emergencia.setDespesas(despesas);
								
								emergencia.imprimirInfo();
								
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - Não");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								break;	
					
														
								default:
									
									System.out.println("\n======= Opção invalida =========");
									System.out.println("\n======= Escolha a opção =========");
									System.out.println("\n1 - Gastos fixos \n2 - Despesas de lazer \n3 - Investimento \n4 - Doação \n5 - Fundo de emergência \n0 - Sair");
									System.out.println("Digite o numero: ");
									opcao = read.nextInt();
									
									if(opcao < 0 || opcao > 6) {
										System.out.println("\n======= Opção invalida =========");
										
									}		
		        		 }
			       }
			
					if(segundaOpcao == 2) {
								
							opcao = 0;	
					}
				
		}
			
	}

}
