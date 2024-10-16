import java.lang.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante(10);

        restaurante.obterMesa(1).ocuparMesa();
        restaurante.obterMesa(2).ocuparMesa();
        restaurante.obterMesa(3).ocuparMesa();
        
        ItemDoPedido pizza = new ItemDoPedido("Pizza", 30.0, "calabresa e mussarela" );
        ItemDoPedido refrigerante = new ItemDoPedido("Refrigerante", 5.0, "coca cola");
        ItemDoPedido sobremesa = new ItemDoPedido("Sobremesa", 15.0, "pudim");
        ItemDoPedido cerveja = new ItemDoPedido("Cerveja", 10.0, "Heineken");
        ItemDoPedido suco = new ItemDoPedido("Suco", 8.0, "Laranja");
        ItemDoPedido agua = new ItemDoPedido("Água", 3.0, "Mineral");
        ItemDoPedido vinho = new ItemDoPedido("Vinho", 50.0, "Tinto de mesa");
        ItemDoPedido salada = new ItemDoPedido("Salada", 10.0, "Salada Cesar");
        ItemDoPedido fileComFritas =  new ItemDoPedido("File com Fritas", 20.0, "File acompanhado com fritas e molho especial");

        
        restaurante.registrarPedido(1, pizza,"calabresa e mussarela");
        restaurante.registrarPedido(1, refrigerante, "coca zero");
        restaurante.registrarPedido(2, sobremesa, "pudim");
        restaurante.registrarPedido(3,fileComFritas, "carne ao ponto");
        restaurante.registrarPedido(3, cerveja, "Heineken");
        

        
        restaurante.fecharConta(1);
        restaurante.fecharConta(3);
        restaurante.fecharConta(2);

        restaurante.gerarRelatorioDeVendas();
       
    }
}

