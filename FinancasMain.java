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
		
		System.out.println("\n=================== BEM VINDES AO SISTEMA DE FINANÇAS =================== ");

		System.out.println("\nDigite os seus dados para ter acesso ao nosso menu: ");
		
		System.out.println("\nComo podemos te chamar? ");
		String nome = read.next();
		System.out.println("\nDigite sua idade: ");
		int idade = read.nextInt();
		System.out.println("\nQual sua profissão: ");
		String profissao = read.next();
		System.out.println("\nDigite o seu salário: ");
		double salario5 = read.nextDouble();

		Cliente cliente = new Cliente("cliente",0,"profissão",0);
		//FundoDeEmergencia emergencia = new FundoDeEmergencia(0);

		
		cliente.setNome(nome);
		
		cliente.setIdade(idade);
		
		cliente.setProfissao(profissao);
		
		cliente.setSalario(salario5);
				
		cliente.imprimirInfo();

		
		while(opcao != 0) {
			
			System.out.println("\n======================= MENU ======================= ");

			System.out.println("\nParabéns! Escolha a sua opção desejada!");
			
			System.out.println("\n(1) Gastos fixos \n(2) Despesas de lazer \n(3) Investimento \n(4) Doação \n(5) Fundo de emergência \n"
					+ "(0) Sair");

			System.out.println("Digite a opção: ");
			
			opcao = read.nextInt();
			

				if(opcao != 0) {
					  switch(opcao) {
						
							case 1:
								System.out.println("\n=================== GASTOS FIXOS =================== ");
								do
								{
									
									System.out.println("\n(1) Aluguel\n(2) IPTU\n(3) Luz\n(4) Água\n(5) Alimentação"
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
										System.out.println("\nQual seu gasto com conta de água? ");
										double agua = read.nextDouble();
										System.out.println("-----------------------------------------------------");
										soma+=agua;
										
										gastosFixos.Agua(agua);
										System.out.println("\n-----------------------------------------------------");
									}
									else if(x==5)
									{
										gastos=gastosFixos;
										System.out.println("\nQual seu gasto com alimentação? ");
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
										System.out.println("\nINFORMAÇÃO INVÁLIDA!");
									}
								}
								while(x>0 && x<=10);
								double resultado = salario5-soma;
								
								System.out.println("\nSeu gasto fixo mensal ficou em R$"+soma);
								System.out.println("\nBom..., agora você tem isso para gerenciar R$"+resultado);
								
								System.out.println("\nDeseja continuar? \n(1) Sim \n(2) Não");
								System.out.println("Digite a opção: ");
								segundaOpcao = read.nextInt();
			
								break;
								
							case 2:
								System.out.println("\n=================== GASTOS DE LAZER =================== ");
								
								System.out.println("\nEntre com o seu salário: ");
								salario = read.nextDouble();
								
								System.out.println("\nRecomendamos que você use apenas 15% do seu salário nesse envelope. " +
										"Deseja continuar com 15%?" + "\n(1) Sim \n(2) Não");
								op2 = read.nextInt();
								
								
								if (op2 == 1)
								{
									limite = (salario*15)/100;
									System.out.println("\n-----------------------------------------------------");
									System.out.println("\nO seu limite é R$" + limite);
									System.out.println("\n-----------------------------------------------------");
									
									do
									{
										
										System.out.println("\nEscolha uma categoria e entre com o seu gasto diário: "
												+ "\n(1) Comida / Delivery "
												+ "\n(2) Passeios / Festas"
												+ "\n(3) Roupas / Acessórios"
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
										
												System.out.println("\n(3) Roupas / Acessórios" +
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
												System.out.println("\nVOCÊ ATINGIU O SEU LIMITE!");
												
												System.out.println("\nOPERAÇÃO FINALIZADA!\nNos vemos no próximo mês =)");	
											}
									}
									
									while (op2 != 0);
								
								}
									
								if (op2 == 2)
								{
									
									System.out.println("\nQuantos % você deseja usar nesse envelope? ");
									porcent = read.nextInt(); 
									
									limite = (salario *porcent)/100;
									
									System.out.println("\nO seu limite é de R$" + limite);
									
									do 
									{
										
										System.out.println("\nEscolha uma categoria e entre com o seu gasto diário: "
												+ "\n(1) Comida / Delivery "
												+ "\n(2) Passeios / Festas"
												+ "\n(3) Roupas / Acessórios"
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
										
												System.out.println("\n(3) Roupas / Acessórios" +
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
												System.out.println("\nVOCÊ ATINGIU O SEU LIMITE!");
												
												System.out.println("\nOPERAÇÃO FINALIZADA!\nNos vemos no próximo mês =)");	
											}
									}
									while (op2 != 0);
									
								}
								System.out.println("\nDeseja continuar? \n(1) Sim \n(2) Não");
								System.out.println("Digite a opção: ");
								segundaOpcao = read.nextInt();
								break;
								
							case 3:
								System.out.println("\n=================== INVESTIMENTO =================== ");
								
								double salarioInvest, percEnvelope, rendimentoCDB, impostoCDB, rendimentoLCI, somaFII=0.0, n2, somaAcoes=0.0;
								int n1, tempoCDB, tempoLCI;

								System.out.println("\nOi, " + nome + "! Ficamos felizes em te ver novamente! =)");
								System.out.println("\nQuanto você recebeu esse mês? ");
								salarioInvest = read.nextDouble(); //3000

								System.out.println("\nQual percentual da sua renda você destinou para investimentos? ");
								percEnvelope = read.nextInt(); //20%
								
								Investimentos aplicacao1 = new Investimentos(salarioInvest, percEnvelope);
								aplicacao1.calcularValorInvestir(); // 600
								
								System.out.println("\nMaravilha! =D E como você distribuiu esse valor?\n\n(1) Apontar em renda fixa\n"
										+ "(2) Apontar em renda variável");
								n1 = read.nextInt();

								while (n1 != 2 && n1 != 1) {
									System.out.println("\nOPÇÃO INVÁLIDA, tente novamente.");
									System.out.println("\nEntre com um número: ");
									n1 = read.nextInt();
								}

								do {
									if (n1 == 1) {
										System.out.println("\n=================== APONTAMENTO RENDA FIXA ===================");
										System.out.println("\nDigite um número dentre essas opções:" + "\n(1) CDB/LC\n(2) LCI/LCA ");
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
											System.out.println("OPÇÃO INVÁLIDA.");
											break;
										}
									
									} else {
										System.out.println("\n=================== APONTAMENTO RENDA VARIÁVEL ===================");
										System.out.println("\nDigite um número dentre essas opções:"
												+ "\n(1) Ações brasileiras\n(2) Fundos Imobiliários");
										int op3 = read.nextInt();
										switch (op3) {
										case 1:
											System.out.println("Ações brasileiras");
											System.out.println("\nQuanto você aplicou?");
											n2 = read.nextDouble();
											somaAcoes = somaAcoes + n2;
											System.out.println("R$"+somaAcoes);
											break;

										case 2:
											System.out.println("Fundos Imobiliários");
											System.out.println("\nQuanto você aplicou?");
											n2 = read.nextDouble();
											somaFII = somaFII + n2;
											System.out.println("R$"+somaFII);
											break;

										default:
											System.out.println("OPÇÃO INVÁLIDA.");
											break;
										}
									}
									System.out.println("\nQuer repetir o procedimento? Digite o número \n(1) para renda fixa \n(2) para renda variável "
											+ "\n(0) para sair ");
									n1 = read.nextInt();
								} while (n1 == 2 || n1 ==1);
								
								System.out.println("\nDeseja continuar? \n(1) Sim \n(2) Não");
								System.out.println("Digite a opção: ");
								segundaOpcao = read.nextInt();
								break;	
								
							case 4:
								System.out.println("\n=================== DOAÇÃO ===================");
								int a,b,c,d,porcentagem=0,salarioDoacao;
								String destino;
									
								System.out.println("Entre com o seu salário:");
								salarioDoacao = read.nextInt();
								System.out.println("\nVocê deseja realizar alguma doação?");
								System.out.println("(1) Sim\n(2) Não");
								a = read.nextInt();
								
								if(a<=2) {
								switch(a) {
								    case 1: 
								    	System.out.println("\nQual percentual da sua renda você destinou para doação? ");
								    	porcentagem = read.nextInt();
								    	System.out.println("\nEu posso oferecer sugestões?");
										System.out.println("(1) Sim\n(2) Não");
										b = read.nextInt();
										Doacao ong = new Doacao(salarioDoacao,porcentagem);
										
										if(b<=2) { 
								    	switch (b) {
										 case 1:
											 System.out.println("\nMas antes de mostrar algumas das sugestões, esse mês você deseja doar para "
											 		+ "qual área? ");
											 System.out.println("(1) Assistência social\n"+"(2) Cultura\n"+"(3) Saúde\n"+ "(4) Meio ambiente");
											 c =read.nextInt();	 
											 if(c<=4) { 
											switch (c) {
											 case 1:
												 System.out.println("\n=================== ASSISTÊNCIA SOCIAL ===================");
												 System.out.println("(1) CADI Brasil\n(2) Banco da providência\n(3) Amigos do bem");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doação foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a próxima etapa!! =D");
												 }else {
													 System.out.println("OPÇÃO INVÁLIDA, tente novamente");
												 }
												 break;
											 case 2:
												 System.out.println("\n=================== CULTURA ===================");
												 System.out.println("(1) GURI\n"+ "(2) Instituto Palmas\n"+"(3) Instituto da Cultura Afro no Brasil");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doação foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a próxima etapa!! =D");
												 }else {
													 System.out.println("OPÇÃO INVÁLIDA, tente novamente");
												 }
											     break;
											 case 3:
												 System.out.println("\n=================== SAÚDE ===================");
												 System.out.println("(1) TUCCA\n"+ "(2) Horas de vida\n"+"(3) ACD\n");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doação foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a próxima etapa!! =D");
												 }else {
													 System.out.println("OPÇÃO INVÁLIDA, tente novamente");
												 }
												 break;
											 case 4:
												 System.out.println("\n=================== MEIO AMBIENTE ===================");
												 System.out.println("(1) SOS Mata Atlântica\n"+ "(2) WWF Brasil\n"+"(3) IPÊ");
												 d = read.nextInt();
												 if(d<=3) {
												 System.out.println("Sua doação foi depositada");
												 ong.imprimir();
												 System.out.println("Vamos para a próxima etapa!! =D");
												 }else {
													 System.out.println("OPÇÃO INVÁLIDA, tente novamente");
										         }break; 	         
										}		 	
											 }break;
											 
										 case 2: 
											 System.out.println("\nTudo bem, desejo uma boa doação!!");
											 System.out.println("Por favor, informe o nome do destinatário:");
											 destino = read.next(); 
											 ong.imprimir();
											 System.out.println("Sua doação foi depositada para "+ destino);
											 System.out.println("Vamos para a próxima etapa!! =D");
											 break;
									}
								    	
							    }else {
								      System.out.println("OPÇÃO INVÁLIDA, tente novamente");		
							    }break;
								 
								    case 2:{
								    Doacao semong = new Doacao(salarioDoacao, porcentagem);
								    System.out.println("Seu saldo atual é "+ salarioDoacao); 
								    System.out.println("Vamos para a próxima etapa!! =D");
								    break;
							 }   
						  }
								}else {
									System.out.println("Por favor, entre com a opção (1) ou (2)");
								}
								
								System.out.println("\nDeseja continuar? \n(1) Sim \n(2) Não");
								System.out.println("Digite a opção: ");
								segundaOpcao = read.nextInt();
								
								break;	
								
							case 5:
								System.out.println("\n=================== FUNDO DE EMERGÊNCIA ===================");
								System.out.println("\nAqui é onde vamos simular sua reserva de emergência. Espera, mas o que é isso?\n"+
										"Caso um imprevisto aconteça, você tem esse valor para garantir que suas contas fixas sejam pagas! Ufa!\n");
										System.out.println("Como montar sua reserva? Temos 3 planos:\n"
												+ "Curto >> 3 meses\n"
												+ "Medio >> 4 meses\n"
												+ "Longo >> 6 meses\n");
										System.out.println("Para saber o seu saldo de emergência, digite o seu gasto fixo mensal:");
										salario1 = read.nextDouble();
										System.out.println("Escolha uma opção:\n"+"(1) Plano longo\n"+"(2) Plano médio\n"+"(3) Plano curto\n");
										
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
							
								System.out.println("\nDeseja continuar? \n(1) Sim \n(2) Não");
								System.out.println("Digite a opção: ");
								segundaOpcao = read.nextInt();
								break;	
					
														
								default:
									
									System.out.println("\n======================= OPÇÃO INVÁLIDA ======================= ");
									System.out.println("\n======================= MENU ======================= ");
																		
									System.out.println("\n(1) Gastos fixos \n(2) Despesas de lazer \n(3) Investimento \n(4) Doação \n(5) Fundo de emergência \n"
											+ "(0) Sair");
									System.out.println("Digite a opção: ");
									opcao = read.nextInt();
									
									if(opcao < 0 || opcao > 6) 
									{
										System.out.println("\n======================= OPÇÃO INVÁLIDA ======================= ");	
									}		
		        		 }
			       }
			
					if(segundaOpcao == 2) 
					{	
							opcao = 0;	
					}
		}		
		System.out.println("\nAté mais! Obrigade! =*");	
	}
}