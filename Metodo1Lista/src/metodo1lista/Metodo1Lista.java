/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo1lista;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Metodo1Lista {

    /**
     * @param args the command line arguments
     */
    public static void pesoIdeal(double alturaPeso){
        double pesoIdealMasc = (72.7 * alturaPeso) - 58;
        
        double pesoIdealFem = (62.1 * alturaPeso) - 44.7;
        
        System.out.println("Seu peso ideal é de: " + pesoIdealMasc + "kg, se você for do sexo Masculino.");
        System.out.println("Seu peso ideal é de: " + pesoIdealFem + "kg, se você for do sexo Feminino.");
    }
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();
        pesoIdeal(altura);
        
        
    }
    
}
