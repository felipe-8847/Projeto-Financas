package ProjetoFinancas;

import java.util.Scanner;

public class FinancasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int opcao=-1,segundaOpcao=1;
		
		System.out.println("\n=================== Bem vindo ao sistema de finan�as  =================");

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
			
			System.out.println("\n=================== Bem vindo ao sistema de finan�as ==================          ");

			System.out.println("\nEscolha a sua op��o de recomenda��o desejada!");
			
			System.out.println("\n1 - Gastos fixos \n2 - Despesas de lazer \n3 - Investimento \n4 - Doa��o \n5 - Fundo de emerg�ncia \n0 - Sair");

			System.out.println("Digite o numero: ");
			
			opcao = read.nextInt();
			

				if(opcao != 0) {
					  switch(opcao) {
						
							case 1:
								System.out.println("\n======= Gastos fixos =========");
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - N�o");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
			
								break;
								
							case 2:
								System.out.println("\n======= Despesas de lazer =========");
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - N�o");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								break;
								
							case 3:
								System.out.println("\n======= Investimento  =========");
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - N�o");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								break;	
								
							case 4:
								System.out.println("\n======= Doa��o  =========");
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - N�o");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								break;	
								
							case 5:
								System.out.println("\n======= Bem vindo a simula��o de fundo de emerg�ncia  =========");
								System.out.println("Digite o valor de suas despesas medias: ");
								double despesas = read.nextDouble();
		
								emergencia.setDespesas(despesas);
								
								emergencia.imprimirInfo();
								
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - N�o");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								break;	
					
														
								default:
									
									System.out.println("\n======= Op��o invalida =========");
									System.out.println("\n======= Escolha a op��o =========");
									System.out.println("\n1 - Gastos fixos \n2 - Despesas de lazer \n3 - Investimento \n4 - Doa��o \n5 - Fundo de emerg�ncia \n0 - Sair");
									System.out.println("Digite o numero: ");
									opcao = read.nextInt();
									
									if(opcao < 0 || opcao > 6) {
										System.out.println("\n======= Op��o invalida =========");
										
									}		
		        		 }
			       }
			
					if(segundaOpcao == 2) {
								
							opcao = 0;	
					}
				
		}
			
	}

}
