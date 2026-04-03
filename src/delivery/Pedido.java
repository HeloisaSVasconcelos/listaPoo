package delivery;

public class Pedido {
    private String nomeCliente;
    private Marmita marmita;

    public static int totalPedidos = 0;
    public static double faturamentoTotal = 0;

    public Pedido(String nomeCliente, Marmita marmita) {
        this.nomeCliente = nomeCliente;
        this.marmita = marmita;
        totalPedidos++;
        faturamentoTotal += marmita.getPreco();
    }

    public static double calcularTotalVendido() {
        return faturamentoTotal;
    }

    public void exibirPedido() {
        System.out.println("Cliente: " + nomeCliente + " | Marmita: " + marmita.getDescricao() +
                " | Tam: " + marmita.getTamanho() + " | Valor: R$" + marmita.getPreco());
    }
}