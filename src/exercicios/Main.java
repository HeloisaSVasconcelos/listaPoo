package exercicios;

public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro();

        c1.marca = "Toyota";
        c1.modelo = "Corolla";
        c1.ano = 2020;

        c1.exibir();

        System.out.printf("Idade: %d\n", c1.idadeDoCarro());

        // exibir() → não retorna valor (void)
        // idadeDoCarro() → retorna valor (int)
    }
}