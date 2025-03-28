package aula05;
import javax.swing.JOptionPane;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta ("1234",1000.50);
        Conta c1 =  new Conta ("1234",250.45);
        c.imprimeDados();
        c.sacarValor(500.50);
        c.imprimeDados();
        c.sacarValor(700);
        JOptionPane.showMessageDialog(null, "Maior saldo: "+c.maiorSaldo(c1));
    }
    
}
