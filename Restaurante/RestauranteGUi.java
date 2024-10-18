import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RestauranteGUi {
    public static void mostrarInferface(List<Mesa> mesas, List<ItemDoPedido> cardapio, List<Pedido> pedidos,
            double totalVendas) {
        JFrame janela = new JFrame("Restaurante");
        janela.setSize(500, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        janela.add(scrollPane, BorderLayout.CENTER);

        StringBuilder relatorio = new StringBuilder();

        relatorio.append("Mesas\n");
        for (Mesa mesa : mesas) {
            relatorio.append("Mesa ").append(mesa.getNumeroMesa());
            relatorio.append(mesa.isOcupada() ? " - Ocupada\n" : " - Livre\n");
        }

        relatorio.append("\n");

        relatorio.append("Cardápio\n");
        for (ItemDoPedido item : cardapio) {
            relatorio.append("Prato: ").append(item.getNome())
                    .append(" | Preço: R$ ").append(item.getPreco())
                    .append(" | Observação: ").append(item.getObservacao()).append("\n");
        }

        relatorio.append("\n");

        relatorio.append("Pedidos\n");
        for (Pedido pedido : pedidos) {
            relatorio.append("Pedido para Mesa ").append(pedido.getNumeroMesa()).append("\n");
            for (ItemDoPedido item : pedido.getItens()) {
                relatorio.append("  - ").append(item.getNome())
                        .append(" | Quantidade: ").append(item.getQuantidade())
                        .append(" | Observação: ").append(item.getObservacao()).append("\n");
            }
            relatorio.append("Total do Pedido: R$ ").append(pedido.calcularTotal()).append("\n\n");
        }

        relatorio.append("Total de Vendas: R$ ").append(totalVendas).append("\n");

        textArea.setText(relatorio.toString());

        janela.setVisible(true);
    }
}