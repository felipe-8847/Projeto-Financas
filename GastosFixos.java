package ProjetoFinancas;

public class GastosFixos extends Gastos
{
	public GastosFixos()
	{
		super("gastosFixos");
	}
	@Override
	public void Aluguel(double aluguelGastos)
	{
		System.out.println("\nSeu gasto com aluguel é: "+aluguelGastos);
	}
	@Override
	public void Iptu(double iptuGastos)
	{
		System.out.println("\nSeu gasto com IPTU é: "+iptuGastos);
	}
	@Override
	public void Luz(double luzGastos)
	{
		System.out.println("\nSeu gasto com Luz é: "+luzGastos);
	}
	@Override
	public void Agua(double aguaGastos)
	{
		System.out.println("\nSeu gasto com Agua é: "+aguaGastos);
	}
	@Override
	public void Alimentacao(double alimentacaoGastos)
	{
		System.out.println("\nSeu gasto com alimentacao é: "+alimentacaoGastos);
	}
	@Override
	public void Internet(double internetGastos)
	{
		System.out.println("\nSeu gasto com internet é: "+internetGastos);
	}
	@Override
	public void Academia(double academiaGastos)
	{
		System.out.println("\nSeu gasto com academia é: "+academiaGastos);
	}
	@Override
	public void CelInter(double celInterGastos)
	{
		System.out.println("\nSeu gasto com internet celular é: "+celInterGastos);
	}
	@Override
	public void Streaming(double streamingGastos)
	{
		System.out.println("\nSeu gasto com streaming é: "+streamingGastos);
	}
	@Override
	public void Emprestimo(double emprestimoGastos)
	{
		System.out.println("\nSeu gasto com emprestimo é: "+emprestimoGastos);
	}
	
}
 