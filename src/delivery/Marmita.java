package delivery;

public class Marmita {
    private String descricao;
    private char tamanho;

    public static final double PRECO_P = 18.00;
    public static final double PRECO_M = 25.00;
    public static final double PRECO_G = 32.00;

    public Marmita(String descricao, char tamanho) {
        this.descricao = descricao;
        this.tamanho = Character.toUpperCase(tamanho);
    }

    public String getDescricao() {
        return descricao;
    }

    public char getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        if (tamanho == 'P') return PRECO_P;
        if (tamanho == 'M') return PRECO_M;
        if (tamanho == 'G') return PRECO_G;
        return 0;
    }
}