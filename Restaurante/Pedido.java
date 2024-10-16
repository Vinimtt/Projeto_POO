import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemDoPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemDoPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemDoPedido item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void exibirPedido() {
        System.out.println("Itens do Pedido:");
        for (ItemDoPedido item : itens) {
            System.out.println(item.getNome() + " - R$ " + item.getPreco());
        }
        System.out.println("Total: R$ " + calcularTotal());
}

    public void setObservacao(String observacao) {
        throw new UnsupportedOperationException("Unimplemented method 'setObservacao'");
    }
}
