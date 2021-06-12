package ProjetoFinancas;

public class ReservaEmergencia {
protected double custofixo;



public ReservaEmergencia(double custofixo){
super();
this.custofixo = custofixo;


}


public double getCustofixo() {
	return custofixo;
}


public void setCustofixo(double custofixo) {
	this.custofixo = custofixo;
}
public void imprimirInfo() {
	System.out.println(" Seu custo fixo mensal é: \n"+custofixo);
}

}






