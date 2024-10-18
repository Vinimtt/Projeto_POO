public class Mesa {
    private int numeroMesa;
    private boolean ocupada;
    private Pedido pedido;

    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.ocupada = false;
        this.pedido = new Pedido();
    }

    public int getNumeroMesa() {
        return this.numeroMesa;
    }

    public boolean isOcupada() {
        return this.ocupada;
    }

    public void ocuparMesa() {
        this.ocupada = true;
    }

    public void liberarMesa() {
        this.ocupada = false;
        this.pedido = new Pedido();
    }

    public Pedido getPedido() {
        return this.pedido;
    }
}