public class Teste {

    public static void main(String[] args) {

        ICliente cliente = new Titular("Ana");

        Servico corte = new Servico(10, "Corte");
        Produto caderno = new Produto(50, "Caderno");


        Orcamento orcamento = new Orcamento(cliente);

        ItemDePedidoDeOrcamento itemCaderno = new ItemDePedidoDeOrcamento(1, caderno);
        ItemDePedidoDeOrcamento itemCorte = new ItemDePedidoDeOrcamento(1, corte);

        orcamento.adicionar(itemCaderno);
        orcamento.adicionar(itemCorte);



        PontoDePagamento caixa = new Caixa();

        Impressora hp = new HP();

        Operadora operadora = new Cielo();

        Cartao cartao = new Visa("45454");


        caixa.abrir(hp,operadora);

        caixa.fecharPedido(orcamento, cartao);



    }
}
