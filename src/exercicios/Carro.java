package exercicios;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // Atributos estáticos e constantes (Ex 7 e 9)
    public static int totalCarros = 0;
    public static final int ANO_PRIMEIRO_CARRO = 1886; //

    // Construtor parametrizado (Ex 5)
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano); // Usa o setter para validar o ano
        totalCarros++; //
    }

    // Métodos Getter e Setter com validação (Ex 4)
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }

    public void setAno(int ano) {
        // Validação usando a constante final
        if (ano < ANO_PRIMEIRO_CARRO || ano > 2026) {
            System.out.println("Erro: Ano inválido!");
        } else {
            this.ano = ano;
        }
    }

    // Método para exibir dados (Ex 2)
    public void exibir() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }
}