import java.util.ArrayList;
import java.util.List;
import java.lang.Iterable;
import java.util.HashMap;
import java.util.Map;


public class Restaurante {
    private List<Mesa> mesas;
    private List<ItemDoPedido> cardapio;
    private List<Pedido> pedidos;
    private double totalVendas;

    

    public Restaurante(List<Mesa> mesas, List<ItemDoPedido> cardapio, List<Pedido> pedidos, double totalVendas) {
        this.mesas = mesas;
        this.cardapio = cardapio;
        this.pedidos = pedidos;
        this.totalVendas = totalVendas;
    }

    public Restaurante(int numeroDeMesas) {
        mesas = new ArrayList<>();
        for (int i = 1; i <= numeroDeMesas; i++) {
            mesas.add(new Mesa(i));
        }
        totalVendas = 0;
    }

    public Mesa obterMesa(int numero) {
        for (Mesa mesa : mesas) {
            if (mesa.getNumero() == numero) {
                return mesa;
            }
        }
        System.out.println("Mesa " + numero + " não encontrada.");
        return null;
    }

    public void registrarPedido(int numeroMesa, ItemDoPedido item, String observacao) {
        Mesa mesa = obterMesa(numeroMesa);
        if (mesa != null && mesa.isOcupada()) {
            mesa.getPedido().adicionarItem(item);
            System.out.println("Item " + item.getNome() + " adicionado à mesa " + numeroMesa);
        } else {
            System.out.println("A mesa " + numeroMesa + " está vazia ou não existe.");
        }
    }

    public void fecharConta(int numeroMesa) {
        Mesa mesa = obterMesa(numeroMesa);
        if (mesa != null && mesa.isOcupada()) {
            double totalMesa = mesa.getPedido().calcularTotal();
            totalVendas += totalMesa;
            System.out.println("Fechando conta da mesa " +numeroMesa + ". Total: R$ " + totalMesa);
            mesa.liberarMesa();
        } else {
            System.out.println("A mesa " + numeroMesa+ " está vazia ou não existe.");
        }
    }

    public void gerarRelatorioDeVendas() {
        System.out.println("Total de vendas: R$ " +totalVendas);
    }

  
    


}

