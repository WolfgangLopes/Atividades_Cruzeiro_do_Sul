import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A3ListaDeStrings {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        //DEFININDO TAMANHO

        System.out.println("Quantos nomes deseja adicionar: ");
        int qtd = read.nextInt();
        read.nextLine();

        // ADICIONANDO NOMES
        System.out.println("Digite os nomes");
        for(int i=0;i<qtd;i++){
            nomes.add(read.nextLine());
        }

        System.out.println("--------------------------");
        //BUSCANDO
        System.out.println("Digite o nome que deseja buscar");
        String busca = read.nextLine();
        System.out.println(nomes.contains(busca)? "Nome encontrado.":"Nome não encontrado");


        //REMOÇÂO

        System.out.println("Digite um número para ser resolvido: ");
        String remover = read.nextLine();
        if(nomes.remove(remover)){
            System.out.println("Nome removido com sucesso;");
        } else {
            System.out.println("Nome não encontrado");
        }

        //ORDENAÇÂO
        Collections.sort(nomes);
        System.out.println("Lista ordenada: "+nomes);


    }}

