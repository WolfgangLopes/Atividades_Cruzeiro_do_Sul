package estrutura_de_decisao;
import java.util.Scanner;

public class Valor {
    public static void main(String []args){
        /*1- Escreva um algoritmo que solicite um número ao usuário. Caso seja digitado um
valor entre 0 e 9, mostre: “valor correto”, caso contrário mostre: “valor incorreto”.*/
        Scanner read = new Scanner(System.in);
        int num;
        System.out.println("Digite um número inteiro entre 0 e 9");
        num = read.nextInt();
        if(num >0 && num<9){
            System.out.println("Valor correto");
        } else {
            System.out.println("Valor incorreto");
        }
        read.close();
    }
}
