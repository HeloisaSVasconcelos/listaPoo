package exercicios;

public class Main {
    public static void main(String[] args) {

        // --- Exercício 12: Referência vs Valor (Objeto) ---

        // a) Criando c1 e fazendo c2 apontar para o mesmo objeto
        Carro c1 = new Carro("Fiat", "Uno", 2020);
        Carro c2 = c1; // c2 não é um novo carro, é apenas um "apelido" para c1 [cite: 73]

        // Alterando o modelo através de c2
        c2.setModelo("Palio"); // [cite: 74]

        // b) Verificando o resultado
        System.out.println("Modelo de c1: " + c1.getModelo()); // Imprime: Palio [cite: 75]
        System.out.println("Modelo de c2: " + c2.getModelo()); // Imprime: Palio [cite: 75]

        /* * c) EXPLICAÇÃO TEÓRICA (Ex 12b e 12c):
         * Por que alterar c2 mudou c1?
         * Porque c1 e c2 compartilham o mesmo endereço de memória no HEAP. [cite: 77, 79]
         * * Diferença entre Ex 11 (int) e Ex 12 (Carro):
         * - No Ex 11 (Tipo Primitivo): A variável guarda o valor real na STACK.
         * Ao copiar, cria-se um valor independente. [cite: 70, 78]
         * * - No Ex 12 (Objeto): A variável na STACK guarda apenas uma REFERÊNCIA (ponteiro).
         * O objeto real fica no HEAP. Ao fazer 'c2 = c1', você copia o endereço,
         * fazendo as duas variáveis apontarem para o MESMO objeto físico. [cite: 77, 79]
         */
    }
}