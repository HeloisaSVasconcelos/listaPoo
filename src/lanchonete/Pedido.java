package lanchonete;

public class Pedido {
    private Lanche lanche;
    // Atributo static para contar pedidos do dia
    public static int totalPedidosDia = 0;

    public Pedido(Lanche lanche) {
        this.lanche = lanche;
        totalPedidosDia++; // Incrementa a cada novo pedido
    }

    public void exibirPedido() {
        System.out.println("Pedido: " + lanche.getNome() + " - R$ " + lanche.getPreco());
    }
}