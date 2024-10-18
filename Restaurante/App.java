public class App {
    public static void main(String[] args) {
        SistemaRestaurante restaurante = new SistemaRestaurante(10);

        restaurante.getCardapio().add(new ItemDoPedido("Pizza", 30.0, "calabresa e mussarela"));
        restaurante.getCardapio().add(new ItemDoPedido("Refrigerante", 5.0, "coca cola"));
        restaurante.getCardapio().add(new ItemDoPedido("Sobremesa", 15.0, "pudim"));
        restaurante.getCardapio().add(new ItemDoPedido("Cerveja", 10.0, "Heineken"));

        restaurante.obterMesa(1).ocuparMesa();
        restaurante.registrarPedido(1, new ItemDoPedido("Pizza", 30.0, "calabresa e mussarela"), "Sem cebola");
        restaurante.registrarPedido(1, new ItemDoPedido("Refrigerante", 5.0, "coca cola"), "Sem gelo");

        restaurante.obterMesa(2).ocuparMesa();
        restaurante.registrarPedido(2, new ItemDoPedido("Sobremesa", 15.0, "pudim"), "");

        restaurante.obterMesa(3).ocuparMesa();
        restaurante.registrarPedido(3, new ItemDoPedido("Cerveja", 10.0, "Heineken"), null);

        restaurante.fecharConta(1);
        restaurante.fecharConta(2);
        restaurante.fecharConta(3);

        RestauranteGUi.mostrarInferface(
                restaurante.getMesas(),
                restaurante.getCardapio(),
                restaurante.getPedidos(),
                restaurante.getTotalVendas());

    }
}