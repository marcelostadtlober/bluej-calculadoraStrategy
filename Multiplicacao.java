
/**
 * Write a description of class Multiplicacao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Multiplicacao implements EstrategiaCalculo {
   public void executarCalculo(double valor1, double valor2) {
       System.out.println("Resultado da Multiplicação = " + (valor1 * valor2));
   }
}
