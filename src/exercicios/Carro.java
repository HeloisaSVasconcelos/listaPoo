package exercicios;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

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
        if (ano < 1886 || ano > 2026) {
            System.out.printf("Ano inválido!\n");
        } else {
            this.ano = ano;
        }
    }

    public void exibir() {
        System.out.printf("%s %s %d\n", marca, modelo, ano);
    }
}