package ProjetoFinancas;

import java.util.Scanner;

import Projeto.CalcEmergencia1;
import Projeto.CalcEmergencia2;
import Projeto.CalcEmergencia3;

public class FinancasMain {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		GastosFixos gastosFixos = new GastosFixos();
		Gastos gastos = null;
		int x;
		double soma=0;
		int op1;
		double salario1 = 0;
		int opcao=-1,segundaOpcao=1;
		int op, op2, porcent;
		double salario = 0, limite = 0, gasto = 0;
		
		System.out.println("\n=================== Bem vindo ao sistema de finanças  =================");

		System.out.println("\nDigite os seus dados para ter acesso ao menu");
		
		System.out.println("\nDigite seu nome: ");
		String nome = read.next();
		System.out.println("\nDigite sua idade: ");
		int idade = read.nextInt();
		System.out.println("\nDigite sua profissao: ");
		String profissao = read.next();
		System.out.println("\nDigite o seu salario: ");
		double salario5 = read.nextDouble();

		Cliente cliente = new Cliente("cliente",0,"profissao",0);
		//FundoDeEmergencia emergencia = new FundoDeEmergencia(0);

		
		cliente.setNome(nome);
		
		cliente.setIdade(idade);
		
		cliente.setProfissao(profissao);
		
		cliente.setSalario(salario5);
				
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
								
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - Não");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
			
								break;
								
							case 2:
								System.out.println("\n======= Despesas de lazer =========");
								
								System.out.println("\nEntre com o seu Salário: ");
								salario = read.nextDouble();
								
								System.out.println("\nRecomendamos que você use apenas 15% do seu Salário nesse envelope. " +
										"Deseja continuar com 15%?" + "\n1- Sim \n2- Não");
								op2 = read.nextInt();
								
								
								if (op2 == 1)
								{
									limite = (salario*15)/100;
									System.out.println("\nO seu Limite é " + limite + " reais.");
									
									do
									{
										
										System.out.println("\nEscolha uma Categoria e entre com o seu Gasto Diário:"
												+ "\nCATEGORIA 1- COMIDA/ DELIVERY: "
												+ "\nCATEGORIA 2- PASSEIOS/FESTAS: "
												+ "\nCATEGORIA 3- ROUPAS/ACESSÓRIOS: "
												+ "\nCATEGORIA 4- OBJETOS: "
												+ "\nCATEGORIA 5- OUTROS: "
												+ "\nEntre com o 0 se Deseja sair do Programa.");
										op = read.nextInt();
										
										
											if (op == 1)
											{
												System.out.println("\nCATEGORIA 1- COMIDA/ DELIVERY:" +
												"\nEntre com o Valor Gasto: ");
												gasto = read.nextDouble();	
										
												limite = limite - gasto;
										
												System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
											}
											else if (op == 2)
											{
												System.out.println("\nCATEGORIA 2- PASSEIOS/FESTAS: " +
												"\nEntre com o Valor Gasto: ");
												gasto = read.nextDouble();	
										
												limite = limite - gasto;
										
												System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
											}
											else if (op == 3)
											{
										
												System.out.println("\nCATEGORIA 3- ROUPAS/ACESSÓRIOS: " +
												"\nEntre com o Valor Gasto: ");
												gasto = read.nextDouble();
										
												limite = limite - gasto;
										
												System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
											}	
											else if (op == 4)
											{	
												System.out.println("\nCATEGORIA 4- OBJETOS: " +
												"\nEntre com o Valor Gasto: ");
												gasto = read.nextDouble();
										
												limite = limite - gasto;
										
										
												System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
											}
											else if (op == 5)
											{
												System.out.println("\nCATEGORIA 5- OUTROS: " +
												"\nEntre com o Valor Gasto: ");
												gasto = read.nextDouble();
										
												limite = limite - gasto;
										
										
												System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
											}
											
											else if (op == 0)
											{
												op2 = 0;
												System.out.println("\nPROGRAMA FINALIZADO. ");
											}
											
											if (limite == 0 || limite < 0)
											{
												op2 = 0;
												System.out.println("\nVOCÊ ATINGIU O SEU LIMITE!");
												
												System.out.println("\nOPERAÇÃO FINALIZADA! \nNos vemos no próximo mês.");	
											}
									}
									
									while (op2 != 0);
								
								}
									
