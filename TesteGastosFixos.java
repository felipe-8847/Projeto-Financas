package ProjetoFinancas;

import java.util.Scanner;

import Aula6.Cachorro;

public class TesteGastosFixos 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		GastosFixos gastosFixos = new GastosFixos();
		Gastos gastos = null;
		
		int x;
		do
		{
			System.out.println("\nQual gasto deseja inserir?\n\n1-Aluguel\n2-Iptu\n3-Luz\n4-Agua\n5-Alimentacao"
					+ "\n6-Internet\n7-Academia\n8-Internet Celular\n9-Streaming\n10-Emprestimo");
			x=leia.nextInt();
			
			if(x==1)
			{
				gastos=gastosFixos;
				System.out.println("\nQual seu gasto com Aluguel: ");
				double aluguel = leia.nextDouble();
				System.out.println("-----------------------------------------------------");
				
				gastosFixos.Aluguel(aluguel);	
			}
			else if(x==2)
			{
				gastos=gastosFixos;
				System.out.println("\nQual seu gasto com IPTU: ");
				double iptu = leia.nextDouble();
				System.out.println("-----------------------------------------------------");
				
				gastosFixos.Iptu(iptu);	
			}
			else if(x==3)
			{
				gastos=gastosFixos;
				System.out.println("\nQual seu gasto com conta de luz: ");
				double luz = leia.nextDouble();
				System.out.println("-----------------------------------------------------");
				
				gastosFixos.Luz(luz);
			}else if(x==4)
			{
				gastos=gastosFixos;
				System.out.println("\nQual seu gasto com conta de agua: ");
				double agua = leia.nextDouble();
				System.out.println("-----------------------------------------------------");
				
				gastosFixos.Agua(agua);
			}
			else if(x==5)
			{
				gastos=gastosFixos;
				System.out.println("\nQual seu gasto com alimentacao: ");
				double alimentacao = leia.nextDouble();
				System.out.println("-----------------------------------------------------");
				
				gastosFixos.Alimentacao(alimentacao);
			}
			else if(x==6)
			{
				gastos=gastosFixos;
				System.out.println("\nQual seu gasto com internet: ");
				double internet = leia.nextDouble();
				System.out.println("-----------------------------------------------------");
				
				gastosFixos.Internet(internet);
			}
			else if(x==7)
			{
				gastos=gastosFixos;
				System.out.println("\nQual seu gasto com academia: ");
				double academia = leia.nextDouble();
				System.out.println("-----------------------------------------------------");
				
				gastosFixos.Academia(academia);
			}
			else if(x==8)
			{
				gastos=gastosFixos;
				System.out.println("\nQual seu gasto com internet celular: ");
				double celInter = leia.nextDouble();
				System.out.println("-----------------------------------------------------");
				
				gastosFixos.CelInter(celInter);
			}
			else if(x==9)
			{
				gastos=gastosFixos;
				System.out.println("\nQual seu gasto com streaming: ");
				double streaming = leia.nextDouble();
				System.out.println("-----------------------------------------------------");
				
				gastosFixos.Streaming(streaming);
			}
			else if(x==10)
			{
				gastos=gastosFixos;
				System.out.println("\nQual valor do seu emprestimo: ");
				double emprestimo = leia.nextDouble();
				System.out.println("-----------------------------------------------------");
				
				gastosFixos.Emprestimo(emprestimo);
			}
			else
			{
				System.out.println("\nInformacao invalida!");
			}
		}
		while(x<=0 || x>=4);
	}
}
