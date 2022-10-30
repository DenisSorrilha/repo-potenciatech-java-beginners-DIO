import java.lang.reflect.Method;

public class Operadores {
    public static void main(String []args) {
        //O Operador de atribuição é: sinal de =. Utilizado para definir valor inicial ou alterar o valor da mesma.
        String nome = "Denis";
        int idade = 41;
        double peso = 104.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        //Date dataNascimento = new Date(); - Cria um objeto.

        //Operadores aritiméticos são utilizados para efetuar operações matemáticas entre números: +, -, /, *,
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        //double resultado = (10 * 7) + (20 / 4);

        //O operador de adição realiza a concatenação de textos.

        //operadores unários - são aplicados com outro valor aritmético. Utilizado para incrementar, decrementar, inverter valores numéricos ou booleanos.
        int numero = 5;
        numero ++; //incrementa
        numero = - numero; //negativa o número
        numero = numero * -1; //transforma o valor em positivo.

        //Operador ternário:
        //<ExpressãoCondicional> ? <Caso seja verdadeiro> : <Caso seja falso>;

        int a, b;
        a = 5;
        b = 6;

        String resultado = (a==b) ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        //operadores relacionais: 
        // == : igual à
        // != : diferente de
        // >  : maior que
        // >= : maior ou igual a
        // <  : menor que
        // <= : menor ou igual a
        











    } 
}