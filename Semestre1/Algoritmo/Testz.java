import java.util.Scanner;

public class Testz {
    public static void main(String[] args) {
        int op;
        Double n1,n2,somv,subv,mulv,divv;
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        n1 = read.nextDouble();
        System.out.println("Digite o segundo valor");
        n2 = read.nextDouble();
        System.out.println("Escolha o tipo de operação:");
        System.out.println("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Sair");
        op = read.nextInt();

        somv = n1+n2;
        subv = n1-n2;
        mulv = n1*n2;
        divv = n1/n2;

        switch(op){
            case 1:
            System.out.println("Você escolheu a opção soma, o valor é: "+somv);
            break;
            case 2:
            System.out.println("Você escolheu a opção subtração, o valor é : "+subv);
            break;
            case 3:
            System.out.println("Você escolheu a opção multiplicação, o valor é: "+mulv);
            break;
            case 4:
            System.out.println("Você escolheu a opção divisão, o valor é : "+divv);
            break;
            case 5:
            System.out.println("Você escolheu sair");
            break;
            default:
            System.out.println("Você não escolheu uma operação válida");
        }
        read.close();
    }
    
}
