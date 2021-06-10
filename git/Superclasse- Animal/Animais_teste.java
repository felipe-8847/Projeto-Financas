package Heranças;

public class Animais_teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nCachorro: ");
		
		Cachorro Frederico = new Cachorro ("Frederico", 3, "09/06/2021", "Gabriele Ribeiro");
		Frederico.imprimirInfo();
		
		System.out.println("\n-----------------------------");
		System.out.println("\nCavalo: ");
		
		Cavalo Alazão = new Cavalo (" Alazão", 2, "Junho/2021", "Polícia Militar", "Julho/2022");
		Alazão.imprimirInfo();
		System.out.println("\n* Mudança de Data de Término de Treinamento: *");
		Alazão.setData(" Outubro/2022 ");
		Alazão.imprimirInfo();
		
		System.out.println("\n-----------------------------");
		System.out.println("\nPreguiça: ");
		
		Preguiça Flash = new Preguiça (" Flash", 1, "03/05/2020", "Saudável, mas com pouco ganho de Peso", "Março/2022");
		Flash.imprimirInfo();
	}

}
