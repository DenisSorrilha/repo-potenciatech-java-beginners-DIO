public class TipoVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33; //ponto significa vírgula. ex: 2.50 = 2,50
        int cep = 07013040; //se começar com zero, deve ser outro valor.
        long cpf = 30612994830L; // precisa terminar com L.

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // Uma constante é uma variável que não pode ser alterada. Deve começar com a palavra reservada 'final' e o nome da variável deve ser em Caixa Alta. 


    }
}
