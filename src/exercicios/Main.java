
package exercicios;

package exercicios;

public class Main {
    public static void main(String[] args) {

        // --- Exercício 11: Referência vs Valor (Primitivo) ---
        int a = 10;
        int b = a; // b recebe uma CÓPIA do valor de a
        b = 99;    // alteramos b, mas a cópia original de 'a' permanece intacta

        // a) Imprimindo os valores para conferir
        System.out.println("Valor de a = " + a); // Saída: 10
        System.out.println("Valor de b = " + b); // Saída: 99

        /* :
         * Alterar a variável 'b' NÃO mudou o valor de 'a'.
         * Isso acontece porque tipos primitivos em Java são passados por VALOR.
         * Quando fizemos 'int b = a', o Java criou um novo espaço na memória (Stack)
         * e copiou o número 10 para lá. As duas variáveis são totalmente independentes
         * e não compartilham nenhuma ligação entre si.
         */
    }
}