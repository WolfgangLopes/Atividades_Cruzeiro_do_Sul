import java.util.Scanner;

public class Exswitchcase{
    public static void main(String[] args) {
        int tipo_de_operacao;
        Double var1,var2,somav,subv,multv,divv;
        Scanner read = new Scanner(System.in);
        var1 = read.nextDouble();
        System.out.println("Digite o segundo valor");
        var2 = read.nextDouble();
        System.out.println("Digite o tipo de operação");
        System.out.println("1- Soma\n2-Subtração\n3Divisão\n4-Multiplicação\n5-Sai");
        tipo_de_operacao = read.nextInt();

        somav = var1+var2;
        subv = var1-var2;
        multv = var1*var2;
        divv = var1/var2;

                
    switch(tipo_de_operacao)
    {
        /* Para simplificação do código é possível fazer no seguinte formato:
        case 1 -> System.out.println("Soma");    
         */
        case 1:
        System.out.println("Você escolheu soma\nO resultado é: "+somav);
        break;
        case 2:
        System.out.println("Você escolheu subtração\nO resultado é: "+subv);
        break;
        case 3:
        System.out.println("Você escolheu divisão\nO resultado é: "+divv);
        break;
        case 4:
        System.out.println("Você escolheu multiplicação\nO resultado é: "+multv);
        case 5:
        System.out.println("Você escolheu sair.");
        break;
        default:
        System.out.println("Tipo selecionado não é válido.");
    }
    read.close();
    }
}