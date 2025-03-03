import java.util.Scanner;

public class Combustivel {
public static void main(String[] args) {
    Double distp, combustg,media;
    Scanner read = new Scanner(System.in);

   System.out.println("Digite a distância percorrida(em Km)");
   distp = read.nextDouble();
   System.out.println("Digite o combustível consumido (em litros)");
   combustg = read.nextDouble(); 
   media = distp/combustg;
   System.out.println("A média de cobustivel gasto foi de:"+media+"km/l.");
   read.close();
}
    
}
