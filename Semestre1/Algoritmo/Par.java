import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        int num;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        num = read.nextInt();
        if (num%2==0) {
            System.out.println("O número: " +num+ " é par!!");
        } else {
            System.out.println("O número "+num+" é impar!!");
        } 
        read.close();
    }
    
}