								if (op2 == 2)
								{
									
									System.out.println("\nQuantos % você Deseja usar nesse Envelope? ");
									porcent = read.nextInt(); 
									
									limite = (salario *porcent)/100;
									
									System.out.println("\nO seu Limite é " + limite + " reais");
									
									do 
									{
										
										System.out.println("\nEscolha uma Categoria e entre com o seu Gasto Diário:"
												+ "\nCATEGORIA 1- COMIDA/ DELIVERY: "
												+ "\nCATEGORIA 2- PASSEIOS/FESTAS: "
												+ "\nCATEGORIA 3- ROUPAS/ACESSÓRIOS: "
												+ "\nCATEGORIA 4- OBJETOS: "
												+ "\nCATEGORIA 5- OUTROS: "
												+ "\nEntre com o 0 se Deseja sair do Programa.");
										op = read.nextInt();
										
										if (op == 1)
										{
											System.out.println("\nCATEGORIA 1- COMIDA/ DELIVERY:" +
												"\nEntre com o Valor Gasto: ");
											gasto = read.nextDouble();	
										
											limite = limite - gasto;
										
											System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
										}
										else if (op == 2)
										{
											System.out.println("\nCATEGORIA 2- PASSEIOS/FESTAS: " +
												"\nEntre com o Valor Gasto: ");
											gasto = read.nextDouble();	
										
											limite = limite - gasto;
										
											System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
										}
										else if (op == 3)
										{
										
											System.out.println("\nCATEGORIA 3- ROUPAS/ACESSÓRIOS: " +
												"\nEntre com o Valor Gasto: ");
											gasto = read.nextDouble();
										
											limite = limite - gasto;
										
											System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
										}	
										else if (op == 4)
										{	
											System.out.println("\nCATEGORIA 4- OBJETOS: " +
												"\nEntre com o Valor Gasto: ");
											gasto = read.nextDouble();
										
											limite = limite - gasto;
										
											System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
										}
										else if (op == 5)
										{
											System.out.println("\nCATEGORIA 5- OUTROS: " +
												"\nEntre com o Valor Gasto: ");
											gasto = read.nextDouble();
										
											limite = limite - gasto;
										
											System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
										}	
										else if (op == 0)
										{
											op2 = 0;
											System.out.println("\nPROGRAMA FINALIZADO. ");
										}
										
										if (limite == 0 || limite < 0)
										{
											op2 = 0;
											System.out.println("\nVOCÊ ATINGIU O SEU LIMITE!");
											
											System.out.println("\nOPERAÇÃO FINALIZADA! \nNos vemos no próximo mês.");	
										}
								}
								
								while (op2 != 0);
									
									
									
								}
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - Não");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								break;
								
							case 3:
								System.out.println("\n======= Investimento  =========");
								
								double salarioInvest, percEnvelope, rendimentoCDB, impostoCDB, rendimentoLCI, somaFII=0.0, n2, somaAcoes=0.0;
								int n1, tempoCDB, tempoLCI;

								System.out.println("\nOi, " + nome + "! Ficamos felizes em te ver novamente! =)");
								System.out.println("\nQuanto você recebeu esse mês? (R$) ");
								salarioInvest = read.nextDouble(); //3000

								System.out.println("\nQual o percentual da sua renda você destinou para investimentos? (%)");
								percEnvelope = read.nextInt(); //20%
								
								Investimentos aplicacao1 = new Investimentos(salarioInvest, percEnvelope);
								aplicacao1.calcularValorInvestir(); // 600
								
								System.out.println("\nMaravilha! =D E como você distribuiu esse valor?\n\n\t(1) Apontar em renda fixa\n\t"
										+ "(2) Apontar em renda variável");
								n1 = read.nextInt();

								while (n1 != 2 && n1 != 1) {
									System.out.println("\nOpção inválida, tente novamente.");
									System.out.println("\nEntre com um número: ");
									n1 = read.nextInt();
								}

								do {
									if (n1 == 1) {
										System.out.println("\n\tApontamento em renda fixa");
										System.out.println("========================================= ");
										System.out.println("\n\nDigite um número dentre essas opções:" + "\n\n\t(1) CDB/LC\n\t(2) LCI/LCA ");
										int op3 = read.nextInt();
										switch (op3) {
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
											System.out.println("Opção inválida.");
											break;
										}
									
									} else {
										System.out.println("\n\tApontamento em renda variável");
										System.out.println("============================================= ");
										System.out.println("\nDigite um número dentre essas opções:"
												+ "\n\n\t(1) Ações brasileiras\n\t(2) Fundos Imobiliários");
										int op3 = read.nextInt();
										switch (op3) {
										case 1:
											System.out.println("Ações brasileiras");
											System.out.println("\nQuanto vc aplicou?");
											n2 = read.nextDouble();
											somaAcoes = somaAcoes + n2;
											System.out.println("R$ "+somaAcoes);
											break;

										case 2:
											System.out.println("Fundos Imobiliários");
											System.out.println("\nQuanto vc aplicou?");
											n2 = read.nextDouble();
											somaFII = somaFII + n2;
											System.out.println("R$ "+somaFII);
											break;

										default:
											System.out.println("Opção inválida.");
											break;
										}
									}
									System.out.println("\nQuer repetir o procedimento? Digite o número 1 para renda fixa, 2 para renda variável ou 0 para sair ");
									n1 = read.nextInt();
								} while (n1 == 2 || n1 ==1);
								
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - Não");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								break;	
								
							case 4:
								System.out.println("\n======= Doação  =========");
								int a,b,c,d,porcentagem=0,salarioDoacao;
								String destino;
									
