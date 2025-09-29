package java;

//Programa principal

public class ExemploOCP  {

    // Interface desconto

    static interface Desconto {
        double aplicar(double valor);
        }
    
        // Descontos especificos
        static class DescontoNatal implements Desconto {
            public double aplicar(double valor){
                return valor * 0.9;
            }
        }

        static class DescontoAnoNovo implements Desconto {
            public double aplicar(double valor){
                return valor * 0.85;
            }
        }

        static class BlackFriday implements Desconto {
            public double aplicar(double valor){
                return valor * 0.5;
            }
        }

        // Calculadora de desconto
        static class CalculadoraDesconto {
            public double calcular(Desconto desconto, double valor){
                return desconto.aplicar(valor);
            }
        }

        public static void main(String[] args){
            CalculadoraDesconto calc = new CalculadoraDesconto();
            
            double valor = 100.0;

            System.out.println("Preço no Natal: " + calc.calcular(new DescontoNatal(), valor));
            System.out.println("Preço no Ano Novo: " + calc.calcular(new DescontoAnoNovo(), valor));
            System.out.println("Preço na Black Friday: " + calc.calcular(new BlackFriday(), valor ));

        }
}
