
public interface PontoDePagamento {

    void abrir(Impressora impressora, Operadora operadora);

    void fecharPedido(Orcamento orcamento, Cartao cartao);
}
