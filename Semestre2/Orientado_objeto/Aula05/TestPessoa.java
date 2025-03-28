package aula05;

public class TestPessoa{
    public static void main(String[]args){
        Pessoa p1= new Pessoa();

        //p1.nome = "Camila" // Erro de acesso porque o tipo é privado e não foi criado 'get/set'
        p1.setNome("Camila"); // Acesso bem sucedido
        p1.idade = 30; // Acesso bem sucedido
        p1.renda = 1700.55; // Acesso bem sucedido
    }
}