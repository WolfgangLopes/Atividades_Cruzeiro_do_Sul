import javax.swing.JOptionPane;


public class Calculadora {
    public static void main(String[] args) {
        String valor1,valor2,tipo;
        Double n1,n2;

        tipo = JOptionPane.showInputDialog("Selecione o tipo de operação: \n+ Soma\n- Subtração\n* Multiplicação\n/ Divisão");
        valor1=JOptionPane.showInputDialog("Digite o primeiro número");
        n1=Double.parseDouble(valor1);
        valor2=JOptionPane.showInputDialog("Digite o segundo número");
        n2=Double.parseDouble(valor2);

        if("+".equals(tipo)){
            JOptionPane.showMessageDialog(null,"O resultado da soma é: "+(n1+n2));
        }else if("-".equals(tipo)){
            JOptionPane.showMessageDialog(null,"O resultado da subtração é: "+(n1-n2));
        }else if("*".equals(tipo)){
            JOptionPane.showMessageDialog(null,"O resultado da multiplicação é: "+(n1*n2));
        }else if("/".equals(tipo)){
            JOptionPane.showMessageDialog(null,"O resultado da divisão é: "+(n1/n2));
        }else{
            JOptionPane.showMessageDialog(null,"Tipo de operação inválido");
        }        

    }    
}
