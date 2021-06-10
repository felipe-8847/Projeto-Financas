package Heranças;

public class Cavalo extends Animais{
	
	private String treinamento;
	private String emprego;
	private String data;
	
	public Cavalo (String nome, int idade, String treinamento, String emprego, String data)
	{
		super (nome, idade);
		
		this.treinamento = treinamento;
		this.emprego = emprego;
		this.data = data;
	}

	public String getTreinamento() {
		return treinamento;
	}

	public void setTreinamento(String treinamento) {
		this.treinamento = treinamento;
	}

	public String getEmprego() {
		return emprego;
	}

	public void setEmprego(String emprego) {
		this.emprego = emprego;
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
				+ "\nInício do Treinamento: " + treinamento + "\nTreinamento destinado à(ao): " + emprego +
				"\nTérmino do Treinamento: " + data);
	}
}
