package exercicios;

public class Main {
    public static void main(String[] args) {
        // c) Tentativa de alterar uma constante final [cite: 49]
        // Carro.ANO_PRIMEIRO_CARRO = 1900;

        /*
         * Ao tentar descomentar a linha acima, o Java apresentará um erro de compilação.
         * Isso acontece porque uma variável marcada como 'final' não pode ter seu valor
         * alterado após ser inicializada. [cite: 50]
         * * O modificador 'final' serve para garantir a integridade de dados que devem
         * ser imutáveis durante toda a execução do programa. [cite: 50]
         */

        // Testando a validação com a constante
        Carro cTest = new Carro("Ford", "T", 1800); // Deve imprimir erro
        cTest.exibir(); // O ano aparecerá como 0 (valor padrão)
    }
}