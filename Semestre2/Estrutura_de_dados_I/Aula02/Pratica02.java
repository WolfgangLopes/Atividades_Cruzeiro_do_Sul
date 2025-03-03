import java.util.Scanner;

public class A2Pratica02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int idade = read.nextInt();
        if(idade>=18){
            System.out.println("Já pode ser preso");
        }else{
            System.out.println("Fundação CASA");
        }
    }
}
