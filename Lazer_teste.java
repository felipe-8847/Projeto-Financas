package Projeto_1;

import java.util.Scanner;

public class Lazer_teste  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op, op2, porcent;
		double salario, limite = 0, gasto = 0, somaDiaria = 0, novolimite = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o seu Salário: ");
		salario = ler.nextDouble();
		
		System.out.println("\nRecomendamos que você use apenas 15% do seu Salário nesse envelope. " +
				"Deseja continuar com 15%?" + "\n1- Sim \n2- Não");
		op2 = ler.nextInt();
		
		if (op2 == 1)
		{
			System.out.println("\n" + limite);
			limite = (salario * (15/100));
			
			System.out.println("\nO seu Limite é " + limite + " reais");
			
			for (op = 1; op < 6; op++)
			{
				
				System.out.println("\nEscolha uma Categoria e entre com o seu Gasto Diário:"
						+ "\nCATEGORIA 1- COMIDA/ DELIVERY: "
						+ "\nCATEGORIA 2- PASSEIOS/FESTAS: "
						+ "\nCATEGORIA 3- ROUPAS/ACESSÓRIOS: "
						+ "\nCATEGORIA 4- OBJETOS: "
						+ "\nCATEGORIA 5- OUTROS: ");
				op = ler.nextInt();
				
				if (op == 1)
			 {
				System.out.println("\nCATEGORIA 1- COMIDA/ DELIVERY:" +
						"\nEntre com o Valor Gasto: ");
				gasto = ler.nextDouble();	
				
				somaDiaria =+ gasto;
				
				System.out.println("\nO seu Limite passou a ser: " + novolimite + " reais");
			 }
			if (op == 2)
			{
				System.out.println("\nCATEGORIA 2- PASSEIOS/FESTAS: " +
						"\nEntre com o Valor Gasto: ");
				gasto = ler.nextDouble();	
				
				somaDiaria =+ gasto;
				
				System.out.println("\nO seu Limite passou a ser: " + novolimite + " reais");
			}
			if (op == 3)
			{
				
				System.out.println("\nCATEGORIA 3- ROUPAS/ACESSÓRIOS: " +
						"\nEntre com o Valor Gasto: ");
				gasto = ler.nextDouble();
				
				somaDiaria =+ gasto;
				
				System.out.println("\nO seu Limite passou a ser: " + novolimite + " reais");
			}	
			if (op == 4)
			{	
				System.out.println("\nCATEGORIA 4- OBJETOS: " +
						"\nEntre com o Valor Gasto: ");
				gasto = ler.nextDouble();
				
				somaDiaria =+ gasto;
				
				System.out.println("\nO seu Limite passou a ser: " + novolimite + " reais");
			}
			if (op == 5)
			{
				System.out.println("\nCATEGORIA 5- OUTROS: " +
						"\nEntre com o Valor Gasto: ");
				gasto = ler.nextDouble();
				
				somaDiaria =+ gasto;
				
				System.out.println("\nO seu Limite passou a ser: " + novolimite + " reais");
			}	
			else
			{
				System.out.println("\nOPÇÃO INVÁLIDA. ");	
			}
			
			op++;
		}
	}
			
		if (op2 == 2)
		{
			
			System.out.println("\nQuantos % você Deseja usar nesse Envelope? ");
			porcent = ler.nextInt(); 
			
			limite = salario * (porcent/100);
			
			System.out.println("\nO seu Limite é " + limite + " reais");
			
			for (op = 1; op < 6; op++)
			{
				
				System.out.println("\nEscolha uma Categoria e entre com o seu Gasto Diário:"
						+ "\nCATEGORIA 1- COMIDA/ DELIVERY: "
						+ "\nCATEGORIA 2- PASSEIOS/FESTAS: "
						+ "\nCATEGORIA 3- ROUPAS/ACESSÓRIOS: "
						+ "\nCATEGORIA 4- OBJETOS: "
						+ "\nCATEGORIA 5- OUTROS: ");
				op = ler.nextInt();
				
				if (op == 1)
			 {
				System.out.println("\nCATEGORIA 1- COMIDA/ DELIVERY:" +
						"\nEntre com o Valor Gasto: ");
				gasto = ler.nextDouble();	
				
				somaDiaria =+ gasto;
				
				System.out.println("\nO seu Limite passou a ser: " + novolimite + " reais");
			 }
			if (op == 2)
			{
				System.out.println("\nCATEGORIA 2- PASSEIOS/FESTAS: " +
						"\nEntre com o Valor Gasto: ");
				gasto = ler.nextDouble();	
				
				somaDiaria =+ gasto;
				
				System.out.println("\nO seu Limite passou a ser: " + novolimite + " reais");
			}
			if (op == 3)
			{
				
				System.out.println("\nCATEGORIA 3- ROUPAS/ACESSÓRIOS: " +
						"\nEntre com o Valor Gasto: ");
				gasto = ler.nextDouble();
				
				somaDiaria =+ gasto;
				
				System.out.println("\nO seu Limite passou a ser: " + novolimite + " reais");
			}	
			if (op == 4)
			{	
				System.out.println("\nCATEGORIA 4- OBJETOS: " +
						"\nEntre com o Valor Gasto: ");
				gasto = ler.nextDouble();
				
				somaDiaria =+ gasto;
				
				System.out.println("\nO seu Limite passou a ser: " + novolimite + " reais");
			}
			if (op == 5)
			{
				System.out.println("\nCATEGORIA 5- OUTROS: " +
						"\nEntre com o Valor Gasto: ");
				gasto = ler.nextDouble();
				
				somaDiaria =+ gasto;
				
				System.out.println("\nO seu Limite passou a ser: " + novolimite + " reais");
			}	
			else
			{
				System.out.println("\nOPÇÃO INVÁLIDA. ");	
			}
		}
	}
		
		novolimite = limite - somaDiaria;

		if (novolimite == 0)
		{
			System.out.println("\nVOCÊ ATINGIU O SEU LIMITE!");
			System.out.println("\nOPERAÇÃO FINALIZADA! \nNos vemos no próximo mês.");	
		}	
		
	}

}