								System.out.println("Informe o seu salario:");
								salarioDoacao = read.nextInt();
								System.out.println("\r\nVocê deseja realizar alguma doação?");
								System.out.println("1- Sim\n2- Não");
								a = read.nextInt();
								
								if(a<=2) {
								switch(a) {
								    case 1: 
								    	System.out.println("Qual a porcentagem com base no seu salário, você deseja doar?");
								    	porcentagem = read.nextInt();
								    	System.out.println("\r\nEu posso oferecer sugestões?");
										System.out.println("1- Sim\n2- Não");
										b = read.nextInt();
										Doacao ong = new Doacao(salarioDoacao,porcentagem);
										
										if(b<=2) { 
								    	switch (b) {
										 case 1:
											 System.out.println("\nMas antes de mostrar algumas das sugestões, esse mês você deseja doar para qual área: ");
											 System.out.println("1- Assistência social;\r\n"+"2- Cultura;\r\n"+"3- Saúde;\r\n"+ "4- Meio ambiente");
											 c =read.nextInt();	 
											 if(c<=4) { 
											switch (c) {
											 case 1:
												 System.out.println("Assistência social:");
												 System.out.println("1- CADI Brasil;\r\n"+ "2- Banco da providência - BP;\r\n"+"3- Amigos do bem - ADB.");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doação foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a próxima etapa!!");
												 }else {
													 System.out.println("Escolha incorreta, tente novamente");
												 }
												 break;
											 case 2:
												 System.out.println("Cultura");
												 System.out.println("1- GURI;\r\n"+ "2- Instituto Palmas;\r\n"+"3- Instituto da Cultura Afro no Brasil.");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doação foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a próxima etapa!!");
												 }else {
													 System.out.println("Escolha incorreta, tente novamente");
												 }
											     break;
											 case 3:
												 System.out.println("Saúde:");
												 System.out.println("1- TUCCA;\r\n"+ "2- Horas de vida;\r\n"+"3- ACD.\r\n");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doação foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a próxima etapa!!");
												 }else {
													 System.out.println("Escolha incorreta, tente novamente");
												 }
												 break;
											 case 4:
												 System.out.println("Meio Ambiente:");
												 System.out.println("1- SOS Mata Atlântica;\r\n"+ "2- WWF Brasil;\r\n"+"3- IPÊ.");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doação foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a próxima etapa!!");
												 }else {
													 System.out.println("Escolha incorreta, tente novamente");
										         }break; 	         
										}		 	
											 }break;
											 
										 case 2: 
											 System.out.println("\nTudo bem, desejo uma boa doação!!");
											 System.out.println("Por Favor, informe o nome do Destinatário:");
											 destino = read.next(); 
											 ong.imprimir();
											 System.out.println("Sua doação foi depositada para "+ destino);
											 System.out.println("Vamos para a próxima etapa!!");
											 break;
									}
								    	
							    }else {
								      System.out.println("Escolha incorreta, tente novamente");		
							    }break;
								 
								    case 2:{
								    Doacao semong = new Doacao(salarioDoacao, porcentagem);
								    System.out.println("Seu saldo atual é "+ salario); 
								    System.out.println("Vamos para a próxima etapa!!");
								    break;
							 }   
						  }
								}else {
									System.out.println("Por Favor, entre com o valor 1 ou 2");
								}
								
								System.out.println("\n=============== Deseja continuar ============== \n1 - Sim \n2 - Não");
								System.out.println("Digite o numero: ");
								segundaOpcao = read.nextInt();
								
								break;	
								
							case 5:
								System.out.println("\n======= Bem vindo a simulação de fundo de emergência  =========");
								System.out.println("Digite o valor de suas despesas medias: ");
								System.out.println("\nAqui é a onde vamos simular sua reserva de emergência, o que é isso?\n"+
										"Caso um imprevisto aconteca, voce tem esse valor para garantir que suas contas fixas sejam pagas\n");
										System.out.println("Como montar sua reserva. Para isso, temos 3 planos:\r\n"
												+ "Pequeno - Para 3 meses;\r\n"
												+ "Medio - Para 4 meses;\r\n"
												+ "Grande - Para 6 meses;\n");
										System.out.println("Para saber o seu saldo de emergência, digite o seu custo fixo mensal:");
										salario1 = read.nextDouble();
										System.out.println("Escolha uma opção:\n"+"1-Plano Grande;\n"+"2- Plano Médio;\n"+"3 - Plano Pequeno;\n");
										
										op1 = read.nextInt();
										
										
										switch(op1) {
										case 1:
											
										 CalcEmergencia1 teste1= new CalcEmergencia1(salario1); 
												
										teste1.imprimirInfo1();
										break;
										case 2:	
											
										CalcEmergencia2 teste2= new CalcEmergencia2(salario1); 
										
										teste2.imprimirInfo2();
										break;
										case 3:
									    CalcEmergencia3 teste3= new CalcEmergencia3(salario1); 
										
										teste3.imprimirInfo3();
										break;
										
										}
							
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