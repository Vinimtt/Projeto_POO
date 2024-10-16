public class Mesa {
    private int numero;
    private boolean ocupada;
    private Pedido pedido;

    public Mesa(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.pedido = new Pedido();
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void ocuparMesa() {
        if (!ocupada) {
            ocupada = true;
            System.out.println("Mesa " + numero + " foi ocupada.");
        } else {
            System.out.println("Mesa " + numero + " já está ocupada.");
        }
    }

    public void liberarMesa() {
        if (ocupada) {
            ocupada = false;
            pedido = new Pedido(); // Limpa o pedido ao liberar a mesa
            System.out.println("Mesa " + numero + " foi liberada.");
        } else {
            System.out.println("Mesa " + numero + " já está vazia.");
        }
    }

    public Pedido getPedido() {
        return pedido;
    }
    
    public int getNumero() {
        return numero;
    }
}

