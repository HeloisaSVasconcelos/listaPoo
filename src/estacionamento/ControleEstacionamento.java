package estacionamento;

import java.util.ArrayList;

public class ControleEstacionamento {
    // O número máximo de vagas (20) nunca muda, por isso é final
    public static final int LIMITE_VAGAS = 20;

    // Atributo static para que a contagem seja global ao sistema
    public static int vagasOcupadas = 0;

    private ArrayList<Veiculo> carrosPresentes = new ArrayList<>();

    public void registrarEntrada(Veiculo v) {
        if (vagasOcupadas < LIMITE_VAGAS) {
            carrosPresentes.add(v);
            vagasOcupadas++; // Incrementa a ocupação
            System.out.println("Entrada registrada: " + v.getPlaca());
        } else {
            System.out.println("Estacionamento LOTADO!");
        }
    }

    public void registrarSaida(String placa) {
        // Remove da lista pelo critério da placa
        boolean removido = carrosPresentes.removeIf(v -> v.getPlaca().equalsIgnoreCase(placa));

        if (removido) {
            vagasOcupadas--; // Decrementa ao sair
            System.out.println("Veículo com placa " + placa + " saiu.");
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

    public void mostrarStatus() {
        // Mostra quantas vagas estão ocupadas e quantas estão livres
        System.out.println("Vagas ocupadas: " + vagasOcupadas);
        System.out.println("Vagas livres: " + (LIMITE_VAGAS - vagasOcupadas));
    }
}