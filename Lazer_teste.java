package Projeto_1;

import java.util.Scanner;

public class Lazer_teste  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op, op2, porcent;
		double salario, limite = 0, gasto = 0, somaDiaria = 0, novolimite = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o seu Sal�rio: ");
		salario = ler.nextDouble();
		
		System.out.println("\nRecomendamos que voc� use apenas 15% do seu Sal�rio nesse envelope. " +
				"Deseja continuar com 15%?" + "\n1- Sim \n2- N�o");
		op2 = ler.nextInt();
		
		if (op2 == 1)
		{
			System.out.println("\n" + limite);
			limite = (salario * (15/100));
			
			System.out.println("\nO seu Limite � " + limite + " reais");
			
			for (op = 1; op < 6; op++)
			{
				
				System.out.println("\nEscolha uma Categoria e entre com o seu Gasto Di�rio:"
						+ "\nCATEGORIA 1- COMIDA/ DELIVERY: "
						+ "\nCATEGORIA 2- PASSEIOS/FESTAS: "
						+ "\nCATEGORIA 3- ROUPAS/ACESS�RIOS: "
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
				
				System.out.println("\nCATEGORIA 3- ROUPAS/ACESS�RIOS: " +
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
				System.out.println("\nOP��O INV�LIDA. ");	
			}
			
			op++;
		}
	}
			
		if (op2 == 2)
		{
			
			System.out.println("\nQuantos % voc� Deseja usar nesse Envelope? ");
			porcent = ler.nextInt(); 
			
			limite = salario * (porcent/100);
			
			System.out.println("\nO seu Limite � " + limite + " reais");
			
			for (op = 1; op < 6; op++)
			{
				
				System.out.println("\nEscolha uma Categoria e entre com o seu Gasto Di�rio:"
						+ "\nCATEGORIA 1- COMIDA/ DELIVERY: "
						+ "\nCATEGORIA 2- PASSEIOS/FESTAS: "
						+ "\nCATEGORIA 3- ROUPAS/ACESS�RIOS: "
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
				
				System.out.println("\nCATEGORIA 3- ROUPAS/ACESS�RIOS: " +
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
				System.out.println("\nOP��O INV�LIDA. ");	
			}
		}
	}
		
		novolimite = limite - somaDiaria;

		if (novolimite == 0)
		{
			System.out.println("\nVOC� ATINGIU O SEU LIMITE!");
			System.out.println("\nOPERA��O FINALIZADA! \nNos vemos no pr�ximo m�s.");	
		}	
		
	}

}
