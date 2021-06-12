package ProjetoFinancas;

import java.util.Scanner;

public class FinancasMain {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		GastosFixos gastosFixos = new GastosFixos();
		Gastos gastos = null;
		int x;
		double soma=0;
		
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
		//FundoDeEmergencia emergencia = new FundoDeEmergencia(0);

		
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
								do
								{
									
									System.out.println("\n***************Qual gasto deseja inserir?***************\n\n1-Aluguel\n2-Iptu\n3-Luz\n4-Agua\n5-Alimentacao"
											+ "\n6-Internet\n7-Academia\n8-Internet Celular\n9-Streaming\n10-Emprestimo");
									
									x=read.nextInt();
									
									if(x==1)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com Aluguel: ");
										double aluguel = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=aluguel;
										
										gastosFixos.Aluguel(aluguel);	
									}
									else if(x==2)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com IPTU: ");
										double iptu = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=iptu;
										
										gastosFixos.Iptu(iptu);	
									}
									else if(x==3)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com conta de luz: ");
										double luz = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=luz;
										
										gastosFixos.Luz(luz);
									}
									else if(x==4)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com conta de agua: ");
										double agua = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=agua;
										
										gastosFixos.Agua(agua);
									}
									else if(x==5)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com alimentacao: ");
										double alimentacao = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=alimentacao;
										
										gastosFixos.Alimentacao(alimentacao);
									}
									else if(x==6)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com internet: ");
										double internet = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=internet;
										
										gastosFixos.Internet(internet);
									}
									else if(x==7)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com academia: ");
										double academia = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=academia;
										
										gastosFixos.Academia(academia);
									}
									else if(x==8)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com internet celular: ");
										double celInter = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=celInter;
										
										gastosFixos.CelInter(celInter);
									}
									else if(x==9)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com streaming: ");
										double streaming = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=streaming;
										
										gastosFixos.Streaming(streaming);
									}
									else if(x==10)
									{
										gastos=gastosFixos;
										System.out.println("\nQual valor do seu emprestimo: ");
										double emprestimo = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=emprestimo;
										
										gastosFixos.Emprestimo(emprestimo);
									}
									else
									{
										System.out.println("\nInformacao invalida!");
									}
								}
								while(x>0 && x<=10);
								double resultado = salario-soma;
								
								System.out.println("\nSeu gasto fixo mensal ficou em: "+soma);
								System.out.println("\nCom valor de salario informado sobrara: "+resultado);
								
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
								
								double salarioInvest, percEnvelope, rendimentoCDB, impostoCDB, rendimentoLCI, somaFII=0.0, n2, somaAcoes=0.0;
								int n1, tempoCDB, tempoLCI;

								System.out.println("\nOi, " + nome + "! Ficamos felizes em te ver novamente! =)");
								System.out.println("\nQuanto voc� recebeu esse m�s? (R$) ");
								salarioInvest = read.nextDouble(); //3000

								System.out.println("\nQual o percentual da sua renda voc� destinou para investimentos? (%)");
								percEnvelope = read.nextInt(); //20%
								
								Investimentos aplicacao1 = new Investimentos(salarioInvest, percEnvelope);
								aplicacao1.calcularValorInvestir(); // 600
								
								System.out.println("\nMaravilha! =D E como voc� distribuiu esse valor?\n\n\t(1) Apontar em renda fixa\n\t"
										+ "(2) Apontar em renda vari�vel");
								n1 = read.nextInt();

								while (n1 != 2 && n1 != 1) {
									System.out.println("\nOp��o inv�lida, tente novamente.");
									System.out.println("\nEntre com um n�mero: ");
									n1 = read.nextInt();
								}

								do {
									if (n1 == 1) {
										System.out.println("\n\tApontamento em renda fixa");
										System.out.println("========================================= ");
										System.out.println("\n\nDigite um n�mero dentre essas op��es:" + "\n\n\t(1) CDB/LC\n\t(2) LCI/LCA ");
										int op = read.nextInt();
										switch (op) {
										case 1:
											System.out.println("CDB/LC");
											
											System.out.println("\nQual o rendimento desse CDB?");
											rendimentoCDB = read.nextDouble(); //13%
											System.out.println("\nQual o imposto desse CDB?");
											impostoCDB = read.nextDouble(); //17,5%
											System.out.println("\nQual o tempo desse CDB?");
											tempoCDB = read.nextInt(); //1
											
											Investimentos aplicacao2 = new Investimentos(salarioInvest, percEnvelope, rendimentoCDB,
													impostoCDB, tempoCDB);
											
											aplicacao2.calcularCDB();
											
											break;
											
										case 2:
											System.out.println("LCI/LCA");
											
											System.out.println("\nQual o rendimento desse LCI/LCA?");
											rendimentoLCI = read.nextDouble();
											System.out.println("\nQual o tempo desse LCI/LCA?");
											tempoLCI = read.nextInt();
											
											Investimentos aplicacao3 = new Investimentos(salarioInvest, percEnvelope, rendimentoLCI, tempoLCI);
											
											aplicacao3.calcularLCI();
											
											break;
											
										default:
											System.out.println("Op��o inv�lida.");
											break;
										}
									
									} else {
										System.out.println("\n\tApontamento em renda vari�vel");
										System.out.println("============================================= ");
										System.out.println("\nDigite um n�mero dentre essas op��es:"
												+ "\n\n\t(1) A��es brasileiras\n\t(2) Fundos Imobili�rios");
										int op = read.nextInt();
										switch (op) {
										case 1:
											System.out.println("A��es brasileiras");
											n2 = read.nextDouble();
											somaAcoes = somaAcoes + n2;
											System.out.println("R$ "+somaAcoes);
											break;

										case 2:
											System.out.println("Fundos Imobili�rios");
											System.out.println("\nQuanto vc aplicou?");
											n2 = read.nextDouble();
											somaFII = somaFII + n2;
											System.out.println("R$ "+somaFII);
											break;

										default:
											System.out.println("Op��o inv�lida.");
											break;
										}
									}
									System.out.println("\nQuer repetir o procedimento? Digite o n�mero 1 para renda fixa, 2 para renda vari�vel ou 0 para sair ");
									n1 = read.nextInt();
								} while (n1 == 2 || n1 ==1);
								
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - N�o");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								break;	
								
							case 4:
								System.out.println("\n======= Doa��o  =========");
								int a,b,c,d,porcentagem=0,salarioDoacao;
								String destino;
									
								System.out.println("Informe o seu salario:");
								salarioDoacao = read.nextInt();
								System.out.println("\r\nVoc� deseja realizar alguma doa��o?");
								System.out.println("1- Sim\n2- N�o");
								a = read.nextInt();
								
								if(a<=2) {
								switch(a) {
								    case 1: 
								    	System.out.println("Qual a porcentagem com base no seu sal�rio, voc� deseja doar?");
								    	porcentagem = read.nextInt();
								    	System.out.println("\r\nEu posso oferecer sugest�es?");
										System.out.println("1- Sim\n2- N�o");
										b = read.nextInt();
										Doa��o ong = new Doa��o(salarioDoacao,porcentagem);
										
										if(b<=2) { 
								    	switch (b) {
										 case 1:
											 System.out.println("\nMas antes de mostrar algumas das sugest�es, esse m�s voc� deseja doar para qual �rea: ");
											 System.out.println("1- Assist�ncia social;\r\n"+"2- Cultura;\r\n"+"3- Sa�de;\r\n"+ "4- Meio ambiente");
											 c =read.nextInt();	 
											 if(c<=4) { 
											switch (c) {
											 case 1:
												 System.out.println("Assist�ncia social:");
												 System.out.println("1- CADI Brasil;\r\n"+ "2- Banco da provid�ncia - BP;\r\n"+"3- Amigos do bem - ADB.");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doa��o foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a pr�xima etapa!!");
												 }else {
													 System.out.println("Escolha incorreta, tente novamente");
												 }
												 break;
											 case 2:
												 System.out.println("Cultura");
												 System.out.println("1- GURI;\r\n"+ "2- Instituto Palmas;\r\n"+"3- Instituto da Cultura Afro no Brasil.");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doa��o foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a pr�xima etapa!!");
												 }else {
													 System.out.println("Escolha incorreta, tente novamente");
												 }
											     break;
											 case 3:
												 System.out.println("Sa�de:");
												 System.out.println("1- TUCCA;\r\n"+ "2- Horas de vida;\r\n"+"3- ACD.\r\n");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doa��o foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a pr�xima etapa!!");
												 }else {
													 System.out.println("Escolha incorreta, tente novamente");
												 }
												 break;
											 case 4:
												 System.out.println("Meio Ambiente:");
												 System.out.println("1- SOS Mata Atl�ntica;\r\n"+ "2- WWF Brasil;\r\n"+"3- IP�.");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doa��o foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a pr�xima etapa!!");
												 }else {
													 System.out.println("Escolha incorreta, tente novamente");
										         }break; 	         
										}		 	
											 }break;
											 
										 case 2: 
											 System.out.println("\nTudo bem, desejo uma boa doa��o!!");
											 System.out.println("Por Favor, informe o nome do Destinat�rio:");
											 destino = read.next(); 
											 ong.imprimir();
											 System.out.println("Sua doa��o foi depositada para "+ destino);
											 System.out.println("Vamos para a pr�xima etapa!!");
											 break;
									}
								    	
							    }else {
								      System.out.println("Escolha incorreta, tente novamente");		
							    }break;
								 
								    case 2:{
								    Doa��o semong = new Doa��o(salarioDoacao, porcentagem);
								    System.out.println("Seu saldo atual � "+ semong.getSalario()); 
								    System.out.println("Vamos para a pr�xima etapa!!");
								    break;
							 }   
						  }
								}else {
									System.out.println("Por Favor, entre com o valor 1 ou 2");
								}
								
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - N�o");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								
								break;	
								
							case 5:
								System.out.println("\n======= Bem vindo a simula��o de fundo de emerg�ncia  =========");
								System.out.println("Digite o valor de suas despesas medias: ");
								double despesas = read.nextDouble();
		
								//emergencia.setDespesas(despesas);
								
								//emergencia.imprimirInfo();
								
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