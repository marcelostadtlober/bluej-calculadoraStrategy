
/**
 * Write a description of class Divisao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Divisao implements EstrategiaCalculo {
   public void executarCalculo(double valor1, double valor2) {
       System.out.println("Resultado da Divisão = " + (valor1 / valor2));
   }
}
