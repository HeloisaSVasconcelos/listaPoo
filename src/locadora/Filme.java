package locadora;

public class Filme {
    private String titulo;
    private String genero;
    private int anoLancamento;

    public static final int ANO_MINIMO = 1895;
    public static int totalFilmesAcervo = 0;

    public Filme(String titulo, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        setAnoLancamento(anoLancamento);
        totalFilmesAcervo++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAnoLancamento(int ano) {
        if (ano < ANO_MINIMO || ano > 2026) {
            System.out.println("Erro: Ano inválido para o filme " + this.titulo);
            this.anoLancamento = ANO_MINIMO;
        } else {
            this.anoLancamento = ano;
        }
    }

    public String verificarClassificacao() {
        if (this.anoLancamento < 2000) {
            return "Clássico";
        } else {
            return "Recente";
        }
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo + " | Gênero: " + genero +
                " | Ano: " + anoLancamento + " (" + verificarClassificacao() + ")");
    }
}