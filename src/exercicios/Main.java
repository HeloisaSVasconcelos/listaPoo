package exercicios;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Carro> lista = new ArrayList<>();

        Carro c1 = new Carro();
        c1.marca = "Toyota";
        c1.modelo = "Corolla";
        c1.ano = 2020;

        Carro c2 = new Carro();
        c2.marca = "Honda";
        c2.modelo = "Civic";
        c2.ano = 2018;

        Carro c3 = new Carro();
        c3.marca = "Ford";
        c3.modelo = "Ka";
        c3.ano = 2015;

        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

        for (Carro c : lista) {
            c.exibir();
        }
    }
}