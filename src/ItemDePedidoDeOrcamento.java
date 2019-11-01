public class ItemDePedidoDeOrcamento implements ItemDePedido {
    private int quantidade;
    private Item item;

    public ItemDePedidoDeOrcamento(int quantidade, Item item) {
        this.quantidade = quantidade;
        this.item = item;
    }

    @Override
    public int obterQuantidade() {
        return this.quantidade;
    }

    @Override
    public float obterSubtotal() {
        return this.obterQuantidade() * this.obterItem().obterPreco();
    }

    @Override
    public void definirItem(Item item) {
        this.item = item;
    }

    @Override
    public Item obterItem() {
        return item;
    }
}
