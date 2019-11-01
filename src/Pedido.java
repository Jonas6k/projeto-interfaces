
public interface Pedido {

    float obterTotal();

    String obterNomeCliente();

    void definirCliente(ICliente ICliente);

    void remover(ItemDePedido itemDePedido);

    void adicionar(ItemDePedido itemDePedido);


}
