package ProjetoFinancas;

public class CalcEmergencia2 extends ReservaEmergencia{
	
	public CalcEmergencia2(double custofixo) {
		super (custofixo);
	}

	public double Calcu2() {
		return this.getCustofixo()*4/12;
		
	}
	public double Objetivo2() {
		return this.getCustofixo()*4;
	}
public void imprimirInfo2() {
	System.out.print("Seu custo fixo mensal �:"+getCustofixo()+"O valor total do seu objetivo �: "+Objetivo2()+"O valor que deve ser guardado ao m�s �: "+Calcu2());
	
}
}


