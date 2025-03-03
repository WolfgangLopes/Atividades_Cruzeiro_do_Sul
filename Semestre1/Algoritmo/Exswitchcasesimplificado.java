package alg2809;
import java.util.Scanner;

public class Exswitchcasesimplificado {
    public static void main(String[] args) {
        int tipo_de_operacao;
        double var1, var2;
        Scanner read = new Scanner(System.in);

        var1 = read.nextDouble();
        System.out.println("Digite o segundo valor");
        var2 = read.nextDouble();
        System.out.println("Escolha o tipo de operação desejado:");
        System.out.println("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Sair");
        tipo_de_operacao = read.nextInt();
        System.out.println("Digite o primeiro valor");
               

        switch (tipo_de_operacao){
            /* Necessária a instação de uma JDK atualizada
             * para o funcionamento da arrow no java. */
            case 1 -> System.out.println("Você escolheu soma ");
            case 2 -> System.out.println("Você escolheu subtração");
            case 3 -> System.out.println("Você escolheu multiplicação");
            case 4 -> System.out.println("Você escolheu divisão");
            case 5 -> System.out.println("Você escolheu sair");
            default -> System.out.println("Tipo de operação escolhida não é válida");
        }
    read.close();
    }

    
}
