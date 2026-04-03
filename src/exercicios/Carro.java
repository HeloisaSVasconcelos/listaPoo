package exercicios;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    public static int totalCarros = 0;

    // a) Criando a constante static final
    // Por convenção, constantes em Java são escritas em MAIÚSCULAS
    public static final int ANO_PRIMEIRO_CARRO = 1886;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano); // b) Usando o setter para aplicar a validação já no construtor
        totalCarros++;
    }

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros++;
    }

    // b) Atualizando o setter com a constante
    public void setAno(int ano) {
        if (ano < ANO_PRIMEIRO_CARRO || ano > 2026) {
            System.out.println("Erro: O ano não pode ser menor que " + ANO_PRIMEIRO_CARRO + " ou maior que 2026.");
        } else {
            this.ano = ano;
        }
    }

    public void exibir() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }

    // Outros getters e setters permanecem iguais...
}