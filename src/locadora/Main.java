package locadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Filme> acervo = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- LOCADORA DO MARCOS ---");
            System.out.println("1) Cadastrar Filme");
            System.out.println("2) Listar Acervo");
            System.out.println("3) Total de Filmes");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Título: ");
                String titulo = sc.nextLine();
                System.out.print("Gênero: ");
                String genero = sc.nextLine();
                System.out.print("Ano de Lançamento: ");
                int ano = sc.nextInt();

                acervo.add(new Filme(titulo, genero, ano));
                System.out.println("Filme adicionado ao acervo!");

            } else if (opcao == 2) {
                System.out.println("\n--- FILMES NO ACERVO ---");
                for (Filme f : acervo) {
                    f.exibirDados();
                }

            } else if (opcao == 3) {
                System.out.println("Total de filmes no acervo: " + Filme.totalFilmesAcervo);
            }
        }
        sc.close();
    }
}