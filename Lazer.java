package Projeto_1;

import java.util.Scanner;

public class Lazer  
{
	public static void main(String[] args) 
	{
		int op, op2, porcent;
		double salario = 0, limite = 0, gasto = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o seu Salário: ");
		salario = ler.nextDouble();
		
		System.out.println("\nRecomendamos que você use apenas 15% do seu Salário nesse envelope. " +
				"Deseja continuar com 15%?" + "\n1- Sim \n2- Não");
		op2 = ler.nextInt();
		
		
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
				op = ler.nextInt();
				
				
					if (op == 1)
					{
						System.out.println("\nCATEGORIA 1- COMIDA/ DELIVERY:" +
						"\nEntre com o Valor Gasto: ");
						gasto = ler.nextDouble();	
				
						limite = limite - gasto;
				
						System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
					}
					else if (op == 2)
					{
						System.out.println("\nCATEGORIA 2- PASSEIOS/FESTAS: " +
						"\nEntre com o Valor Gasto: ");
						gasto = ler.nextDouble();	
				
						limite = limite - gasto;
				
						System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
					}
					else if (op == 3)
					{
				
						System.out.println("\nCATEGORIA 3- ROUPAS/ACESSÓRIOS: " +
						"\nEntre com o Valor Gasto: ");
						gasto = ler.nextDouble();
				
						limite = limite - gasto;
				
						System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
					}	
					else if (op == 4)
					{	
						System.out.println("\nCATEGORIA 4- OBJETOS: " +
						"\nEntre com o Valor Gasto: ");
						gasto = ler.nextDouble();
				
						limite = limite - gasto;
				
				
						System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
					}
					else if (op == 5)
					{
						System.out.println("\nCATEGORIA 5- OUTROS: " +
						"\nEntre com o Valor Gasto: ");
						gasto = ler.nextDouble();
				
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
			porcent = ler.nextInt(); 
			
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
				op = ler.nextInt();
				
				if (op == 1)
				{
					System.out.println("\nCATEGORIA 1- COMIDA/ DELIVERY:" +
						"\nEntre com o Valor Gasto: ");
					gasto = ler.nextDouble();	
				
					limite = limite - gasto;
				
					System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
				}
				else if (op == 2)
				{
					System.out.println("\nCATEGORIA 2- PASSEIOS/FESTAS: " +
						"\nEntre com o Valor Gasto: ");
					gasto = ler.nextDouble();	
				
					limite = limite - gasto;
				
					System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
				}
				else if (op == 3)
				{
				
					System.out.println("\nCATEGORIA 3- ROUPAS/ACESSÓRIOS: " +
						"\nEntre com o Valor Gasto: ");
					gasto = ler.nextDouble();
				
					limite = limite - gasto;
				
					System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
				}	
				else if (op == 4)
				{	
					System.out.println("\nCATEGORIA 4- OBJETOS: " +
						"\nEntre com o Valor Gasto: ");
					gasto = ler.nextDouble();
				
					limite = limite - gasto;
				
					System.out.println("\nO seu Limite passou a ser: " + limite + " reais");
				}
				else if (op == 5)
				{
					System.out.println("\nCATEGORIA 5- OUTROS: " +
						"\nEntre com o Valor Gasto: ");
					gasto = ler.nextDouble();
				
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
	}
}

