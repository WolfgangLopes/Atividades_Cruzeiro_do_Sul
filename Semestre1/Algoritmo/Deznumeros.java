import java.util.Scanner;

public class Deznumeros {
    public static void main(String[]args){
        /* 3- Faça um algoritmo que solicite ao usuário 10 números reais, calcule e mostre a soma deles.
         Use a estrutura de repetição para*/
        Scanner read = new Scanner(System.in);
        Double n1, soma;
        int i;
        soma = 0.0;
       
        for(i=1;i<=10;i++){
            System.out.println("Digite um número: ");
            n1 = read.nextDouble();
            soma=soma+n1;
        }
        System.out.println("A somatório é: "+soma);
        read.close();
    }
 }
