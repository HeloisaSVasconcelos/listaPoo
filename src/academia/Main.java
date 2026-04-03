package academia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControleAcademia controle = new ControleAcademia();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- ACADEMIA DA FERNANDA ---");
            System.out.println("1) Matricular Aluno");
            System.out.println("2) Listar Alunos");
            System.out.println("3) Ver Total de Alunos");
            System.out.println("4) Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();
                System.out.print("Plano (Mensal/Anual): ");
                String plano = sc.nextLine();

                controle.matricular(new Aluno(nome, idade, plano));

            } else if (opcao == 2) {
                controle.listarAlunos();

            } else if (opcao == 3) {
                System.out.println("Total de alunos matriculados: " + ControleAcademia.totalMatriculados);
            }
        }
        sc.close();
    }
}