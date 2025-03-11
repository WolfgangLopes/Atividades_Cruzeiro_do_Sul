package Exercicio2;
import java.util.Scanner;
import java.util.Arrays;

/*Exercicio de média das notas
 * Nome: Wolfgang Lopes               RGM: 39900916
 */
public class Media{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Double total;
        String maiornota,media,nome;
        int i=0;
        total=0.0;
        Double nota[] = new Double[4];

        System.out.println("Digite o nome do aluno");
        nome = read.next();        

        for(i=0;i<4;i++){
        System.out.println("Digite a "+(i+1)+" nota");
            nota[i] = read.nextDouble();
            total= total+nota[i];
        }
        Aluno x = new Aluno(nome,nota);        
        Arrays.sort(nota, 0, 4);

        media="Média das quatro notas: "+total/4;
        maiornota="Maior nota: "+nota[3];        

        System.out.println(media+"\n"+maiornota);
        System.out.println("Nome: "+x.nome+"\nNotas: "+Arrays.toString(x.nota));
        }    
}
