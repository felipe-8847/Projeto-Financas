package ProjetoFinancas;

import java.text.NumberFormat;

public class Cliente extends Imprimir {

	private String nome;
	private int idade;
	private String profissao;
	private double salario;
	
	public Cliente (String nome, int idade, String profissao, float salario) {
		
		super();
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
		this.salario = salario;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	@Override
	public void imprimirInfo() {
		
		System.out.println("\nDados do usuario \nNome: "+nome+" \nIdade: "+idade+" anos "+" \nProfissão: "+profissao+" \nSalario: "+formatarMoeda());

	}
	
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	

}
