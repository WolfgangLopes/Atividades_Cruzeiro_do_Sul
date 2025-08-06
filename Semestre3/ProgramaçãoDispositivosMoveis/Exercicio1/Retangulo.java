import java.util.Scanner;

public class Retangulo extends Quadrilatero{
    public static void main(String args[]){
    float lado;
    float altura;
    Scanner read = new Scanner(System.in);
    System.out.println("Digite o lado em cm");
    lado = read.nextFloat();
    System.out.println("Digite a altura em cm");
    altura = read.nextFloat();
    read.close();
    Float area = calcularArea(lado,altura);
    Float perimetro = calcularPerimetro(lado,altura);
    System.out.println("Area: "+area+"Perimetro"+perimetro);
}
}