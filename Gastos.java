package ProjetoFinancas;

public abstract class Gastos 
{
	private String gastosFixos;
	
	abstract public void Aluguel(double aluguelGastos);
	abstract public void Iptu(double iptuGastos);
	abstract public void Luz(double luzGastos);
	abstract public void Agua(double aguaGastos);
	abstract public void Alimentacao(double alimentacaoGastos);
	abstract public void Internet(double internetGastos);
	abstract public void Academia(double academiaGastos);
	abstract public void CelInter(double celInterGastos);
	abstract public void Streaming(double streamingGastos);
	abstract public void Emprestimo(double emprestimoGastos);
	
	public Gastos(String gastosFixos)
	{
		this.gastosFixos = gastosFixos;
	}
	public String getGastosFixos() {
		return gastosFixos;
	}
	public void setGastosFixos(String gastosFixos) {
		this.gastosFixos = gastosFixos;
	}
}
