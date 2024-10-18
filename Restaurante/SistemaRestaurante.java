import java.util.ArrayList;
import java.util.List;

public class SistemaRestaurante {
    private List<Mesa> mesas;
    private List<ItemDoPedido> cardapio;
    private List<Pedido> pedidos;
    private double totalVendas;

    public SistemaRestaurante(int numeroDeMesas) {
        this.mesas = new ArrayList<>(); 
        this.cardapio = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.totalVendas = 0.0;
        criarMesas(numeroDeMesas);
    }

    
    private void criarMesas(int numeroDeMesas) {
        for (int i = 0; i < numeroDeMesas; i++) {
            this.mesas.add(new Mesa(i + 1)); 
        }
    }

    public Mesa obterMesa(int numeroMesa) {
        for (Mesa mesa : mesas) {
            if (mesa.getNumeroMesa() == numeroMesa) {
                return mesa;
            }
        }
        System.out.println("Mesa " + numeroMesa + " não encontrada.");
        return null;
    }

    public void registrarPedido(int numeroMesa, ItemDoPedido item, String observacao) {
        Mesa mesa = obterMesa(numeroMesa);
        if (mesa != null && mesa.isOcupada()) {
            mesa.getPedido().adicionarItem(item);
            System.out.println("Item " + item.getNome() + "adicionado à mesa " + numeroMesa);
        } else {
            System.out.println("A mesa " + numeroMesa + " está vazia ou não existe.");
        }
    }


    public void fecharConta(int numeroMesa) {
        Mesa mesa = obterMesa(numeroMesa);
        if (mesa != null && mesa.isOcupada()) {
            double totalMesa = mesa.getPedido().calcularTotal();
            totalVendas += totalMesa;
            System.out.println("Fechando conta da mesa " + numeroMesa+ ". Total: R$ " + totalMesa);
            mesa.liberarMesa(); 
        } else {
            System.out.println("A mesa " + numeroMesa + " está vazia ou não existe.");
        }
    }

    public void gerarRelatorioDeVendas() {
        System.out.println("Total de vendas: R$ " + totalVendas);
    }


    public double getTotalVendas() {
        return totalVendas;
    }


    public List<Mesa> getMesas() {
        return mesas;
    }

    public List<ItemDoPedido> getCardapio() {
        return cardapio;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}