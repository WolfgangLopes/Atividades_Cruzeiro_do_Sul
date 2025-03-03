import java.util.Scanner;

public class A2Pratica03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 3: ");
        int opcao = read.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Você escolheu maçã");
                break;
            case 2:
                System.out.println("Você escolheu abacaxi");
                break;
            case 3:
                System.out.println("Você escolheu laranja");
                break;
            default:
                System.out.println("Escolha inválida");
        }

    }
}
