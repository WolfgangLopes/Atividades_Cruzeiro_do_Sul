package quadrado_numero; 
import java.util.Scanner;
/** arquivo sempre com primeira letra maiscula
 * package sempre em minusculo
 * import, na linha seguinte ao package, importa funcionalidades ao código
 * "class" indica a classe, logo em seguida é usado o nome da classe desejada, main é de acordo com o nome do arquivo, iniciante com miscula
 * "{} abre e fecha um bloco de instruções, "int" é um número inteiro
 * "Scanner" é o comando para ler o imput, "printLn" mostra o texto no terminal
 * @author WolfgangLopes
 */

public class Quadrado_numero {
    public static void main(String[] args) {
            int q;
            
            System.out.println("Digite um número inteiro");
            Scanner leia = new Scanner(System.in);
            int n = leia.nextInt();
            q = n * n;
            System.out.println("O resultado do número: " + n + " ao quadrado é:" + q);
                    }
          
    
}
