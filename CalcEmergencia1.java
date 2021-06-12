package ProjetoFinancas;

public class CalcEmergencia1 extends ReservaEmergencia{

	
	public CalcEmergencia1(double custofixo) {
		super (custofixo);
	
	}

	public double Calcu1() {
		return this.getCustofixo()*6/12;
		
	}
	public double Objetivo1() {
		return this.getCustofixo()*6;
	}
public void imprimirInfo1() {
	System.out.print(" Seu custo fixo mensal é: R$"+getCustofixo()+
			"\n O valor total do seu objetivo é: R$"+Objetivo1()+
			"\n O valor que deve ser guardado ao mês é: R$"+Calcu1());
	
}
}
