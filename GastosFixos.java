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
		System.out.println("\nSeu gasto com aluguel �: "+aluguelGastos);
	}
	@Override
	public void Iptu(double iptuGastos)
	{
		System.out.println("\nSeu gasto com IPTU �: "+iptuGastos);
	}
	@Override
	public void Luz(double luzGastos)
	{
		System.out.println("\nSeu gasto com Luz �: "+luzGastos);
	}
	@Override
	public void Agua(double aguaGastos)
	{
		System.out.println("\nSeu gasto com Agua �: "+aguaGastos);
	}
	@Override
	public void Alimentacao(double alimentacaoGastos)
	{
		System.out.println("\nSeu gasto com alimentacao �: "+alimentacaoGastos);
	}
	@Override
	public void Internet(double internetGastos)
	{
		System.out.println("\nSeu gasto com internet �: "+internetGastos);
	}
	@Override
	public void Academia(double academiaGastos)
	{
		System.out.println("\nSeu gasto com academia �: "+academiaGastos);
	}
	@Override
	public void CelInter(double celInterGastos)
	{
		System.out.println("\nSeu gasto com internet celular �: "+celInterGastos);
	}
	@Override
	public void Streaming(double streamingGastos)
	{
		System.out.println("\nSeu gasto com streaming �: "+streamingGastos);
	}
	@Override
	public void Emprestimo(double emprestimoGastos)
	{
		System.out.println("\nSeu gasto com emprestimo �: "+emprestimoGastos);
	}
	
}
 