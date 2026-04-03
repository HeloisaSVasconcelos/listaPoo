package exercicios;

public class Main {
    public static void main(String[] args) {
        // Criando o objeto conforme o enunciado
        Carro meuCarro = new Carro("VW", "Gol", 2015);

        // Chamando o método que recebe o objeto por referência
        trocarModelo(meuCarro);

        // a) O que é impresso?
        // Resposta: Será impresso "Fusca"
        System.out.println("Modelo após o método: " + meuCarro.getModelo());

        /* * b) EXPLICAÇÃO TEÓRICA (Ex 13b):
         * A mudança afetou o objeto original porque, em Java, os objetos são passados
         * por REFERÊNCIA.
         * * O parâmetro 'c' do método trocarModelo aponta para o MESMO endereço de
         * memória no HEAP onde o objeto 'meuCarro' está armazenado.
         * Assim, qualquer alteração feita através de 'c' reflete-se diretamente
         * no objeto original.
         */
    }

    // Método solicitado no exercício
    public static void trocarModelo(Carro c) {
        c.setModelo("Fusca");
    }
}