package exercicios;

public class Main {
    public static void main(String[] args) {
        // Criando alguns carros para testar
        new Carro("Chevrolet", "Onix", 2022);
        new Carro("Fiat", "Argo", 2021);

        // Chamando o método static [cite: 43]
        Carro.imprimirTotal();
    }
}