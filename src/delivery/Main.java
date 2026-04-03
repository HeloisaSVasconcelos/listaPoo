package delivery;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Marmita> cardapio = new ArrayList<>();
        ArrayList<Pedido> pedidosDoDia = new ArrayList<>();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n--- DELIVERY DA CAMILA ---");
            System.out.println("1) Cadastrar Marmita no Cardápio");
            System.out.println("2) Registrar Novo Pedido");
            System.out.println("3) Listar Pedidos do Dia");
            System.out.println("4) Ver Total e Faturamento");
            System.out.println("5) Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Descrição (ex: Frango grelhado): ");
                String desc = sc.nextLine();
                System.out.print("Tamanho (P/M/G): ");
                char tam = sc.next().charAt(0);
                cardapio.add(new Marmita(desc, tam));
                System.out.println("Marmita cadastrada!");

            } else if (opcao == 2) {
                if (cardapio.isEmpty()) {
                    System.out.println("Cadastre marmitas no cardápio primeiro!");
                } else {
                    System.out.print("Nome do Cliente: ");
                    String nome = sc.nextLine();
                    System.out.println("Escolha a marmita:");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.println(i + " - " + cardapio.get(i).getDescricao() + " (" + cardapio.get(i).getTamanho() + ")");
                    }
                    int index = sc.nextInt();
                    pedidosDoDia.add(new Pedido(nome, cardapio.get(index)));
                    System.out.println("Pedido registrado!");
                }

            } else if (opcao == 3) {
                System.out.println("\n--- PEDIDOS REALIZADOS ---");
                for (Pedido p : pedidosDoDia) {
                    p.exibirPedido();
                }

            } else if (opcao == 4) {
                System.out.println("Quantidade de pedidos: " + Pedido.totalPedidos);
                System.out.println("Valor total vendido: R$" + Pedido.calcularTotalVendido());
            }
        }
        sc.close();
    }
}