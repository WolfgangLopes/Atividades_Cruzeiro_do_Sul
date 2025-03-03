package test;
import javax.swing.JOptionPane;

public class Imcif {
    public static void main(String[] args){
    Double peso, altura, imc;
    String p=JOptionPane.showInputDialog("Digite o seu peso em kg: ");
    peso = Double.parseDouble(p);
        /* Alternativa: "peso = Double.valueOf();" */
    String a=JOptionPane.showInputDialog("Digite a sua altura em m: ");
    altura = Double.parseDouble(a);
    imc = peso/(altura*altura);
    JOptionPane.showMessageDialog(null, "O seu IMC é "+imc+".");
    
    if (imc<20){
JOptionPane.showMessageDialog(null, "Abaixo do peso");
 }
    else if (imc>=20&&imc<25){
        JOptionPane.showMessageDialog(null, "Peso normal");
    }else if(imc<30&&imc>=25){
        JOptionPane.showMessageDialog(null, "Sobrepeso");
    }else if(imc<40&&imc>=30){
        JOptionPane.showMessageDialog(null, "Obeso");
    }else{
        JOptionPane.showMessageDialog(null, "Obeso Mórbido");
    }
}
}
