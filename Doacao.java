package ProjetoFinancas;

public class Doacao {

	private float Sal�rio;
	private float Porcentagem;
	
	
	public Doacao (float salario, int porcentagem) {
		this.Sal�rio = salario;
		this.Porcentagem = salario - (salario * porcentagem /100);		
	}

	public float getSal�rio() {
		return Sal�rio;
	}


	public void setSal�rio(float sal�rio) {
		Sal�rio = sal�rio;
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