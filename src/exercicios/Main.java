
package exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando a lista dinâmica de objetos do tipo Carro
        ArrayList<Carro> listaCarros = new ArrayList<>();

        // Instanciando objetos usando o Construtor (Passando os dados direto no parênteses)
        Carro c1 = new Carro("Fiat", "Uno", 2010);
        Carro c2 = new Carro("Ford", "Ka", 2015);
        Carro c3 = new Carro("Renault", "Sandero", 2018);

        // Adicionando os objetos na lista
        listaCarros.add(c1);
        listaCarros.add(c2);
        listaCarros.add(c3);

        // Percorrendo a lista com o loop for-each
        System.out.println("========== LISTAGEM DE VEÍCULOS ==========");
        for (Carro car : listaCarros) {
            car.exibir();
        }
        System.out.println("==========================================");
    }
}