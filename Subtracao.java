
/**
 * Write a description of class Subtracao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Subtracao implements EstrategiaCalculo {
    public void executarCalculo(double valor1, double valor2) {
        System.out.println("Resultado da Subtração = " + (valor1 - valor2));
    }
}
