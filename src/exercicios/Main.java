package exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando a lista dinâmica (Ex 3) [cite: 20, 21]
        ArrayList<Carro> listaCarros = new ArrayList<>();

        // Criando um carro com o construtor parametrizado (Ex 5/6a) [cite: 29, 30]
        Carro c1 = new Carro("Fiat", "Uno", 2010);

        // Criando um carro com o construtor padrão (Ex 6b)
        Carro c2 = new Carro();

        // Adicionando na lista [cite: 21]
        listaCarros.add(c1);
        listaCarros.add(c2);

        // c) Imprimindo e comparando (Ex 6c) [cite: 35]
        System.out.println("========== TESTE DE SOBRECARGA ==========");
        for (Carro car : listaCarros) {
            car.exibir();
        }
        System.out.println("==========================================");

        // Comentário Ex 6c: O que muda é que o primeiro objeto já nasce com dados reais [cite: 35]
        // enquanto o segundo nasce com valores genéricos ("Desconhecido"), oferecendo
        // opções diferentes de inicialização dependendo da necessidade do sistema. [cite: 35]
    }
}