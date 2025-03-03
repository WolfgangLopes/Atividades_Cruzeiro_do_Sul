package wljava;
import javax.swing.JOptionPane;

public class Retanguloinerface{
public static void main(String[] args) {
    double perim, area, ladoA, ladoB;
    String lA, lB;
    lA =  JOptionPane.showInputDialog("Digite um lado do retângulo em cm.");
    lB = JOptionPane.showInputDialog("Digite outro lado do retângulo em cm.");
    ladoA = Double.parseDouble(lA);
    ladoB = Double.parseDouble(lB);
    perim = 2*ladoA + 2*ladoB;
    area = ladoA + ladoB;
    JOptionPane.showMessageDialog(null, "O perímetro do retângulo é igual a " + perim + "cm, e a área do retângulo é igual a " + area + "cm².");


}
}
