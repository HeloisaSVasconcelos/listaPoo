package exercicios;

public class Main {
    public static void main(String[] args) {
        // e) Criando um objeto com cada construtor
        Cliente cli1 = new Cliente("Helo", "helos@email.com", "65 9999-9999");
        Cliente cli2 = new Cliente("Diego", "diego@unisenai.edu.br");
        Cliente cli3 = new Cliente("João");

        // Imprimindo os dados dos três
        System.out.println("========== LISTA DE CLIENTES ==========");
        cli1.exibirCliente();
        cli2.exibirCliente();
        cli3.exibirCliente();
        System.out.println("=======================================");

        // Exibindo o total de clientes usando o atributo static
        System.out.println("Total de clientes cadastrados: " + Cliente.totalClientes);
    }
}