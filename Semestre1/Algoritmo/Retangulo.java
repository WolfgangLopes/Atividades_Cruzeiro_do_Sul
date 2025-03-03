package retangulo;
import java.util.Scanner;

public class Retangulo {

  
    public static void main(String[] args) {
        //real, perim, ladoA, ladoB, perim, area
        
       double perim, area;
       
      
        System.out.println("Digite o valor de um lado em cm");
        Scanner digite = new Scanner(System.in);
        double ladoA = digite.nextDouble();
        System.out.println("Digite o valor de outro lado em cm");
        double ladoB = digite.nextDouble();
//lugar onde irei guardar minha conta
        perim = 2*ladoA + 2*ladoB;
        area = ladoA + ladoB;
                
        System.out.println("Perímetro: " + perim + " cm ");
        System.out.println("Área do retângulo = " + area + " cm² ");
        
   
    }
    
}
