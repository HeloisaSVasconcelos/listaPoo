
package exercicios;

public class Main {
    public static void main(String[] args) {

        // a) O código abaixo não compila originalmente:
        if (true) {
            int x = 10; // x é criada dentro do bloco do 'if'
            System.out.println("Variável x dentro do if: " + x);
        }

        // System.out.println(x); // ERRO DE COMPILAÇÃO AQUI

        // b) Versão corrigida para funcionar:
        int y = 20; // Declarada fora do bloco para ter um escopo maior
        if (true) {
            y = 30;
        }
        System.out.println("Variável y fora do if: " + y);

        /* *
         * O que aconteceu? O código original não compila porque a variável 'x'
         * foi declarada dentro do bloco de chaves do 'if'.
         * * O que é Escopo? É a região do programa onde uma variável é "visível" ou acessível. [cite: 61]
         * No Java, uma variável local só existe dentro do bloco de código {} onde foi declarada.
         * Assim que o programa sai do 'if', a variável 'x' é destruída da memória (Stack),
         * por isso ela não existe na linha de baixo.
         */
    }
}