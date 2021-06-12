package ProjetoFinancas;

public class Doacao {

	private float Salário;
	private float Porcentagem;
	
	
	public Doacao (float salario, int porcentagem) {
		this.Salário = salario;
		this.Porcentagem = salario - (salario * porcentagem /100);		
	}

	public float getSalário() {
		return Salário;
	}


	public void setSalário(float salário) {
		Salário = salário;
	}


	public float getPorcentagem() {
		return Porcentagem;
	}


	public void setPorcentagem(int porcentagem) {
		Porcentagem = porcentagem;
	}
	
	public void imprimir() {
		System.out.println("O seu saldo é: "+ Porcentagem);
	}
}