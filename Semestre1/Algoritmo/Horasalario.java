package estrutura_de_decisao;
import java.util.Scanner;

public class Horasalario {
    public static void main(String[]args){
        /*2- Crie um algoritmo que solicite ao usuário o seu turno de trabalho e a quantidade de
horas trabalhadas, calcule e mostre o valor do salário. Considere os valores de horas a
seguir, de acordo com o turno de trabalho. Caso o turno seja igual a ‘N’ (utilize um
caractere para representar) o valor da hora trabalhada é R$ 45,00, caso contrário é R$
37,50. */
Scanner read = new Scanner(System.in);
double htn,htd;
String turno;

System.out.println("Qual seu turno de trabalho?");
System.out.println("Digite D para diurno, ou N para noturno");
turno = read.next();
System.out.println("Digite a quantidade de horas trabalhadas");
int ht = read.nextInt();
htn = ht*45;
htd = ht*37.5;
        if(turno=="N"||turno=="n"){
            System.out.println("O seu salário é: R$"+htn);
        } else {
            System.out.println("O seu salário é igual R$"+htd);
        }
        read.close();
    }
}
