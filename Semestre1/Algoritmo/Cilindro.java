
package java;
import javax.swing.JOptionPane;

public class Cilindro{
    public static void main(String[] args){
        Double area,raio,altura,volume;
    String altr = JOptionPane.showInputDialog("Digite a altura do cilindro.");
    altura = Double.parseDouble(altr);
    String r = JOptionPane.showInputDialog("Digite o raio do cilindro.");
    raio = Double.parseDouble(r);
    area = Math.PI*(raio*raio);
    volume = area*altura;
    JOptionPane.showMessageDialog(null, "A área da base do cilindro é igual a "+area+"cm².");

    }
}