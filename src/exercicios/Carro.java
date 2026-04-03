package exercicios;

public class Carro {
    // Atributos privados (Encapsulamento)
    private String marca;
    private String modelo;
    private int ano;

    // Construtor Parametrizado: Exige os dados no momento do "new"
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano); // Chama o setter para validar o ano logo na criação
    }

    // Métodos Getter e Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        // Validação básica de segurança
        if (ano < 1886 || ano > 2026) {
            System.out.println("Erro: O ano " + ano + " é inválido!");
        } else {
            this.ano = ano;
        }
    }

    // Método para exibir os dados formatados
    public void exibir() {
        System.out.printf("Veículo: %-10s | Modelo: %-10s | Ano: %d%n", marca, modelo, ano);
    }
}