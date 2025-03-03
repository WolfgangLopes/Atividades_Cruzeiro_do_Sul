import java.util.Arrays;
import java.util.Scanner;

public class A3ArrayDeInteiros {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Criando um array
        System.out.println("Digite a quantidade de números: ");
        int n = read.nextInt();

        //Integer permite armazenar valores nulos
        Integer[] numeros = new Integer [n];


        System.out.println("----------------------------------------");
        //ARMAZENANDO NO ARRAY
        System.out.println("Digite "+n+" números inteiros");
        for(int i=0;i<n;i++){
            numeros[i] = read.nextInt();
        }
        System.out.println("----------------------------------------");

        //BUSCANDO NO ARRAY
        System.out.println("Digite um número para buscar");
        int busca = read.nextInt();

        boolean encontrado = false;

        for(Integer num : numeros){
            if(num != null && num == busca){
                encontrado=true;
                break;
            }
        }
        //boolean ? true:false
        System.out.println(encontrado ? "O número "+busca+ "foi encontrado com sucesso!":
                "O número "+busca+" não foi encontrado no array");
        System.out.println("________________________________________________");

        //REMOÇÂO
        System.out.println("Digite um número para ser removido:");
        int remover = read.nextInt();
        for(int i=0;i<numeros.length;i++){
            if(numeros[i] !=null&&numeros[i]==remover){
                numeros[i]=null;
                break;
            }


        }

        System.out.println("-----------------------------------");

        //ORDENAÇÂO
        Arrays.sort(numeros, (a, b) ->{
            if (a==null)return 1;
            if (b==null)return -1;
            return a -b;
        });
        System.out.println("Array ordenado: "+ Arrays.toString(numeros));
        read.close();
    }
}
