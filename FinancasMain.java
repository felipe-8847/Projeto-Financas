package ProjetoFinancas;

import java.util.Scanner;


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
		
		System.out.println("\n=================== BEM VINDES AO SISTEMA DE FINAN�AS =================== ");

		System.out.println("\nDigite os seus dados para ter acesso ao nosso menu: ");
		
		System.out.println("\nComo podemos te chamar? ");
		String nome = read.next();
		System.out.println("\nDigite sua idade: ");
		int idade = read.nextInt();
		System.out.println("\nQual sua profiss�o: ");
		String profissao = read.next();
		System.out.println("\nDigite o seu sal�rio: ");
		double salario5 = read.nextDouble();

		Cliente cliente = new Cliente("cliente",0,"profiss�o",0);
		//FundoDeEmergencia emergencia = new FundoDeEmergencia(0);

		
		cliente.setNome(nome);
		
		cliente.setIdade(idade);
		
		cliente.setProfissao(profissao);
		
		cliente.setSalario(salario5);
				
		cliente.imprimirInfo();

		
		while(opcao != 0) {
			
			System.out.println("\n======================= MENU ======================= ");

			System.out.println("\nParab�ns! Escolha a sua op��o desejada!");
			
			System.out.println("\n(1) Gastos fixos \n(2) Despesas de lazer \n(3) Investimento \n(4) Doa��o \n(5) Fundo de emerg�ncia \n"
					+ "(0) Sair");

			System.out.println("Digite a op��o: ");
			
			opcao = read.nextInt();
			

				if(opcao != 0) {
					  switch(opcao) {
						
							case 1:
								System.out.println("\n=================== GASTOS FIXOS =================== ");
								do
								{
									
									System.out.println("\n(1) Aluguel\n(2) IPTU\n(3) Luz\n(4) �gua\n(5) Alimenta��o"
											+ "\n(6) Internet residencial\n(7) Academia\n(8) Internet Celular\n(9) Streaming\n(10) Financiamento"
											+ "\n(0) Para retornar ao menu principal");
									
									x=read.nextInt();
									
									if(x==1)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com aluguel? ");
										double aluguel = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=aluguel;
										
										gastosFixos.Aluguel(aluguel);
										System.out.println("\n-----------------------------------------------------");
									}
									else if(x==2)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com IPTU? ");
										double iptu = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=iptu;
										
										gastosFixos.Iptu(iptu);	
										System.out.println("\n-----------------------------------------------------");
									}
									else if(x==3)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com conta de luz? ");
										double luz = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=luz;
										
										gastosFixos.Luz(luz);
										System.out.println("\n-----------------------------------------------------");
									}
									else if(x==4)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com conta de �gua? ");
										double agua = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=agua;
										
										gastosFixos.Agua(agua);
										System.out.println("\n-----------------------------------------------------");
									}
									else if(x==5)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com alimenta��o? ");
										double alimentacao = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=alimentacao;
										
										gastosFixos.Alimentacao(alimentacao);
										System.out.println("\n-----------------------------------------------------");
									}
									else if(x==6)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com internet residencial? ");
										double internet = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=internet;
										
										gastosFixos.Internet(internet);
										System.out.println("\n-----------------------------------------------------");
									}
									else if(x==7)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com academia? ");
										double academia = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=academia;
										
										gastosFixos.Academia(academia);
										System.out.println("\n-----------------------------------------------------");
									}
									else if(x==8)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com internet celular? ");
										double celInter = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=celInter;
										
										gastosFixos.CelInter(celInter);
										System.out.println("\n-----------------------------------------------------");
									}
									else if(x==9)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com streaming? ");
										double streaming = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=streaming;
										
										gastosFixos.Streaming(streaming);
										System.out.println("\n-----------------------------------------------------");
									}
									else if(x==10)
									{
										gastos=gastosFixos;
										System.out.println("\nQual valor do seu financiamento? ");
										double emprestimo = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=emprestimo;
										
										gastosFixos.Emprestimo(emprestimo);
										System.out.println("\n-----------------------------------------------------");
									}
									else
									{
										System.out.println("\nINFORMA��O INV�LIDA!");
									}
								}
								while(x>0 && x<=10);
								double resultado = salario5-soma;
								
								System.out.println("\nSeu gasto fixo mensal ficou em R$"+soma);
								System.out.println("\nBom..., agora voc� tem isso para gerenciar R$"+resultado);
								
								System.out.println("\nDeseja continuar? \n(1) Sim \n(2) N�o");
								System.out.println("Digite a op��o: ");
								segundaOpcao = read.nextInt();
			
								break;
								
							case 2:
								System.out.println("\n=================== GASTOS DE LAZER =================== ");
								
								System.out.println("\nEntre com o seu sal�rio: ");
								salario = read.nextDouble();
								
								System.out.println("\nRecomendamos que voc� use apenas 15% do seu sal�rio nesse envelope. " +
										"Deseja continuar com 15%?" + "\n(1) Sim \n(2) N�o");
								op2 = read.nextInt();
								
								
								if (op2 == 1)
								{
									limite = (salario*15)/100;
									System.out.println("\n-----------------------------------------------------");
									System.out.println("\nO seu limite � R$" + limite);
									System.out.println("\n-----------------------------------------------------");
									
									do
									{
										
										System.out.println("\nEscolha uma categoria e entre com o seu gasto di�rio: "
												+ "\n(1) Comida / Delivery "
												+ "\n(2) Passeios / Festas"
												+ "\n(3) Roupas / Acess�rios"
												+ "\n(4) Objetos"
												+ "\n(5) Outros"
												+ "\n(0) Para retornar ao menu principal");
										op = read.nextInt();
										
										
											if (op == 1)
											{
												System.out.println("\n(1) Comida / Delivery " +
												"\nEntre com o valor gasto: ");
												gasto = read.nextDouble();	
										
												limite = limite - gasto;
												
												System.out.println("\n-----------------------------------------------------");
												System.out.println("\nO seu limite passou a ser R$" + limite);
												System.out.println("\n-----------------------------------------------------");
											}
											else if (op == 2)
											{
												System.out.println("\n(2) Passeios / Festas" +
												"\nEntre com o valor gasto: ");
												gasto = read.nextDouble();	
										
												limite = limite - gasto;
												
												System.out.println("\n-----------------------------------------------------");
												System.out.println("\nO seu limite passou a ser R$" + limite);
												System.out.println("\n-----------------------------------------------------");
											}
											else if (op == 3)
											{
										
												System.out.println("\n(3) Roupas / Acess�rios" +
												"\nEntre com o valor gasto: ");
												gasto = read.nextDouble();
										
												limite = limite - gasto;
										
												System.out.println("\n-----------------------------------------------------");
												System.out.println("\nO seu limite passou a ser R$" + limite);
												System.out.println("\n-----------------------------------------------------");
											}	
											else if (op == 4)
											{	
												System.out.println("\n(4) Objetos" +
												"\nEntre com o valor gasto: ");
												gasto = read.nextDouble();
										
												limite = limite - gasto;
										
												System.out.println("\n-----------------------------------------------------");
												System.out.println("\nO seu limite passou a ser R$" + limite);
												System.out.println("\n-----------------------------------------------------");
											}
											else if (op == 5)
											{
												System.out.println("\n(5) Outros" +
												"\nEntre com o valor gasto: ");
												gasto = read.nextDouble();
										
												limite = limite - gasto;
										
												System.out.println("\n-----------------------------------------------------");
												System.out.println("\nO seu limite passou a ser R$" + limite);
												System.out.println("\n-----------------------------------------------------");
											}
											
											else if (op == 0)
											{
												op2 = 0;
												System.out.println("\nPROGRAMA FINALIZADO. ");
											}
											
											if (limite == 0 || limite < 0)
											{
												op2 = 0;
												System.out.println("\nVOC� ATINGIU O SEU LIMITE!");
												
												System.out.println("\nOPERA��O FINALIZADA!\nNos vemos no pr�ximo m�s =)");	
											}
									}
									
									while (op2 != 0);
								
								}
									
								if (op2 == 2)
								{
									
									System.out.println("\nQuantos % voc� deseja usar nesse envelope? ");
									porcent = read.nextInt(); 
									
									limite = (salario *porcent)/100;
									
									System.out.println("\nO seu limite � de R$" + limite);
									
									do 
									{
										
										System.out.println("\nEscolha uma categoria e entre com o seu gasto di�rio: "
												+ "\n(1) Comida / Delivery "
												+ "\n(2) Passeios / Festas"
												+ "\n(3) Roupas / Acess�rios"
												+ "\n(4) Objetos"
												+ "\n(5) Outros"
												+ "\n(0) Para retornar ao menu principal");
										op = read.nextInt();
										
										
											if (op == 1)
											{
												System.out.println("\n(1) Comida / Delivery " +
												"\nEntre com o valor gasto: ");
												gasto = read.nextDouble();	
										
												limite = limite - gasto;
												
												System.out.println("\n-----------------------------------------------------");
												System.out.println("\nO seu limite passou a ser R$" + limite);
												System.out.println("\n-----------------------------------------------------");
											}
											else if (op == 2)
											{
												System.out.println("\n(2) Passeios / Festas" +
												"\nEntre com o valor gasto: ");
												gasto = read.nextDouble();	
										
												limite = limite - gasto;
												
												System.out.println("\n-----------------------------------------------------");
												System.out.println("\nO seu limite passou a ser R$" + limite);
												System.out.println("\n-----------------------------------------------------");
											}
											else if (op == 3)
											{
										
												System.out.println("\n(3) Roupas / Acess�rios" +
												"\nEntre com o valor gasto: ");
												gasto = read.nextDouble();
										
												limite = limite - gasto;
										
												System.out.println("\n-----------------------------------------------------");
												System.out.println("\nO seu limite passou a ser R$" + limite);
												System.out.println("\n-----------------------------------------------------");
											}	
											else if (op == 4)
											{	
												System.out.println("\n(4) Objetos" +
												"\nEntre com o valor gasto: ");
												gasto = read.nextDouble();
										
												limite = limite - gasto;
										
												System.out.println("\n-----------------------------------------------------");
												System.out.println("\nO seu limite passou a ser R$" + limite);
												System.out.println("\n-----------------------------------------------------");
											}
											else if (op == 5)
											{
												System.out.println("\n(5) Outros" +
												"\nEntre com o valor gasto: ");
												gasto = read.nextDouble();
										
												limite = limite - gasto;
										
												System.out.println("\n-----------------------------------------------------");
												System.out.println("\nO seu limite passou a ser R$" + limite);
												System.out.println("\n-----------------------------------------------------");
											}
											
											else if (op == 0)
											{
												op2 = 0;
												System.out.println("\nPROGRAMA FINALIZADO. ");
											}
											
											if (limite == 0 || limite < 0)
											{
												op2 = 0;
												System.out.println("\nVOC� ATINGIU O SEU LIMITE!");
												
												System.out.println("\nOPERA��O FINALIZADA!\nNos vemos no pr�ximo m�s =)");	
											}
									}
									while (op2 != 0);
									
								}
								System.out.println("\nDeseja continuar? \n(1) Sim \n(2) N�o");
								System.out.println("Digite a op��o: ");
								segundaOpcao = read.nextInt();
								break;
								
							case 3:
								System.out.println("\n=================== INVESTIMENTO =================== ");
								
								double salarioInvest, percEnvelope, rendimentoCDB, impostoCDB, rendimentoLCI, somaFII=0.0, n2, somaAcoes=0.0;
								int n1, tempoCDB, tempoLCI;

								System.out.println("\nOi, " + nome + "! Ficamos felizes em te ver novamente! =)");
								System.out.println("\nQuanto voc� recebeu esse m�s? ");
								salarioInvest = read.nextDouble(); //3000

								System.out.println("\nQual percentual da sua renda voc� destinou para investimentos? ");
								percEnvelope = read.nextInt(); //20%
								
								Investimentos aplicacao1 = new Investimentos(salarioInvest, percEnvelope);
								aplicacao1.calcularValorInvestir(); // 600
								
								System.out.println("\nMaravilha! =D E como voc� distribuiu esse valor?\n\n(1) Apontar em renda fixa\n"
										+ "(2) Apontar em renda vari�vel");
								n1 = read.nextInt();

								while (n1 != 2 && n1 != 1) {
									System.out.println("\nOP��O INV�LIDA, tente novamente.");
									System.out.println("\nEntre com um n�mero: ");
									n1 = read.nextInt();
								}

								do {
									if (n1 == 1) {
										System.out.println("\n=================== APONTAMENTO RENDA FIXA ===================");
										System.out.println("\nDigite um n�mero dentre essas op��es:" + "\n(1) CDB/LC\n(2) LCI/LCA ");
										int op3 = read.nextInt();
										switch (op3) {
										case 1:
											System.out.println("CDB/LC");
											
											System.out.println("\nQual o rendimento desse CDB?");
											rendimentoCDB = read.nextDouble(); //13%
											System.out.println("\nQual o imposto desse CDB?");
											impostoCDB = read.nextDouble(); //17,5%
											System.out.println("\nQual o tempo (vencimento) desse CDB?");
											tempoCDB = read.nextInt(); //1
											
											Investimentos aplicacao2 = new Investimentos(salarioInvest, percEnvelope, rendimentoCDB,
													impostoCDB, tempoCDB);
											
											aplicacao2.calcularCDB();
											
											break;
											
										case 2:
											System.out.println("LCI/LCA");
											
											System.out.println("\nQual o rendimento desse LCI/LCA?");
											rendimentoLCI = read.nextDouble();
											System.out.println("\nQual o tempo (vencimento) desse LCI/LCA?");
											tempoLCI = read.nextInt();
											
											Investimentos aplicacao3 = new Investimentos(salarioInvest, percEnvelope, rendimentoLCI, tempoLCI);
											
											aplicacao3.calcularLCI();
											
											break;
											
										default:
											System.out.println("OP��O INV�LIDA.");
											break;
										}
									
									} else {
										System.out.println("\n=================== APONTAMENTO RENDA VARI�VEL ===================");
										System.out.println("\nDigite um n�mero dentre essas op��es:"
												+ "\n(1) A��es brasileiras\n(2) Fundos Imobili�rios");
										int op3 = read.nextInt();
										switch (op3) {
										case 1:
											System.out.println("A��es brasileiras");
											System.out.println("\nQuanto voc� aplicou?");
											n2 = read.nextDouble();
											somaAcoes = somaAcoes + n2;
											System.out.println("R$"+somaAcoes);
											break;

										case 2:
											System.out.println("Fundos Imobili�rios");
											System.out.println("\nQuanto voc� aplicou?");
											n2 = read.nextDouble();
											somaFII = somaFII + n2;
											System.out.println("R$"+somaFII);
											break;

										default:
											System.out.println("OP��O INV�LIDA.");
											break;
										}
									}
									System.out.println("\nQuer repetir o procedimento? Digite o n�mero \n(1) para renda fixa \n(2) para renda vari�vel "
											+ "\n(0) para sair ");
									n1 = read.nextInt();
								} while (n1 == 2 || n1 ==1);
								
								System.out.println("\nDeseja continuar? \n(1) Sim \n(2) N�o");
								System.out.println("Digite a op��o: ");
								segundaOpcao = read.nextInt();
								break;	
								
							case 4:
								System.out.println("\n=================== DOA��O ===================");
								int a,b,c,d,porcentagem=0,salarioDoacao;
								String destino;
									
								System.out.println("Entre com o seu sal�rio:");
								salarioDoacao = read.nextInt();
								System.out.println("\nVoc� deseja realizar alguma doa��o?");
								System.out.println("(1) Sim\n(2) N�o");
								a = read.nextInt();
								
								if(a<=2) {
								switch(a) {
								    case 1: 
								    	System.out.println("\nQual percentual da sua renda voc� destinou para doa��o? ");
								    	porcentagem = read.nextInt();
								    	System.out.println("\nEu posso oferecer sugest�es?");
										System.out.println("(1) Sim\n(2) N�o");
										b = read.nextInt();
										Doacao ong = new Doacao(salarioDoacao,porcentagem);
										
										if(b<=2) { 
								    	switch (b) {
										 case 1:
											 System.out.println("\nMas antes de mostrar algumas das sugest�es, esse m�s voc� deseja doar para "
											 		+ "qual �rea? ");
											 System.out.println("(1) Assist�ncia social\n"+"(2) Cultura\n"+"(3) Sa�de\n"+ "(4) Meio ambiente");
											 c =read.nextInt();	 
											 if(c<=4) { 
											switch (c) {
											 case 1:
												 System.out.println("\n=================== ASSIST�NCIA SOCIAL ===================");
												 System.out.println("(1) CADI Brasil\n(2) Banco da provid�ncia\n(3) Amigos do bem");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doa��o foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a pr�xima etapa!! =D");
												 }else {
													 System.out.println("OP��O INV�LIDA, tente novamente");
												 }
												 break;
											 case 2:
												 System.out.println("\n=================== CULTURA ===================");
												 System.out.println("(1) GURI\n"+ "(2) Instituto Palmas\n"+"(3) Instituto da Cultura Afro no Brasil");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doa��o foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a pr�xima etapa!! =D");
												 }else {
													 System.out.println("OP��O INV�LIDA, tente novamente");
												 }
											     break;
											 case 3:
												 System.out.println("\n=================== SA�DE ===================");
												 System.out.println("(1) TUCCA\n"+ "(2) Horas de vida\n"+"(3) ACD\n");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doa��o foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a pr�xima etapa!! =D");
												 }else {
													 System.out.println("OP��O INV�LIDA, tente novamente");
												 }
												 break;
											 case 4:
												 System.out.println("\n=================== MEIO AMBIENTE ===================");
												 System.out.println("(1) SOS Mata Atl�ntica\n"+ "(2) WWF Brasil\n"+"(3) IP�");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doa��o foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a pr�xima etapa!! =D");
												 }else {
													 System.out.println("OP��O INV�LIDA, tente novamente");
										         }break; 	         
										}		 	
											 }break;
											 
										 case 2: 
											 System.out.println("\nTudo bem, desejo uma boa doa��o!!");
											 System.out.println("Por favor, informe o nome do destinat�rio:");
											 destino = read.next(); 
											 ong.imprimir();
											 System.out.println("Sua doa��o foi depositada para "+ destino);
											 System.out.println("Vamos para a pr�xima etapa!! =D");
											 break;
									}
								    	
							    }else {
								      System.out.println("OP��O INV�LIDA, tente novamente");		
							    }break;
								 
								    case 2:{
								    Doacao semong = new Doacao(salarioDoacao, porcentagem);
								    System.out.println("Seu saldo atual � "+ salarioDoacao); 
								    System.out.println("Vamos para a pr�xima etapa!! =D");
								    break;
							 }   
						  }
								}else {
									System.out.println("Por favor, entre com a op��o (1) ou (2)");
								}
								
								System.out.println("\nDeseja continuar? \n(1) Sim \n(2) N�o");
								System.out.println("Digite a op��o: ");
								segundaOpcao = read.nextInt();
								
								break;	
								
							case 5:
								System.out.println("\n=================== FUNDO DE EMERG�NCIA ===================");
								System.out.println("\nAqui � onde vamos simular sua reserva de emerg�ncia. Espera, mas o que � isso?\n"+
										"Caso um imprevisto aconte�a, voc� tem esse valor para garantir que suas contas fixas sejam pagas! Ufa!\n");
										System.out.println("Como montar sua reserva? Temos 3 planos:\n"
												+ "Curto >> 3 meses\n"
												+ "Medio >> 4 meses\n"
												+ "Longo >> 6 meses\n");
										System.out.println("Para saber o seu saldo de emerg�ncia, digite o seu gasto fixo mensal:");
										salario1 = read.nextDouble();
										System.out.println("Escolha uma op��o:\n"+"(1) Plano longo\n"+"(2) Plano m�dio\n"+"(3) Plano curto\n");
										
										op1 = read.nextInt();
										
										
										switch(op1) {
										case 1:
											
										 CalcEmergencia1 teste1= new CalcEmergencia1(salario1); 
										System.out.println("\n-----------------------------------------------------");
										teste1.imprimirInfo1();
										System.out.println("\n-----------------------------------------------------");
										break;
										case 2:	
											
										CalcEmergencia2 teste2= new CalcEmergencia2(salario1); 
										System.out.println("\n-----------------------------------------------------");
										teste2.imprimirInfo2();
										System.out.println("\n-----------------------------------------------------");
										break;
										case 3:
									    CalcEmergencia3 teste3= new CalcEmergencia3(salario1); 
									    System.out.println("\n-----------------------------------------------------");
										teste3.imprimirInfo3();
										System.out.println("\n-----------------------------------------------------");
										break;
										
										}
							
								System.out.println("\nDeseja continuar? \n(1) Sim \n(2) N�o");
								System.out.println("Digite a op��o: ");
								segundaOpcao = read.nextInt();
								break;	
					
														
								default:
									
									System.out.println("\n======================= OP��O INV�LIDA ======================= ");
									System.out.println("\n======================= MENU ======================= ");
																		
									System.out.println("\n(1) Gastos fixos \n(2) Despesas de lazer \n(3) Investimento \n(4) Doa��o \n(5) Fundo de emerg�ncia \n"
											+ "(0) Sair");
									System.out.println("Digite a op��o: ");
									opcao = read.nextInt();
									
									if(opcao < 0 || opcao > 6) 
									{
										System.out.println("\n======================= OP��O INV�LIDA ======================= ");	
									}		
		        		 }
			       }
			
					if(segundaOpcao == 2) 
					{	
							opcao = 0;	
					}
		}		
		System.out.println("\nAt� mais! Obrigade! =*");	
	}
}