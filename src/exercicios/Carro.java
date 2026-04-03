package exercicios;

public class Carro {

    String marca;
    String modelo;
    int ano;

    public void exibir() {
        System.out.printf("%s %s %d\n", marca, modelo, ano);
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }
}