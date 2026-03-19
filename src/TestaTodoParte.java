import java.util.Date;

public class    TestaTodoParte {

    public static void main(String[] args) {

        // Cria um objeto da classe Cliente independente
        // Cria o objeto-parte
        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente(1, "Fulano", "1234", "Rua Chile");

        // Produtos
        Produto pr1 = new Produto(100, "Mouse", "Mouse Óptico", 180);
        Produto pr2 = new Produto(200, "Monitor", "Widescreen", 180);
        Produto pr3 = new Produto(47, "Camisa Palmeiras", "Flaco Lópes", 200);

        // Cria o objeto-todo
        Pedido ped1 = new Pedido(10, new Date(), cl2);

        ped1.adicionaItemPedido(1000, 5, pr1);
        ped1.adicionaItemPedido(201, 2, pr2);
        ped1.adicionaItemPedido(47, 2, pr3);

        System.out.println(ped1.toString());
    }
}


// ItemPedido ip1 = new ItemPedido(1000, 5, pr1);  // Relacionado AO "pr2"
// ItemPedido ip2 = new ItemPedido(201, 2, pr2);   // Relacionado AO "pr2"