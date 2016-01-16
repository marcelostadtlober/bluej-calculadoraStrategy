
/**
 * Write a description of class Adicao here.
 * 
 * @author (Marcelo Stadtlober) 
 * @version (02/06/2014)
 */
public class Adicao implements EstrategiaCalculo {
   public void executarCalculo(double valor1, double valor2) {
       System.out.println("Resultado da Adição = " + (valor1 + valor2));
   }
}
