package exercicios;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    public static int totalCarros = 0;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        totalCarros++;
    }

    // Necessário para o exercício 12: Getter e Setter de modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibir() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }
}