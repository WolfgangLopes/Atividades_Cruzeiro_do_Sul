// Programa principal
public class ExemploISP {

    // Interfaces menores e especificas
    static interface Impressora{
        void imprimir();
    }

    static interface Scanner {
        void escanear();
    }

    static interface Fax{
        void enviarFax();
    }

    // Classes que implementam apenas o necessário
    static class ImpressoraSimples implements Impressora {
        public void imprimir(){
            System.out.println(" Impressora simples: imprimindo documento...");
        }
    }

    static class MultiFuncional implements Impressora, Scanner, Fax {
        public void imprimir(){
            System.out.println("Multifuncional: imprimindo documento...");
        }
        public void escanear(){
            System.out.println("Multifuncional: Escaneando documento...");
        }
        public void enviarFax(){
            System.out.println("Multifuncional: Enviando Fax...");
        }
    }


    public static void main (String[] args){
        ImpressoraSimples simples = new ImpressoraSimples();
        simples.imprimir();

        MultiFuncional multi = new MultiFuncional();
        multi.imprimir();
        multi.escanear();
        multi.enviarFax();
    }
    
}
