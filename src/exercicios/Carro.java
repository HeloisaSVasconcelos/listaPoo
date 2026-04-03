package exercicios;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // a) Atributo estático: pertence à classe e não a um objeto específico
    public static int totalCarros = 0;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        // b) Incrementa o contador sempre que este construtor é usado
        totalCarros++;
    }

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        // b) Incrementa o contador também no construtor sem parâmetros
        totalCarros++;
    }

    public void exibir() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }

    // Mantenha os Getters e Setters aqui abaixo...
}