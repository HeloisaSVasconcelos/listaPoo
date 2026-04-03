package exercicios;

public class Main {
    public static void main(String[] args) {
        new Carro("Toyota", "Corolla", 2020);
        new Carro("Honda", "Civic", 2019);
        new Carro("VW", "Golf", 2018);
        new Carro(); // Usando o construtor vazio
        new Carro(); // Usando o construtor vazio

        System.out.println("Total de carros cadastrados: " + Carro.totalCarros);

        /* * d) EXPLICAÇÃO TEÓRICA:
         * Acessamos com 'Carro.totalCarros' porque o atributo é STATIC.
         * Isso significa que ele pertence à classe como um todo, e não a um
         * objeto individual.
         * * Diferença:
         * - Atributo de Instância (ex: modelo): Cada carro tem o seu próprio nome.
         * - Atributo Static (ex: totalCarros): É um valor compartilhado. Se um
         * carro muda o valor, muda para todos, pois todos "olham" para a mesma variável na memória.
         */
    }
}