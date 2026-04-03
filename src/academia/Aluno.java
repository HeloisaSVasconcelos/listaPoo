package academia;

public class Aluno {
    private String nome;
    private int idade;
    private String plano;

    public static final int IDADE_MINIMA = 14;

    public Aluno(String nome, int idade, String plano) {
        this.nome = nome;
        this.plano = plano;
        setIdade(idade);
    }

    public void setIdade(int idade) {
        if (idade < IDADE_MINIMA) {
            System.out.println("Erro: Idade mínima permitida é " + IDADE_MINIMA + " anos.");
            this.idade = IDADE_MINIMA;
        } else {
            this.idade = idade;
        }
    }

    public void exibir() {
        System.out.println("Aluno: " + nome + " | Idade: " + idade + " | Plano: " + plano);
    }
}