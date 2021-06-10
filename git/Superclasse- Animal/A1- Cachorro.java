package Heranças;

public class Cachorro extends Animais {

	private String adotado;
	private String pais;
	
	public Cachorro (String nome, int idade, String adotado, String pais)
	{
		super (nome, idade);
		
		this.adotado = adotado;
		this.pais = pais;
	}

	public String getAdotado() {
		return adotado;
	}

	public void setAdotado(String adotado) {
		this.adotado = adotado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do animal: " + getNome() + "\nIdade: " + getIdade() + " ano(s)"
				+ "\nData de Adoção:: " + adotado + "\nResponsável: " + pais);
	}
}
