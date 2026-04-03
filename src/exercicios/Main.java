package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Carro> lista = new ArrayList<>(); //
        int opcao = 0;

        while (opcao != 4) { // [cite: 101]
            System.out.println("\n--- MENU DO SISTEMA ---");
            System.out.println("1) Cadastrar Carro");
            System.out.println("2) Listar todos");
            System.out.println("3) Total cadastrado");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar o buffer

            if (opcao == 1) { // Cadastrar [cite: 101]
                System.out.print("Marca: ");
                String ma = leitor.nextLine();
                System.out.print("Modelo: ");
                String mo = leitor.nextLine();
                System.out.print("Ano: ");
                int an = leitor.nextInt();

                // Cria o objeto via construtor e adiciona na lista [cite: 105]
                lista.add(new Carro(ma, mo, an));
                System.out.println("Carro cadastrado com sucesso!");

            } else if (opcao == 2) { // Listar [cite: 101]
                System.out.println("\n--- LISTA DE VEÍCULOS ---");
                for (Carro c : lista) {
                    c.exibir();
                }

            } else if (opcao == 3) { // Total [cite: 101]
                // Acesso via atributo static da classe [cite: 106]
                System.out.println("Total de carros no sistema: " + Carro.totalCarros);

            } else if (opcao == 4) {
                System.out.println("A encerrar o sistema...");
            } else {
                System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }
}