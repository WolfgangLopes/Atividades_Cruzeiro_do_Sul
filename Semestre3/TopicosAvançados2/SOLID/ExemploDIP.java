// Programa principal

public class ExemploDIP {

    // Abstração do banco
    static interface Banco {
        void salvar(String dado);
    }

    // Implementações concretas
    static class MySQLBanco implements Banco {
        public void salvar(String dado){
            System.out.println("Salvando no MySQL: "+dado);
        }
    }

    static class PostgresBanco implements Banco {
        public void salvar(String dado) {
            System.out.println("Salvando no PostgreSQl: "+dado);
        }
    }    

    // Classe de cadastro que depende da abstração de banco
    static class CadastroCliente{
        private Banco banco;

        public CadastroCliente(Banco banco){
            this.banco=banco;
        }

        public void cadastrar(String nome){
            banco.salvar("Cliente: "+nome);
        }
    }

    public static void main(String[]args){
        CadastroCliente cadastroMySQL= new CadastroCliente( new MySQLBanco());
        cadastroMySQL.cadastrar("João");

        CadastroCliente cadastroPostgres = new CadastroCliente(new PostgresBanco());
        cadastroPostgres.cadastrar("Maria");
    }
}
