class ItemDoPedido {
    private String nome;
    private double preco;
    private String observacao;

    public ItemDoPedido(String nome, double preco, String observacao) {
        this.nome = nome;
        this.preco = preco;
        this.observacao = observacao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Object getQuantidade() {
        throw new UnsupportedOperationException("Unimplemented method 'getQuantidade'");
    }

}