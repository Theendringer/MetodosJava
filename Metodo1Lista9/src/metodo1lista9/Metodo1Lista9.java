/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo1lista9;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Metodo1Lista9 {

    /**
     * @param args the command line arguments
     */
    public static void tempFparaC(float tempC){
        double tempF = (tempC * 1.8) + 32;
        
        System.out.println(tempC + " graus Celsius equivalem á " + tempF + " Fahrenheits");
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a temperatura a ser transformada: ");
        float temp = scanner.nextFloat();
        tempFparaC(temp);
    }
    
}
