import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;     // ID do pedido
    private Date data;      // Data do pedido
    private Cliente cliente;        // associação todo-parte
    // Maiuscula - Classe   |   Minuscula - objeto
    private ArrayList<ItemPedido> itensPedido;  // Vetor


    // Construtor Vazio
    public Pedido() {
        this.itensPedido = new ArrayList<>();   // Aloca espaço na memória
    }

    // Construtor   | Cliente veio pronto, já que está no (Cliente.java), é agregação = independente
    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itensPedido = new ArrayList<>();
    }

    // Adiciona um Item de Pedido no vetor "itensPedido" (ou pedido)
    // add = vetor  |   Passando valores para criar item pedido

    public void adicionaItemPedido(int id, float qtde, Produto produto){
        ItemPedido aux = new ItemPedido(id, qtde, produto);
        this.itensPedido.add(aux);
        System.out.println("Item do pedido adicionado com sucesso!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Cliente veio pronto, já que está no (Cliente.java), é agregação = independente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=" + cliente +    // Retorna o toString do Cliente (do Cliente.java)
                ", itens do pedido = " + itensPedido +
                '}';
    }

    public float calcularTotalPedido(){
        float total = 0;    // Total se inicia com 0
        for(ItemPedido item : itensPedido){     // Percorre todos os itens do "itensPedido"
            total+= item.getQtde() * item.getProduto().getPreco();
            // Pega a Qtde de itens e multiplica pelo preço do produto, somando no "total"
        }
        return total;
    }

}


// Agregação e Composição, matéria de prova

// Se caso fosse agregação, seria

//public void adicionaItemPedido(ItemPedido itemPedido){
//    this.itensPedido.add(itemPedido);
//}