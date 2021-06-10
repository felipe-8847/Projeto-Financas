package Heranças;

public class Preguiça extends Animais {
	
	private String resgatada;
	private String saude;
	private String data;
	
	public Preguiça (String nome, int idade, String resgatada, String saude, String data)
	{
		super (nome, idade);
		
		this.resgatada = resgatada;
		this.saude = saude;
		this.data = data;
	}

	public String getResgatada() {
		return resgatada;
	}

	public void setResgatada(String resgatada) {
		this.resgatada = resgatada;
	}

	public String getSaude() {
		return saude;
	}

	public void setSaude(String saude) {
		this.saude = saude;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do animal:" + getNome() + "\nIdade: " + getIdade() + " ano(s)" 
			 + "\nResgatada(o) no dia: " + resgatada + "\nEstado de Saúde: " + saude +
				"\nData Prevista para ser devolvida(o) à Natureza: " + data);
	}

}
