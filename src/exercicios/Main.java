package exercicios;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Criando a lista para armazenar os objetos do tipo Carro
        ArrayList<Carro> lista = new ArrayList<>();

        // Configurando o Carro 1 usando os Setters
        Carro c1 = new Carro();
        c1.setMarca("Toyota");
        c1.setModelo("Corolla");
        c1.setAno(2020);

        // Configurando o Carro 2 usando os Setters
        Carro c2 = new Carro();
        c2.setMarca("Honda");
        c2.setModelo("Civic");
        c2.setAno(2018);

        // Configurando o Carro 3 usando os Setters
        Carro c3 = new Carro();
        c3.setMarca("Ford");
        c3.setModelo("Ka");
        c3.setAno(2015);

        // Adicionando os objetos na lista
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

        // Percorrendo a lista e chamando o método exibir de cada carro
        System.out.println("--- Lista de Carros ---");
        for (Carro c : lista) {
            c.exibir();
        }
    }
}