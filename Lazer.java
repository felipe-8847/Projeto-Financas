package Projeto_1;

import java.util.Scanner;

public class Lazer  
{
	public static void main(String[] args) 
	{
		int op, op2, porcent;
		double salario = 0, limite = 0, gasto = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o seu Sal�rio: ");
		salario = ler.nextDouble();
		
		System.out.println("\nRecomendamos que voc� use apenas 15% do seu Sal�rio nesse envelope. " +
				"Deseja continuar com 15%?" + "\n1- Sim \n2- N�o");
		op2 = ler.nextInt();
		
		
		if (op2 == 1)
		{
			limite = (salario*15)/100;
			System.out.println("\nO seu Limite � " + limite + " reais.");
			
			do
			{
				
				System.out.println("\nEscolha uma Categoria e entre com o seu Gasto Di�rio:"
						+ "\nCATEGORIA 1- COMIDA/ DELIVERY: "
						+ "\nCATEGORIA 2- PASSEIOS/FESTAS: "
						+ "\nCATEGORIA 3- ROUPAS/ACESS�RIOS: "
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
				
						System.out.println("\nCATEGORIA 3- ROUPAS/ACESS�RIOS: " +
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
						System.out.println("\nVOC� ATINGIU O SEU LIMITE!");
						
						System.out.println("\nOPERA��O FINALIZADA! \nNos vemos no pr�ximo m�s.");	
					}
			}
			
			while (op2 != 0);
		
		}
			
		if (op2 == 2)
		{
			
			System.out.println("\nQuantos % voc� Deseja usar nesse Envelope? ");
			porcent = ler.nextInt(); 
			
			limite = (salario *porcent)/100;
			
			System.out.println("\nO seu Limite � " + limite + " reais");
			
			do 
			{
				
				System.out.println("\nEscolha uma Categoria e entre com o seu Gasto Di�rio:"
						+ "\nCATEGORIA 1- COMIDA/ DELIVERY: "
						+ "\nCATEGORIA 2- PASSEIOS/FESTAS: "
						+ "\nCATEGORIA 3- ROUPAS/ACESS�RIOS: "
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
				
					System.out.println("\nCATEGORIA 3- ROUPAS/ACESS�RIOS: " +
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
					System.out.println("\nVOC� ATINGIU O SEU LIMITE!");
					
					System.out.println("\nOPERA��O FINALIZADA! \nNos vemos no pr�ximo m�s.");	
				}
		}
		
		while (op2 != 0);
			
			
			
		}
	}
}

