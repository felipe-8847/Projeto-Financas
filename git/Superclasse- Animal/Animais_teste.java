package Heran�as;

public class Animais_teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nCachorro: ");
		
		Cachorro Frederico = new Cachorro ("Frederico", 3, "09/06/2021", "Gabriele Ribeiro");
		Frederico.imprimirInfo();
		
		System.out.println("\n-----------------------------");
		System.out.println("\nCavalo: ");
		
		Cavalo Alaz�o = new Cavalo (" Alaz�o", 2, "Junho/2021", "Pol�cia Militar", "Julho/2022");
		Alaz�o.imprimirInfo();
		System.out.println("\n* Mudan�a de Data de T�rmino de Treinamento: *");
		Alaz�o.setData(" Outubro/2022 ");
		Alaz�o.imprimirInfo();
		
		System.out.println("\n-----------------------------");
		System.out.println("\nPregui�a: ");
		
		Pregui�a Flash = new Pregui�a (" Flash", 1, "03/05/2020", "Saud�vel, mas com pouco ganho de Peso", "Mar�o/2022");
		Flash.imprimirInfo();
	}

}
