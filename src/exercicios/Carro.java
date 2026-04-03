package exercicios;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor do exercício 5
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Segundo construtor sem parâmetros (Exercício 6b)
    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
    }

    public void exibir() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }

    // Getters e Setters (Exercício 4)
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) {
        if (ano >= 1886 && ano <= 2026) {
            this.ano = ano;
        } else {
            System.out.println("Erro: Ano inválido!");
        }
    }
}