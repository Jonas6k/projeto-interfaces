
public interface ItemDePedido {

    int obterQuantidade();

    /**
     * esse método é a multiplicação da quantidade pelo preço do produto
     * @return quantidade  vezes preco do produto
     */

    float obterSubtotal();

    void definirItem(Item item);

    Item obterItem();
}
