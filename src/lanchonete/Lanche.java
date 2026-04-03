package lanchonete;

public class Lanche {
    private String nome;
    private double preco;

    public Lanche(String nome, double preco) {
        this.nome = nome;
        setPreco(preco); // Valida o preço no construtor
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    public void setPreco(double preco) {
        if (preco < 0) { // Regra do Seu Jorge
            System.out.println("Erro: O preço não pode ser negativo!");
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }
}