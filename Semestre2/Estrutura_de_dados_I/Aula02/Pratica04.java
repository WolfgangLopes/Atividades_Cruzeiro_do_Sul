import java.util.Scanner;

public class A2Pratica04
{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número para calcular tabuada");
        int n=read.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
