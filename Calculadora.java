
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora {
    
	private EstrategiaCalculo contextoAtual;
	
	public Calculadora(EstrategiaCalculo contextoAtual) {
		this.contextoAtual = contextoAtual;
	}
	
	public EstrategiaCalculo getContextoAtual() {
		return contextoAtual;
	}

	public void setContextoAtual(EstrategiaCalculo contextoAtual) {
		this.contextoAtual = contextoAtual;
	}

	public void calcular(double valor1, double valor2) {
		contextoAtual.executarCalculo(valor1, valor2);
	}

	public static void main(String[] args) {
		Adicao adicao = new Adicao();
		Subtracao subtracao = new Subtracao();
		Multiplicacao multiplicacao = new Multiplicacao();
		Divisao divisao = new Divisao();
		
		Calculadora calculadora = new Calculadora(adicao);		
		calculadora.calcular(5, 5);
		
		calculadora.setContextoAtual(subtracao);
		calculadora.calcular(3, 5);
	}
}
