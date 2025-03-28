package aula05;
import javax.swing.JOptionPane;

public class Conta {
    String numero;
    double saldo;

    //Construtor
    Conta(String n, double saldo){
        numero=n;
        this.saldo=saldo;
    }

    void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Dados de conta: "
        +"\nNúmero: "+numero+"\nSaldo: "+saldo);
    }
    
    void sacarValor(double valor){
        if(valor>saldo){
            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
        }else{
            saldo=saldo-valor;
        }
    }
    public double maiorSaldo(Conta c){
        if(this.saldo>c.saldo){
            return this.saldo;
        }else{
            return c.saldo;
        }
    }
    
}
