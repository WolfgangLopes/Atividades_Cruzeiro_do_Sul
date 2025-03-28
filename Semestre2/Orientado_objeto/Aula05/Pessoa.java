package aula05;
import javax.swing.JOptionPane;

public class Pessoa{
    //atributos
    private String nome;
    public int idade;
    protected double renda;

    //Construtor
    Pessoa(String nome, int idade, double renda){
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
    }

    //metodos
    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade+"\nRenda: "+renda);
    }
    
    // Get/Set
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getRenda(){
        return renda;
    }
     public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setRenda(double renda){
        this.renda=renda;
    }

}