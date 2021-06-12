package ProjetoFinancas;

public class CalcEmergencia3 extends ReservaEmergencia{
	
	public CalcEmergencia3(double custofixo) {
		super (custofixo);
	}
	public double Calcu3() {
		return this.getCustofixo()*3/12;
		
	}
	public double Objetivo3() {
		return this.getCustofixo()*3;
	}
public void imprimirInfo3() {
	System.out.print(" Seu custo fixo mensal é: R$"+getCustofixo()+
			"\nO valor total do seu objetivo é: R$"+Objetivo3()+
			"\nO valor que deve ser guardado ao mês é: R$"+Calcu3());
	
}
}


