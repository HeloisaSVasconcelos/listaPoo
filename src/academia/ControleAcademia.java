package academia;

import java.util.ArrayList;

public class ControleAcademia {
    public static final int LIMITE_ALUNOS = 50;
    public static int totalMatriculados = 0;

    private ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void matricular(Aluno a) {
        if (totalMatriculados < LIMITE_ALUNOS) {
            listaAlunos.add(a);
            totalMatriculados++;
            System.out.println("Matrícula realizada com sucesso!");
        } else {
            System.out.println("Erro: Capacidade máxima da academia atingida!");
        }
    }

    public void listarAlunos() {
        System.out.println("\n--- QUADRO DE ALUNOS ---");
        for (Aluno al : listaAlunos) {
            al.exibir();
        }
    }
}