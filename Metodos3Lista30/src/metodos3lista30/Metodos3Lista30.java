/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos3lista30;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Metodos3Lista30 {

    /**
     * @param args the command line arguments
     */
    public static void panificadora(double qtdpaes){
        for(double i=0.18; i<=(qtdpaes * 0.18); i++){
            double tabela = qtdpaes * i;
            System.out.println(qtdpaes + " " + "-" + " " + "R$" + tabela);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de pães desejada: ");
        double paes = scanner.nextInt();
        
        panificadora(paes);
        
    }
    
}
