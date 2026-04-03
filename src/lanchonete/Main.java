package lanchonete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Lanche> cardapio = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- LANCHONETE DO SEU JORGE ---");
            System.out.println("1) Cadastrar Lanche no Cardápio");
            System.out.println("2) Registrar Pedido");
            System.out.println("3) Total de Pedidos do Dia");
            System.out.println("4) Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do lanche: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                cardapio.add(new Lanche(nome, preco));
                System.out.println("Lanche cadastrado!");

            } else if (opcao == 2) {
                if (cardapio.isEmpty()) {
                    System.out.println("Cardápio vazio! Cadastre um lanche primeiro.");
                } else {
                    System.out.println("--- Cardápio ---");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.println(i + " - " + cardapio.get(i).getNome());
                    }
                    System.out.print("Escolha o número do lanche: ");
                    int index = sc.nextInt();
                    new Pedido(cardapio.get(index)); // Cria o pedido e incrementa o static
                    System.out.println("Pedido registrado!");
                }

            } else if (opcao == 3) {
                System.out.println("Pedidos feitos hoje: " + Pedido.totalPedidosDia);
            }
        }
        sc.close();
    }
}