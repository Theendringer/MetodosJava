/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo2lista10;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Metodo2Lista10 {

    /**
     * @param args the command line arguments
     */
    public static void cursandoTurno(String resp){
        
        if(resp.equalsIgnoreCase("M")){
            System.out.println("Bom dia!");
        } else if(resp.equalsIgnoreCase("V")){
            System.out.println("Boa Tarde!");
        } else if(resp.equalsIgnoreCase("N")){
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor Inválido!");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe em qual turno você estuda: ");
        System.out.println("");
        System.out.println("Use M para Matutino");
        System.out.println("V para Vespertino");
        System.out.println("N para Noturno");
        System.out.println("");
        
        String resposta = scanner.next();
        
        cursandoTurno(resposta);
    }
    
}
