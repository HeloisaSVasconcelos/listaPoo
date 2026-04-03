package estacionamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControleEstacionamento controle = new ControleEstacionamento();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- ESTACIONAMENTO DO CARLÃO ---");
            System.out.println("1) Entrada de Veículo");
            System.out.println("2) Saída de Veículo");
            System.out.println("3) Ver Vagas");
            System.out.println("4) Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Placa: ");
                String placa = sc.nextLine();
                System.out.print("Modelo: ");
                String modelo = sc.nextLine();
                controle.registrarEntrada(new Veiculo(placa, modelo));

            } else if (opcao == 2) {
                System.out.print("Placa do veículo saindo: ");
                String placa = sc.nextLine();
                controle.registrarSaida(placa);

            } else if (opcao == 3) {
                controle.mostrarStatus();
            }
        }
        sc.close();
    }
}