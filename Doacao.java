package ProjetoFinancas;

public class Doacao {

	private float salario;
	private float Porcentagem;
	
	
	public Doacao (float salario, int porcentagem) {
		this.salario = salario;
		this.Porcentagem = salario - (salario * porcentagem /100);		
	}

	public float getSal�rio() {
		return salario;
	}


	public void setSal�rio(float salario) {
		salario = salario;
	}


	public float getPorcentagem() {
		return Porcentagem;
	}


	public void setPorcentagem(int porcentagem) {
		Porcentagem = porcentagem;
	}
	
	public void imprimir() {
		System.out.println("O seu saldo �: "+ Porcentagem);
	}
}