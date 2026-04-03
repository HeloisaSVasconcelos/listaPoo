package exercicios;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    public static int totalCarros = 0;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        totalCarros++;
    }

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros++;
    }

    public static void imprimirTotal() {
        System.out.println("Total de carros registrados: " + totalCarros);

        // b) Tentativa de acessar atributo de instância
        // System.out.println(modelo);
        // ^ SE DESCOMENTAR A LINHA ACIMA, DARÁ ERRO DE COMPILAÇÃO!
    }

    /* *
     * Um método 'static' pertence à classe e existe mesmo que nenhum objeto tenha sido criado.
     * Atributos de instância (como 'modelo') só existem depois que você dá um 'new Carro()'.
     * O método static não sabe de "qual" carro você está falando, por isso ele não pode
     * acessar dados individuais.
     */

    public void exibir() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }
}