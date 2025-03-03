package aulaaug;
import java.util.Scanner;

/**
 *
 * @author Wolfgang
 */
public class Imc {
    public static void main(String[] args){
        Float peso, altura, imc;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o peso da pessoa (em kg):");
        peso = read.nextFloat();
        System.out.println("Digite a altura da pessoa (em m):");
        altura = read.nextFloat();
        imc = peso/ (altura*altura);
        System.out.println("O IMC  da pessoa é : " + imc + "Kg/m².");
        read.close();
        /* printf(2f) */
        
        
     
             
              
        
        
    }
    
}
