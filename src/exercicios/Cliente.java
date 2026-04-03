package exercicios;

public class Cliente {
    // a) Atributos privados (Encapsulamento) [cite: 93]
    private String nome;
    private String email;
    private String telefone;

    // d) Atributo estático para contagem
    public static int totalClientes = 0;

    // a) Construtor 1: Recebe todos os parâmetros [cite: 94]
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        totalClientes++; // Incrementa o total
    }

    // b) Construtor 2: Recebe nome e email (Telefone padrão) [cite: 95]
    public Cliente(String nome, String email) {
        this(nome, email, "Não informado"); // Chama o Construtor 1
    }

    // c) Construtor 3: Recebe apenas o nome [cite: 96]
    public Cliente(String nome) {
        this(nome, "Não informado", "Não informado"); // Chama o Construtor 1
    }

    // Método para exibir os dados (útil para o item e)
    public void exibirCliente() {
        System.out.println("Nome: " + nome + " | Email: " + email + " | Tel: " + telefone);
    }

    // Getters (Caso precises aceder aos dados na Main)
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
}