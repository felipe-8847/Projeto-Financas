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
	System.out.print("Seu custo fixo mensal � R$ "+getCustofixo()+"\nO valor total do seu objetivo � R$ "+Objetivo2()+"\nO valor que deve ser guardado ao m�s � R$ "+Calcu2());
	
}
}


